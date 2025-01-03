package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.quizapp.settings.Settings
import com.example.quizapp.ui.theme.QuizAppTheme
import com.example.quizapp.data.QuizData
import com.example.quizapp.data.UserProgress

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize both Settings and UserProgress
        Settings.init(this)
        UserProgress.init(this)
        
        // Debug check
        if (applicationInfo.flags and android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE != 0) {
            QuizData.printQuestionValidation()
        }
        
        setContent {
            QuizAppTheme {
                QuizApp()
            }
        }
    }
}