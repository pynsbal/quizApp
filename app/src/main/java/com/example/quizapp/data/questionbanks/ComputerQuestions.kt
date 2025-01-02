package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object ComputerQuestions {
    val questions: List<Question> = listOf(
        // Level 1 (EASY) - Basic Computer Parts
        Question(
            "What do you type on? ⌨️",
            listOf("Monitor", "Mouse", "Keyboard", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What shows the picture? 🖥️",
            listOf("Keyboard", "Monitor", "Mouse", "Printer"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What do you click with? 🖱️",
            listOf("Keyboard", "Screen", "Mouse", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What makes sound? 🔊",
            listOf("Mouse", "Screen", "Keyboard", "Speaker"),
            3,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What prints paper? 🖨️",
            listOf("Monitor", "Mouse", "Printer", "Keyboard"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),

        // Level 2 (EASY) - Basic Computer Parts
        Question(
            "What shows pictures? 🖥️",
            listOf("Mouse", "Screen", "Keyboard", "Speaker"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What types words? ⌨️",
            listOf("Screen", "Mouse", "Keyboard", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What moves the pointer? 🖱️",
            listOf("Screen", "Mouse", "Keyboard", "Speaker"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What makes sound? 🔊",
            listOf("Mouse", "Screen", "Keyboard", "Speaker"),
            3,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What needs power? 🔌",
            listOf("Paper", "Book", "Computer", "Pencil"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),

        // Level 3 (EASY) - Basic Actions
        Question(
            "How do you start a computer? 🔌",
            listOf("Power button", "Mouse", "Screen", "Keyboard"),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What opens programs? 🖱️",
            listOf("Type", "Click", "Speak", "Draw"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "How do you write letters? ⌨️",
            listOf("Mouse", "Screen", "Keyboard", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What moves the pointer? 🖱️",
            listOf("Keyboard", "Screen", "Mouse", "Speaker"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "How do you close a window? ❌",
            listOf("Open it", "Click X", "Unplug", "Wait"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),

        // Level 3 (EASY) - Basic Programs
        Question(
            "What do you draw with? 🎨",
            listOf("Calculator", "Paint", "Clock", "Games"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What shows the time? ⏰",
            listOf("Paint", "Games", "Clock", "Music"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "Where do you write stories? 📝",
            listOf("Paint", "Calculator", "Word", "Games"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What plays music? 🎵",
            listOf("Paint", "Clock", "Games", "Media Player"),
            3,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What does math? 🔢",
            listOf("Paint", "Calculator", "Games", "Clock"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),

        // Level 4 (EASY) - Internet Basics
        Question(
            "What connects to the internet? 🌐",
            listOf("Paper", "Pencil", "Computer", "Book"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What searches the internet? 🔍",
            listOf("Word", "Browser", "Paint", "Games"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What sends messages? ✉️",
            listOf("Paint", "Games", "Email", "Clock"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What shows videos? 🎥",
            listOf("Clock", "Calculator", "YouTube", "Paint"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What needs WiFi? 📶",
            listOf("Book", "Paper", "Internet", "Pencil"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),

        // Level 5 (EASY) - Computer Safety
        Question(
            "Should you share passwords? 🔑",
            listOf("Yes", "No", "Maybe", "Sometimes"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "What keeps computers safe? 🛡️",
            listOf("Games", "Paint", "Antivirus", "Music"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "Who can use your password? 🔒",
            listOf("Friends", "Teachers", "Nobody", "Family"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "What needs protection? 🔐",
            listOf("Games", "Password", "Paint", "Clock"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "Should you click unknown links? 🔗",
            listOf("Yes", "No", "Maybe", "Always"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),

        // Level 6 (MEDIUM) - Basic File Management
        Question(
            "Where do we save files? 💾",
            listOf("Printer", "Folder", "Mouse", "Screen"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "How do you copy files? 📋",
            listOf("Delete them", "Copy + Paste", "Cut them", "Move them"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "What creates new folders? 📁",
            listOf("Delete", "Copy", "Right-click", "Close"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "Where are pictures saved? 📸",
            listOf("Music", "Pictures", "Games", "Tools"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "How do you rename files? ✏️",
            listOf("Delete it", "Copy it", "Right-click", "Move it"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),

        // Level 7 (MEDIUM) - Simple Coding Concepts
        Question(
            "What gives computers instructions? 💻",
            listOf("Games", "Code", "Paint", "Music"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What is a loop? 🔄",
            listOf("Stop", "Repeat", "Delete", "End"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What is coding? 👩‍💻",
            listOf(
                "Playing games",
                "Writing instructions",
                "Drawing pictures",
                "Watching videos"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What do robots need? 🤖",
            listOf("Food", "Water", "Code", "Sleep"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What makes games work? 🎮",
            listOf("Magic", "Code", "Luck", "Nothing"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),

        // Level 8 (MEDIUM) - Digital Citizenship
        Question(
            "Should you be nice online? 😊",
            listOf("No", "Sometimes", "Yes", "Never"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "What is cyberbullying? 😢",
            listOf(
                "Being nice online",
                "Being mean online",
                "Playing games",
                "Sharing pictures"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "Should you share photos? 📷",
            listOf("Always", "Never", "Ask first", "Sometimes"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "Who can you talk to online? 💭",
            listOf("Everyone", "Strangers", "Friends only", "Nobody"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "What makes a good password? 🔑",
            listOf("Your name", "Birthday", "Pet name", "Mixed letters"),
            3,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),

        // Level 9 (MEDIUM) - Computer Care
        Question(
            "How to keep computers clean? 🧹",
            listOf("Water", "Cloth", "Soap", "Paint"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "What hurts computers? 💧",
            listOf("Air", "Light", "Water", "Sound"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "Where should food be? 🍕",
            listOf(
                "On keyboard",
                "Away from computer",
                "On mouse",
                "Near screen"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "When to turn off computers? 💤",
            listOf(
                "Never",
                "After using",
                "While using",
                "During updates"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "What needs charging? 🔋",
            listOf("Mouse", "Laptop", "Screen", "Keyboard"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),

        // Level 10 (MEDIUM) - Basic Troubleshooting
        Question(
            "If computer is slow? 🐌",
            listOf("Add water", "Restart it", "Hit it", "Unplug it"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "No internet? 📡",
            listOf(
                "Hit computer",
                "Check WiFi",
                "Add water",
                "Turn off"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "Screen is black? 🖥️",
            listOf(
                "Add water",
                "Check power",
                "Hit screen",
                "Throw away"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "Mouse not working? 🖱️",
            listOf(
                "Throw away",
                "Check battery",
                "Add water",
                "Hit it"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "Program frozen? ❄️",
            listOf(
                "Break computer",
                "Close program",
                "Add water",
                "Hit screen"
            ),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),

        // Level 11 (HARD) - Digital Art
        Question(
            "What makes digital art? 🎨",
            listOf("Paper", "Paint app", "Pencil", "Water"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "What tool colors? 🖌️",
            listOf("Eraser", "Brush", "Text", "Shape"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "How to fix mistakes? ↩️",
            listOf("Restart", "Undo", "Delete file", "Close app"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "Where to save art? 💾",
            listOf("Trash", "Pictures", "Desktop", "Games"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "What makes shapes? ⭕",
            listOf("Brush", "Shape tool", "Text", "Eraser"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),

        // Level 12 (HARD) - Educational Games
        Question(
            "What helps learn math? 🔢",
            listOf("Paint", "Math games", "Music", "Videos"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What teaches typing? ⌨️",
            listOf("Paint", "Games", "Typing games", "Music"),
            2,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What helps spelling? 📝",
            listOf("Paint", "Word games", "Music", "Videos"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What teaches science? 🔬",
            listOf("Paint", "Science games", "Music", "Chat"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What helps reading? 📚",
            listOf("Paint", "Reading games", "Music", "Chat"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),

        // Level 13 (HARD) - Computer Rules
        Question(
            "How long to use computers? ⏰",
            listOf("All day", "Take breaks", "Never", "24 hours"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "How to sit properly? 🪑",
            listOf("Slouch", "Straight back", "Lay down", "Stand"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "Eyes getting tired? 👀",
            listOf("Keep going", "Take break", "Close eyes", "Quit"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "When to ask for help? 🤔",
            listOf("Never", "When stuck", "Always", "Later"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "What about screen time? 📱",
            listOf("Unlimited", "Limited", "None", "24/7"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),

        // Level 14 (HARD) - Future Technology
        Question(
            "What are robots? 🤖",
            listOf(
                "Toys only",
                "Smart machines",
                "Just games",
                "Not real"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What is AI? 🧠",
            listOf(
                "A game",
                "Smart computer",
                "A toy",
                "Nothing"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What is virtual reality? 🥽",
            listOf(
                "Real world",
                "Computer world",
                "Just games",
                "TV show"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What are smart homes? 🏠",
            listOf(
                "Normal homes",
                "Computer homes",
                "Big homes",
                "Small homes"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What is coding for? 👩‍💻",
            listOf(
                "Just games",
                "Future jobs",
                "Nothing",
                "Playing"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),

        // Level 15 (HARD) - Online Learning (completing the set)
        Question(
            "What helps online learning? 💻",
            listOf(
                "Playing only",
                "Good habits",
                "No rules",
                "Sleeping"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "What makes learning fun? 🎮",
            listOf(
                "Only games",
                "Learning games",
                "No work",
                "Just videos"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "Best study place? 📚",
            listOf(
                "Noisy room",
                "Quiet space",
                "Playground",
                "Busy street"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "What helps focus? 🎯",
            listOf(
                "Many tabs open",
                "One task at a time",
                "Playing games",
                "Watching videos"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "Best learning time? ⏰",
            listOf(
                "When tired",
                "When fresh",
                "Very late",
                "While playing"
            ),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        )
    )
} 