package com.example.quizapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quizapp.data.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import com.example.quizapp.components.TopBar

@Composable
fun LevelMapScreen(
    category: Category,
    onLevelSelected: (Int) -> Unit,
    onBackPressed: () -> Unit
) {
    val context = LocalContext.current
    val levels = (1..15).toList()

    Scaffold(
        topBar = {
            TopBar(
                title = category.toDisplayCategory().name,
                showBackButton = true,
                onBackPressed = onBackPressed
            )
        }
    ) { padding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(levels) { level ->
                val isUnlocked = UserProgress.isLevelUnlocked(category, level)
                val score = UserProgress.getScore(category, level)
                
                Button(
                    onClick = { if (isUnlocked) onLevelSelected(level) },
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isUnlocked) 
                            MaterialTheme.colorScheme.primary
                        else 
                            MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(level.toString())
                        if (!isUnlocked) {
                            Icon(Icons.Default.Lock, "Locked")
                        } else if (score > 0) {
                            Row {
                                repeat(score / 33 + 1) {
                                    Icon(
                                        Icons.Default.Star,
                                        "Star",
                                        tint = Color.Yellow
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
} 