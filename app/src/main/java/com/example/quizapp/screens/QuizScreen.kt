package com.example.quizapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quizapp.data.*
import com.example.quizapp.sound.LocalSoundEffects
import com.example.quizapp.sound.SoundType
import com.example.quizapp.components.TopBar

@Composable
fun QuizScreen(
    category: Category,
    difficulty: Difficulty,
    level: Int,
    onQuizFinished: () -> Unit,
    onError: (String) -> Unit,
    onBackPressed: () -> Unit
) {
    val soundEffects = LocalSoundEffects.current
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var correctAnswers by remember { mutableStateOf(0) }
    
    val questions = remember(category, level) {
        QuizData.questions.filter { 
            it.category == category && 
            it.level == level &&
            it.difficulty == difficulty
        }
    }

    if (questions.isEmpty()) {
        LaunchedEffect(Unit) {
            onError("No questions available for this level")
        }
        return
    }

    val currentQuestion = questions[currentQuestionIndex]

    Scaffold(
        topBar = {
            TopBar(
                title = "Level $level",
                onBackPressed = onBackPressed
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Progress indicator
            LinearProgressIndicator(
                progress = (currentQuestionIndex + 1).toFloat() / questions.size,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )

            // Question counter
            Text(
                text = "Question ${currentQuestionIndex + 1}/${questions.size}",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Question text
            Text(
                text = currentQuestion.question,
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .fillMaxWidth()
            )

            // Answer options
            currentQuestion.options.forEachIndexed { index, option ->
                Button(
                    onClick = {
                        if (index == currentQuestion.correctAnswer) {
                            correctAnswers++
                            soundEffects.playSound(SoundType.CORRECT)
                        } else {
                            soundEffects.playSound(SoundType.WRONG)
                        }

                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                        } else {
                            // Quiz completed
                            UserProgress.completeLevel(
                                category,
                                level,
                                questions.size,
                                correctAnswers
                            )
                            onQuizFinished()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Text(
                        text = option,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
            }
        }
    }
} 