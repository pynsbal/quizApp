package com.example.quizapp.data.questionbanks

import com.example.quizapp.data.Question
import com.example.quizapp.data.Difficulty
import com.example.quizapp.data.Category

object ComputerQuestions {
    val questions = listOf(
        // Level 1 (EASY) - Basic Computer Parts
        Question(
            "What do you use to click things? 🖱️",
            listOf("Keyboard", "Mouse", "Screen", "Speaker"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What shows the pictures? 🖥️",
            listOf("Speaker", "Screen", "Mouse", "Keyboard"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What makes computer sounds? 🔊",
            listOf("Screen", "Mouse", "Speaker", "Keyboard"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "What do you type with? ⌨️",
            listOf("Mouse", "Screen", "Speaker", "Keyboard"),
            3,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),
        Question(
            "Which turns the computer on? 🔘",
            listOf("Power button", "Screen", "Mouse", "Speaker"),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            1
        ),

        // Level 2 (EASY) - Basic Actions
        Question(
            "How do you make letters BIG? ⬆️",
            listOf("Caps Lock", "Space", "Enter", "Delete"),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What makes a space between words? ➡️",
            listOf("Enter", "Space bar", "Delete", "Shift"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What moves down to a new line? ⬇️",
            listOf("Space", "Delete", "Enter", "Shift"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "What erases letters? ⬅️",
            listOf("Space", "Enter", "Delete", "Shift"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),
        Question(
            "Double-click means click ___?",
            listOf("Once", "Twice", "Three times", "Never"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            2
        ),

        // Level 3 (EASY) - Basic Programs
        Question(
            "What do we use to draw? 🎨",
            listOf("Paint", "Clock", "Games", "Files"),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What shows us the time? ⏰",
            listOf("Paint", "Clock", "Games", "Files"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "Where do we save pictures? 📁",
            listOf("Paint", "Clock", "Games", "Files"),
            3,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What do we use to learn? 📚",
            listOf("Games", "Learning apps", "Paint", "Clock"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),
        Question(
            "What helps us write? ✏️",
            listOf("Paint", "Clock", "Text editor", "Games"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            3
        ),

        // Level 4 (EASY) - Simple Internet
        Question(
            "What connects us to the internet? 🌐",
            listOf("WiFi", "Paint", "Games", "Files"),
            0,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What do we use to search? 🔍",
            listOf("Paint", "Browser", "Games", "Files"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What shows us videos? 📺",
            listOf("Paint", "Clock", "YouTube", "Files"),
            2,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What helps us learn online? 💻",
            listOf("Games only", "Learning websites", "Just videos", "Nothing"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),
        Question(
            "What do we need to go online? 🔌",
            listOf("Just a screen", "Internet connection", "Just a mouse", "Nothing"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            4
        ),

        // Level 5 (EASY) - Computer Safety
        Question(
            "What keeps your computer safe? 🛡️",
            listOf("Games", "Antivirus", "Paint", "Clock"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "Should you share passwords? 🔑",
            listOf("Yes", "No", "Sometimes", "Always"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "What's safe to click? 🖱️",
            listOf("Unknown links", "Safe websites", "Pop-ups", "Ads"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "Who can help with computer problems? 👥",
            listOf("Strangers", "Grown-ups you trust", "Nobody", "Anyone"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),
        Question(
            "What should you do if something breaks? 🔧",
            listOf("Hide it", "Tell a grown-up", "Fix it yourself", "Ignore it"),
            1,
            Difficulty.EASY,
            Category.COMPUTER,
            5
        ),

        // Level 6 (MEDIUM) - Files and Folders
        Question(
            "Where do we save pictures? 📁",
            listOf("In folders", "On the desk", "In the trash", "Nowhere"),
            0,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "What's a folder used for? 📂",
            listOf("Drawing", "Organizing files", "Playing games", "Writing"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "How do you open a file? 📄",
            listOf("Double-click", "Shake mouse", "Press power", "Unplug computer"),
            0,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "What happens when you delete a file? 🗑️",
            listOf("It goes to recycle bin", "It explodes", "It prints", "Nothing"),
            0,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),
        Question(
            "What's a good file name? 📝",
            listOf("!!!!", "homework1", "@#$%", "????"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            6
        ),

        // Level 7 (MEDIUM) - Internet Safety
        Question(
            "What's a safe password? 🔑",
            listOf("123", "password", "birthday", "Mix of letters/numbers"),
            3,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "Who can you share passwords with? 🤫",
            listOf("Friends", "Everyone", "Nobody", "Strangers"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What's safe to click? 🖱️",
            listOf("Unknown links", "Pop-up ads", "Trusted websites", "Strange emails"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "What should you tell people online? 🤔",
            listOf("Your address", "Your name", "Nothing personal", "Your phone"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),
        Question(
            "Who can help with internet safety? 👥",
            listOf("Strangers", "Parents/Teachers", "Online friends", "Nobody"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            7
        ),

        // Level 8 (MEDIUM) - Basic Email
        Question(
            "What's an email address? 📧",
            listOf("Home address", "Phone number", "Online mailbox", "Real mailbox"),
            2,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "What can you send in email? 📨",
            listOf("Real letters", "Messages", "Real packages", "Real food"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "What's spam email? 🚫",
            listOf("Good email", "Junk mail", "Important mail", "Friend mail"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "How to send an email? ✉️",
            listOf("Print it", "Click send", "Mail it", "Draw it"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),
        Question(
            "What needs an email address? @",
            listOf("Name only", "Name and @", "Just numbers", "Just letters"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            8
        ),

        // Level 9 (MEDIUM) - Simple Searching
        Question(
            "What helps us find things online? 🔍",
            listOf("Games", "Search engine", "Paint", "Clock"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "What makes a good search? 🤔",
            listOf("One word", "Clear words", "Random words", "No words"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "Where do we type searches? 📝",
            listOf("Games", "Search bar", "Paint", "Files"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "What shows search results? 📄",
            listOf("Paint", "Web pages", "Games", "Clock"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),
        Question(
            "How do we open search results? 🖱️",
            listOf("Double-click", "Click once", "Right click", "No click"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            9
        ),

        // Level 10 (MEDIUM) - Computer Care
        Question(
            "How to keep computers clean? 🧹",
            listOf("Use water", "Gentle wipes", "Rough cleaning", "Don't clean"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "What hurts computers? 💧",
            listOf("Clean hands", "Water", "Gentle use", "Careful handling"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "When should you update? 🔄",
            listOf("Never", "When asked", "Random times", "Every minute"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "How to carry a laptop? 💻",
            listOf("One hand", "Carefully with both hands", "Throw it", "Drop it"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),
        Question(
            "What's good computer care? 🛠️",
            listOf("Being rough", "Being gentle", "Being fast", "Being loud"),
            1,
            Difficulty.MEDIUM,
            Category.COMPUTER,
            10
        ),

        // Level 11 (HARD) - Online Safety Rules
        Question(
            "What's a safe password? 🔑",
            listOf("Your name", "Birthday", "Pet's name", "Mix of letters/numbers"),
            3,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "Who can you trust online? 🤝",
            listOf("Strangers", "Known friends", "Unknown people", "Random users"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "What's safe to share online? 📱",
            listOf("Address", "Favorite color", "Phone number", "Password"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "What's cyberbullying? 😢",
            listOf("Being kind", "Being mean online", "Being helpful", "Being friendly"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),
        Question(
            "What to do if bullied online? 🆘",
            listOf("Nothing", "Tell a grown-up", "Keep quiet", "Be mean back"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            11
        ),

        // Level 12 (HARD) - Digital Citizenship
        Question(
            "How should we act online? 🤝",
            listOf("Mean", "Kind", "Rude", "Bad"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What's good online behavior? 👍",
            listOf("Being mean", "Being helpful", "Being rude", "Being unkind"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "How to treat others online? 🌟",
            listOf("With meanness", "With respect", "With rudeness", "With anger"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What makes a good digital friend? 👥",
            listOf("Being mean", "Being kind", "Being rude", "Being unfair"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),
        Question(
            "What's good to share online? 📱",
            listOf("Mean words", "Kind messages", "Rude pictures", "Bad comments"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            12
        ),

        // Level 13 (HARD) - Problem Solving
        Question(
            "Computer won't turn on, what first? 🔌",
            listOf("Hit it", "Check power", "Give up", "Throw it"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "If screen is dark, check the ___? 💡",
            listOf("Mouse", "Brightness", "Games", "Internet"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "No internet? First check ___? 🌐",
            listOf("Games", "WiFi connection", "Paint", "Files"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "If mouse won't work, check the ___? 🖱️",
            listOf("Screen", "Connection", "Keyboard", "Speakers"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),
        Question(
            "Computer is slow, try ___? 🐌",
            listOf("Using more", "Closing programs", "Adding more", "Nothing"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            13
        ),

        // Level 14 (HARD) - Simple Programming
        Question(
            "What is coding? 💻",
            listOf("Drawing", "Telling computer what to do", "Playing", "Writing"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What do programs need? 📝",
            listOf("Just words", "Clear instructions", "Just pictures", "Nothing"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "Programs run in what order? 📋",
            listOf("Random", "Step by step", "All at once", "No order"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What fixes program errors? 🐞",
            listOf("Adding more", "Debugging", "Making bigger", "Nothing"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),
        Question(
            "What makes good code? ✨",
            listOf("Being messy", "Being organized", "Being random", "Being quick"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            14
        ),

        // Level 15 (HARD) - Computer Responsibility
        Question(
            "How long to use computers? ⏰",
            listOf("All day", "Balanced time", "Never", "24 hours"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "How to sit at computer? 🪑",
            listOf("Any way", "With good posture", "Lying down", "Upside down"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "What's good for your eyes? 👀",
            listOf("No breaks", "Taking breaks", "Getting closer", "Bright screen"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "How to treat equipment? 🖥️",
            listOf("Roughly", "Carefully", "Carelessly", "However"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        ),
        Question(
            "When to ask for help? 🆘",
            listOf("Never", "When needed", "Last resort", "Don't ask"),
            1,
            Difficulty.HARD,
            Category.COMPUTER,
            15
        )
    )
} 