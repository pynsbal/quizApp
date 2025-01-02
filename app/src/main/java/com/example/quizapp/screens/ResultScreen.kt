package com.example.quizapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ResultScreen(
    score: Int,
    totalQuestions: Int,
    onRetry: () -> Unit,
    onHome: () -> Unit
) {
    val percentage = remember { score.toFloat() / totalQuestions * 100 }
    val resultMessage = remember {
        when {
            percentage >= 80 -> "Excellent!"
            percentage >= 60 -> "Good Job!"
            else -> "Keep Practicing!"
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = resultMessage,
            style = MaterialTheme.typography.headlineMedium,
            color = when {
                percentage >= 80 -> Color(0xFF4CAF50)
                percentage >= 60 -> Color(0xFFFFA726)
                else -> Color(0xFFE53935)
            }
        )
        
        Text(
            text = "Score: $score/$totalQuestions",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Text(
            text = "${percentage.toInt()}%",
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = onRetry,
                modifier = Modifier.weight(1f).padding(end = 8.dp)
            ) {
                Text("Try Again")
            }
            
            Button(
                onClick = onHome,
                modifier = Modifier.weight(1f).padding(start = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondary
                )
            ) {
                Text("Home")
            }
        }
    }
} 