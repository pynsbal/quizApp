package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.OnBackPressedCallback
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.quizapp.ui.theme.QuizAppTheme
import com.example.quizapp.sound.SoundEffects
import com.example.quizapp.sound.LocalSoundEffects
import com.example.quizapp.data.Category
import com.example.quizapp.screens.CategoryScreen
import com.example.quizapp.screens.SettingsScreen
import com.example.quizapp.data.QuizData
import com.example.quizapp.screens.QuizScreen
import com.example.quizapp.screens.WelcomeScreen

var isDarkMode by mutableStateOf(false)
var volume by mutableFloatStateOf(0.5f)

class MainActivity : ComponentActivity() {
    private lateinit var soundEffects: SoundEffects
    private var currentScreen by mutableStateOf("welcome")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        soundEffects = SoundEffects(this)

        setContent {
            QuizAppTheme {
                CompositionLocalProvider(LocalSoundEffects provides soundEffects) {
                    AnimatedQuizApp()
                }
            }
        }

        // Handle system back button
        onBackPressedDispatcher.addCallback(
            this, // LifecycleOwner
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if (currentScreen != "welcome") {
                        currentScreen = when (currentScreen) {
                            "categories" -> "welcome"
                            "levelMap" -> "categories"
                            "quiz" -> "levelMap"
                            "settings" -> "welcome"
                            else -> "welcome"
                        }
                    } else {
                        finish()
                    }
                }
            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        soundEffects.release()
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedQuizApp() {
    var currentScreen by remember { mutableStateOf("welcome") }
    var selectedCategory by remember { mutableStateOf<Category?>(null) }
    var currentLevel by remember { mutableStateOf(1) }

    val onBackPressed: () -> Unit = {
        currentScreen = when (currentScreen) {
            "categories" -> "welcome"
            "levelMap" -> "categories"
            "quiz" -> "levelMap"
            "settings" -> "welcome"
            else -> "welcome"
        }
    }

    AnimatedContent(
        targetState = currentScreen,
        transitionSpec = {
            when (targetState) {
                "welcome" -> {
                    // Slide down + fade when going back to welcome
                    slideInVertically { height -> -height } + fadeIn() with 
                    slideOutVertically { height -> height } + fadeOut()
                }
                "settings" -> {
                    // Slide from end for settings
                    slideInHorizontally { width -> width } + fadeIn() with 
                    slideOutHorizontally { width -> -width } + fadeOut()
                }
                "categories" -> {
                    // Scale up for categories
                    scaleIn(initialScale = 0.8f) + fadeIn() with 
                    scaleOut(targetScale = 1.1f) + fadeOut()
                }
                "levelMap" -> {
                    // Slide from start for level map
                    slideInHorizontally { width -> -width } + fadeIn() with 
                    slideOutHorizontally { width -> width } + fadeOut()
                }
                else -> {
                    // Default slide up + fade for quiz
                    slideInVertically { height -> height } + fadeIn() with 
                    slideOutVertically { height -> -height } + fadeOut()
                }
            }.using(
                SizeTransform(clip = false)
            )
        }
    ) { screen ->
        when (screen) {
            "welcome" -> {
                WelcomeScreen(
                    onStartClick = {
                        currentScreen = "categories"
                    },
                    onSettingsClick = {
                        currentScreen = "settings"
                    }
                )
            }
            "categories" -> {
                CategoryScreen(
                    onCategorySelected = { category ->
                        selectedCategory = category
                        currentScreen = "levelMap"
                    },
                    onBackPressed = onBackPressed
                )
            }
            "levelMap" -> {
                selectedCategory?.let { category ->
                    LevelMapScreen(
                        category = category,
                        onLevelSelected = { level, difficulty ->
                            currentLevel = level
                            currentScreen = "quiz"
                        },
                        onBackPressed = onBackPressed
                    )
                }
            }
            "quiz" -> {
                selectedCategory?.let { category ->
                    QuizScreen(
                        category = category,
                        difficulty = QuizData.getDifficultyForLevel(currentLevel),
                        level = currentLevel,
                        onQuizFinished = {
                            currentScreen = "levelMap"
                        },
                        onError = { message ->
                            currentScreen = "levelMap"
                        },
                        onBackPressed = onBackPressed
                    )
                }
            }
            "settings" -> {
                SettingsScreen(
                    onBackPressed = onBackPressed
                )
            }
        }
    }
}