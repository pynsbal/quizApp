package com.example.quizapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quizapp.data.*
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
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var correctAnswers by remember { mutableStateOf(0) }
    
    val questions = remember(category, level) {
        try {
            println("DEBUG: Loading questions for ${category.name} level $level")
            QuizData.getQuestionsForCategoryAndLevel(category, level)
        } catch (e: Exception) {
            println("DEBUG: Error loading questions - ${e.message}")
            e.printStackTrace() // This will print the full error stack trace
            onError("Error loading questions: ${e.message}")
            null
        }
    }

    if (questions == null) {
        println("DEBUG: Questions is null, returning")
        return
    }

    if (questions.isEmpty()) {
        println("DEBUG: Questions is empty, showing error")
        LaunchedEffect(Unit) {
            onError("No questions available for ${category.name} level $level")
        }
        return
    }

    println("DEBUG: Loaded ${questions.size} questions successfully")
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
                        }

                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                        } else {
                            // Quiz completed
                            UserProgress.completeLevel(
                                category = category,
                                level = level,
                                score = (correctAnswers * 100) / questions.size
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