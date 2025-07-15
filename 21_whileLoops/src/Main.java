/*
=====================================================================================================
📘 JAVA LOOPS – WHILE LOOP 🔁
=====================================================================================================

🔰 LEVEL: Beginner ➤ Advanced
📦 CATEGORY: Control Flow (Looping)

=====================================================================================================
💡 WHAT IS A WHILE LOOP?
=====================================================================================================

🔁 A `while` loop in Java is a **control flow statement** that repeatedly executes a block of code
   **as long as a given condition is true**.

📌 Think of it like a **repeating question**:
    ➤ "Is this still true? If yes, run the code again. If not, stop."

-----------------------------------------------------------------------------------------------------
🧠 BASIC STRUCTURE:

while(condition) {
    // block of code (loop body)
}

🔸 The condition is a boolean expression (true or false).
🔸 The loop continues until the condition becomes false.
🔸 If the condition is false on the first check → the loop body will NOT execute even once.

-----------------------------------------------------------------------------------------------------
🔁 Example:
// int i = 0;
// while(i < 5) {
//     System.out.println("Hello!");
//     i++;
// }

Expected Output:
Hello!
Hello!
Hello!
Hello!
Hello!

-----------------------------------------------------------------------------------------------------
📝 Real-life analogy:
Imagine your phone is charging while the battery is less than 100%.
→ While (battery < 100%) → keep charging.
Once battery hits 100%, stop.

=====================================================================================================
🧩 COMPONENTS OF A WHILE LOOP
=====================================================================================================

1️⃣ Initialization – Set a starting point (e.g., `int i = 0;`)
2️⃣ Condition – The condition to check before each loop iteration (`i < 10`)
3️⃣ Update – Some way to progress toward ending the loop (`i++`)

⚠️ If you forget to update the loop variable → you might create an infinite loop!

-----------------------------------------------------------------------------------------------------
💀 INFINITE LOOP EXAMPLE (CAUTION!)
// int i = 0;
// while(i < 5) {
//     System.out.println("Infinite Loop"); // i is never updated
// }

This loop never stops because the condition is always true.

=====================================================================================================
🧪 WHEN TO USE A WHILE LOOP?
=====================================================================================================

✔️ When you don’t know **how many times** you need to repeat something ahead of time.
✔️ When you want to keep repeating something **as long as a condition is true**.

✅ Great for:
- Reading user input until it's valid
- Waiting for a process to finish
- Polling / monitoring status
- Repeating menu options

=====================================================================================================
🔄 VARIANTS OF WHILE LOOP
=====================================================================================================

1️⃣ WHILE LOOP
Executes **0 or more times**
⏳ Checks condition BEFORE running the block.

2️⃣ DO-WHILE LOOP
Executes **at least once**
🚀 Runs the block FIRST, then checks the condition.

Example:
// int i = 0;
// do {
//     System.out.println(i);
//     i++;
// } while(i < 5);

3️⃣ FOR LOOP
More compact, but good when you know the iteration count.

=====================================================================================================
📛 COMMON MISTAKES
=====================================================================================================

🚫 Forgetting to update the loop variable → Infinite loop
🚫 Using `=` instead of `==` in condition
🚫 Misplaced semicolon (;) after `while` → creates a null loop

Example of BAD syntax:
// while(i < 5); ❌ ← This semicolon ends the loop prematurely

=====================================================================================================
🔐 NESTED WHILE LOOPS
=====================================================================================================

Just like `for` loops, `while` loops can be **nested** inside each other.

Example:
// int i = 1;
// while(i <= 3){
//     int j = 1;
//     while(j <= 3){
//         System.out.print("*");
//         j++;
//     }
//     System.out.println();
//     i++;
// }

Output:
***
***
***

=====================================================================================================
⚙️ BREAK & CONTINUE STATEMENTS
=====================================================================================================

🔓 `break;` – Exits the loop immediately
🔄 `continue;` – Skips to the next iteration

Example:
while(true){
    int input = scanner.nextInt();
    if(input == -1){
        break; // Stop the loop
    }
    if(input == 0){
        continue; // Skip this round
    }
    System.out.println("You entered: " + input);
}

=====================================================================================================
✅ SUMMARY CHEATSHEET
=====================================================================================================

| Term         | Meaning                               |
|--------------|----------------------------------------|
| `while`      | Loop with pre-checked condition        |
| `do-while`   | Loop with post-checked condition       |
| `for`        | Loop with built-in initialization, condition, update |
| `break`      | Exit the loop                         |
| `continue`   | Skip to next loop cycle               |

=====================================================================================================
💬 FINAL THOUGHT:
=====================================================================================================

📎 Use `while` when:
✔️ You don’t know how many iterations you’ll need
✔️ You want to keep asking/checking something until a condition changes

🎯 Remember to always plan how and when the loop should stop!

=====================================================================================================
📌 NEXT STEP:
Try writing your own while loop program:
- Create a login system that keeps asking for a password until it's correct
- Countdown timer
- Number guessing game
=====================================================================================================
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 🔁 WHILE LOOP: Keeps repeating as long as a condition remains TRUE
        // 📌 Use case: when we don’t know exactly how many times we need to repeat

        Scanner scanner = new Scanner(System.in);

        // ──────────────────────────────────────────────────────
        // ✅ EXAMPLE 1: Ask the user for a name until they enter one
        // ──────────────────────────────────────────────────────
        String name = "";

        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine(); // Keeps looping until input is NOT empty
        }

        System.out.println("Hello " + name + "! 😄");

        // ──────────────────────────────────────────────────────
        // 🔁 INFINITE LOOP DEMO (commented out for safety!)
        // ──────────────────────────────────────────────────────
//        while(1 == 2){
//            System.out.println("HELP! I'M STUCK IN A LOOP! 😱");
//        }

        // ──────────────────────────────────────────────────────
        // ✅ EXAMPLE 2: Simple game loop that ends on "Q"
        // ──────────────────────────────────────────────────────
        String response = "";

        while(!response.equals("Q")) {
            System.out.println("🎮 You are playing a game!");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase(); // Convert input to uppercase
        }

        System.out.println("🚪 You have quit the game!");

        // ──────────────────────────────────────────────────────
        // ✅ EXAMPLE 3: Validate age (no negatives)
        // ──────────────────────────────────────────────────────
        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0) {
            System.out.println("⚠️ Your age can't be negative!");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("✅ You are " + age + " years old!");

        // ──────────────────────────────────────────────────────
        // 🔁 DO-WHILE LOOP: Same logic, but runs AT LEAST once
        // ──────────────────────────────────────────────────────
        // 📌 Good for validation where we want to check AFTER first run

        do {
            System.out.println("Enter your age again (no negatives): ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("🔁 Re-confirmed: You are " + age + " years old!");

        // ──────────────────────────────────────────────────────
        // ✅ EXAMPLE 4: Pick a number between 1 and 10
        // ──────────────────────────────────────────────────────
        int number = 0;

        do {
            System.out.println("🎯 Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10); // Repeat until valid input

        System.out.println("You picked: " + number + " ✅");

        // ✅ Always close the scanner at the end
        scanner.close();
    }
}

