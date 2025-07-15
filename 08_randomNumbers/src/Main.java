/*
====================================================================================
🎲 JAVA RANDOM NUMBER GENERATION - COMPLETE THEORY GUIDE (Beginner to Advanced)
====================================================================================

📦 CLASS USED: java.util.Random
-------------------------------------
Java provides the `Random` class to help generate **pseudo-random numbers**.

🧠 What is pseudo-random?
------------------------------
Pseudo-random numbers are numbers that appear random, but are actually generated
using a formula. They're deterministic based on an internal **seed**.
If the same seed is used again, the same sequence will be repeated.

====================================================================================
🧭 WHEN TO USE RANDOM?
-------------------------------------
Use `Random` when you want your program to:
✔️ Simulate real-world randomness (e.g., dice rolls, coin flips)
✔️ Make games more dynamic (random enemies, weapons, events)
✔️ Generate test data (e.g., random usernames, test scores)
✔️ Randomize behavior (e.g., shuffling, animations, transitions)
✔️ Create quizzes or randomized outputs
❌ Don't use it for cryptography (use `SecureRandom` instead)

====================================================================================
🛠️ HOW TO USE THE RANDOM CLASS?
-------------------------------------
1️⃣ First, import the class:
    import java.util.Random;

2️⃣ Then, create a Random object:
    Random rand = new Random();

3️⃣ Use methods like:
    rand.nextInt();       → Any int (positive or negative)
    rand.nextInt(10);     → Int between 0 (inclusive) and 10 (exclusive)
    rand.nextDouble();    → Decimal between 0.0 and 1.0
    rand.nextBoolean();   → true or false

🧠 Analogy:
---------------
Imagine `Random` as a dice factory. You can ask it:
- Give me a 6-sided dice result → `rand.nextInt(6) + 1`
- Give me a random yes/no → `rand.nextBoolean()`

====================================================================================
🧪 RANDOM METHODS OVERVIEW
-------------------------------------

| Method                | Description                                        |
|------------------------|----------------------------------------------------|
| nextInt()              | Any integer (positive or negative)                |
| nextInt(n)             | Integer from 0 to n-1                             |
| nextDouble()           | Decimal between 0.0 and 1.0                       |
| nextBoolean()          | Random boolean: true or false                    |
| nextFloat()            | Decimal from 0.0 to 1.0 (float version)           |
| nextLong()             | Random long integer                               |
| setSeed(long seed)     | Set seed manually for reproducibility             |

====================================================================================
📌 SAMPLE USAGE (JUST FOR THEORY, NOT TO EXECUTE HERE)
-------------------------------------
Example 1:
-----------
// Random rand = new Random();
// int number = rand.nextInt(10);  // Generates 0 to 9

Example 2:
-----------
// boolean isHeads = rand.nextBoolean();  // Simulates coin flip

Example 3:
-----------
// String[] colors = {"Red", "Green", "Blue"};
// String randomColor = colors[rand.nextInt(colors.length)];

====================================================================================
⚙️ INTERNAL WORKINGS – HOW RANDOM WORKS UNDER THE HOOD
-------------------------------------
🔸 Java uses a **Linear Congruential Generator (LCG)** internally.

   Formula:
     seed = (seed * multiplier + addend) % modulus

🔹 Each number is based on the previous one (hence “pseudo”).
🔹 If you set the same seed again → same random sequence every time.
🔹 Behind the scenes, Random uses `System.nanoTime()` as the default seed if not provided.

====================================================================================
⚠️ COMMON MISTAKES TO AVOID
-------------------------------------

❌ Mistake: Thinking `rand.nextInt(6)` returns 1 to 6
✅ It returns 0 to 5 → Add 1 to shift range

❌ Mistake: Using Random for security like password generation
✅ Use `SecureRandom` instead for cryptography

❌ Mistake: Mixing multiple Random objects in short loops
✅ Reuse a single `Random` object to ensure true randomness

❌ Mistake: Assuming `nextInt()` is always positive
✅ Use `nextInt(bound)` to limit and control values

====================================================================================
🔐 SECURE RANDOM VS. RANDOM (COMPARISON)
-------------------------------------

| Feature           | Random                    | SecureRandom                     |
|-------------------|----------------------------|----------------------------------|
| Use Case          | Games, UI, simple tools    | Passwords, tokens, crypto keys   |
| Performance       | Very fast                  | Slower but more secure           |
| Predictability    | Predictable with same seed | Not predictable                  |
| Package           | java.util                  | java.security                    |

====================================================================================
✅ BEST PRACTICES
-------------------------------------
✔️ Always reuse the same `Random` instance — don’t create it in every loop
✔️ Add +1 or custom math to control range: `rand.nextInt(max - min + 1) + min`
✔️ Use clear naming for random variables (`randomAge`, `randomColor`)
✔️ Use `ThreadLocalRandom` in multi-threaded apps (faster, thread-safe)
✔️ Avoid hardcoding magic numbers → use constants

====================================================================================
📊 MATH.RANDOM() VS RANDOM CLASS
-------------------------------------

| Feature              | Math.random()          | Random class                    |
|----------------------|------------------------|----------------------------------|
| Return Type          | Only double (0.0–1.0)  | int, boolean, float, etc.        |
| Object Required?     | No                     | Yes (Random rand = new Random()) |
| Range Control        | Requires math          | Built-in methods available       |
| Seed Control         | ❌ Not available       | ✅ Can set manually              |

Example:
```java
// int number = (int)(Math.random() * 10);  // 0 to 9

====================================================================================
📌 FINAL TAKEAWAYS
✅ Random helps simulate real-world unpredictability
✅ Use nextInt(n) carefully — it excludes upper bound!
✅ Don’t use it for passwords or secure applications
✅ Seed the generator if you want repeatable sequences
✅ Prefer ThreadLocalRandom in high-concurrency applications

====================================================================================
🏁 END OF JAVA RANDOM THEORY NOTES 🏁
*/

// =============================================================================
// 🎲 JAVA RANDOM NUMBER GENERATION - CODED EXAMPLES
// =============================================================================
// 📦 import the Random class from java.util package
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // =============================================================================
        // 🧪 STEP 1: Create a Random object to use its methods
        // =============================================================================
        Random random = new Random(); // 🎯 This object helps us generate random values

        // =============================================================================
        // 🔢 EXAMPLE 1: Generate a completely random integer (positive or negative)
        // =============================================================================

        int number1;
        int number2;
        int number3;

        // ✅ This can be any int between -2,147,483,648 and 2,147,483,647
        number1 = random.nextInt();
        System.out.println("🎯 Completely random int (any range): " + number1);


        // =============================================================================
        // 🎲 EXAMPLE 2: Simulate rolling 3 dice (Each die has values between 1 and 6)
        // =============================================================================

        number1 = random.nextInt(1, 7); // min=1 (inclusive), max=7 (exclusive)
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println("\n🎲 Dice Roll Results:");
        System.out.println("Die 1: " + number1);
        System.out.println("Die 2: " + number2);
        System.out.println("Die 3: " + number3);


        // =============================================================================
        // 💯 EXAMPLE 3: Generate 3 random integers between 1 and 100
        // =============================================================================

        number1 = random.nextInt(1, 101); // Range: 1–100 inclusive
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println("\n💡 Random Numbers (1–100):");
        System.out.println("Number A: " + number1);
        System.out.println("Number B: " + number2);
        System.out.println("Number C: " + number3);


        // =============================================================================
        // 🧮 EXAMPLE 4: Generate a random decimal number between 0.0 and 1.0
        // =============================================================================

        double doubleNumber;
        doubleNumber = random.nextDouble(); // Always between 0.0 (inclusive) and 1.0 (exclusive)

        System.out.println("\n📉 Random Decimal (0.0 - 1.0): " + doubleNumber);


        // =============================================================================
        // 🪙 EXAMPLE 5: Simulate a coin toss (true = Heads, false = Tails)
        // =============================================================================

        boolean isHeads;
        isHeads = random.nextBoolean(); // randomly returns true or false

        System.out.println("\n🪙 Coin Flip Result:");
        if (isHeads) {
            System.out.println("✨ Heads!");
        } else {
            System.out.println("🌀 Tails!");
        }

        // =============================================================================
        // ✅ NOTES:
        // - The nextInt(int origin, int bound) version used here is available in Java 17+
        // - If you're using older versions, use: random.nextInt(bound) + min
        //
        // Example for Java < 17:
        // int result = random.nextInt(6) + 1; // 1 to 6 (inclusive)
        // =============================================================================
    }
}

