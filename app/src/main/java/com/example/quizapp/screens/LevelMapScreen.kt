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
import androidx.compose.ui.unit.dp
import com.example.quizapp.data.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import com.example.quizapp.components.TopBar
import com.example.quizapp.sound.LocalSoundEffects
import com.example.quizapp.sound.SoundType

@Composable
fun LevelMapScreen(
    category: Category,
    onLevelSelected: (Int) -> Unit,
    onBackPressed: () -> Unit
) {
    val soundEffects = LocalSoundEffects.current
    val levels = (1..15).toList() // Show 15 levels

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
                LevelButton(
                    level = level,
                    category = category,
                    onClick = {
                        soundEffects.playSound(SoundType.CLICK)
                        onLevelSelected(level)
                    }
                )
            }
        }
    }
}

@Composable
private fun LevelButton(
    level: Int,
    category: Category,
    onClick: () -> Unit
) {
    val progress = UserProgress.getInstance()
    val score = progress.getScore(category, level)
    val isUnlocked = progress.isLevelUnlocked(category, level)
    
    Button(
        onClick = { if (isUnlocked) onClick() },
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape),
        enabled = isUnlocked,
        colors = ButtonDefaults.buttonColors(
            containerColor = when {
                !isUnlocked -> MaterialTheme.colorScheme.surfaceVariant
                score > 0 -> MaterialTheme.colorScheme.primaryContainer
                else -> MaterialTheme.colorScheme.primary
            }
        )
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            if (!isUnlocked) {
                Icon(Icons.Default.Lock, contentDescription = "Locked level")
            } else {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(level.toString())
                    if (score > 0) {
                        Row {
                            repeat(score) {
                                Icon(
                                    Icons.Default.Star,
                                    contentDescription = "Star",
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
} 