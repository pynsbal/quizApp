package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object ScienceQuestions {
    val questions: List<Question> = listOf(
        // Level 1 (EASY) - Basic Animals
        Question(
            "Which animal says 'meow'? 😺",
            listOf("Dog", "Cat", "Bird", "Fish"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal can fly? 🦋",
            listOf("Fish", "Snake", "Butterfly", "Cat"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal lives in water? 🐠",
            listOf("Bird", "Fish", "Dog", "Cat"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal has a long neck? 🦒",
            listOf("Lion", "Giraffe", "Zebra", "Elephant"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),
        Question(
            "Which animal hops? 🐰",
            listOf("Snake", "Fish", "Rabbit", "Lion"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            1
        ),

        // Level 2 (EASY) - Basic Plants
        Question(
            "What do plants need to grow? 🌱",
            listOf("Only water", "Only sun", "Water and sun", "Only soil"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "What color are most leaves? 🌿",
            listOf("Red", "Blue", "Green", "Yellow"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "Which part of the plant grows underground?",
            listOf("Leaf", "Flower", "Root", "Stem"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "What do flowers grow from? 🌺",
            listOf("Rocks", "Seeds", "Water", "Air"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),
        Question(
            "Which part of the plant makes food?",
            listOf("Root", "Stem", "Leaves", "Flower"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            2
        ),

        // Level 3 (EASY) - Weather
        Question(
            "What falls from clouds as water? 💧",
            listOf("Snow", "Rain", "Wind", "Sun"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What makes a rainbow? 🌈",
            listOf("Moon", "Stars", "Sun and rain", "Wind"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What color are most clouds? ☁️",
            listOf("Blue", "Green", "White", "Yellow"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "When can you see stars? ⭐",
            listOf("Morning", "Night", "Noon", "Evening"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),
        Question(
            "What makes wind?",
            listOf("Rain", "Moving air", "Sun", "Moon"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            3
        ),

        // Level 4 (EASY) - Human Body
        Question(
            "What do we use to see? 👀",
            listOf("Nose", "Eyes", "Ears", "Mouth"),
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
            "What pumps blood in our body? ❤️",
            listOf("Brain", "Lungs", "Heart", "Stomach"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "What do we use to smell? 👃",
            listOf("Eyes", "Ears", "Nose", "Mouth"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),
        Question(
            "What do we use to taste? 👅",
            listOf("Nose", "Ears", "Eyes", "Tongue"),
            3,
            Difficulty.EASY,
            Category.SCIENCE,
            4
        ),

        // Level 5 (EASY) - Basic Materials
        Question(
            "What is ice made of? ❄️",
            listOf("Air", "Water", "Rock", "Sand"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "Which is a liquid? 💧",
            listOf("Rock", "Water", "Chair", "Paper"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "What is wood from?",
            listOf("Ground", "Water", "Trees", "Air"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "Which is soft?",
            listOf("Rock", "Cotton", "Glass", "Metal"),
            1,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),
        Question(
            "What melts in heat?",
            listOf("Wood", "Rock", "Ice cream", "Paper"),
            2,
            Difficulty.EASY,
            Category.SCIENCE,
            5
        ),

        // Level 6 (MEDIUM) - Simple Machines
        Question(
            "Which helps lift heavy things? 🏋️",
            listOf("Lever", "String", "Paper", "Box"),
            0,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What do wheels help things do? 🛞",
            listOf("Float", "Fly", "Move", "Jump"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What makes a slide work? ⛷️",
            listOf("Pushing", "Pulling", "Gravity", "Wind"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "What helps open a door? 🚪",
            listOf("Lock", "Handle", "Window", "Wall"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),
        Question(
            "Which is a simple machine? ⚙️",
            listOf("Tree", "Rock", "Pulley", "Cloud"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            6
        ),

        // Level 7 (MEDIUM) - Day and Night
        Question(
            "What makes day light? ☀️",
            listOf("Moon", "Stars", "Sun", "Clouds"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "What do we see at night? 🌙",
            listOf("Sun", "Stars", "Rainbow", "Clouds"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "When does the moon shine? 🌕",
            listOf("Morning", "Noon", "Night", "Always"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "Why does it get dark?",
            listOf(
                "Sun goes to sleep",
                "Earth turns away from Sun",
                "Moon blocks Sun",
                "Stars take Sun's light"
            ),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),
        Question(
            "What makes shadows? ⛱️",
            listOf("Moon", "Wind", "Light", "Rain"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            7
        ),

        // Level 8 (MEDIUM) - Seasons
        Question(
            "When do leaves fall? 🍂",
            listOf("Spring", "Summer", "Fall", "Winter"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "When does it snow? ❄️",
            listOf("Summer", "Spring", "Fall", "Winter"),
            3,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "When do flowers bloom? 🌸",
            listOf("Winter", "Spring", "Summer", "Fall"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "Which season is hottest? 🌞",
            listOf("Winter", "Spring", "Summer", "Fall"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),
        Question(
            "When do birds fly south? 🦅",
            listOf("Spring", "Summer", "Fall", "Winter"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            8
        ),

        // Level 9 (MEDIUM) - Animal Habitats
        Question(
            "Where do fish live? 🐠",
            listOf("Trees", "Water", "Sky", "Ground"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do birds make nests? 🐦",
            listOf("Underground", "Trees", "Water", "Caves"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do bears sleep? 🐻",
            listOf("Trees", "Water", "Caves", "Fields"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do rabbits live? 🐰",
            listOf("Trees", "Burrows", "Water", "Sky"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),
        Question(
            "Where do monkeys live? 🐒",
            listOf("Underground", "Water", "Trees", "Caves"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            9
        ),

        // Level 10 (MEDIUM) - Food Chains
        Question(
            "What do plants eat? 🌱",
            listOf("Meat", "Other plants", "Sunlight", "Animals"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What do rabbits eat? 🐰",
            listOf("Meat", "Plants", "Fish", "Birds"),
            1,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What do lions eat? 🦁",
            listOf("Plants", "Grass", "Meat", "Seeds"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What eats plants and meat? 🐻",
            listOf("Bears", "Cows", "Deer", "Sheep"),
            0,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),
        Question(
            "What do birds eat? 🐦",
            listOf("Only meat", "Only seeds", "Both", "Neither"),
            2,
            Difficulty.MEDIUM,
            Category.SCIENCE,
            10
        ),

        // Level 11 (HARD) - States of Matter
        Question(
            "What state is water? 💧",
            listOf("Only solid", "Only liquid", "Only gas", "Can be all three"),
            3,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What happens to ice in heat? 🧊",
            listOf("Gets bigger", "Melts", "Disappears", "Nothing"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What is steam? 💨",
            listOf("Hot air", "Water vapor", "Smoke", "Wind"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What state is a rock? 🪨",
            listOf("Liquid", "Gas", "Solid", "All three"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),
        Question(
            "What state is air? 💨",
            listOf("Solid", "Liquid", "Gas", "None"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            11
        ),

        // Level 12 (HARD) - Simple Forces
        Question(
            "What makes things fall down? 🎈",
            listOf("Wind", "Gravity", "Magic", "Light"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What makes things float? 🛟",
            listOf("Magic", "Weight", "Buoyancy", "Color"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What stops moving things? 🛑",
            listOf("Gravity", "Light", "Friction", "Sound"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What makes a swing move? 🎪",
            listOf("Magic", "Push", "Wind", "Light"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),
        Question(
            "What pulls magnets together? 🧲",
            listOf("Gravity", "Light", "Magnetism", "Wind"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            12
        ),

        // Level 13 (HARD) - Earth and Space
        Question(
            "What shape is Earth? 🌍",
            listOf("Flat", "Square", "Round", "Triangle"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What is the Sun? ☀️",
            listOf("Planet", "Star", "Moon", "Cloud"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What is the Moon? 🌕",
            listOf("Star", "Planet", "Satellite", "Sun"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What makes a year? 📅",
            listOf(
                "Moon around Earth",
                "Earth around Sun",
                "Sun around Earth",
                "Stars moving"
            ),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),
        Question(
            "What makes a day? 🌞",
            listOf(
                "Earth spins",
                "Sun moves",
                "Moon spins",
                "Stars move"
            ),
            0,
            Difficulty.HARD,
            Category.SCIENCE,
            13
        ),

        // Level 14 (HARD) - Sound and Light
        Question(
            "What makes sound? 🔊",
            listOf("Light", "Color", "Vibration", "Heat"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What travels faster? 💨",
            listOf("Sound", "Light", "Wind", "Rain"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What bounces sound? 🔉",
            listOf("Light", "Echo", "Wind", "Heat"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What makes a rainbow? 🌈",
            listOf("Moon", "Stars", "Light in water", "Wind"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),
        Question(
            "What needs light? 👀",
            listOf("Sound", "Touch", "Seeing", "Taste"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            14
        ),

        // Level 15 (HARD) - Living vs Non-living (completing the set)
        Question(
            "What do all living things need? 💧",
            listOf("Toys", "Water", "Cars", "Books"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "Which grows? 🌿",
            listOf("Rock", "Toy", "Plant", "Chair"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What needs food? 🍎",
            listOf("Book", "Animal", "Rock", "Pencil"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "Which breathes? 🫁",
            listOf("Table", "Car", "Animal", "Phone"),
            2,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        ),
        Question(
            "What can move by itself? 🦮",
            listOf("Chair", "Animal", "Book", "Rock"),
            1,
            Difficulty.HARD,
            Category.SCIENCE,
            15
        )
    )
} 