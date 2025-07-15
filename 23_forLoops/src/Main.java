/*
╔════════════════════════════════════════════════════════╗
║           🔁 COMPLETE THEORY: FOR LOOPS IN JAVA        ║
╚════════════════════════════════════════════════════════╝

🧠 WHAT IS A "FOR" LOOP?
─────────────────────────────
A `for` loop is a control flow statement used to repeat a block of code a known number of times.

📦 It's the most commonly used loop when the number of iterations is known beforehand.

🧩 THINK OF IT AS:
  "Repeat this action *X* times while this condition is true."

🎯 PURPOSE:
─────────────────────────────
Used when:
✔ You know in advance how many times you want to loop.
✔ You're iterating over arrays, strings, or ranges of numbers.
✔ You want precise control over the loop counter.

---------------------------------------------------------
🧱 STRUCTURE / SYNTAX
---------------------------------------------------------

for(initialization; condition; update){
    // block of code to execute
}

🔍 Each part explained:

1️⃣ Initialization → executed once before the loop starts.
   (e.g., `int i = 0`)

2️⃣ Condition → evaluated *before* every iteration.
   If true → execute the loop body.
   If false → exit the loop.

3️⃣ Update → executed *after* every iteration.
   Usually increments/decrements the loop counter.
   (e.g., `i++`)

🌐 Example:

for(int i = 1; i <= 5; i++){
    System.out.println("Loop #" + i);
}

🔁 OUTPUT:
Loop #1
Loop #2
Loop #3
Loop #4
Loop #5

---------------------------------------------------------
📌 REAL-WORLD ANALOGY
---------------------------------------------------------
Imagine a treadmill at a gym:
- You set it to run for 30 minutes → Initialization
- Each minute, it checks if time is up → Condition
- After each minute, it increases time passed → Update

---------------------------------------------------------
🔧 VARIATIONS OF FOR LOOPS
---------------------------------------------------------

✅ INCREMENTING LOOP:
for(int i = 0; i < 10; i++) {
    // runs from 0 to 9
}

✅ DECREMENTING LOOP:
for(int i = 10; i >= 0; i--) {
    // counts down from 10 to 0
}

✅ CUSTOM STEP SIZE:
for(int i = 0; i <= 100; i += 10) {
    // increments by 10: 0, 10, 20, ..., 100
}

✅ INFINITE LOOP (⚠️ Dangerous):
for(;;) {
    // condition never false, runs forever unless broken manually
}

✅ LOOPING THROUGH STRINGS:
String name = "Rehan";
for(int i = 0; i < name.length(); i++){
    System.out.println(name.charAt(i));
}

✅ LOOPING THROUGH ARRAYS:
String[] fruits = {"Apple", "Banana", "Mango"};
for(int i = 0; i < fruits.length; i++){
    System.out.println(fruits[i]);
}

---------------------------------------------------------
🚫 COMMON MISTAKES TO AVOID
---------------------------------------------------------

❌ Forgetting to increment or decrement `i`
   → Causes an infinite loop.

❌ Off-by-one errors:
   e.g., using `i <= array.length` instead of `i < array.length`
   → Can throw `ArrayIndexOutOfBoundsException`

❌ Using wrong data type in update:
   e.g., `i = i + 0.5` (invalid for `int i`)

---------------------------------------------------------
🎯 BEST PRACTICES
---------------------------------------------------------

✔ Use `for` loops when count-based iterations are needed.
✔ Use meaningful variable names if nested (e.g., `i`, `j`, `k`)
✔ Keep loop logic readable and simple.
✔ Use enhanced `for-each` loops for collections or arrays if index not needed.

---------------------------------------------------------
💡 ADVANCED: NESTED FOR LOOPS
---------------------------------------------------------

📌 You can put a for loop inside another for loop:

for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 2; j++){
        System.out.println("Row " + i + ", Column " + j);
    }
}

🔁 OUTPUT:
Row 1, Column 1
Row 1, Column 2
Row 2, Column 1
Row 2, Column 2
Row 3, Column 1
Row 3, Column 2

Use nested loops for:
✔ Tables
✔ Grids
✔ Patterns
✔ Matrix operations

---------------------------------------------------------
🧪 WHEN TO USE FOR LOOPS VS WHILE LOOPS
---------------------------------------------------------

| Use "for" loop when:               | Use "while" loop when:              |
|-----------------------------------|-------------------------------------|
| You know the number of iterations | The number of repetitions is unknown |
| Iterating over arrays/strings     | Waiting for user input or a condition |
| Need predictable control flow     | Need flexible conditions            |

---------------------------------------------------------
🧾 SUMMARY TABLE
---------------------------------------------------------

| Component      | Description                        |
|----------------|------------------------------------|
| Initialization | Happens once before loop starts    |
| Condition      | Checked before each iteration      |
| Update         | Happens after each iteration       |
| Body           | Executes if condition is true      |

---------------------------------------------------------
📚 FUN FACTS
---------------------------------------------------------
✨ The `for` loop was introduced in Java since its inception.
✨ You can nest as many `for` loops as needed (but use wisely).
✨ Java also has a `for-each` loop → used for collections & arrays.

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 🔁 FOR LOOP BASICS ========================================
        // A for loop repeats a block of code a CERTAIN number of times.
        // Syntax: for(initialization; condition; update){ ... }

        // ✅ Example 1: Print numbers from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // Prints 0 to 9
        }

        // ✅ Example 2: Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Prints 1 to 10
        }

        // ✅ Example 3: Countdown from 10 to 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i); // Prints 10 to 1
        }

        // ✅ Example 4: Print even numbers from 0 to 9
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i); // Prints 0, 2, 4, 6, 8
        }

        // 💡 DYNAMIC USER INPUT EXAMPLE ==============================
        // Ask user how many times to loop and print numbers from 1 to N

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i); // Prints 1 to user-entered max
        }

        // 🎉 MINI PROJECT - COUNTDOWN TIMER ==========================
        // Count down like a real timer with 1 second delay

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pauses for 1000ms = 1 second
        }

        System.out.println("🎆 HAPPY NEW YEAR! 🎆");

        scanner.close();
    }
}
