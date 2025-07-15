// Java Variables – Complete Beginner to Advanced Guide
// ----------------------------------------------------

public class Main {

    public static void main(String[] args) {

        /*
         * WHAT IS A VARIABLE?
         * ---------------------
         * A variable is a symbolic name (identifier) that refers to a memory location.
         * It acts as a container for storing data — like a labeled jar containing values.
         *
         * In Java, you must:
         *   1. Declare the type of data the variable holds
         *   2. Give it a valid name (identifier)
         *   3. Optionally assign it an initial value
         *
         * Syntax:
         *   dataType variableName = value;
         */

        // ---------------------------
        // 🔸 Basic Variable Declaration
        // ---------------------------
        int age = 18;                   // Integer value
        String name = "Rehan";          // String (text)
        double height = 5.9;            // Decimal number
        boolean isStudent = true;       // Boolean true/false

        int localScore = 100; // Local variable example

        // ---------------------------
        // 🔸 Memory Model
        // ---------------------------
        // Primitive types are stored directly in stack memory.
        // Reference types store the memory address in the stack, which points to the object in the heap.

        /*
         * 🔢 PRIMITIVE DATA TYPES (8 types)
         * ---------------------------------
         * byte    - 1 byte     [-128 to 127]
         * short   - 2 bytes    [-32K to 32K]
         * int     - 4 bytes    [-2B to +2B]
         * long    - 8 bytes    (very large integers)
         * float   - 4 bytes    (decimal, less precise)
         * double  - 8 bytes    (decimal, more precise)
         * char    - 2 bytes    (a single character, e.g. 'A')
         * boolean - 1 bit      (true/false)
         */

        byte smallNumber = 127;
        int population = 1380000000;
        long distanceToMoon = 384400000L;   // 'L' suffix required
        float temperature = 36.6f;          // 'f' suffix required
        double pi = 3.14159265359;
        char grade = 'A';
        boolean passed = true;

        /*
         * 🎯 NON-PRIMITIVE (REFERENCE) DATA TYPES
         * ---------------------------------------
         * These are types based on classes (objects), e.g.:
         * - String
         * - Arrays
         * - Custom classes
         */
        String city = "New York";

        /*
         * 🧩 NAMING RULES (Identifiers)
         * ----------------------------
         * ✅ Can use letters, digits, underscores (_) and dollar signs ($)
         * ✅ Cannot begin with a digit
         * ✅ Cannot use reserved keywords (like `int`, `class`, etc.)
         * ✅ Use camelCase for variables and methods
         */
        int numberOfStudents = 30;

        // ❌ int 1number = 5;  // Invalid: starts with digit
        // ❌ int class = 10;   // Invalid: 'class' is a keyword

        /*
         * 🔄 VARIABLE ASSIGNMENT & REASSIGNMENT
         * -------------------------------------
         */
        int marks;        // Declaration
        marks = 95;       // Assignment
        marks = 100;      // Reassignment (overwrites old value)

        /*
         * 🚨 FINAL VARIABLES (Constants)
         * ------------------------------
         * Final variables cannot be changed once assigned.
         * Use UPPERCASE for naming constants.
         */
        final double GRAVITY = 9.8;
        // GRAVITY = 10.0; ❌ Not allowed, final means "constant"

        /*
         * 📏 TYPE CASTING
         * ---------------
         * Converting from one data type to another:
         * - Implicit (widening): int → double
         * - Explicit (narrowing): double → int
         */
        int intVal = 10;
        double doubleVal = intVal;  // Implicit casting
        System.out.println("int → double: " + doubleVal);

        double price = 99.99;
        int rounded = (int) price;  // Explicit casting (loses decimals)
        System.out.println("double → int (rounded): " + rounded);

        /*
         * 📘 BEST PRACTICES
         * -----------------
         * ✅ Use descriptive names
         * ✅ Use camelCase
         * ✅ Use final for constants
         * ✅ Group variables logically
         */

        // ---------------------------
        // 🔹 Variable Usage Summary
        // ---------------------------
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " ft");
        System.out.println("Passed: " + passed);
        System.out.println("City: " + city);
        System.out.println("GRAVITY: " + GRAVITY);

        // ---------------------------
        // 🔹 STEPS TO CREATE A VARIABLE
        // ---------------------------
        // 1. Declaration → int age;
        // 2. Assignment  → age = 18;

        // ---------------------------
        // 🔸 Integers
        // ---------------------------
        int age5 = 18;
        int year = 2025;
        int quantity = 1;
        System.out.println(age5);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println("This year is: " + year);

        // ---------------------------
        // 🔸 Doubles
        // ---------------------------
        double price2 = 19999.99;
        double gpa = 3.5;
        double temp = -12.5;
        System.out.println("$" + price2);
        System.out.println(gpa);
        System.out.println(temp);

        // ---------------------------
        // 🔸 Characters
        // ---------------------------
        char grade2 = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade2);
        System.out.println(symbol);
        System.out.println(currency);

        // ---------------------------
        // 🔸 Booleans
        // ---------------------------
        boolean isStudent2 = false;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent2);
        System.out.println(forSale);
        System.out.println(isOnline);

        if (isStudent2) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        // ---------------------------
        // 🔸 Strings
        // ---------------------------
        String name2 = "Rehan Islam";
        String food = "Pizza";
        String email = "rehanislamcontact@gmail.com";
        String car = "Mustang";
        String colour = "Red";

        System.out.println("Hello, my name is " + name2);
        System.out.println("My favourite food is " + food);
        System.out.println("My email is " + email);
        System.out.println("Your car: " + car);
        System.out.println("Car colour: " + colour);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Your average grade is: " + grade);
        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is: " + currency + price2);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale!");
        }
    }
}
