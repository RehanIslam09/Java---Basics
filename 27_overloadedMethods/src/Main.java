/*
╔═══════════════════════════════════════════════════════════════════════════╗
║ 🔁 OVERLOADED METHODS IN JAVA – FULL THEORY & DEEP DIVE (Beginner → Pro) ║
╚═══════════════════════════════════════════════════════════════════════════╝

📌 WHAT IS METHOD OVERLOADING?
──────────────────────────────
Method Overloading = A feature in Java that allows a class to have more than one method
with the same name BUT different parameters.

🧠 Java determines which method to call based on:
   1. Number of parameters
   2. Type of parameters
   3. Order of parameters

💡 Think of overloaded methods as "same action" with different types/amounts of input.

────────────────────────────────────────────────────
🧪 WHY USE OVERLOADED METHODS?
────────────────────────────────────────────────────
✔ Improves readability
✔ Reusability of method name for similar tasks
✔ Eliminates the need to create multiple differently named methods

────────────────────────────────────────────────────
📚 BASIC SYNTAX:
────────────────────────────────────────────────────

class ClassName {

    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }

    void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

}

★ All methods are named `greet` but accept different arguments.
★ Java automatically chooses the correct method during compilation.
★ This is called **compile-time polymorphism** or **static binding**.

────────────────────────────────────────────────────
🔂 RULES FOR OVERLOADING:
────────────────────────────────────────────────────
✅ Methods must have:
   - Different number of parameters OR
   - Different types of parameters OR
   - Different order of parameters

❌ NOT ALLOWED:
   - Only changing return type (that causes ambiguity)

✔ Allowed:
    sum(int a, int b)
    sum(double a, double b)
    sum(int a, int b, int c)

❌ NOT Allowed:
    int print() {...}
    double print() {...}  // Same name & params — not allowed!

────────────────────────────────────────────────────
🎯 REAL WORLD EXAMPLES:
────────────────────────────────────────────────────

Example: Printing areas of different shapes

    printArea(double radius)              ➜ circle
    printArea(double length, double width) ➜ rectangle
    printArea(int base, int height)       ➜ triangle

☝ All represent "area calculation", so using the same method name improves clarity.

────────────────────────────────────────────────────
🎭 OVERLOADING VS OVERRIDING
────────────────────────────────────────────────────

🔁 OVERLOADING (this topic):
    - Happens in same class
    - Same method name, different parameter list
    - Compile-time polymorphism

🔄 OVERRIDING:
    - Happens in subclass (inheritance)
    - Same method name + parameters + return type
    - Run-time polymorphism

────────────────────────────────────────────────────
🔓 ACCESS MODIFIERS & RETURN TYPES
────────────────────────────────────────────────────

✔ Access modifiers (public, private) can be different
✔ Return types can be different, BUT they are not used to distinguish overloads
✔ Static methods can also be overloaded

────────────────────────────────────────────────────
📦 JAVA BUILT-IN OVERLOADED METHODS
────────────────────────────────────────────────────

Java itself uses method overloading everywhere!

Examples:
    System.out.println(int x)
    System.out.println(String s)
    System.out.println(boolean b)

    Math.abs(int a)
    Math.abs(double a)
    Math.abs(float a)

────────────────────────────────────────────────────
✅ WHEN TO USE METHOD OVERLOADING?
────────────────────────────────────────────────────
✔ When multiple methods conceptually perform the same task
✔ When flexibility of different parameter input is required
✔ When building utility/helper methods (e.g., format(), sum(), calculate())

────────────────────────────────────────────────────
🌟 BONUS: VARARGS (Variable Arguments) - Java’s flexible method input
────────────────────────────────────────────────────

public void printNames(String... names) {
    for(String name : names){
        System.out.println(name);
    }
}

This allows calling: printNames("Rehan"), printNames("Rehan", "Kabir", "Ayaan");

Varargs is not considered overloading unless used alongside another non-varargs method.

────────────────────────────────────────────────────
💡 TIPS:
────────────────────────────────────────────────────
✔ Try to use overloading to avoid code duplication.
✔ Do not rely on return type to distinguish methods.
✔ Use meaningful parameter names to improve readability.

────────────────────────────────────────────────────
🚀 CONCLUSION:
────────────────────────────────────────────────────

Method Overloading is:
✔ An elegant way to reuse method names
✔ A foundational concept for code clarity and flexibility
✔ A stepping stone to deeper OOP concepts like Polymorphism

🧠 MASTER IT — it’ll appear everywhere from utility libraries to real-world projects.

╔══════════════════════════════════════════════╗
║ ✅ NEXT STEP?                                ║
║ ➤ Write examples yourself to reinforce it!   ║
╚══════════════════════════════════════════════╝
*/


public class Main {
    public static void main(String[] args) {

        /*
        ╔══════════════════════════════════════════════════════════════════╗
        ║ 🔁 OVERLOADED METHODS – DEMO PROGRAM                             ║
        ║ 🧠 Same method name, different parameters                        ║
        ╚══════════════════════════════════════════════════════════════════╝

        🎯 GOAL:
        - To demonstrate method overloading using 'add' and 'bakePizza'
        - Overloaded methods improve readability and reduce clutter

        🧪 SIGNATURE = methodName + parameters (type, number, order)
        */

        // 🧮 Using the overloaded `add()` method
        System.out.println(add(1, 2, 3, 4));  // Calls the version with 4 arguments

        // 🍕 Using overloaded `bakePizza()` with 3 ingredients
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);  // ➜ "pepperoni mozzarella flat bread pizza"
    }

    /*
    ╔════════════════════════════════════════════╗
    ║ ➕ Overloaded 'add' methods                 ║
    ║ 🔹 Different parameter counts              ║
    ╚════════════════════════════════════════════╝
    */

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    /*
    ╔═══════════════════════════════════════════════════════╗
    ║ 🍕 Overloaded 'bakePizza' methods                      ║
    ║ 🔹 Same method name, but with more ingredients         ║
    ╚═══════════════════════════════════════════════════════╝

    🎯 Each version of `bakePizza` adds more ingredients based on parameters.
    📌 Return type can be same (String) but is not part of the overload decision.
    */

    // 🫓 Bread-only pizza
    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    // 🧀 Bread + cheese
    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    // 🍕 Bread + cheese + topping
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }

}
