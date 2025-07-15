/*
====================================================================================================
🔍 LOGICAL OPERATORS IN JAVA — COMPLETE THEORY DEEP DIVE
====================================================================================================

🎯 PURPOSE:
Logical operators in Java are used to connect two or more **boolean expressions** and return
a **single boolean result (true or false)**.

They are essential for **decision-making**, especially inside:
✅ if/else conditions
✅ while loops
✅ boolean validations
✅ form input checking
✅ access control, etc.

====================================================================================================
🧠 LOGICAL OPERATORS OVERVIEW
====================================================================================================

| Operator | Name            | Description                                             |
|----------|-----------------|---------------------------------------------------------|
|   &&     | Logical AND      | Returns true only if BOTH expressions are true         |
|   ||     | Logical OR       | Returns true if AT LEAST ONE expression is true        |
|   !      | Logical NOT      | Reverses the truth value of the expression             |

====================================================================================================
🔗 1. LOGICAL AND (&&)
====================================================================================================

✔️ Returns true only when **both** conditions are true.

📌 Syntax:
    condition1 && condition2

📦 Example
    boolean hasLicense = true;
    boolean hasHelmet = true;

    if (hasLicense && hasHelmet) {
        // Output: You can ride the bike.


📌 Truth Table:
        | A     | B     | A && B |
        |-------|-------|--------|
        | true  | true  | true   |
        | true  | false | false  |
        | false | true  | false  |
        | false | false | false  |

====================================================================================================
        🔗 2. LOGICAL OR (||)
====================================================================================================

        ✔️ Returns true when **at least one** condition is true.

        📌 Syntax:
condition1 || condition2

📦 Example:

    boolean hasPassport = true;
    boolean hasID = false;

    if (hasPassport || hasID) {
        // Output: You can enter the exam hall.
    }


        📌 Truth Table:
        | A     | B     | A || B |
        |-------|-------|--------|
        | true  | true  | true   |
        | true  | false | true   |
        | false | true  | true   |
        | false | false | false  |

====================================================================================================
        🔄 3. LOGICAL NOT (!)
====================================================================================================

        ✔️ Used to **invert** or **negate** a condition.

        📌 Syntax:
        !condition

📦 Example:

    boolean isLoggedIn = false;

    if (!isLoggedIn) {
        // Output: Please log in first.
    }


        📌 Truth Table:
        | A     | !A    |
        |-------|-------|
        | true  | false |
        | false | true  |

====================================================================================================
        ⚙️ 4. COMBINING LOGICAL OPERATORS
====================================================================================================

        📦 Example:

    int age = 20;
    boolean hasTicket = true;

    if ((age >= 18 && age <= 25) && hasTicket) {
        // Output: You may enter the concert.
    }


        🧠 You can group multiple conditions using **parentheses** `()` to control precedence.

====================================================================================================
        📚 5. REAL-WORLD USE CASES
====================================================================================================

✔️ Form validations (e.g. email is not empty AND password is strong)
✔️ Game logic (e.g. player has enough health AND ammo)
✔️ Security checks (e.g. user is admin OR moderator)
✔️ Input sanitization (e.g. field is not null AND not empty)

====================================================================================================
        🚧 6. COMMON MISTAKES & TIPS
====================================================================================================

❌ Using `=` instead of `==` inside logical conditions:
if (x = 5 && y = 10) → wrong (assignment, not comparison)

✅ Always use `==`, `!=`, `<`, `>`, etc. inside logical operators.

❌ Forgetting `()` when mixing `&&` and `||` → may lead to unexpected precedence.

✅ Always prioritize clarity using parentheses!

====================================================================================================
🔎 7. SHORT-CIRCUIT EVALUATION
====================================================================================================

Java uses **short-circuit evaluation** for `&&` and `||`:

        ✔️ AND (`&&`): If the first condition is false, the second is never evaluated.
✔️ OR (`||`): If the first condition is true, the second is skipped.

        📦 Example:

    int x = 5;
    if (x > 10 && expensiveFunction()) {
        // expensiveFunction() won't be called if x > 10 is false
    }


Why? ✅ This improves performance & prevents unnecessary computation.

====================================================================================================
        🧠 8. BEST PRACTICES
====================================================================================================

        🔹 Use descriptive boolean variable names (e.g., isAvailable, hasPermission)
🔹 Always use parentheses to avoid confusion
🔹 Combine logic with caution – too many nested operators can hurt readability
🔹 Don't overuse `!` – double negatives like `!isNotEmpty` are hard to read
        🔹 Break complex logic into smaller helper methods for better clarity

====================================================================================================
        🎓 9. SUMMARY TABLE
====================================================================================================

        | Operator | Meaning         | Example                   | Result                        |
        |----------|------------------|---------------------------|-------------------------------|
        | &&       | Logical AND      | `true && true`            | true                          |
        | ||       | Logical OR       | `true || false`           | true                          |
        | !        | Logical NOT      | `!true`                   | false                         |
        | Combined | Mixed Logic      | `(a > 5 || b == 3) && ok` | true if all evaluates to true|

====================================================================================================
        🎉 YOU'RE NOW A LOGICAL OPERATOR MASTER!
====================================================================================================
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ====================================================================================================
        🔍 LOGICAL OPERATORS PRACTICE WITH CONDITIONS
        ====================================================================================================

        && = Logical AND → returns true only if ALL conditions are true
        || = Logical OR  → returns true if AT LEAST ONE condition is true
        !  = Logical NOT → inverts the boolean value (true → false, false → true)

        Let's simulate this with a weather-check and a username validation demo.
        ====================================================================================================
        */

        // 🔆 WEATHER CONDITIONS EXAMPLE

        double temp = 20;          // temperature in °C
        boolean isSunny = false;   // is it sunny outside?

        // 🌤️ Check if temperature is in a comfortable range AND it's sunny
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("🌞 The weather is GOOD!");
            System.out.println("It is SUNNY outside.");
        }

        // ☁️ Same comfortable temp range BUT it's cloudy (not sunny)
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("🌥️ The weather is GOOD!");
            System.out.println("It is CLOUDY outside.");
        }

        // 🔥❄️ Extremely hot or cold weather
        else if (temp > 30 || temp < 0) {
            System.out.println("⛔ The weather is BAD!");
        }

        /*
        ====================================================================================================
        🧪 USERNAME VALIDATION EXAMPLE (Using Logical Operators)
        ====================================================================================================

        📝 RULES:
        - Username must be between 4 to 12 characters in length
        - Username must NOT contain spaces (" ") or underscores ("_")

        We'll use:
        - `||` to catch either too short or too long
        - `contains(" ") || contains("_")` to catch invalid characters
        ====================================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("\nEnter your new username: ");
        username = scanner.nextLine();

        // ❌ INVALID: Length not within 4–12
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("⚠️ Username must be between 4–12 characters long!");
        }

        // ❌ INVALID: Contains space or underscore
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("⚠️ Username must NOT contain spaces or underscores!");
        }

        // ✅ VALID username
        else {
            System.out.println("✅ Welcome, " + username + "! Your username has been set.");
        }

        scanner.close();
    }
}
