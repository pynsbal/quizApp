package com.example.quizapp.sound

import androidx.compose.runtime.compositionLocalOf

val LocalSoundEffects = compositionLocalOf<SoundEffects> {
    error("No SoundEffects provided")
} 