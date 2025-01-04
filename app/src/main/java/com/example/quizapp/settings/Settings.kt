package com.example.quizapp.settings

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf

object Settings {
    private lateinit var prefs: SharedPreferences
    
    var isDarkMode = mutableStateOf(false)
        private set

    fun init(context: Context) {
        prefs = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
        isDarkMode.value = prefs.getBoolean("dark_mode", false)
    }

    fun toggleDarkMode() {
        isDarkMode.value = !isDarkMode.value
        prefs.edit().putBoolean("dark_mode", isDarkMode.value).apply()
    }
} 