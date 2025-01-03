package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object ScienceQuestions {
    val questions = listOf(
        // Level 1 (EASY) - Basic Animals
        Question(
            "Which animal says 'Meow'? 🐱",
            listOf("Dog", "Cat", "Bird", "Fish"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal has wings? 🦅",
            listOf("Fish", "Snake", "Bird", "Cat"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Where do fish live? 🐠",
            listOf("Trees", "Water", "Sky", "Ground"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal has a long neck? 🦒",
            listOf("Elephant", "Giraffe", "Lion", "Zebra"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "What do birds use to fly? 🕊️",
            listOf("Legs", "Wings", "Tail", "Beak"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),

        // Level 2 (EASY) - Basic Plants
        Question(
            "What do plants need to grow? 🌱",
            listOf("Only water", "Water and sunlight", "Only sunlight", "Nothing"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "Which part of the plant grows under the ground? 🌿",
            listOf("Leaf", "Flower", "Root", "Stem"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "What color are most leaves? 🍃",
            listOf("Blue", "Red", "Green", "Yellow"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "Where do seeds come from? 🌺",
            listOf("Roots", "Flowers", "Stems", "Leaves"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "What do plants drink? 💧",
            listOf("Milk", "Juice", "Water", "Soda"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),

        // Level 3 (EASY) - Weather
        Question(
            "What makes puddles dry up? ☀️",
            listOf("Wind", "Rain", "Sun", "Snow"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What falls from clouds? ☁️",
            listOf("Leaves", "Rain", "Stars", "Sand"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "When can you see stars? 🌟",
            listOf("Morning", "Afternoon", "Night", "Noon"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What season is usually the hottest? 🌡️",
            listOf("Winter", "Spring", "Summer", "Fall"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What makes the wind blow? 🌬️",
            listOf("Trees", "Moving air", "Cars", "Birds"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),

        // Level 4 (EASY) - Human Body
        Question(
            "What do we use to see? 👀",
            listOf("Nose", "Eyes", "Ears", "Hands"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "What pumps blood in our body? ❤️",
            listOf("Brain", "Heart", "Lungs", "Stomach"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "What do we use to hear? 👂",
            listOf("Eyes", "Nose", "Ears", "Mouth"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "Which helps us breathe? 🫁",
            listOf("Heart", "Brain", "Lungs", "Stomach"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "What do we use to smell? 👃",
            listOf("Ears", "Eyes", "Nose", "Mouth"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),

        // Level 5 (EASY) - Five Senses
        Question(
            "Which sense helps us taste food? 👅",
            listOf("Smell", "Touch", "Taste", "Hearing"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "What sense tells us if something is hot? 🔥",
            listOf("Sight", "Touch", "Smell", "Taste"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "Which sense helps us see colors? 🌈",
            listOf("Touch", "Smell", "Sight", "Hearing"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "What sense lets us hear music? 🎵",
            listOf("Sight", "Touch", "Smell", "Hearing"),
            3,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "Which sense helps us feel soft things? 🧸",
            listOf("Touch", "Taste", "Smell", "Hearing"),
            0,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),

        // Level 6 (MEDIUM) - Simple Earth Science
        Question(
            "What is soil made of? 🌱",
            listOf("Just dirt", "Rocks and minerals", "Only water", "Just sand"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What makes a rainbow? 🌈",
            listOf("Moon", "Rain and sun", "Stars", "Wind"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What is under Earth's surface? 🌍",
            listOf("Nothing", "More rock", "Just water", "Only air"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "Where does rain come from? ☔",
            listOf("Trees", "Clouds", "Ground", "Mountains"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What makes day and night? 🌞",
            listOf("Clouds", "Earth spinning", "Moon", "Stars"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),

        // Level 7 (MEDIUM) - Basic Space
        Question(
            "What gives us light during the day? ☀️",
            listOf("Moon", "Sun", "Stars", "Earth"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "What do we see at night? 🌙",
            listOf("Sun", "Stars and moon", "Clouds", "Rainbow"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "What planet do we live on? 🌍",
            listOf("Mars", "Earth", "Moon", "Sun"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "Is the Sun a ___? ⭐",
            listOf("Planet", "Star", "Moon", "Cloud"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "What moves around Earth? 🌑",
            listOf("Sun", "Stars", "Moon", "Clouds"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),

        // Level 8 (MEDIUM) - Simple Machines
        Question(
            "What helps lift heavy things? 🏗️",
            listOf("Lever", "Paper", "String", "Water"),
            0,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "What do wheels help things do? 🛞",
            listOf("Float", "Move", "Fly", "Swim"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "What makes a slide work? ⛷️",
            listOf("Magnet", "Gravity", "Wind", "Light"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "What helps us open bottles? 🔧",
            listOf("Screwdriver", "Hammer", "Scissors", "Paper"),
            0,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "What helps cut paper? ✂️",
            listOf("String", "Ruler", "Scissors", "Tape"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),

        // Level 9 (MEDIUM) - Animal Habitats
        Question(
            "Where do polar bears live? 🐻‍❄️",
            listOf("Desert", "Arctic", "Jungle", "Ocean"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do fish make their home? 🐠",
            listOf("Trees", "Water", "Sky", "Sand"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do birds build nests? 🐦",
            listOf("Underground", "Trees", "Water", "Caves"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do monkeys live? 🐒",
            listOf("Ocean", "Desert", "Trees", "Snow"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do penguins live? 🐧",
            listOf("Desert", "Jungle", "Cold places", "Forest"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),

        // Level 10 (MEDIUM) - Plant Life Cycles
        Question(
            "What do plants start as? 🌱",
            listOf("Leaves", "Seeds", "Flowers", "Fruit"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What do plants need to grow? 🌿",
            listOf("Only water", "Water and sunlight", "Only sun", "Nothing"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What comes after a flower? 🌸",
            listOf("Seed", "Fruit", "Root", "Leaf"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What helps spread seeds? 🌾",
            listOf("Wind", "Cars", "Houses", "Rocks"),
            0,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What color are young plants? 🌱",
            listOf("Brown", "Green", "Red", "Blue"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),

        // Level 11 (HARD) - States of Matter
        Question(
            "What happens to water when it freezes? ❄️",
            listOf("Turns to steam", "Turns to ice", "Disappears", "Turns to gas"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What is steam made of? 💨",
            listOf("Hot air", "Water vapor", "Smoke", "Clouds"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What state is juice in? 🧃",
            listOf("Solid", "Liquid", "Gas", "None"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "Which is a solid? 🧊",
            listOf("Milk", "Air", "Ice", "Steam"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What happens to chocolate in the sun? 🍫",
            listOf("Gets harder", "Melts", "Nothing", "Freezes"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),

        // Level 12 (HARD) - Simple Forces
        Question(
            "What makes things fall down? 🎈",
            listOf("Wind", "Gravity", "Light", "Sound"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What helps boats float? 🚢",
            listOf("Magic", "Water", "Wind", "Air inside"),
            3,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What makes a swing move? 🎪",
            listOf("Pushing", "Magic", "Light", "Heat"),
            0,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What makes a magnet work? 🧲",
            listOf("Light", "Heat", "Magnetic force", "Wind"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What helps birds fly? 🕊️",
            listOf("Magic", "Wings and air", "Just wings", "Just air"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),

        // Level 13 (HARD) - Basic Energy
        Question(
            "What gives us heat? 🌞",
            listOf("Moon", "Sun", "Stars", "Wind"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What makes a flashlight work? 🔦",
            listOf("Water", "Air", "Batteries", "Sand"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What gives plants energy? ☀️",
            listOf("Moon", "Sunlight", "Wind", "Rain"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What gives us energy to play? 🍎",
            listOf("Sleep", "Food", "Water", "Air"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What makes a car go? ⛽",
            listOf("Water", "Air", "Fuel", "Sand"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),

        // Level 14 (HARD) - Food Chains
        Question(
            "What do plants eat? 🌱",
            listOf("Sunlight and water", "Meat", "Other plants", "Nothing"),
            0,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What do rabbits eat? 🐰",
            listOf("Meat", "Plants", "Fish", "Birds"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What do lions eat? 🦁",
            listOf("Grass", "Plants", "Meat", "Seeds"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What eats plants and meat? 🐻",
            listOf("Bears", "Cows", "Deer", "Sheep"),
            0,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What do fish eat? 🐠",
            listOf("Only plants", "Only smaller fish", "Both plants and small fish", "Rocks"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),

        // Level 15 (HARD) - Simple Earth Changes
        Question(
            "What makes day turn to night? 🌍",
            listOf("Magic", "Earth spins", "Sun moves", "Moon moves"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What makes the seasons change? 🍂",
            listOf("Earth's movement", "Wind", "Rain", "Clouds"),
            0,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What makes waves in the ocean? 🌊",
            listOf("Fish", "Wind", "Boats", "Rain"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What makes mountains? 🏔️",
            listOf("Wind", "Earth movements", "Rain", "Snow"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What makes valleys? 🏞️",
            listOf("Wind", "Water erosion", "Plants", "Animals"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        )
    )
} 