package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Category
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Question

object EnglishQuestions {
    val questions = listOf(
        // Level 1 (EASY) - Alphabet and Letter Sounds
        Question(
            "What letter does 'Apple' start with?",
            listOf("B", "A", "C", "D"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "What letter makes the 'Meow' sound in 'Cat'?",
            listOf("T", "A", "C", "M"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which letter says 'Buh' in 'Ball'?",
            listOf("A", "L", "B", "T"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Find the first letter in 'Dog'?",
            listOf("B", "G", "D", "O"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which is a vowel? 🎵",
            listOf("B", "C", "E", "D"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),

        // Level 2 (EASY) - Simple Words & Rhyming
        Question(
            "Which word rhymes with 'cat'? 🐱",
            listOf("dog", "hat", "pig", "cup"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "What color is the sky? ☁️",
            listOf("red", "blue", "green", "pink"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "Which animal says 'Woof'? 🐕",
            listOf("cat", "dog", "fish", "bird"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "What rhymes with 'sun'? ☀️",
            listOf("moon", "fun", "day", "light"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "Find the fruit: 🍎",
            listOf("car", "apple", "house", "tree"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),

        // Level 3 (EASY) - Simple Sentences
        Question(
            "Which is a complete sentence?",
            listOf(
                "The dog",
                "Running fast",
                "The dog runs.",
                "Big and small"
            ),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "What comes at the end of a sentence?",
            listOf(".", ",", "?", "!"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "Which word should be capitalized?",
            listOf("dog", "cat", "john", "ball"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "Find the naming word (noun): 🏠",
            listOf("run", "big", "house", "fast"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "Which is an action word (verb)?",
            listOf("happy", "jump", "big", "small"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),

        // Level 4 (EASY) - Word Meanings
        Question(
            "What is the opposite of 'hot'? 🌡️",
            listOf("warm", "cold", "nice", "wet"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Which is a feeling word? 😊",
            listOf("happy", "table", "run", "blue"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "What do we use to read? 📚",
            listOf("food", "books", "shoes", "toys"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Where do fish live? 🐠",
            listOf("trees", "water", "sky", "ground"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "When do stars come out? ⭐",
            listOf("night", "morning", "noon", "evening"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),

        // Level 5 (EASY) - Simple Reading
        Question(
            "The cat is ___ the mat.",
            listOf("on", "in", "at", "by"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "I like to ___ books.",
            listOf("read", "reads", "reading", "readed"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "The sun is ___.",
            listOf("bright", "dark", "cold", "small"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "Birds can ___.",
            listOf("swim", "fly", "run", "jump"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "We go to school in the ___.",
            listOf("morning", "night", "evening", "noon"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),

        // Level 6 (MEDIUM) - Simple Plurals
        Question(
            "Which is the plural of 'cat'? 🐱",
            listOf("cat's", "cats", "cates", "catz"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "One dog, two ___? 🐕",
            listOf("doges", "dog's", "dogs", "doggy"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "One box, two ___? 📦",
            listOf("boxs", "boxes", "box's", "boxies"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "Which shows many fish? 🐠",
            listOf("fishs", "fish", "fishes", "fishies"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "One tooth, two ___? 🦷",
            listOf("tooths", "tooth's", "teeths", "teeth"),
            3,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),

        // Level 7 (MEDIUM) - Basic Sight Words
        Question(
            "Which is spelled correctly? 👀",
            listOf("becuse", "because", "becaus", "becoz"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Choose the correct word: The dog ___ happy.",
            listOf("is", "are", "am", "be"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which word means 'not small'?",
            listOf("big", "huge", "tall", "long"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "What word comes after 'thank'?",
            listOf("you", "me", "him", "her"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which word means 'right now'?",
            listOf("later", "soon", "now", "then"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),

        // Level 8 (MEDIUM) - Word Families
        Question(
            "Which word belongs in the '-at' family? 🐱",
            listOf("hot", "bat", "bet", "but"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "Find the word that rhymes with 'pin': 📍",
            listOf("pan", "pen", "win", "tin"),
            3,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "Which word rhymes with 'cake'? 🎂",
            listOf("back", "take", "cook", "look"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "Find the '-ug' word: 🫂",
            listOf("hug", "huge", "hub", "hut"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "Which word rhymes with 'bell'? 🔔",
            listOf("ball", "bill", "tell", "tall"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),

        // Level 9 (MEDIUM) - Simple Sentences
        Question(
            "Choose the correct ending: The sun is ___.",
            listOf("shine", "shining", "shined", "shines"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "Which is a complete sentence? 📝",
            listOf(
                "The big dog",
                "Running fast",
                "The cat sleeps",
                "Very happy"
            ),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "What comes at the end of a question? ❓",
            listOf(".", "!", "?", ","),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "Find the action word: The dog ___ the ball.",
            listOf("catch", "catches", "caught", "catching"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "Which shows excitement? 'I won the game___'",
            listOf(".", "!", "?", ","),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),

        // Level 10 (MEDIUM) - Simple Comprehension
        Question(
            "If it's raining, I need a ___. ☔",
            listOf("sun", "umbrella", "book", "toy"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "When do birds fly south? 🦅",
            listOf("summer", "spring", "winter", "fall"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "What do we use to tell time? ⏰",
            listOf("book", "clock", "chair", "door"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "Where do fish live? 🐠",
            listOf("trees", "water", "sky", "ground"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "What helps plants grow? 🌱",
            listOf("water", "rocks", "toys", "books"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),

        // Level 11 (HARD) - Simple Compound Words
        Question(
            "Which makes a compound word with 'book'? 📚",
            listOf("shelf", "pen", "paper", "read"),
            0,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Sun + shine = ___? ☀️",
            listOf("sunlight", "sunshine", "sunny", "sunset"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Rain + bow = ___? 🌈",
            listOf("rainfall", "rainbow", "raincoat", "raindrop"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Which is a compound word? 🏠",
            listOf("playing", "inside", "bedroom", "happy"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "What makes a word with 'ball'? ⚽",
            listOf("foot", "hand", "arm", "leg"),
            0,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),

        // Level 12 (HARD) - Basic Contractions
        Question(
            "What is the contraction for 'do not'? 🚫",
            listOf("dont", "don't", "doesnt", "doesn't"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "I am = ___?",
            listOf("Iam", "Im", "I'm", "i'm"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "Cannot = ___?",
            listOf("cant", "can't", "dont", "don't"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "What is 'will not' shortened?",
            listOf("willn't", "won't", "will't", "willnot"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "They are = ___?",
            listOf("theyre", "they're", "their", "there"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),

        // Level 13 (HARD) - Simple Prefixes
        Question(
            "What does 'un-' mean in 'unhappy'? 😢",
            listOf("very", "not", "more", "again"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which means 'not possible'?",
            listOf("possible", "impossible", "possibly", "possiblity"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "'Re-' means to do something ___.",
            listOf("never", "once", "again", "before"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which word means 'not fair'?",
            listOf("fair", "unfair", "fairly", "fairness"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "'Pre-' means ___.",
            listOf("after", "before", "during", "between"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),

        // Level 14 (HARD) - Simple Suffixes
        Question(
            "What is a person who teaches? 👩‍🏫",
            listOf("teach", "teaching", "teacher", "taught"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Which means 'full of joy'? 😊",
            listOf("joy", "joyful", "joyous", "joying"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "What happens when you add '-ing' to 'play'?",
            listOf("played", "plays", "playing", "player"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Which means 'more than one fish'?",
            listOf("fishs", "fishing", "fishes", "fish"),
            3,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Add '-er' to 'help': ___",
            listOf("helps", "helping", "helped", "helper"),
            3,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),

        // Level 15 (HARD) - Reading Comprehension
        Question(
            "If it's cold outside, I should ___.",
            listOf("wear a coat", "go swimming", "eat ice cream", "play in the sun"),
            0,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "The sky is dark and cloudy. It might ___.",
            listOf("snow", "rain", "shine", "be hot"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "I am hungry, so I should ___.",
            listOf("sleep", "eat", "run", "play"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "At night, we see the ___ in the sky.",
            listOf("sun", "clouds", "stars", "rainbow"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "Birds build nests to ___.",
            listOf("swim in", "sleep in", "eat in", "play in"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        )
    )
} 