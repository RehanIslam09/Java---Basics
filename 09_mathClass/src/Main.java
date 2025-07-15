/*
=========================================================================================
📘 JAVA MATH CLASS – COMPLETE THEORY GUIDE (Beginner → Advanced)
=========================================================================================

📦 PACKAGE: java.lang.Math
🔧 TYPE: Utility class with static methods (No need to create an object!)
📚 PURPOSE: Provides built-in mathematical functions for common operations

=========================================================================================
🧠 1. WHAT IS THE MATH CLASS?
=========================================================================================

The `Math` class in Java is a **built-in utility class** that provides methods
for performing mathematical calculations such as:

🔹 Basic arithmetic (max, min, abs)
🔹 Advanced math (pow, sqrt, log, sin, cos, tan)
🔹 Rounding (ceil, floor, round)
🔹 Constants like PI and E

✅ You can use all methods directly using the class name:
    👉 `Math.methodName()`

There is **no need to create a Math object** because all methods are static.

-----------------------------------------------------------------------------------------
🔧 Analogy:
Imagine the Math class as your **built-in calculator** 📟
Instead of writing the logic from scratch, you just "press a button" (call a method)
-----------------------------------------------------------------------------------------

=========================================================================================
🧱 2. STRUCTURE AND USAGE OF MATH CLASS
=========================================================================================

🛠️ Usage Pattern:
-------------------
Since all methods are static:
    Math.method(arguments);

✔️ No need to import anything – Math is part of the `java.lang` package, auto-imported.

Example:
```java
double result = Math.sqrt(25); // result = 5.0
=========================================================================================
🔢 3. COMMON MATH METHODS (Beginner-Friendly)
📐 ABSOLUTE VALUE:
Math.abs(x) → Returns the positive version of a number

🧮 MAX & MIN:
Math.max(a, b) → Returns the larger value
Math.min(a, b) → Returns the smaller value

📏 POWER & ROOT:
Math.pow(base, exponent) → base ^ exponent
Math.sqrt(x) → Square root of x

🌀 ROUNDING:
Math.round(x) → Nearest whole number (returns long)
Math.ceil(x) → Rounds UP to nearest int
Math.floor(x) → Rounds DOWN to nearest int

🎲 RANDOM:
Math.random() → Returns a double between 0.0 and 1.0

=========================================================================================
📈 4. ADVANCED MATH METHODS
📉 EXPONENTIALS AND LOGS:
Math.exp(x) → Returns e^x (e = Euler’s number ≈ 2.718)
Math.log(x) → Natural log (base e)
Math.log10(x) → Log base 10

📐 TRIGONOMETRY:
Math.sin(x), Math.cos(x), Math.tan(x) → Input in radians!
Math.toRadians(degree) → Converts degrees to radians
Math.toDegrees(radian) → Converts radians to degrees

🧠 HYPOTENUSE:
Math.hypot(x, y) → Returns √(x² + y²) safely, avoids overflow

🪄 SIGN FUNCTIONS:
Math.signum(x) → Returns -1.0, 0.0, or 1.0 depending on the sign

=========================================================================================
🧪 5. IMPORTANT CONSTANTS IN MATH
🔢 Math.PI → π ≈ 3.14159
🔢 Math.E → Euler's number ≈ 2.71828

These are defined as public static final double, meaning:
✅ Constant (unchangeable)
✅ Available without object creation

=========================================================================================
⚠️ 6. COMMON PITFALLS & MISTAKES
🚫 Mistake: Using degrees in trigonometric functions without conversion
✅ Fix: Convert using Math.toRadians(degrees)

🚫 Mistake: Thinking Math.round returns an int
✅ Fix: It returns long, so cast if needed

🚫 Mistake: Using Math.random() expecting int
✅ Fix: Multiply and cast:
java int rand = (int)(Math.random() * 100); // 0 to 99

=========================================================================================
💎 7. BEST PRACTICES
✅ Use Math class for readability and precision (instead of writing own logic)
✅ Always use Math.pow() for exponents instead of manual multiplication for readability
✅ Round only when displaying — keep full precision during calculations
✅ Use Math.hypot() instead of manually doing sqrt(xx + yy) for safety
✅ Don’t forget: Trig functions use radians, not degrees

=========================================================================================
🧠 8. UNDER THE HOOD (Advanced Internals)
🔹 All methods in Math use native code, meaning they’re highly optimized by the JVM.
🔹 Some methods delegate to hardware-level operations (e.g., FPU on CPU)
🔹 Java 9+ uses StrictMath for reproducible floating-point behavior across platforms

Math class = Simple, fast, portable

=========================================================================================
📊 9. QUICK METHOD REFERENCE TABLE
Method	Description
abs(x)	Absolute value
max(a, b), min(a,b)	Find largest or smallest
sqrt(x)	Square root
pow(a, b)	a to the power of b
round(x)	Round to nearest whole number
ceil(x)	Round UP
floor(x)	Round DOWN
random()	Random number [0.0 - 1.0)
log(x), log10(x)	Natural log, base-10 log
exp(x)	e^x
sin(x), cos(x), tan(x)	Trigonometric functions (radians)
toRadians(deg)	Degrees → Radians
toDegrees(rad)	Radians → Degrees
hypot(x, y)	Safe hypotenuse √(x² + y²)

=========================================================================================
🔚 10. CONCLUSION
🎯 Math is a core part of Java — clean, simple, and fast.
🚀 Helps avoid writing error-prone formulas yourself
🧪 Used in all major applications involving:

Scientific calculations

Financial systems (rounding, absolute)

2D/3D graphics

Games and simulations

Statistical analysis

=========================================================================================
📌 END OF MATH CLASS THEORY NOTES 📌
*/

/*
===========================================================================================
📘 JAVA MATH CLASS – Beginner to Advanced Practical Guide
===========================================================================================

🎯 This program demonstrates how to use the built-in Math class in Java to:
   ✔ Access constants like PI and E
   ✔ Perform mathematical calculations (power, square root, rounding, max/min, etc.)
   ✔ Solve real-world geometry problems (triangle, circle)
   ✔ Use printf for formatted output

-------------------------------------------------------------------------------------------
📦 REMINDER: The Math class is part of java.lang, so no import needed!
All methods are static — call directly as: Math.method()
-------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 🔢 Math constants – available directly as public static final fields
        System.out.println(Math.PI); // ≈ 3.141592653589793 – ratio of circle’s circumference to diameter
        System.out.println(Math.E);  // ≈ 2.718281828459045 – base of natural logarithms

        // 📐 Declare result variables for storing Math method outputs
        double result;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;
        double result8;

        // 🔋 POWER: Raises 2 to the power of 4 → 2^4 = 16
        result = Math.pow(2, 4);

        // 🎯 ABSOLUTE VALUE: Always returns the non-negative version
        result2 = Math.abs(-5); // → 5

        // 🔍 SQUARE ROOT: √9 = 3.0
        result3 = Math.sqrt(9);

        // 🎯 ROUNDING to nearest integer → returns long
        result4 = Math.round(3.14); // → 3

        // 🔼 CEIL: Rounds UP → smallest integer ≥ input
        result5 = Math.ceil(3.14); // → 4.0

        // 🔽 FLOOR: Rounds DOWN → largest integer ≤ input
        result6 = Math.floor(3.99); // → 3.0

        // 🔝 MAXIMUM of two numbers
        result7 = Math.max(10, 20); // → 20

        // 🔻 MINIMUM of two numbers
        result8 = Math.min(10, 20); // → 10

        // 🖨️ Print all results
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

        // ====================================================================================
        // 🧪 EXERCISE: FIND THE HYPOTENUSE OF A RIGHT TRIANGLE
        // Formula: hypotenuse = √(base² + height²)
        // ====================================================================================

        Scanner scanner = new Scanner(System.in);
        int base;
        int height;
        double hypotenuse;

        System.out.println("Enter the base length of the triangle (in cm): ");
        base = scanner.nextInt();

        System.out.println("Enter the height of the triangle (in cm): ");
        height = scanner.nextInt();

        // 🧠 Use Pythagorean theorem
        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        System.out.println("The hypotenuse of the triangle is: " + hypotenuse + "cm");

        // ====================================================================================
        // 🧮 EXERCISE: CALCULATE CIRCLE PROPERTIES (Circumference, Area, Volume)
        // ====================================================================================

        int radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextInt();

        // 🧮 CIRCUMFERENCE = 2πr
        circumference = 2 * Math.PI * radius;

        // 🧮 AREA = πr²
        area = Math.PI * Math.pow(radius, 2);

        // 🧮 VOLUME (of sphere) = 4/3 × π × r³
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // 📤 Print full values (unformatted)
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area + "cm²");
        System.out.println("The volume of the circle is: " + volume + "cm³");

        // ====================================================================================
        // 💡 BONUS: FORMATTED OUTPUT USING printf()
        // %.1f = round to 1 decimal place
        // ====================================================================================

        System.out.printf("The circumference of the circle is: %.1fcm",  circumference);
        System.out.printf("\nThe area of the circle is: %.1fcm²",  area);
        System.out.printf("\nThe volume of the circle is: %.1fcm³",  volume);

        // Always good practice to close Scanner at the end
        scanner.close();
    }
}
