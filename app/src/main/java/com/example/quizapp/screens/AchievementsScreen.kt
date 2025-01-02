package com.example.quizapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quizapp.achievement.AchievementManager
import com.example.quizapp.components.TopBar

@Composable
fun AchievementsScreen(
    onBackPressed: () -> Unit
) {
    val context = LocalContext.current
    val achievements = AchievementManager.getAllAchievements(context)

    Scaffold(
        topBar = {
            TopBar(
                title = "Achievements",
                onBackPressed = onBackPressed
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            achievements.forEach { (achievement, isUnlocked) ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = if (isUnlocked) 
                            MaterialTheme.colorScheme.primaryContainer
                        else 
                            MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = achievement.title,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = achievement.description,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        if (!isUnlocked) {
                            Text(
                                text = "🔒 Locked",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }
            }
        }
    }
} 