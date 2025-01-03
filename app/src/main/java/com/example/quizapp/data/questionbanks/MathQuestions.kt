package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Category
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Question

object MathQuestions {
    val questions = listOf(
        // Level 1 (EASY) - Basic Addition
        Question(
            "What is 2 + 2?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 3 + 3?",
            listOf("5", "6", "7", "8"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 1 + 4?",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 2 + 3?",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 5 + 0?",
            listOf("4", "5", "6", "0"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),

        // Level 2 (EASY) - Basic Subtraction
        Question(
            "What is 5 - 2?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 4 - 1?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 6 - 3?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 7 - 4?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 5 - 5?",
            listOf("2", "0", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),

        // Level 3 (EASY) - Numbers and Counting
        Question(
            "Count the apples: 🍎🍎🍎",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "Count the stars: ⭐⭐⭐⭐",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "How many fingers are on one hand?",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "Count the hearts: ❤️❤️❤️❤️❤️",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "How many days are in a week?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),

        // Level 4 (EASY) - Simple Patterns
        Question(
            "What comes next: 2, 4, 6, __",
            listOf("7", "8", "9", "10"),
            1,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "Complete: 5, 10, 15, __",
            listOf("18", "20", "25", "30"),
            1,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "What's next: 1, 3, 5, __",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "Continue: 10, 20, 30, __",
            listOf("35", "40", "45", "50"),
            1,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "Next number: 2, 5, 8, __",
            listOf("10", "11", "12", "13"),
            1,
            Difficulty.EASY,
            Category.MATH,
            4
        ),

        // Level 5 (EASY) - Basic Shapes
        Question(
            "How many sides does a triangle have?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "How many sides does a square have?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "How many corners does a triangle have?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "How many sides does a rectangle have?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "How many circles in: ⭕⭕⭕",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),

        // Level 6 (MEDIUM) - Double Digit Addition
        Question(
            "What is 12 + 15?",
            listOf("25", "27", "28", "30"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 20 + 25?",
            listOf("35", "40", "45", "50"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 18 + 12?",
            listOf("28", "29", "30", "31"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 22 + 11?",
            listOf("31", "32", "33", "34"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 15 + 15?",
            listOf("25", "30", "35", "40"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),

        // Level 7 (MEDIUM) - Double Digit Subtraction
        Question(
            "What is 25 - 10?",
            listOf("10", "15", "20", "25"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 30 - 12?",
            listOf("16", "17", "18", "19"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 28 - 15?",
            listOf("11", "12", "13", "14"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 40 - 20?",
            listOf("15", "20", "25", "30"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 35 - 15?",
            listOf("15", "20", "25", "30"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),

        // Level 8 (MEDIUM) - Simple Multiplication
        Question(
            "What is 2 × 3?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "What is 4 × 2?",
            listOf("6", "8", "10", "12"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "What is 3 × 3?",
            listOf("6", "7", "8", "9"),
            3,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "What is 5 × 2?",
            listOf("8", "9", "10", "11"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "What is 2 × 6?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),

        // Level 9 (MEDIUM) - Simple Division
        Question(
            "What is 6 ÷ 2?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is 8 ÷ 2?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is 10 ÷ 2?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is 12 ÷ 3?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is 15 ÷ 3?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),

        // Level 10 (MEDIUM) - Mixed Operations
        Question(
            "What is (4 + 2) × 2?",
            listOf("10", "12", "14", "16"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "What is 15 - (3 × 2)?",
            listOf("7", "8", "9", "10"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "What is 20 ÷ (2 + 2)?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "What is (10 - 4) ÷ 2?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "What is 3 × (4 + 1)?",
            listOf("12", "13", "14", "15"),
            3,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),

        // Level 11 (HARD) - Word Problems
        Question(
            "If you have 3 bags with 4 apples each, how many apples do you have?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "You have 15 candies and give 6 to your friend. How many do you have left?",
            listOf("7", "8", "9", "10"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "If you save $2 every day, how much will you have after 5 days?",
            listOf("8", "9", "10", "11"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "There are 20 students in class, 8 are boys. How many girls are there?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "You have 4 quarters. How many cents do you have?",
            listOf("75", "100", "125", "150"),
            1,
            Difficulty.HARD,
            Category.MATH,
            11
        ),

        // Level 12 (HARD) - Complex Word Problems
        Question(
            "If you buy 3 toys for $5 each, how much change will you get from $20?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "A recipe needs 3 eggs per cake. How many eggs for 4 cakes?",
            listOf("9", "10", "11", "12"),
            3,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "If 2 pencils cost 50 cents, how much do 6 pencils cost?",
            listOf("$1.00", "$1.25", "$1.50", "$1.75"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "You walk 3 miles each day. How many miles in 5 days?",
            listOf("12", "13", "14", "15"),
            3,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "If you read 4 pages every 10 minutes, how many pages in 30 minutes?",
            listOf("8", "10", "12", "14"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),

        // Level 13 (HARD) - Time and Money
        Question(
            "How many minutes are in 2 hours?",
            listOf("90", "100", "110", "120"),
            3,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "How many quarters make a dollar?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "If it's 2:30 now, what time was it 45 minutes ago?",
            listOf("1:45", "1:55", "2:15", "2:25"),
            0,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "How many nickels equal 50 cents?",
            listOf("5", "10", "15", "20"),
            1,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "How many dimes make 80 cents?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.HARD,
            Category.MATH,
            13
        ),

        // Level 14 (HARD) - Fractions
        Question(
            "What fraction of a pizza is 2 slices out of 8?",
            listOf("1/2", "1/3", "1/4", "1/5"),
            2,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "If you eat half of half a pizza, what fraction did you eat?",
            listOf("1/2", "1/3", "1/4", "1/5"),
            2,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "What is half of 30?",
            listOf("10", "15", "20", "25"),
            1,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "If you have 3/4 of a dollar, how many cents do you have?",
            listOf("50¢", "65¢", "75¢", "85¢"),
            2,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "What fraction of a dozen eggs is 3 eggs?",
            listOf("1/2", "1/3", "1/4", "1/6"),
            3,
            Difficulty.HARD,
            Category.MATH,
            14
        ),

        // Level 15 (HARD) - Advanced Word Problems
        Question(
            "If a train travels 60 miles in 2 hours, how many miles per hour is it going?",
            listOf("25", "30", "35", "40"),
            1,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "You need 3 cups of flour for one batch of cookies. How many cups for 4 batches?",
            listOf("9", "10", "11", "12"),
            3,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "If 5 children share 20 candies equally, how many does each child get?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "A book has 40 pages. If you read 1/4 of it, how many pages did you read?",
            listOf("5", "10", "15", "20"),
            1,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "If you save $3 per week, how much will you have after 5 weeks?",
            listOf("12", "13", "14", "15"),
            3,
            Difficulty.HARD,
            Category.MATH,
            15
        )
    )
} 