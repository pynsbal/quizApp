package com.example.quizapp

import androidx.compose.runtime.*
import androidx.compose.material3.*
import com.example.quizapp.screens.*
import com.example.quizapp.data.*

@Composable
fun QuizApp() {
    var currentScreen by remember { mutableStateOf("welcome") }
    var selectedCategory by remember { mutableStateOf<Category?>(null) }
    var selectedLevel by remember { mutableStateOf<Int?>(null) }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        println("DEBUG: Running question validation")
        QuizData.printQuestionValidation()
    }

    when (currentScreen) {
        "welcome" -> WelcomeScreen(
            onStartClick = { currentScreen = "categories" },
            onSettingsClick = { currentScreen = "settings" },
            onAchievementsClick = { currentScreen = "achievements" }
        )
        "categories" -> CategoryScreen(
            onCategorySelected = { category ->
                println("DEBUG: Selected category: ${category.name}")
                selectedCategory = category
                try {
                    val questionsForCategory = QuizData.questions.filter { it.category == category }
                    println("DEBUG: Found ${questionsForCategory.size} questions for ${category.name}")
                    
                    if (questionsForCategory.isNotEmpty()) {
                        currentScreen = "levelMap"
                    } else {
                        errorMessage = "No questions available for ${category.name}"
                    }
                } catch (e: Exception) {
                    println("DEBUG: Error in category selection - ${e.message}")
                    errorMessage = "Error: ${e.message}"
                }
            },
            onBackPressed = { currentScreen = "welcome" }
        )
        "levelMap" -> selectedCategory?.let { category ->
            LevelMapScreen(
                category = category,
                onLevelSelected = { level ->
                    selectedLevel = level
                    currentScreen = "quiz"
                },
                onBackPressed = { currentScreen = "categories" }
            )
        }
        "quiz" -> selectedCategory?.let { category ->
            selectedLevel?.let { level ->
                QuizScreen(
                    category = category,
                    difficulty = QuizData.getDifficultyForLevel(level),
                    level = level,
                    onQuizFinished = { currentScreen = "levelMap" },
                    onError = { error -> 
                        errorMessage = error
                        currentScreen = "levelMap"
                    },
                    onBackPressed = { currentScreen = "levelMap" }
                )
            }
        }
        "settings" -> SettingsScreen(
            onBackPressed = { currentScreen = "welcome" }
        )
        "achievements" -> AchievementsScreen(
            onBackPressed = { currentScreen = "welcome" }
        )
    }

    // Show error dialog if there's an error
    errorMessage?.let { message ->
        println("DEBUG: Showing error dialog: $message")
        AlertDialog(
            onDismissRequest = { 
                println("DEBUG: Dismissing error dialog")
                errorMessage = null 
            },
            title = { Text(text = "Error") },
            text = { Text(text = message) },
            confirmButton = {
                TextButton(onClick = { 
                    errorMessage = null
                    currentScreen = "categories"
                }) {
                    Text(text = "OK")
                }
            }
        )
    }
} 