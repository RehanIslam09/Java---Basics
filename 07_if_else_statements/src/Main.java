import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 🔧 Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        /*
        ============================================================================================
        📘 JAVA IF-ELSE STATEMENTS – COMPLETE THEORY GUIDE (Beginner → Advanced)
        ============================================================================================

        🧠 WHAT IS A CONDITIONAL STATEMENT?

        A conditional statement lets your program **make decisions** based on certain conditions.

        ▸ It's like giving your code a brain: "IF this happens, THEN do that... ELSE do something else."

        ▸ Most real-world programs rely heavily on decision-making:
            - Logging in a user (if password matches)
            - Showing a warning (if battery is low)
            - Calculating grades (if score > 90 then A, else B, etc.)
            - Changing UI theme (if nightMode = true)

        ============================================================================================
        🔰 BASIC SYNTAX – IF STATEMENT
        ============================================================================================

        if (condition) {
            // block of code that runs if condition is TRUE
        }

        ▸ The condition is a **boolean expression** that evaluates to either true or false.
        ▸ If the condition is true, the code inside the block is executed.
        ▸ If the condition is false, the block is skipped.

        --------------------------------------------------------------------------------------------
        ✅ Example:
        int age = 18;

        if (age >= 18) {
            // This block runs because 18 >= 18 is true
            System.out.println("You are eligible to vote.");
        }
        --------------------------------------------------------------------------------------------

        ============================================================================================
        🔄 IF-ELSE STATEMENT
        ============================================================================================

        if (condition) {
            // runs if condition is true
        } else {
            // runs if condition is false
        }

        ▸ Use `else` to handle the opposite or fallback case.

        --------------------------------------------------------------------------------------------
        ✅ Example:
        int age = 15;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible yet.");
        }
        --------------------------------------------------------------------------------------------

        ============================================================================================
        🔗 IF - ELSE IF - ELSE LADDER
        ============================================================================================

        Use this when you have multiple **mutually exclusive** conditions to check.

        if (condition1) {
            // runs if condition1 is true
        } else if (condition2) {
            // runs if condition2 is true
        } else if (condition3) {
            // ...
        } else {
            // runs if none of the above conditions are true
        }

        ▸ The first true condition wins; others are ignored (short-circuiting).

        --------------------------------------------------------------------------------------------
        ✅ Example:
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
        --------------------------------------------------------------------------------------------

        ============================================================================================
        ⚠️ IMPORTANT RULES & PITFALLS
        ============================================================================================

        ▸ Only one block runs in an if-else-if ladder.
        ▸ Conditions must result in a boolean (`true` or `false`). You can’t write: if (5) ❌
        ▸ Always use **curly braces `{}`**, even if you write only 1 line. Prevents logic errors.
        ▸ Use indentation properly for readability.
        ▸ Avoid writing deeply nested `if-else` chains — extract logic into methods when needed.

        ============================================================================================
        ✅ BOOLEAN EXPRESSIONS & OPERATORS
        ============================================================================================

        You can use comparison and logical operators inside `if` conditions:

        ▸ Comparison:
            ==   → equals
            !=   → not equal
            >    → greater than
            <    → less than
            >=   → greater than or equal to
            <=   → less than or equal to

        ▸ Logical:
            &&   → AND (both must be true)
            ||   → OR (at least one must be true)
            !    → NOT (inverts true/false)

        --------------------------------------------------------------------------------------------
        ✅ Example:
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        --------------------------------------------------------------------------------------------

        ============================================================================================
        🧠 REAL WORLD USE CASES
        ============================================================================================

        ▸ Login authentication
        ▸ Showing/hiding UI elements
        ▸ Game logic (e.g., if playerHealth == 0 → Game Over)
        ▸ Calculating taxes or discounts
        ▸ Weather forecast logic (e.g., if temperature > 30 → show “Hot!”)

        ============================================================================================
        📊 ADVANCED: NESTED IF STATEMENTS
        ============================================================================================

        You can place an `if` inside another `if`. Use only when necessary — too much nesting can reduce readability.

        --------------------------------------------------------------------------------------------
        ✅ Example:
        if (loggedIn) {
            if (isAdmin) {
                System.out.println("Welcome Admin.");
            } else {
                System.out.println("Welcome User.");
            }
        } else {
            System.out.println("Please log in first.");
        }
        --------------------------------------------------------------------------------------------

        ============================================================================================
        🧾 COMPARISON VS ASSIGNMENT – COMMON BUG
        ============================================================================================

        ⚠️ Mistake: if (x = 5) ❌ (This assigns 5 to x instead of comparing)
        ✅ Correct: if (x == 5)

        Use `==` to compare values.
        Use `=` to assign values.

        ============================================================================================
        📌 SUMMARY – WHEN TO USE WHAT
        ============================================================================================

        ▸ Use `if` for one condition
        ▸ Use `if-else` when you want two possibilities (either/or)
        ▸ Use `if-else-if` when you want multiple mutually exclusive outcomes
        ▸ Use `nested if` when decisions depend on other decisions

        ============================================================================================
        🧪 MINI PRACTICE CHALLENGES (in your head or next file)
        ============================================================================================

        1. Check if a number is even or odd
        2. Determine if a user is eligible for driving license based on age and test score
        3. Assign grades based on marks (A, B, C, etc.)
        4. Build a simple login check using `if` with username/password

        ============================================================================================
        🧠 DEEP INSIGHT – HOW JAVA PROCESSES IF-ELSE
        ============================================================================================

        Internally, Java evaluates the condition in the parentheses:
        - If the result is `true`, it runs the corresponding block.
        - If not, it moves to the next `else if` or final `else`.

        This logic is fundamental to control flow and forms the basis for advanced topics like:
        - Loops
        - Switch statements
        - Exception handling
        - Functional programming (lambdas, predicates)

        ============================================================================================
        ✅ END OF IF-ELSE THEORY GUIDE
        ============================================================================================
        */

/*
        ================================================================================
        🎯 IF-ELSE STATEMENT PRACTICE – Beautified & Commented Walkthrough
        --------------------------------------------------------------------
        ✔️ Decision making using conditions
        ✔️ Grouped input validation
        ✔️ Handling user identity and age-based output
        ✔️ Using booleans for logic control
        ✔️ Added emojis & visual cues for fun learning 🧠
        ================================================================================
        */

        // 🔹 GROUP 1 – IF-ELSE STRUCTURE WITH FIXED AGE
        int age = 70;

        /*
         * 📌 We check conditions from top to bottom.
         * Java runs the FIRST matching condition and skips the rest.
         * That's why `age >= 18` runs first before `age >= 65`, even when age = 70.
         */
        if (age >= 18) {
            System.out.println("✅ You are an adult!");
        } else if (age < 0) {
            System.out.println("❌ You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("👶 You are a baby!");
        } else if (age >= 65) {
            System.out.println("🧓 You are a senior!");
        } else {
            System.out.println("🧒 You are a child!");
        }

        // 🔹 GROUP 2 – USER INPUT: NAME & STUDENT STATUS

        String name;

        System.out.print("\n👤 Enter your name: ");
        name = scanner.nextLine(); // Reads full name including spaces

        boolean isStudent;

        System.out.print("🎓 Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // 🧪 GROUP 2.1 – NAME VALIDATION
        if (name.isEmpty()) {
            System.out.println("⚠️ You didn't enter your name! 😾");
        } else {
            System.out.println("👋 Hello " + name + "! 😃");
        }

        // 🔹 GROUP 3 – AGE-BASED CATEGORY SYSTEM

        int inputAge;

        System.out.print("\n📅 Please enter your age: ");
        inputAge = scanner.nextInt();

        // 🌟 Age categories with emoji indicators
        if (inputAge >= 65) {
            System.out.println("🧓 You are a senior!");
        } else if (inputAge >= 18) {
            System.out.println("✅ You are an adult!");
        } else if (inputAge >= 13) {
            System.out.println("🧑 You are a teenager!");
        } else if (inputAge >= 5) {
            System.out.println("🧒 You are a child!");
        } else if (inputAge == 0) {
            System.out.println("👶 You are a baby!");
        } else {
            System.out.println("❌ You are not even born yet!");
        }

        // 🔹 GROUP 4 – BOOLEAN CHECK FOR STUDENT STATUS

        if (isStudent) {
            System.out.println("🎓 You are a student!");
        } else {
            System.out.println("📛 You are not a student.");
        }

        // 🛑 Good practice: Close Scanner at the end
        scanner.close();

        /*
        =================================================================================
        📘 FINAL NOTES:
        ---------------------------------------------------------------------------------
        🧠 Java checks if-else conditions top to bottom.
        ✅ Always write most specific checks lower and broad/general checks higher.
        ⚠️ Always use curly braces `{}` to prevent logic bugs.
        🤓 Use input validation for user entries (like name, numbers, etc.).
        🧼 Use comments and spacing to make your code clean and understandable!
        =================================================================================
        */
    }
}
