package com.example.quizapp.data

data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int,
    val difficulty: Difficulty,
    val category: Category,
    val level: Int
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

enum class Category {
    MATH, ENGLISH, SCIENCE, COMPUTER
}

object QuizData {
    val questions = listOf(
        // MATH Questions - Level 1 (Easy, 5 questions)
        Question(
            "What is 2 + 2?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 5 - 3?",
            listOf("1", "2", "3", "4"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 3 × 2?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 8 ÷ 2?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 1 + 3?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),

        // Level 6 (Medium, 10 questions)
        Question(
            "Solve: 15 × 4",
            listOf("45", "50", "60", "65"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 72 ÷ 8?",
            listOf("6", "7", "8", "9"),
            3,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        // Add 8 more questions for level 6...

        // ENGLISH Questions - Level 1 (Easy, 5 questions)
        Question(
            "Which word means 'happy'?",
            listOf("Sad", "Joyful", "Angry", "Tired"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "What is the opposite of 'big'?",
            listOf("Large", "Huge", "Small", "Tall"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Choose the correct spelling:",
            listOf("Beautifull", "Beautiful", "Beutiful", "Beautyful"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which is a complete sentence?",
            listOf("Running fast", "The dog", "It is sunny", "Blue sky"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Find the verb:",
            listOf("Happy", "Jump", "Blue", "Small"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),

        // Level 6 (Medium, 10 questions)
        Question(
            "Choose the correct homophone:",
            listOf("Their/There", "Their/They're", "There/They're", "All are homophones"),
            3,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        // Add 9 more questions for level 6...

        // SCIENCE Questions - Level 1 (Easy, 5 questions)
        Question(
            "What is the closest planet to the Sun?",
            listOf("Venus", "Mercury", "Earth", "Mars"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "What do plants need to grow?",
            listOf("Only water", "Only sunlight", "Water and sunlight", "Only soil"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal lays eggs?",
            listOf("Dog", "Cat", "Chicken", "Cow"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "What is the largest planet?",
            listOf("Mars", "Jupiter", "Saturn", "Earth"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "What do we breathe?",
            listOf("Nitrogen", "Carbon", "Oxygen", "Hydrogen"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),

        // COMPUTER Questions - Level 1 (Easy, 5 questions)
        Question(
            "What does CPU stand for?",
            listOf(
                "Central Processing Unit",
                "Computer Personal Unit",
                "Central Program Utility",
                "Computer Processing Unit"
            ),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "Which is an input device?",
            listOf("Monitor", "Printer", "Keyboard", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What does RAM stand for?",
            listOf(
                "Random Access Memory",
                "Read Access Memory",
                "Random Available Memory",
                "Read Available Memory"
            ),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "Which is not an operating system?",
            listOf("Windows", "Linux", "Excel", "MacOS"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What is a mouse?",
            listOf(
                "Output Device",
                "Input Device",
                "Processing Unit",
                "Storage Device"
            ),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        )
        // Continue adding more questions for other levels...
    )

    fun getQuestionsByCategory(category: Category, difficulty: Difficulty, level: Int): List<Question> {
        // Verify difficulty matches level range
        val expectedDifficulty = when {
            level <= 5 -> Difficulty.EASY
            level <= 10 -> Difficulty.MEDIUM
            else -> Difficulty.HARD
        }
        
        if (difficulty != expectedDifficulty) {
            throw IllegalArgumentException("Invalid difficulty for level $level. Expected: $expectedDifficulty, Got: $difficulty")
        }

        val levelQuestions = questions.filter { 
            it.category == category && 
            it.level == level &&
            it.difficulty == difficulty
        }

        // Verify we have enough questions
        val requiredQuestions = if (level <= 5) 5 else 10
        if (levelQuestions.size < requiredQuestions) {
            throw IllegalStateException("Not enough questions for level $level in category $category. Required: $requiredQuestions, Found: ${levelQuestions.size}")
        }

        return levelQuestions.shuffled() // Randomize question order
    }

    fun getCategories(): List<Category> {
        return Category.values().toList()
    }

    fun getDifficultyForLevel(level: Int): Difficulty {
        return when {
            level <= 5 -> Difficulty.EASY
            level <= 10 -> Difficulty.MEDIUM
            else -> Difficulty.HARD
        }
    }
} 