/*
╔══════════════════════════════════════════════════════════════════════════════╗
║                            📚 JAVA METHODS (FUNCTIONS)                       ║
╚══════════════════════════════════════════════════════════════════════════════╝

╭──────────────────────────────────────────────────────────────╮
│ ✅ WHAT IS A METHOD?                                          │
╰──────────────────────────────────────────────────────────────╯

🔹 A **method** (also called a function in many other languages) is a block of code
   that performs a specific task and is executed when it is **called/invoked**.

🔹 Think of a method like a **tool** in a toolbox — you define it once and use it whenever needed.

📦 A method helps to:
  - Reduce code repetition ✅
  - Increase modularity ✅
  - Improve readability ✅
  - Enable reusability ✅

🧱 Basic structure of a method:

    returnType methodName(parameters) {
        // Code block (instructions)
    }

🧪 Example:
    void greet() {
        System.out.println("Hello!");
    }


╭──────────────────────────────────────────────────────────────╮
│ 🧩 TYPES OF METHODS                                            │
╰──────────────────────────────────────────────────────────────╯

📌 Based on return type and parameters, we get:

1️⃣ **No return, No parameters**
   ➤ Method just runs, doesn't take input, doesn't return anything

2️⃣ **No return, With parameters**
   ➤ Takes input but doesn't return anything

3️⃣ **With return, No parameters**
   ➤ Doesn't take input, but returns a value

4️⃣ **With return, With parameters**
   ➤ Takes input and returns value


╭──────────────────────────────────────────────────────────────╮
│ 🧠 WHY USE METHODS?                                          │
╰──────────────────────────────────────────────────────────────╯

✨ Imagine writing a greeting 10 times:
    - BAD: Manually repeating System.out.println("Hello!");
    - GOOD: Define it once in greet() and call greet() 10 times ✅

🚀 Break code into logical blocks
🧰 Easier to test and debug specific functionalities
♻️ Reuse code in multiple places


╭──────────────────────────────────────────────────────────────╮
│ 🧪 SYNTAX EXPLAINED                                            │
╰──────────────────────────────────────────────────────────────╯

🔹 Access Modifier (usually `public`)
🔹 Return Type (e.g. int, void, double, String, etc.)
🔹 Method Name (camelCase by convention)
🔹 Parameters (data you send IN to the method)
🔹 Method Body (the code to execute)

🧱 Format:

    public static returnType methodName(parameter1, parameter2, ...) {
        // Method logic here
        return value; // only if returnType is NOT void
    }

⚠️ `static` means the method belongs to the class, not instances (more on this later)

🧠 Examples:

    ➤ public static void sayHello() {
          System.out.println("Hello there!");
       }

    ➤ public static int add(int a, int b) {
          return a + b;
       }


╭──────────────────────────────────────────────────────────────╮
│ 🎯 METHOD OVERLOADING                                          │
╰──────────────────────────────────────────────────────────────╯

🔁 Java allows **multiple methods** with the **same name** but **different parameters**.

🔹 This is called **method overloading**.

🧪 Example:

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

💡 The compiler decides which version to call based on arguments passed.


╭──────────────────────────────────────────────────────────────╮
│ 💬 PARAMETERS VS ARGUMENTS                                    │
╰──────────────────────────────────────────────────────────────╯

🧱 Definitions:
- **Parameter**: Variable listed inside method declaration
- **Argument**: Actual value passed during method call

🔹 Example:
    public static void greet(String name) // "name" is parameter
    greet("Rehan");                      // "Rehan" is argument


╭──────────────────────────────────────────────────────────────╮
│ ⏱ METHOD CALLING ORDER (FLOW)                                 │
╰──────────────────────────────────────────────────────────────╯

🌀 Think of method calls like a stack:
    1. `main()` starts
    2. `main()` calls a method
    3. That method finishes and returns to `main()`
    4. Execution continues in `main()`

📌 Methods can even call **other methods**, or call **themselves** (recursion!)


╭──────────────────────────────────────────────────────────────╮
│ 🛠️ BEST PRACTICES                                              │
╰──────────────────────────────────────────────────────────────╯

✅ Keep method names descriptive (e.g. `calculateBMI`, `getUserInput`)
✅ Keep methods small and focused on one task
✅ Use comments if logic is complex
✅ Don't make everything static unless necessary
✅ Follow camelCase naming conventions


╭──────────────────────────────────────────────────────────────╮
│ 🧠 ADVANCED METHOD TOPICS                                      │
╰──────────────────────────────────────────────────────────────╯

🚀 You’ll learn later:
- Method recursion (a method calling itself)
- Passing objects as parameters
- Return arrays, classes, etc.
- Instance vs static methods
- Method references & lambdas (Java 8+)


╭──────────────────────────────────────────────────────────────╮
│ 🔚 TL;DR SUMMARY                                               │
╰──────────────────────────────────────────────────────────────╯

📌 Java methods help you:
   ✔ Organize your code
   ✔ Avoid repetition
   ✔ Make reusable tools
   ✔ Work like LEGO bricks 🧱

📦 Pack logic inside methods → 🧰 Reuse anywhere


╭──────────────────────────────────────────────────────────────╮
│ 📌 NEXT STEP: Ready to create your own methods!                │
╰──────────────────────────────────────────────────────────────╯

💡 Send me the code you want to beautify or the method program you're working on,
and I'll format it just like this!

Happy coding! 💻🚀
*/


public class Main {
    public static void main(String[] args) {

        /*
        ╔════════════════════════════════════════════════════════════════════╗
        ║ 🎉 EXAMPLE: METHODS IN JAVA - HAPPY BIRTHDAY & UTILITIES 🎂        ║
        ╚════════════════════════════════════════════════════════════════════╝

        🔁 Problem: We are repeating the same birthday song 3 times manually!
        💡 Solution: Use methods to create reusable code blocks!

        Let's first look at the traditional (inefficient) way:
        */

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        /*
        🚨 This works, but it's not clean, reusable, or scalable.
        🧠 Let's refactor this using a method called `happyBirthday()`!

        We'll also pass parameters to personalize it!
        */

        String name = "BladerX";
        int age = 25;

        // 👇 Call the method with different values
        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        /*
        ╔══════════════════════════════════════╗
        ║ ✏️ DEMO: METHODS WITH RETURN VALUES   ║
        ╚══════════════════════════════════════╝

        🔹 Let's use a method to calculate the square and cube of a number.
        🔹 These methods will return a double (decimal number).
        */

        // ✅ square() and cube() return values that can be printed or stored
        System.out.println(square(3));  // ➜ Output: 9.0
        System.out.println(cube(3));    // ➜ Output: 27.0

        /*
        ╔════════════════════════════════════╗
        ║ 📛 COMBINING STRINGS WITH A METHOD ║
        ╚════════════════════════════════════╝

        👇 The method `getFullName()` takes two Strings and returns one full name
        */

        String fullName = getFullName("Rehan", "Islam");
        System.out.println(fullName);  // ➜ Output: Rehan Islam

        /*
        ╔═════════════════════════════════════════════════╗
        ║ ✅ AGE CHECK METHOD: BOOLEAN RETURN (TRUE/FALSE) ║
        ╚═════════════════════════════════════════════════╝

        👇 A method that returns true if user is 18 or older, false otherwise
        */

        int ageOfUser = 18;

        if (ageCheck(ageOfUser)) {
            System.out.println("You are eligible to sign up!");
        } else {
            System.out.println("You must be 18 to sign up!");
        }
    }

    /*
    ╔════════════════════════════════════════════════════════╗
    ║ 🎵 Method: happyBirthday(String name, int age)         ║
    ╚════════════════════════════════════════════════════════╝

    📌 Purpose: Reuse the birthday song format with personalized name and age.
    📥 Parameters: name (String), age (int)
    📤 Returns: Nothing (void method)
    */

    static void happyBirthday(String name, int age) {
        System.out.println("============ 🎉 METHOD CALL ============");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!");
        System.out.println("========================================\n");
    }

    /*
    ╔═════════════════════════════════════╗
    ║ 📐 Method: square(double number)    ║
    ╚═════════════════════════════════════╝

    📌 Purpose: Return the square of a number
    📥 Parameter: number (double)
    📤 Returns: number squared (double)
    */

    static double square(double number) {
        return number * number;
    }

    /*
    ╔════════════════════════════════════╗
    ║ 🔢 Method: cube(double number)     ║
    ╚════════════════════════════════════╝

    📌 Purpose: Return the cube of a number
    📥 Parameter: number (double)
    📤 Returns: number cubed (double)
    */

    static double cube(double number) {
        return number * number * number;
    }

    /*
    ╔═══════════════════════════════════════════════╗
    ║ 📛 Method: getFullName(String first, String last) ║
    ╚═══════════════════════════════════════════════╝

    📌 Purpose: Combine two names into a full name
    📥 Parameters: first (String), last (String)
    📤 Returns: Full name (String)
    */

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    /*
    ╔═══════════════════════════════════════════════╗
    ║ ✅ Method: ageCheck(int ageOfUser)            ║
    ╚═══════════════════════════════════════════════╝

    📌 Purpose: Check if user is 18 or older
    📥 Parameter: ageOfUser (int)
    📤 Returns: true or false (boolean)
    */

    static boolean ageCheck(int ageOfUser) {
        if (ageOfUser >= 18) {
            return true;
        } else {
            return false;
        }
        // ⛳ OR more simply: return ageOfUser >= 18;
    }
}
