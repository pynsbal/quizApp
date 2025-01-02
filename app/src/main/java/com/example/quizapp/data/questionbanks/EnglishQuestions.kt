package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object EnglishQuestions {
    val questions: List<Question> = listOf(
        // Level 1 (EASY) - Capital Letters
        Question(
            "Which letter should be capital?",
            listOf("cat", "john", "dog", "ball"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which word starts a sentence?",
            listOf("and", "The", "but", "or"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which name needs a capital letter?",
            listOf("dog", "mary", "cat", "book"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which day needs a capital letter?",
            listOf("today", "monday", "tomorrow", "day"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),
        Question(
            "Which place needs a capital letter?",
            listOf("house", "paris", "school", "store"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            1
        ),

        // Level 2 (EASY) - Basic Punctuation
        Question(
            "What ends a sentence?",
            listOf(",", ".", "-", ";"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "What shows a question?",
            listOf(".", "!", "?", ","),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "What shows excitement!",
            listOf(".", "!", "?", ","),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "What separates words in a list?",
            listOf(".", "!", "?", ","),
            3,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),
        Question(
            "Which is correct?",
            listOf("I like cats", "I like cats.", "i like cats", "i like cats,"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            2
        ),

        // Level 3 (EASY) - Singular/Plural
        Question(
            "Which is plural?",
            listOf("cat", "dog", "birds", "fish"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "One dog, two ___",
            listOf("dog", "dogs", "doggy", "dogged"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "Which means more than one?",
            listOf("book", "boxes", "toy", "cup"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "One child, two ___",
            listOf("childs", "child", "children", "childrens"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),
        Question(
            "Which is not plural?",
            listOf("cats", "dogs", "mouse", "birds"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            3
        ),

        // Level 4 (EASY) - Common Sight Words
        Question(
            "Which is a sight word?",
            listOf("the", "cat", "run", "big"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Choose the sight word:",
            listOf("jump", "and", "play", "fast"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Pick the sight word:",
            listOf("red", "is", "ball", "tree"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Which is a sight word?",
            listOf("they", "dog", "run", "big"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),
        Question(
            "Find the sight word:",
            listOf("cat", "was", "run", "big"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            4
        ),

        // Level 5 (EASY) - Basic Vocabulary
        Question(
            "Which is a color?",
            listOf("big", "run", "blue", "fast"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "Which is an animal?",
            listOf("car", "cat", "hat", "mat"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "Which shows size?",
            listOf("red", "run", "big", "play"),
            2,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "Which is a number word?",
            listOf("three", "blue", "run", "big"),
            0,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),
        Question(
            "Which is about weather?",
            listOf("jump", "rain", "book", "tree"),
            1,
            Difficulty.EASY,
            Category.ENGLISH,
            5
        ),

        // Level 6 (MEDIUM) - Simple Tenses
        Question(
            "She ___ to school.",
            listOf("go", "goes", "going", "went"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "Yesterday, I ___ a book.",
            listOf("read", "reads", "reading", "will read"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "They ___ now.",
            listOf("play", "plays", "playing", "played"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "He ___ his toys.",
            listOf("like", "likes", "liking", "liked"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),
        Question(
            "I ___ my homework.",
            listOf("do", "does", "doing", "did"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            6
        ),

        // Level 7 (MEDIUM) - Parts of Speech
        Question(
            "Which is a naming word (noun)?",
            listOf("run", "big", "cat", "fast"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which is an action word (verb)?",
            listOf("book", "jump", "big", "red"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which describes (adjective)?",
            listOf("run", "cat", "big", "jump"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which is a person?",
            listOf("tree", "teacher", "fast", "jump"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),
        Question(
            "Which is a place?",
            listOf("school", "happy", "run", "they"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            7
        ),

        // Level 8 (MEDIUM) - Opposites
        Question(
            "What's the opposite of 'big'?",
            listOf("huge", "large", "small", "tall"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "What's the opposite of 'hot'?",
            listOf("warm", "cool", "cold", "nice"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "What's the opposite of 'up'?",
            listOf("over", "under", "down", "in"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "What's the opposite of 'fast'?",
            listOf("quick", "slow", "speed", "run"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),
        Question(
            "What's the opposite of 'happy'?",
            listOf("sad", "glad", "mad", "bad"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            8
        ),

        // Level 9 (MEDIUM) - Simple Reading
        Question(
            "The cat is ___ the mat.",
            listOf("on", "in", "at", "by"),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "I like to ___ books.",
            listOf("eat", "read", "sleep", "walk"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "The dog is ___ the house.",
            listOf("on", "in", "at", "by"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "She ___ to school.",
            listOf("walk", "walks", "walking", "walked"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),
        Question(
            "The bird can ___.",
            listOf("swim", "fly", "run", "jump"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            9
        ),

        // Level 10 (MEDIUM) - Simple Sentences
        Question(
            "Which is a complete sentence?",
            listOf("The big dog", "Ran fast", "I like cats.", "To the store"),
            2,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "Choose the best sentence:",
            listOf("Cat sleep", "The cat sleeps.", "Running cat", "Cat the"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "Which sentence is correct?",
            listOf("I am happy.", "Me happy.", "Happy I.", "Am happy."),
            0,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "Pick the right sentence:",
            listOf("Dog the bark", "The dog barks.", "Barking dog", "Dog bark"),
            1,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),
        Question(
            "Which is correct?",
            listOf("We to park", "Going park", "At the park", "We go to the park."),
            3,
            Difficulty.MEDIUM,
            Category.ENGLISH,
            10
        ),

        // Level 11 (HARD) - Compound Words
        Question(
            "Which is a compound word?",
            listOf("cat", "dog", "sunshine", "big"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Make a compound word: rain + bow",
            listOf("rainup", "rainbow", "raindown", "rainby"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Which is compound?",
            listOf("happy", "baseball", "yellow", "small"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Sun + light makes:",
            listOf("sunup", "sundown", "sunlight", "sunset"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),
        Question(
            "Which is not compound?",
            listOf("butterfly", "doorbell", "rainbow", "yellow"),
            3,
            Difficulty.HARD,
            Category.ENGLISH,
            11
        ),

        // Level 12 (HARD) - Word Families
        Question(
            "Which rhymes with 'cat'?",
            listOf("car", "hat", "hit", "cut"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "Which belongs to '-ing' family?",
            listOf("sing", "sang", "sung", "song"),
            0,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "Which ends like 'walk'?",
            listOf("take", "talk", "tale", "tall"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "Which rhymes with 'day'?",
            listOf("do", "die", "play", "put"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),
        Question(
            "Find the '-at' word:",
            listOf("eat", "it", "hat", "hot"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            12
        ),

        // Level 13 (HARD) - Similar Words
        Question(
            "Which means 'big'?",
            listOf("tiny", "large", "small", "short"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which means 'happy'?",
            listOf("sad", "mad", "glad", "bad"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which means 'little'?",
            listOf("big", "huge", "tiny", "tall"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which means 'quick'?",
            listOf("slow", "fast", "stop", "walk"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),
        Question(
            "Which means 'cold'?",
            listOf("hot", "warm", "cool", "nice"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            13
        ),

        // Level 14 (HARD) - Simple Comprehension
        Question(
            "The sun is ___.",
            listOf("cold", "dark", "bright", "wet"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Birds can ___.",
            listOf("swim", "fly", "run", "jump"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Fish live in ___.",
            listOf("trees", "water", "sky", "ground"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "We sleep at ___.",
            listOf("noon", "night", "morning", "day"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),
        Question(
            "Rain comes from ___.",
            listOf("ground", "trees", "clouds", "sun"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            14
        ),

        // Level 15 (HARD) - Story Elements
        Question(
            "Who tells the story?",
            listOf("Setting", "Narrator", "Plot", "Time"),
            1,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "Where a story happens is called?",
            listOf("Time", "Place", "Setting", "Plot"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "The people in a story are called?",
            listOf("Setting", "Plot", "Characters", "Scene"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "What happens in a story is called?",
            listOf("Setting", "Characters", "Plot", "Time"),
            2,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        ),
        Question(
            "When a story happens is called?",
            listOf("Setting", "Plot", "Scene", "Time"),
            3,
            Difficulty.HARD,
            Category.ENGLISH,
            15
        )
    )
} 