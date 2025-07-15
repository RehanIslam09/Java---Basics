/*
====================================================================================
🎯 JAVA TERNARY OPERATOR – COMPLETE THEORY GUIDE (Beginner ➡️ Advanced)
====================================================================================

🧠 WHAT IS THE TERNARY OPERATOR?
------------------------------------------------------------------------------------
The **ternary operator** is a shorthand for writing simple `if-else` statements
in Java. It’s called **"ternary"** because it involves **three operands**.

📌 Syntax:
-----------

    condition ? expressionIfTrue : expressionIfFalse;

✅ If the condition is true ➡️ expressionIfTrue is executed
❌ If the condition is false ➡️ expressionIfFalse is executed

📦 It’s a concise alternative to:
--------------------------------
    if (condition) {
        return value1;
    } else {
        return value2;
    }

👆 The ternary operator does the same in **one line**.

====================================================================================
🔣 BASIC STRUCTURE AND SYNTAX
====================================================================================

(condition) ? value_if_true : value_if_false;

🧩 Components:
--------------
- `condition`        → a boolean expression (evaluates to true or false)
- `value_if_true`    → returned if condition is true
- `value_if_false`   → returned if condition is false

📌 You can store the result in a variable:
    int max = (a > b) ? a : b;

====================================================================================
🧪 EXAMPLES (THEORY ONLY – NO EXECUTION HERE)
====================================================================================

🔸 Example 1: Determine greater value
    int max = (a > b) ? a : b;

🔸 Example 2: Check if a number is even or odd
    String result = (num % 2 == 0) ? "Even" : "Odd";

🔸 Example 3: Assign discount based on age
    double discount = (age >= 60) ? 0.20 : 0.10;

🔸 Example 4: Nested ternary (⚠️ Not recommended unless very clear!)
    String grade = (score >= 90) ? "A" :
                   (score >= 80) ? "B" :
                   (score >= 70) ? "C" : "F";

====================================================================================
⚠️ WHEN (AND WHEN NOT) TO USE THE TERNARY OPERATOR
====================================================================================

✅ When:
- You have a **simple conditional assignment**
- Code clarity is not affected
- You're assigning a value based on a boolean condition

❌ Avoid when:
- You’re doing **multiple actions or side effects**
- You need multiple conditions AND it hurts readability
- You're handling long expressions or logic chains

Example of BAD use:
-------------------
    (age >= 18) ? System.out.println("Adult") : System.out.println("Child");

🚫 Reason: Ternary should return **values**, not control flow!

====================================================================================
💡 BEST PRACTICES
====================================================================================

✔️ Keep ternary operations simple
✔️ Use parentheses for readability if nested
✔️ Don’t use it if `if-else` is more expressive
✔️ Use it only for value assignment (not full logic blocks)
✔️ Avoid nesting ternaries unless absolutely needed

====================================================================================
🔧 UNDER THE HOOD (ADVANCED)
====================================================================================

- The ternary operator is actually just **syntactic sugar** for `if-else`.
- Under the hood, the compiler replaces it with branching logic.
- It works with all data types (int, String, double, etc.)
- Can be **used in return statements** for clean expression-based returns.

    Example:
    return (score >= 40) ? "Pass" : "Fail";

====================================================================================
📌 SUMMARY TABLE – QUICK LOOKUP
====================================================================================

| Concept       | Description                                |
|---------------|--------------------------------------------|
| ?:            | Ternary Operator syntax                    |
| condition     | Boolean expression to evaluate             |
| true result   | Value returned if condition is true        |
| false result  | Value returned if condition is false       |
| Return type   | Must be the same or compatible types       |
| Use case      | Replacing short if-else value assignments  |

====================================================================================
🧠 TL;DR
====================================================================================

- Use `?:` as a **compact version** of `if-else`.
- Works well for **single-line expressions**.
- Do NOT use it for multiple statements or complex logic.
- Improves readability if used wisely.

====================================================================================
*/




public class Main {
    public static void main(String[] args) {

        /*
        ==================================================================================
        🎯 TERNARY OPERATOR IN ACTION – BEAUTIFIED EXAMPLES
        ==================================================================================

        🧠 SYNTAX REMINDER:
        --------------------
        variable = (condition) ? valueIfTrue : valueIfFalse;

        🔹 It's a one-liner shorthand for simple if-else statements.
        🔹 Improves readability for short conditional value assignments.

        ==================================================================================
        ✅ EXAMPLE 1: CHECK PASS OR FAIL USING IF-ELSE AND TERNARY
        ==================================================================================
        */

        int score = 70;

        // 🧾 Traditional if-else method
        if (score >= 60) {
            System.out.println("Pass!");
        } else {
            System.out.println("Fail!");
        }

        // ✅ Ternary version (MUCH CLEANER!)
        String passOrFail = (score >= 60) ? "YOU'VE PASSED! 🎉" : "YOU'VE FAILED! 😢";
        System.out.println(passOrFail);

        /*
        ==================================================================================
        ✅ EXAMPLE 2: CHECK IF NUMBER IS EVEN OR ODD
        ==================================================================================
        */

        int number = 6;

        String evenOrOdd = (number % 2 == 0) ? "It's an even number 🔢" : "It's an odd number 🔹";
        System.out.println(evenOrOdd);

        /*
        ==================================================================================
        ✅ EXAMPLE 3: DETERMINE TIME OF DAY (AM/PM)
        ==================================================================================
        */

        int hours = 9;

        String timeOfDay = (hours >= 12) ? "P.M. 🌙" : "A.M. ☀️";
        System.out.println("Current hour: " + hours + " → " + timeOfDay);

        /*
        ==================================================================================
        ✅ EXAMPLE 4: CALCULATE TAX RATE BASED ON INCOME
        ==================================================================================
        */

        int income = 60000;

        // If income is >= 40000 → tax = 25%, else → 15%
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println("Annual Income: $" + income);
        System.out.println("Tax Rate Applied: " + (taxRate * 100) + "%");

        /*
        ==================================================================================
        🔁 SUMMARY OF WHAT WE LEARNED
        ==================================================================================
        ✔️ Ternary operator is useful for:
           - Short if-else decisions
           - Cleaner value assignments
           - One-liners that improve code readability

        ❗ Avoid using ternary for complex logic or actions (use regular if-else then)
        ✅ Use it for expressions, not for control flow

        */
    }
}
