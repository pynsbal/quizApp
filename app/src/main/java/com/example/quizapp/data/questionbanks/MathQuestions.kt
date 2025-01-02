package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object MathQuestions {
    val questions: List<Question> = listOf(
        // Level 1 (EASY) - Basic Addition within 10
        Question(
            "What is 2 + 3?",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 4 + 1?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 3 + 2?",
            listOf("4", "5", "6", "7"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 1 + 6?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 2 + 2?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 3 + 4?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 2 + 5?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 4 + 3?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 1 + 6?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),
        Question(
            "What is 5 + 2?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.EASY,
            Category.MATH,
            1
        ),

        // Level 2 (EASY) - Basic Subtraction within 10
        Question(
            "What is 5 - 2?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 7 - 3?",
            listOf("3", "4", "5", "6"),
            1,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 6 - 2?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.EASY,
            Category.MATH,
            2
        ),
        Question(
            "What is 8 - 5?",
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

        // Level 3 (EASY) - Addition within 20
        Question(
            "What is 12 + 5?",
            listOf("15", "16", "17", "18"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "What is 8 + 7?",
            listOf("13", "14", "15", "16"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "What is 11 + 6?",
            listOf("15", "16", "17", "18"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "What is 9 + 8?",
            listOf("15", "16", "17", "18"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),
        Question(
            "What is 13 + 4?",
            listOf("15", "16", "17", "18"),
            2,
            Difficulty.EASY,
            Category.MATH,
            3
        ),

        // Level 4 (EASY) - Subtraction within 20
        Question(
            "What is 15 - 7?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "What is 18 - 9?",
            listOf("7", "8", "9", "10"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "What is 14 - 6?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "What is 16 - 8?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),
        Question(
            "What is 13 - 5?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.EASY,
            Category.MATH,
            4
        ),

        // Level 5 (EASY) - Simple Multiplication Tables (2,5,10)
        Question(
            "What is 2 × 3?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 5 × 2?",
            listOf("8", "9", "10", "11"),
            2,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 10 × 1?",
            listOf("8", "9", "10", "11"),
            2,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 2 × 5?",
            listOf("8", "10", "12", "14"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 5 × 3?",
            listOf("10", "15", "20", "25"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 10 × 2?",
            listOf("15", "20", "25", "30"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 4 × 5?",
            listOf("15", "20", "25", "30"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),
        Question(
            "What is 2 × 10?",
            listOf("15", "20", "25", "30"),
            1,
            Difficulty.EASY,
            Category.MATH,
            5
        ),

        // Level 6 (MEDIUM) - Multiplication Tables (3,4)
        Question(
            "What is 3 × 4?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 4 × 3?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 3 × 5?",
            listOf("13", "14", "15", "16"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 4 × 4?",
            listOf("14", "15", "16", "17"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),
        Question(
            "What is 3 × 6?",
            listOf("16", "17", "18", "19"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            6
        ),

        // Level 7 (MEDIUM) - Simple Division
        Question(
            "What is 10 ÷ 2?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 15 ÷ 3?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 12 ÷ 4?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 8 ÷ 2?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),
        Question(
            "What is 20 ÷ 5?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            7
        ),

        // Level 8 (MEDIUM) - Simple Word Problems
        Question(
            "Tom has 5 apples and gets 3 more. How many apples does he have?",
            listOf("6", "7", "8", "9"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "Sara has 10 candies and gives 4 to her friend. How many candies does she have left?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "There are 3 boxes with 4 toys in each. How many toys in total?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "If you have 15 cookies and share them equally with 2 friends, how many cookies does each person get?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),
        Question(
            "John has 2 bags with 6 marbles in each. How many marbles does he have?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            8
        ),

        // Level 9 (MEDIUM) - Simple Fractions
        Question(
            "What fraction of the pizza is shaded? 🍕🍕⬛⬛",
            listOf("1/2", "1/3", "2/4", "3/4"),
            0,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "Which fraction is bigger: 1/2 or 1/4?",
            listOf("1/4", "1/2", "They are equal", "Can't tell"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "If you eat 2 pieces of a pizza cut into 8 pieces, what fraction is left?",
            listOf("4/8", "5/8", "6/8", "7/8"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is half of 10?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),
        Question(
            "What is 1/4 of 12?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            9
        ),

        // Level 10 (MEDIUM) - Time and Money
        Question(
            "How many minutes are in 1 hour?",
            listOf("30", "45", "60", "90"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "How many quarters make a dollar?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "If it's 2:00 now, what time will it be in 2 hours?",
            listOf("3:00", "4:00", "5:00", "6:00"),
            1,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "How many nickels equal 25 cents?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),
        Question(
            "How many days are in a week?",
            listOf("5", "6", "7", "8"),
            2,
            Difficulty.MEDIUM,
            Category.MATH,
            10
        ),

        // Level 11 (HARD) - More Complex Word Problems
        Question(
            "A class has 24 students. If they form groups of 4, how many groups will there be?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "If you have $1.00 and spend 65 cents, how much money do you have left?",
            listOf("25¢", "30¢", "35¢", "40¢"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "A rectangle has length 8 and width 5. What is its area?",
            listOf("35", "38", "40", "42"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "If 3 pencils cost 30 cents, how much do 5 pencils cost?",
            listOf("40¢", "45¢", "50¢", "55¢"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),
        Question(
            "Tom reads 2 pages every 5 minutes. How many pages will he read in 15 minutes?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.HARD,
            Category.MATH,
            11
        ),

        // Level 12 (HARD) - Patterns and Sequences
        Question(
            "What comes next: 2, 4, 6, 8, __?",
            listOf("9", "10", "11", "12"),
            1,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "What comes next: 20, 18, 16, 14, __?",
            listOf("10", "11", "12", "13"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "Complete: 5, 10, 15, __, 25",
            listOf("18", "19", "20", "21"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "What comes next: 1, 3, 5, 7, __?",
            listOf("8", "9", "10", "11"),
            1,
            Difficulty.HARD,
            Category.MATH,
            12
        ),
        Question(
            "Complete: 2, 4, 8, 16, __?",
            listOf("24", "28", "32", "36"),
            2,
            Difficulty.HARD,
            Category.MATH,
            12
        ),

        // Level 13 (HARD) - Mixed Operations
        Question(
            "What is (4 × 5) + 2?",
            listOf("18", "20", "22", "24"),
            2,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "What is 25 - (3 × 4)?",
            listOf("11", "12", "13", "14"),
            2,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "What is (12 ÷ 3) + 5?",
            listOf("7", "8", "9", "10"),
            2,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "What is 2 × (10 + 5)?",
            listOf("25", "30", "35", "40"),
            1,
            Difficulty.HARD,
            Category.MATH,
            13
        ),
        Question(
            "What is (20 - 8) ÷ 4?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.HARD,
            Category.MATH,
            13
        ),

        // Level 14 (HARD) - Simple Geometry
        Question(
            "How many sides does a square have?",
            listOf("2", "3", "4", "5"),
            2,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "Which shape is round?",
            listOf("Square", "Triangle", "Circle", "Rectangle"),
            2,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "How many corners does a triangle have?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "Which shape has 3 sides?",
            listOf("Circle", "Triangle", "Square", "Rectangle"),
            1,
            Difficulty.HARD,
            Category.MATH,
            14
        ),
        Question(
            "Which shape looks like a ball?",
            listOf("Square", "Circle", "Triangle", "Rectangle"),
            1,
            Difficulty.HARD,
            Category.MATH,
            14
        ),

        // Level 15 (HARD) - Simple Word Problems
        Question(
            "Tom has 3 apples and gets 2 more. How many now?",
            listOf("3", "4", "5", "6"),
            2,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "If you have 10 cookies and eat 4, how many left?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "Each bag has 2 toys. How many toys in 3 bags?",
            listOf("4", "5", "6", "7"),
            2,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "Jane has 5 pencils and gives 2 away. How many left?",
            listOf("2", "3", "4", "5"),
            1,
            Difficulty.HARD,
            Category.MATH,
            15
        ),
        Question(
            "If you save $2 each day for 3 days, how much money?",
            listOf("$4", "$5", "$6", "$7"),
            2,
            Difficulty.HARD,
            Category.MATH,
            15
        )
    )
} 