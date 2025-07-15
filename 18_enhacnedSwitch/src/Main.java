/*
================================================================================
🔄 ENHANCED SWITCH STATEMENT IN JAVA – COMPLETE THEORY (Beginner → Advanced)
================================================================================

🧠 WHAT IS A SWITCH STATEMENT?
------------------------------
The `switch` statement is a control flow tool used to compare one value
against a list of possible values (called "cases").

📌 It's often cleaner than writing multiple if-else-if conditions.

📦 Example use case:
    - Determine actions based on a day of the week
    - Respond to user commands
    - Map inputs to outputs quickly

================================================================================
⛔ CLASSIC SWITCH (BEFORE JAVA 14) – OLD WAY
================================================================================

switch (day) {
    case "Monday":
        System.out.println("Start of week");
        break;
    case "Friday":
        System.out.println("Almost weekend!");
        break;
    default:
        System.out.println("Just another day");
}

🧨 Problems:
- ❗ Requires `break` to prevent accidental fall-through
- ❗ Cannot return values directly
- ❗ Verbose and error-prone

================================================================================
✅ ENHANCED SWITCH (JAVA 14+ WITH PREVIEW, JAVA 17+ OFFICIALLY)
================================================================================

🆕 Syntax with `->` (arrow functions):
- Cleaner
- No need for `break`
- Supports returning values directly (switch *expressions*)

📌 Example:

switch (day) {
    case "Monday" -> System.out.println("Start of the week");
    case "Friday" -> System.out.println("Almost weekend!");
    default -> System.out.println("Just another day");
}

================================================================================
📦 ENHANCED SWITCH WITH RETURN VALUE (AS AN EXPRESSION)
================================================================================

String mood = switch (day) {
    case "Monday" -> "😴 Sleepy";
    case "Friday" -> "🎉 Excited!";
    default -> "🙂 Chill";
};
System.out.println(mood);

📌 Now you can assign switch results directly into variables!

================================================================================
🔁 MULTIPLE CASE LABELS (GROUPED CASES)
================================================================================

String category = switch (fruit) {
    case "Apple", "Banana", "Mango" -> "Fruit";
    case "Carrot", "Spinach" -> "Vegetable";
    default -> "Unknown";
};

📌 Cleaner alternative to repeating the same output across cases.

================================================================================
🎯 COMPLEX LOGIC WITH `yield` (Multi-line blocks)
================================================================================

int statusCode = switch (response) {
    case "OK" -> 200;
    case "NOT_FOUND" -> 404;
    case "ERROR" -> {
        System.out.println("Logging error...");
        yield 500;
    }
    default -> 0;
};

📌 Use `yield` to return a value from a multi-line block.

================================================================================
📚 SWITCH ON PRIMITIVES, STRINGS, ENUMS
================================================================================

You can use `switch` with:
✔️ int, byte, short, char
✔️ String
✔️ Enum types

❌ You CANNOT use:
- long, float, double
- Objects (non-enum)

================================================================================
📌 WHEN TO USE SWITCH VS IF-ELSE
================================================================================

Use `switch` when:
✔️ You're checking ONE variable
✔️ Comparing against known constant values
✔️ Better readability

Use `if-else` when:
✔️ Comparing ranges, conditions
✔️ Involving multiple variables or more complex expressions

================================================================================
💡 REAL-WORLD USE CASES
================================================================================

🗓️ Weekday planner:
    switch (day) → Show task or suggestion

🎮 Game difficulty:
    switch (level) → Set parameters

📋 Menu system:
    switch (option) → Perform selected operation

📊 Error status codes:
    switch (code) → Return proper response

================================================================================
⚠️ COMMON MISTAKES TO AVOID
================================================================================

🚫 Using old `switch` with no `break` → causes fall-through bugs
✅ Enhanced switch has NO fall-through by default

🚫 Forgetting `yield` when using multi-line block
✅ Use `yield` if your block has more than one statement

================================================================================
📌 ENHANCED SWITCH SYNTAX SUMMARY
================================================================================

| Feature                 | Classic Switch | Enhanced Switch |
|------------------------|----------------|-----------------|
| Uses arrow syntax `->` | ❌              | ✅              |
| Returns values         | ❌              | ✅              |
| Break required         | ✅              | ❌              |
| Fall-through risk      | ✅              | ❌              |
| Multi-label cases      | ✅              | ✅              |
| Supports enums, String | ✅              | ✅              |
| Supports expressions   | ❌              | ✅              |

================================================================================
🧪 SAMPLE ENHANCED SWITCH EXPRESSION – SUPER CLEAN!
================================================================================

String role = "admin";

String permission = switch (role) {
    case "admin" -> "Full Access";
    case "user" -> "Limited Access";
    case "guest" -> "Read-Only";
    default -> "No Access";
};

System.out.println("Permission: " + permission);

================================================================================
✅ CONCLUSION – WHY USE ENHANCED SWITCH?
================================================================================

🎯 Cleaner, concise, modern
🎯 Avoids fall-through bugs
🎯 Supports returning values (expressions)
🎯 Matches modern Java coding standards (Java 17+)

📌 Recommended for all new projects – it makes your code easier to read, write, and maintain!

================================================================================
🔚 END OF ENHANCED SWITCH THEORY
================================================================================
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ================================================================================
        🔄 ENHANCED SWITCH STATEMENT – JAVA 14+ FEATURE
        ================================================================================

        🎯 PURPOSE:
        A modern replacement for multiple `else-if` or classic `switch` blocks.
        The new syntax is:

            switch (value) {
                case X -> // do something;
                case Y -> // do something else;
                default -> // fallback;
            }

        ✅ BENEFITS:
        - Cleaner syntax (uses `->` instead of `:`)
        - No need for `break`
        - No fall-through bugs
        - Can return values (with `yield`)
        - Allows grouping multiple cases together

        🧠 Real-world use: Great for menu options, day matching, user input routing, etc.

        ================================================================================
        */

        Scanner scanner = new Scanner(System.in);

        // 🧑 Prompt the user to enter a day of the week
        System.out.println("📅 Enter the day of the week: ");
        String day = scanner.nextLine();

        /*
        ================================================================================
        🧪 CLASSIC WAY (Verbose and Repetitive)

        switch (day){
            case "Monday" -> System.out.println("It is a weekday!");
            case "Tuesday" -> System.out.println("It is a weekday!");
            ...
            case "Sunday" -> System.out.println("It is the weekend!");
            default -> System.out.println("Invalid day!");
        }
        ================================================================================
        */

        /*
        ================================================================================
        ✅ EFFICIENT ENHANCED SWITCH VERSION (Grouped Cases)
        ================================================================================
        */

        switch (day) {
            // 🏢 Weekdays group
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("🗓️ It is a weekday!");

            // 🏖️ Weekends group
            case "Saturday", "Sunday" ->
                    System.out.println("🎉 It is the weekend!");

            // ❌ Invalid input fallback
            default ->
                    System.out.println("❌ '" + day + "' is not a valid day!");
        }

        // 🔒 Always remember to close the Scanner to free up system resources!
        scanner.close();
    }
}

