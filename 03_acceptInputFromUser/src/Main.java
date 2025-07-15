/*
================================================================================
📘 JAVA SCANNER & USER INPUT - COMPLETE THEORY GUIDE
================================================================================

🔰 LEVEL: Absolute Beginner → Advanced
🎯 PURPOSE: Read and process user input in Java at runtime (from keyboard, files, etc.)
📦 CLASS: java.util.Scanner (must be imported before use)

================================================================================
🧠 1. WHAT IS THE SCANNER CLASS?
================================================================================

Scanner is a built-in Java class that allows a program to read input from various sources,
most commonly the **keyboard (System.in)**.

🗣️ Think of Scanner as a **listener** or **interpreter** that waits for the user to type something
and then makes that data available to your program.

📦 Source: java.util package

--------------------------------------------------------------------------------
Example of its presence (DO NOT TYPE YET! Just for theory reference)
// import java.util.Scanner;
// Scanner scanner = new Scanner(System.in);
--------------------------------------------------------------------------------

================================================================================
🎯 2. WHY & WHEN DO WE USE IT?
================================================================================

Use Scanner whenever you want:
- To interact with the user via input
- To read input during runtime (instead of hardcoding)
- To read from various sources (keyboard, files, strings)

✔️ Most common usage: reading **keyboard input** in command-line Java apps

================================================================================
🧱 3. STRUCTURE OF SCANNER (NO CODE, JUST THEORY)
================================================================================

A Scanner object is created by:
1️⃣ Specifying the source to read from (e.g., System.in for keyboard)
2️⃣ Calling the appropriate method to extract the input in a desired data type

🧩 Think of it as:
[Input Source] → Scanner → [Parsed Data]

📥 Input Sources:
- System.in (keyboard input)
- File object (to read from a file)
- String (Scanner can tokenize strings too!)

🧾 Common Reading Methods (by data type):
- next()       → reads a single word (ignores spaces)
- nextLine()   → reads an entire line
- nextInt()    → reads an int
- nextDouble() → reads a decimal number
- nextBoolean()→ reads a boolean (true/false)
- ...and more (nextByte(), nextShort(), nextFloat(), nextLong())

================================================================================
📦 4. INPUT TYPES SCANNER CAN HANDLE
================================================================================

🧑‍💻 Keyboard (System.in)
📄 Files (File object)
🧵 Strings (String as data source)

Each of these behaves slightly differently in terms of how tokens are read.

Example (DO NOT TYPE YET):
// Scanner sc = new Scanner("Hello 123");
// sc.next(); → "Hello"
// sc.nextInt(); → 123

================================================================================
🚧 5. COMMON PITFALLS & GOTCHAS (Must-Know)
================================================================================

⚠️ Mixing `nextLine()` with other `nextX()` methods causes issues.
Why? Because `nextInt()` or `nextDouble()` do NOT consume the newline character.
So when `nextLine()` runs next, it reads an empty line.

✅ Fix: Always add an extra `nextLine()` after `nextInt()` if you're switching.

⚠️ InputMismatchException – If user enters text when Scanner expects a number.
Always validate or handle with `hasNextInt()`, try-catch, or prompts.

⚠️ Scanner never closes System.in automatically — don’t call `scanner.close()` if you plan
to use Scanner again in the program. It can make System.in unusable afterward.

⚠️ Scanner is **not thread-safe**. Don't share it across threads unless synchronized manually.

================================================================================
💎 6. BEST PRACTICES
================================================================================

✔️ Use clear prompts for input (so users know what to type)
✔️ Check for input availability using `hasNextX()` methods
✔️ Use try-catch for robust user input validation
✔️ Always close files, but be careful closing `System.in` if using multiple times
✔️ Keep Scanner instance scoped appropriately (method-level or class-level)

================================================================================
💡 7. REAL-WORLD USE CASES
================================================================================

🧠 Scanner is used for:
- CLI tools that ask users for info (e.g., login forms, quizzes)
- Reading structured data from files (e.g., CSVs, configs)
- Tokenizing and parsing strings
- Taking runtime input in school/college projects
- Reading input for small games or interactive programs

================================================================================
⚙️ 8. UNDER THE HOOD (Advanced Internal Understanding)
================================================================================

✔️ Scanner works by **breaking input into tokens** using a delimiter (default is whitespace).
✔️ It wraps around other input streams like InputStream, File, or String.
✔️ Underneath, it uses a `Pattern` (regex) to split input.
✔️ Efficient for simple parsing but not suitable for high-performance streaming.

📍 Scanner is line-buffered: it waits for the user to press Enter before it processes input.
So if you type something but don’t press Enter, Scanner won’t proceed.

================================================================================
✅ 9. SUMMARY RECAP (Quick Table)
================================================================================

| Method           | Reads...                  |
|------------------|---------------------------|
| next()           | A single word/token       |
| nextLine()       | A whole line              |
| nextInt()        | An integer                |
| nextDouble()     | A decimal number          |
| nextBoolean()    | true/false                |
| hasNextX()       | Check if next token is X  |

================================================================================
🧪 10. EXPECTED INPUT BEHAVIOR EXAMPLES (DO NOT RUN)
================================================================================

// Example:
// Input: Hello 123
// next()       → "Hello"
// nextInt()    → 123

// Input:
// 25
// John
// nextInt()    → 25
// nextLine()   → "" ← empty string (because newline still pending!)
// nextLine()   → "John"

================================================================================
📌 END OF SCANNER THEORY NOTES
================================================================================
*/

/*
================================================================================
📘 JAVA SCANNER & USER INPUT - COMPLETE THEORY GUIDE
================================================================================
[THEORY OMITTED FOR BREVITY — already present above]
================================================================================
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 🔰 Create a Scanner instance to read input from the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);

        // ─────────────────────────────────────────────────────────────────────────
        // 🧑 USER DETAILS SECTION
        // ─────────────────────────────────────────────────────────────────────────

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // nextLine() reads the full name with spaces

        System.out.println("Enter your college year and your starting year:");
        // ⚠️ next() reads only the first word/token (e.g., "1st" or "2025", not both)
        String year = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads integer

        System.out.println("Enter your gpa: ");
        double gpa = scanner.nextDouble(); // Reads double (e.g., 3.5)

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean(); // Reads true/false

        // 🎉 Output the gathered information
        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("You're a " + year + " year student");
        System.out.println("Your GPA is: " + gpa);

        if (isStudent) {
            System.out.println("You are enrolled as a student!");
        } else {
            System.out.println("You are NOT enrolled as a student!");
        }

        // ─────────────────────────────────────────────────────────────────────────
        // 🚧 COMMON ISSUE DEMO: nextInt() + nextLine()
        // ─────────────────────────────────────────────────────────────────────────

        System.out.println("\nCOMMON ISSUE DEMO 👇");

        System.out.println("Enter your age: ");
        int ageIssue = scanner.nextInt(); // Reads number but leaves newline in buffer

        System.out.println("Enter your favourite color:");
        String colorIssue = scanner.nextLine(); // ⚠️ Gets skipped due to leftover newline

        System.out.println("You are " + ageIssue + " years old");
        System.out.println("Your favourite color is: " + colorIssue);

        /*
        OUTPUT:
        Enter your age:
        18
        Enter your favourite color:
        You are 18 years old
        Your favourite color is:
        (← empty, because `nextLine()` reads leftover newline)
        */

        // ─────────────────────────────────────────────────────────────────────────
        // ✅ FIXING THE ISSUE: Add extra nextLine() after nextInt()
        // ─────────────────────────────────────────────────────────────────────────

        System.out.println("\nFIXED VERSION ✅");

        System.out.println("Enter your age: ");
        int ageFix = scanner.nextInt();
        scanner.nextLine(); // 🛠️ Consume the leftover newline

        System.out.println("Enter your favourite color:");
        String colorFix = scanner.nextLine(); // ✅ Now works properly

        System.out.println("You are " + ageFix + " years old");
        System.out.println("Your favourite color is: " + colorFix);

        /*
        OUTPUT:
        Enter your age:
        18
        Enter your favourite color:
        Red
        You are 18 years old
        Your favourite color is: Red
        */

        // ─────────────────────────────────────────────────────────────────────────
        // 📐 EXERCISE: CALCULATE AREA OF TRIANGLE
        // ─────────────────────────────────────────────────────────────────────────

        // 💡 Quick version — calculate area directly using input
        System.out.println("\n🧮 CALCULATE AREA OF TRIANGLE (Quick Version)");
        System.out.println("Enter the base length of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area + " cm²");

        // 🧼 Better style: Declare variables at the top (more readable)
        double width = 0;
        double height2 = 0;
        double area2 = 0;

        System.out.println("\n🧮 CALCULATE AREA OF TRIANGLE (Structured Version)");
        System.out.println("Enter the width of the triangle (in cm): ");
        width = scanner.nextDouble();

        System.out.println("Enter the height of the triangle (in cm): ");
        height2 = scanner.nextDouble();

        area2 = 0.5 * width * height2;
        System.out.println("The area of the triangle is: " + area2 + " cm²");

        // ✅ Best Practice: Always close scanner when done (if no more input required)
        scanner.close();
    }
}

