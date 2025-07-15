/*
       ╔═══════════════════════════════════════════════╗
       ║           📘 VARARGS IN JAVA (THEORY)         ║
       ╚═══════════════════════════════════════════════╝

       ░░ What is varargs? ░░
       ▸ Varargs stands for "Variable-length Arguments".
       ▸ It allows a method to accept **0 or more arguments** of the same type.
       ▸ Instead of passing a fixed number of arguments, you can pass any number (or even none).

       ░░ Syntax ░░
       ▸ returnType methodName(type... variableName) { ... }
         → The three dots `...` is called the *ellipsis*.
         → Behind the scenes, varargs is treated as an array.

       ░░ Rules ░░
       ✔ There can be ONLY ONE varargs parameter in a method.
       ✔ It MUST be the **last** parameter in the method.
       ✔ You can still have other parameters, but varargs must be at the end.

       ░░ Why use varargs? ░░
       ✔ Cleaner and more flexible than using method overloading.
       ✔ Avoids creating multiple methods for different argument counts.
       ✔ Useful when number of inputs is unknown at compile time.
       ✔ Makes code reusable, scalable, and more readable.

       ░░ Internally ░░
       ▸ Java treats varargs as an array.
         For example:
             printNames(String... names)
             is treated like:
             printNames(String[] names)

       ░░ Common Use Cases ░░
       ✔ Logging messages
       ✔ Aggregation (sum, average, etc.)
       ✔ Printing, displaying or formatting output
       ✔ Replacing overloaded methods that take different counts of parameters

               ──────────────────────────────────────────────
        ✅ WHAT IS VARARGS?
        ──────────────────────────────────────────────
        • VARARGS = "Variable-Length Argument Lists"
        • Allows you to pass a variable number of values to a method
        • Instead of defining many overloaded versions of the same method,
          you can just define one using varargs

        ──────────────────────────────────────────────
        ✅ SYNTAX
        ──────────────────────────────────────────────
        methodName(dataType... parameterName)

        EXAMPLE:
        static void greet(String... names) {
            for(String name : names){
                System.out.println("Hello " + name);
            }
        }

        // Can be called with any number of arguments:
        greet("Rehan");
        greet("Ali", "Ahmed");
        greet(); // even with zero arguments

        ──────────────────────────────────────────────
        ✅ HOW DOES IT WORK INTERNALLY?
        ──────────────────────────────────────────────
        • Java converts the varargs into an ARRAY behind the scenes.
        • So, inside the method, you can loop through it just like any array.

        EXAMPLE:
        void sum(int... nums) {
            int total = 0;
            for (int n : nums) {
                total += n;
            }
            System.out.println(total);
        }

        sum(1, 2, 3); // total = 6
        sum();        // total = 0

        ──────────────────────────────────────────────
        ✅ RULES FOR USING VARARGS
        ──────────────────────────────────────────────
        1. Only ONE varargs parameter per method.
        2. It must be the LAST parameter in the method.

        ❌ INVALID:
        void invalid(int... a, int... b) { ... } // ❌ Can't have 2 varargs
        void alsoInvalid(int... a, String b) { ... } // ❌ varargs not last

        ✅ VALID:
        void valid(String name, int... scores) { ... }

        ──────────────────────────────────────────────
        ✅ WHEN TO USE VARARGS?
        ──────────────────────────────────────────────
        ✔ When you want to pass an unknown number of arguments
        ✔ When replacing method overloading that only differs by param count
        ✔ Useful in utility methods (sum, print, average, etc.)

        ──────────────────────────────────────────────
        ✅ EXAMPLES OF USAGE
        ──────────────────────────────────────────────

        // 1️⃣ Sum of integers
        static int sum(int... numbers) {
            int total = 0;
            for(int n : numbers){
                total += n;
            }
            return total;
        }

        // 2️⃣ Greeting multiple people
        static void greet(String... names) {
            for(String name : names){
                System.out.println("Hello " + name);
            }
        }

        // 3️⃣ Varargs + Fixed parameters
        static void showScores(String student, int... marks) {
            System.out.println("Student: " + student);
            for(int mark : marks){
                System.out.println("Score: " + mark);
            }
        }

        ──────────────────────────────────────────────
        ✅ ADVANTAGES OF VARARGS
        ──────────────────────────────────────────────
        • Flexibility to pass any number of arguments
        • Cleaner and shorter code
        • Easier to maintain (vs overloaded methods)

        ──────────────────────────────────────────────
        ✅ LIMITATIONS OF VARARGS
        ──────────────────────────────────────────────
        • Cannot use multiple varargs in one method
        • Slight overhead (Java wraps them into array)
        • Can reduce readability if overused in large methods

        ──────────────────────────────────────────────
        ✅ COMMON MISTAKES
        ──────────────────────────────────────────────
        • Placing varargs at the beginning of the parameter list ❌
        • Trying to use more than one varargs parameter ❌
        • Assuming varargs can't be empty (they can) ❌

        ──────────────────────────────────────────────
        ✅ CONCLUSION
        ──────────────────────────────────────────────
        • Varargs are a powerful feature in Java that allow flexibility
          in method arguments.
        • Helps reduce boilerplate method overloading
        • Internally handled as arrays, so familiar syntax
        • Just remember: only one allowed, and it must come last.

        ──────────────────────────────────────────────
        ✨ TL;DR: Varargs Cheat Sheet
        ──────────────────────────────────────────────
        → methodName(type... name)
        → only ONE allowed
        → always the LAST parameter
        → internally = array

 */




public class Main {
    public static void main(String[] args) {

        /*
         ╔══════════════════════════════════════════════╗
         ║            🧠 VARARGS DEMO IN JAVA           ║
         ╚══════════════════════════════════════════════╝

         ► varargs = Variable-Length Argument Lists
         -------------------------------------------
         ☑ Allow a method to accept a varying number of arguments
         ☑ Removes the need for overloaded methods
         ☑ Java internally packs these arguments into an array
         ☑ Syntax: (type... parameterName) → The '...' is called an *ellipsis*

         🔹 Use cases:
         - Utility methods (sum, average, print logs, join strings, etc.)
         - When number of arguments isn't known beforehand

         🔹 This program includes:
         1. add() method – sums any number of integers
         2. average() method – calculates the average of any number of doubles
        */

        // Calling the add() method with multiple integers
        System.out.println(add(1, 2, 3, 4, 5, 6, 7));

        // Calling the average() method with multiple double values
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    /*
     ╔═════════════════════════════╗
     ║  🔢 ADD METHOD (with varargs) ║
     ╚═════════════════════════════╝

     ◉ Accepts any number of integers
     ◉ Calculates and returns the total sum
     ◉ Parameter: int... numbers → treated as an int array internally
    */
    static int add(int... numbers) {
        int sum = 0;

        // Enhanced for loop to add each number
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    /*
     ╔════════════════════════════════╗
     ║  📊 AVERAGE METHOD (with varargs) ║
     ╚════════════════════════════════╝

     ◉ Accepts any number of double values
     ◉ Returns the average value as a double
     ◉ Checks for division by zero if no numbers are passed
    */
    static double average(double... numbers) {
        double sum = 0;

        // If no arguments provided, return 0 to avoid division by zero
        if (numbers.length == 0) {
            return 0;
        }

        // Sum all the numbers
        for (double number : numbers) {
            sum += number;
        }

        // Return average (total / number of elements)
        return sum / numbers.length;
    }
}
