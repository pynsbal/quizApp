package com.example.quizapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quizapp.data.Category
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.UserProgress
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import com.example.quizapp.data.QuizData
import com.example.quizapp.components.TopBar

@Composable
fun LevelMapScreen(
    category: Category,
    onLevelSelected: (Int, Difficulty) -> Unit,
    onBackPressed: () -> Unit
) {
    var isLoading by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopBar(
                title = "${category.name} Quest 🗺️",
                onBackPressed = onBackPressed
            )
        }
    ) { padding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize()) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            return@Scaffold
        }

        val levels = (1..15).toList()
        val chunkedLevels = remember { levels.chunked(3) }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                Text(
                    text = "${category.name} Quest 🗺️",
                    style = MaterialTheme.typography.headlineMedium
                )
            }

            items(chunkedLevels) { rowLevels ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    rowLevels.forEach { level ->
                        val isUnlocked = UserProgress.isLevelUnlocked(category, level)
                        val requiredQuestions = if (level <= 5) 5 else 10
                        val stars = if (UserProgress.isLevelUnlocked(category, level)) {
                            UserProgress.getLevelScore(category, level, requiredQuestions, requiredQuestions)
                        } else {
                            0
                        }
                        
                        LevelButton(
                            level = level,
                            isUnlocked = isUnlocked,
                            stars = stars,
                            difficulty = QuizData.getDifficultyForLevel(level),
                            onClick = { selectedLevel, difficulty ->
                                if (isUnlocked) {
                                    onLevelSelected(selectedLevel, difficulty)
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LevelButton(
    level: Int,
    isUnlocked: Boolean,
    stars: Int,
    difficulty: Difficulty,
    onClick: (Int, Difficulty) -> Unit
) {
    val backgroundColor = when {
        !isUnlocked -> Color.Gray
        difficulty == Difficulty.EASY -> Color(0xFF4CAF50)
        difficulty == Difficulty.MEDIUM -> Color(0xFFFFA726)
        else -> Color(0xFFE53935)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(backgroundColor)
                .padding(8.dp)
        ) {
            if (isUnlocked) {
                Button(
                    onClick = { onClick(level, difficulty) },
                    modifier = Modifier.fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    elevation = ButtonDefaults.buttonElevation(0.dp)
                ) {
                    Text(
                        text = level.toString(),
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White
                    )
                }
            } else {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Locked Level",
                    tint = Color.White,
                    modifier = Modifier
                        .size(32.dp)
                        .align(Alignment.Center)
                )
            }
        }
        
        if (stars > 0) {
            Row(
                modifier = Modifier.padding(top = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                repeat(stars) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color(0xFFFFD700),
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
} 