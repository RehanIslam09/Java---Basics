/*
================================================================================
🧠 NESTED IF STATEMENTS IN JAVA — COMPLETE THEORY GUIDE
================================================================================

🔰 LEVEL: Beginner → Advanced
🛠️ TOPIC: Control Flow – Nested `if` statements
📌 PURPOSE: To make decisions based on **multiple layers** of conditions

================================================================================
🧩 1. WHAT IS A NESTED IF STATEMENT?
================================================================================

A nested `if` statement is simply an `if` statement placed **inside another `if` or `else` block**.

🎯 It allows you to perform a **second level check** *only* if the first condition is true.

➡️ Think of it as **"If A is true, THEN also check B."**

📦 SYNTAX STRUCTURE:
-----------------------------------
if (condition1) {
    // Executes if condition1 is true

    if (condition2) {
        // Executes only if BOTH condition1 AND condition2 are true
    }
}
-----------------------------------

================================================================================
🌍 2. REAL-LIFE ANALOGY
================================================================================

🎓 Example: School Admission

"If you passed the entrance exam (condition 1),
   then check if you submitted documents (condition 2).
       If yes, you're admitted."

Translated to code-like logic:

if (passedExam) {
    if (submittedDocuments) {
        admitStudent();
    }
}

✅ The second condition is **only relevant** *if* the first one is met.

================================================================================
🧠 3. WHY USE NESTED IFs?
================================================================================

✔️ Break down **complex decisions** into smaller chunks
✔️ Prevent unnecessary checks
✔️ Add **hierarchical logic**: one condition depends on another
✔️ Easier to **trace logic** step-by-step

✅ Helps when multiple things must be true **in sequence**

================================================================================
📦 4. FLOWCHART (VISUALIZATION)
================================================================================

→ START
   └── if (A)
         └── if (B)
               └── DO SOMETHING

✅ A must be true → then and only then → B is checked

================================================================================
🔍 5. DEEP NESTING — MULTIPLE LEVELS
================================================================================

Yes, you can nest as deeply as you want:

if (A) {
    if (B) {
        if (C) {
            // Executes only if A, B, and C are all true
        }
    }
}

⚠️ However, too many nested blocks can reduce readability.
→ Consider **logical operators** (`&&`, `||`) to flatten logic when appropriate.

================================================================================
📌 6. COMPARISON: Nested IFs vs Logical Operators
================================================================================

Both of these are valid:

1️⃣ Nested:
-----------------------------------
if (A) {
    if (B) {
        doSomething();
    }
}
-----------------------------------

2️⃣ Flattened with logical AND:
-----------------------------------
if (A && B) {
    doSomething();
}
-----------------------------------

💡 Use logical AND `&&` for **simple conditions**
💡 Use nested `if` for **multi-step logic or for adding additional instructions** between levels

================================================================================
⚙️ 7. COMBINING WITH ELSE, ELSE IF
================================================================================

You can also combine nested `if` with `else` and `else if`:

if (userLoggedIn) {
    if (isAdmin) {
        // Show admin panel
    } else {
        // Show regular dashboard
    }
} else {
    // Redirect to login
}

✅ This is a **common real-world pattern** in login and permission systems

================================================================================
💡 8. BEST PRACTICES
================================================================================

✔️ ✅ Keep nesting to 2–3 levels max for readability
✔️ ✅ Use indentation and spacing for clarity
✔️ ✅ Add comments to explain layers of logic
✔️ ✅ Use `else if` instead of deep `if-else` ladders if possible
✔️ ✅ Combine checks with `&&` when they're closely related

❌ Don't write unreadable deeply nested code like:
if (a) { if (b) { if (c) { if (d) { ... }}}}

================================================================================
🚫 9. COMMON MISTAKES TO AVOID
================================================================================

❌ Missing braces `{}` in nested blocks → can cause **logic errors**

BAD:
if (a)
    if (b)
        doSomething();
    else
        doAnotherThing(); // This "else" attaches to the inner "if" — may cause confusion

✅ Always use braces `{}` even for single-line blocks in nested situations

================================================================================
📘 10. USE CASES FOR NESTED IF
================================================================================

🔒 Login + Role-Based Access
🎓 Student grading systems
🎮 Game logic (e.g., power-ups, stages)
💵 Banking rules (e.g., balance checks + overdraft eligibility)
🛒 Online shopping cart (e.g., if logged in → if premium member → apply discount)

================================================================================
🔁 11. HOW IT EXECUTES (ORDER OF OPERATIONS)
================================================================================

→ Outer `if` is evaluated first
→ If TRUE, control enters the block and checks the inner `if`
→ This process continues inward for further nested layers
→ If any outer condition is false, **the inner blocks are skipped entirely**

================================================================================
✅ 12. WRAP-UP SUMMARY
================================================================================

| Concept                     | Description                                |
|----------------------------|--------------------------------------------|
| Nested if                  | if inside another if                       |
| Purpose                    | Multi-level conditional checks             |
| Logical depth              | Execute inner code only if outer is true   |
| Use when                   | One decision depends on another            |
| Combine with               | else, else if, logical AND/OR              |
| Alternatives               | Flatten with logical operators             |
| Max nesting recommendation| 2–3 levels for readability                  |

================================================================================
🔚 END OF NESTED IF THEORY GUIDE
================================================================================
*/


public class Main {
    public static void main(String[] args){
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}



