public class Main {

    // 🌍 CLASS SCOPE (aka Static/Class Variable)
    // -------------------------------------------
    // ➤ This variable is declared as `static`, meaning:
    //    - It's shared across all methods of this class.
    //    - Exists as long as the class is loaded into memory.
    //    - Accessible inside static methods (like main()).
    static int x3 = 3;

    public static void main(String[] args) {

        /*
        ╔══════════════════════════════════════════════════════════════╗
        ║ 🔍 VARIABLE SCOPE IN JAVA – COMPLETE DEEP DIVE THEORY 📘     ║
        ╚══════════════════════════════════════════════════════════════╝

        🧠 What is "Scope"?
        ─────────────────────
        ➤ "Scope" determines where a variable can be accessed or modified.
        ➤ It controls the **lifetime** and **visibility** of a variable in Java.
        ➤ Java has three main scopes:
            1. Local Scope
            2. Instance/Object Scope
            3. Class/Static Scope

        ───────────────────────────────────────────────────────────────

        🟢 1️⃣ LOCAL SCOPE
        ─────────────────────
        ➤ Declared inside a method or block.
        ➤ Accessible only **within** that method or block.
        ➤ Destroyed after the block/method completes execution.

        🔸 Example:
        */
        int x = 10; // Local variable inside main()
        System.out.println("Local variable x = " + x);

        /*
        ───────────────────────────────────────────────────────────────

        🟡 2️⃣ INSTANCE/OBJECT SCOPE
        ─────────────────────────────
        ➤ Declared inside a class but **outside any method**.
        ➤ Each object (instance) of the class has its own copy.
        ➤ Accessible using `this.variableName` if shadowed.

        🔸 Declared as:
            public class Student {
                String name; // instance variable
            }

        🔸 Accessed from any non-static method in that class.
        ───────────────────────────────────────────────────────────────

        🔵 3️⃣ CLASS SCOPE (STATIC VARIABLES)
        ──────────────────────────────────────
        ➤ Declared with the `static` keyword.
        ➤ Shared among **all objects** of the class.
        ➤ Exists as long as the class is loaded in memory.

        🔸 Used for:
            - Constants
            - Counters
            - Utilities

        ───────────────────────────────────────────────────────────────

        ⚫ BLOCK SCOPE (Mini Scope!)
        ─────────────────────────────
        ➤ A variable inside an `if`, `for`, or other block `{}` exists only there.

        🔸 Example:
        */
        if (true) {
            int y = 20;
            System.out.println("Block-scoped variable y = " + y);
        }
        // System.out.println(y); ❌ ERROR: y not visible outside the block

        /*
        ───────────────────────────────────────────────────────────────

        🔁 VARIABLE SHADOWING
        ───────────────────────
        ➤ When a local variable **hides** (or shadows) an instance variable
          with the same name.

        🔸 Example:
            class Car {
                String model = "BMW";

                void printModel() {
                    String model = "Audi"; // shadows instance variable
                    System.out.println(model); // prints "Audi"
                }
            }

        ✅ Use `this.model` to access the instance variable explicitly.
        ───────────────────────────────────────────────────────────────

        🔒 FINAL VARIABLES & SCOPE
        ────────────────────────────
        ➤ Variables declared with `final` **cannot be reassigned**.
        ➤ Useful for constants within scope.

        🔸 Example:
            final int MAX_SPEED = 120;

        ───────────────────────────────────────────────────────────────

        📊 Summary Table:

        | SCOPE TYPE       | WHERE DECLARED         | ACCESSIBLE FROM              | LIFETIME                 |
        |------------------|-------------------------|-------------------------------|---------------------------|
        | Local            | Inside method/block     | Only within method/block      | Until method/block ends   |
        | Instance (Field) | In class (no static)    | Non-static methods of class   | As long as object lives   |
        | Class (Static)   | In class with static    | From anywhere using ClassName | As long as class is loaded|

        ───────────────────────────────────────────────────────────────

        ✅ BEST PRACTICES:
        ➤ Keep variables in the smallest scope possible.
        ➤ Avoid reusing the same variable names in nested scopes.
        ➤ Use `private` and getter/setters for instance variables.
        ➤ Constants should be `static final` (uppercase with underscores).

        ───────────────────────────────────────────────────────────────

        💡 BONUS TIPS:
        ➤ Global scope like other languages (Python, JavaScript) doesn’t exist in Java.
        ➤ Every variable in Java has to be declared **inside a class**.
        ➤ You can **pass variables as parameters** to expose them to other methods.

        🎉 Congratulations! You now fully understand Java Variable Scope!
        Let's apply it in real programs! 💻🚀

        ══════════════════════════════════════════════════════════════
        */

//      ====================================================================================

        // 🌱 LOCAL SCOPE (main method)
        // -------------------------------------------
        // ➤ These variables are declared inside `main()`, so:
        //    - They only exist within the `main()` block.
        //    - Cannot be accessed from other methods.
        int x1 = 1;
        int x3 = 36;  // 🔁 SHADOWS the class variable 'x3'

        // 🔍 ACCESSING LOCAL VARIABLES
        System.out.println("x1 in main() = " + x1); // Prints: 1
        System.out.println("x3 in main() = " + x3); // Prints: 36
        System.out.println("Here, x3 in local is: " + x3); // Also 36

        // 🎯 Calling another method
        doSomething();
    }

    static void doSomething() {
        // 🌱 LOCAL SCOPE (doSomething method)
        // -------------------------------------------
        // ➤ These variables are new and only accessible inside `doSomething()`
        // ➤ They also shadow the class variable `x3`.
        int x1 = 2;
        int x3 = 366;

        System.out.println("x1 in doSomething() = " + x1); // Prints: 2
        System.out.println("x3 in doSomething() = " + x3); // Prints: 366
        System.out.println("Here, x3 in local is: " + x3); // Also 366
    }
}

    /*
    🧠 SCOPE ANALYSIS
    ─────────────────────────────
    Variable       | Where Declared        | Value Printed        | Scope Type       | Notes
    ---------------|------------------------|-----------------------|------------------|-------------------------
    x1             | main()                 | 1                     | Local to main()  |
    x3             | main()                 | 36                    | Local to main()  | Shadows static x3 = 3
    x1             | doSomething()          | 2                     | Local to method  |
    x3             | doSomething()          | 366                   | Local to method  | Shadows static x3 = 3
    static x3      | class-level (global)   | (not printed directly) | Class (static)  | Not visible when shadowed

    ✅ If you want to access the class-level `x3`, use: Main.x3 or remove local shadowing.

    🧪 TRY THIS BONUS:
    ─────────────────────────────
    ➤ Add this line at the end of `main()`:
        System.out.println("Class level x3 = " + Main.x3);

    It will print: 3 🧨
    */
