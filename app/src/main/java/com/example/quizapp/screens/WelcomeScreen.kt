package com.example.quizapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.sound.LocalSoundEffects
import com.example.quizapp.sound.SoundType

@Composable
fun WelcomeScreen(
    onStartClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    val soundEffects = LocalSoundEffects.current
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Quiz Wiz",
            style = MaterialTheme.typography.displayLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        
        Text(
            text = "Test Your Knowledge!",
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 48.dp)
        )

        Button(
            onClick = { 
                soundEffects.playSound(SoundType.CLICK)
                onStartClick()
            },
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(56.dp)
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text("Start Quiz", style = MaterialTheme.typography.titleLarge)
        }

        Button(
            onClick = { 
                soundEffects.playSound(SoundType.CLICK)
                onSettingsClick()
            },
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(56.dp)
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text("Settings", style = MaterialTheme.typography.titleLarge)
        }
    }
} 