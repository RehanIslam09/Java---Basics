/*
================================================================================
📘 JAVA ARITHMETIC OPERATORS – COMPLETE THEORY GUIDE
================================================================================

🔰 LEVEL: Absolute Beginner → Advanced
🎯 PURPOSE: Understand how to perform math operations in Java
📦 TOPIC: Arithmetic Operators

================================================================================
🧠 1. WHAT ARE ARITHMETIC OPERATORS?
================================================================================

Arithmetic operators are **symbols used to perform mathematical operations** between two values or variables.

These include:
- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division
- 🧮 Modulus (remainder)
- ⬆️ Increment / Decrement (prefix and postfix)

Java provides 6 primary arithmetic operators:
-------------------------------------------------------------------------------
| Operator | Symbol | Example      | Description                            |
|----------|--------|--------------|----------------------------------------|
| Add      | +      | a + b        | Adds two values                        |
| Subtract | -      | a - b        | Subtracts second from the first        |
| Multiply | *      | a * b        | Multiplies two values                  |
| Divide   | /      | a / b        | Divides first by second                |
| Modulus  | %      | a % b        | Returns the remainder after division   |
| Negation | -      | -a           | Converts a positive number to negative |

================================================================================
📐 2. ADDITION (+)
================================================================================

Used to add two numbers.

- Works with: integers, floats, doubles, and even strings (for concatenation)
- Special behavior: if either operand is a `String`, `+` performs **concatenation**

Example:
a = 10, b = 5 → a + b = 15
"Hello " + "World" = "Hello World"

================================================================================
➖ 3. SUBTRACTION (-)
================================================================================

Used to subtract the second operand from the first.

- Simple numerical difference
- Works with all numeric types

Example:
a = 10, b = 5 → a - b = 5

================================================================================
✖️ 4. MULTIPLICATION (*)
================================================================================

Used to multiply two numbers.

Example:
a = 10, b = 5 → a * b = 50

Notes:
- Java follows **BODMAS (precedence rules)**, so multiplication is done before addition/subtraction.

================================================================================
➗ 5. DIVISION (/)
================================================================================

Used to divide one number by another.

⚠️ Special Rules:
- Integer division: discards the decimal (e.g., 7 / 2 = 3)
- Use float or double to keep decimal precision (e.g., 7.0 / 2 = 3.5)

Example:
int result = 7 / 2;       // result = 3 (NOT 3.5)
double result = 7.0 / 2;  // result = 3.5

⚠️ Division by zero:
- Integer → Throws ArithmeticException
- Double/float → Returns Infinity or NaN

================================================================================
🧮 6. MODULUS (%) → REMAINDER OPERATOR
================================================================================

Returns the **remainder** of a division operation.

Use cases:
- Check for even/odd: `num % 2 == 0`
- Circular arrays, game turns: `i % length`
- Detect multiples: `num % x == 0`

Example:
10 % 3 = 1 (since 10 ÷ 3 = 3 remainder 1)

================================================================================
⬆️ 7. INCREMENT (++) AND DECREMENT (--)
================================================================================

Used to increase/decrease a value by 1.

Comes in two forms:
-------------------------------------------------------------------------------
| Form         | Syntax | Behavior                             |
|--------------|--------|--------------------------------------|
| Prefix       | ++a    | Increments first, then returns value |
| Postfix      | a++    | Returns value, then increments       |
-------------------------------------------------------------------------------

Example:
int a = 5;
System.out.println(++a); // prints 6
System.out.println(a++); // prints 6, then a becomes 7

Same applies for `--` (decrement)

================================================================================
📊 8. OPERATOR PRECEDENCE (ORDER OF EXECUTION)
================================================================================

Java evaluates arithmetic expressions using **operator precedence**.

Highest to lowest:
1. ( )         → Parentheses first
2. *, /, %     → Multiplication, division, modulus
3. +, -        → Addition and subtraction

Example:
int result = 10 + 2 * 5;      // 10 + (2 * 5) = 20
int result = (10 + 2) * 5;    // (10 + 2) * 5 = 60

⚠️ Use parentheses to make complex expressions more readable and predictable.

================================================================================
📈 9. TYPE PROMOTION & IMPLICIT CONVERSION
================================================================================

If operands are of **different types**, Java promotes smaller type to match the larger one.

Example:
int a = 10;
double b = 5.5;
Result of a + b → b becomes 5.5 → Output is double (15.5)

Java automatically promotes:
byte → short → int → long → float → double

================================================================================
🚨 10. COMMON MISTAKES & GOTCHAS
================================================================================

⚠️ Integer division truncates decimals: 5 / 2 = 2 (not 2.5)
⚠️ Division by zero with integers throws exception: 5 / 0 → ArithmeticException
⚠️ Overflows: int max = 2,147,483,647 → exceeding it causes wraparound
⚠️ Precision issues with float/double due to IEEE-754 representation

================================================================================
🧠 11. REAL-WORLD EXAMPLES
================================================================================

✔️ Calculators
✔️ Finance apps (tax %, discounts)
✔️ Game scoring systems
✔️ Shopping carts (quantity * price)
✔️ Loop counters, indexers (i++, i--)

================================================================================
📘 12. BEST PRACTICES
================================================================================

✔️ Use `double` when precision matters (like currency, GPA, ratios)
✔️ Be cautious with division — cast explicitly to get decimals
✔️ Always check for division by zero
✔️ Group operations with `()` to control precedence
✔️ Prefer readability over clever compact code

================================================================================
✅ 13. SUMMARY TABLE
================================================================================

| Operator | Meaning         | Notes                               |
|----------|------------------|--------------------------------------|
| +        | Addition          | Also used for string concatenation  |
| -        | Subtraction       | Simple difference                   |
| *        | Multiplication    | Respects precedence                 |
| /        | Division          | Integer → truncates, double → float |
| %        | Modulus           | Returns remainder                   |
| ++       | Increment         | Prefix/postfix differs              |
| --       | Decrement         | Same logic as ++                    |

================================================================================
📌 END OF ARITHMETIC OPERATORS THEORY
================================================================================
*/


public class Main {
    public static void main(String[] args) {

        /*
        ====================================================================================
        🎯 ARITHMETIC OPERATORS IN JAVA – FULL HANDS-ON GUIDE
        ====================================================================================

        📌 This code covers:
           - Basic arithmetic: +, -, *, /, %
           - Variable reassignment
           - Augmented assignment operators (e.g., +=, -=)
           - Increment & Decrement (++, --)
           - Operator precedence (PEMDAS)
        ====================================================================================
        */

        // 🧮 Step 1: Declare variables for arithmetic operations
        int x = 10;
        int y = 3;
        int z; // We'll reuse z to store results

        // ➕ ADDITION
        z = x + y; // Adds 10 + 3 = 13
        System.out.println("Addition (x + y): " + z);

        // ➖ SUBTRACTION
        z = x - y; // Subtracts 10 - 3 = 7
        System.out.println("Subtraction (x - y): " + z);

        // ✖️ MULTIPLICATION
        z = x * y; // Multiplies 10 * 3 = 30
        System.out.println("Multiplication (x * y): " + z);

        // ➗ DIVISION
        z = x / y; // Integer division → 10 / 3 = 3 (decimal discarded)
        System.out.println("Division (x / y): " + z);

        // 🧮 MODULUS (REMAINDER)
        z = x % y; // 10 % 3 = 1 (remainder after division)
        System.out.println("Modulus (x % y): " + z);
        // 🔹 Useful to check if a number is even or odd:
        //      if (x % 2 == 0) → even, else → odd

        /*
        ====================================================================================
        🔁 REASSIGNMENT & AUGMENTED OPERATORS
        ====================================================================================
        */

        // 🔁 REASSIGNING a value to `x`
        x = x + y; // x = 10 + 3 = 13
        System.out.println("x after x = x + y: " + x);

        // ✅ BETTER WAY: Augmented Assignment Operators
        // These make the code cleaner and more readable:

        x += y; // Same as x = x + y → 13 + 3 = 16
        System.out.println("x after x += y: " + x);

        x -= y; // Same as x = x - y → 16 - 3 = 13
        System.out.println("x after x -= y: " + x);

        x *= y; // x = x * y → 13 * 3 = 39
        System.out.println("x after x *= y: " + x);

        x /= y; // x = x / y → 39 / 3 = 13
        System.out.println("x after x /= y: " + x);

        x %= y; // x = x % y → 13 % 3 = 1
        System.out.println("x after x %= y: " + x);

        /*
        ====================================================================================
        ⬆️ INCREMENT & DECREMENT OPERATORS
        ====================================================================================
        */

        int i = 9; // Fresh variable for increment/decrement

        // ⬆️ INCREMENT (adds 1 to the value)
        // i = i + 1;         ✅ Traditional
        // i += 1;            ✅ Shorthand
        i++;                // ✅ Most common in loops or counters
        System.out.println("After increment (i++): " + i); // i becomes 10

        // ⬇️ DECREMENT (subtracts 1)
        // i = i - 1;
        // i -= 1;
        i--; // i becomes 9
        i--; // i becomes 8
        i--; // i becomes 7
        System.out.println("After 3 decrements (i--): " + i);

        /*
        ====================================================================================
        📐 OPERATOR PRECEDENCE (ORDER OF EXECUTION)
        ====================================================================================
        Java uses **PEMDAS**:
        ➤ Parentheses
        ➤ Exponents (Java doesn't have `^` for power, uses Math.pow)
        ➤ Multiplication, Division, Modulus (left to right)
        ➤ Addition, Subtraction (left to right)

        NOTE: You can use parentheses to control execution order explicitly.
        ====================================================================================
        */

        // 🧠 Let's test order of operations
        double result = 3 + 4 * (7 - 5) / 2.0;
        /*
         * Step-by-step breakdown:
         * (7 - 5)       = 2
         * 4 * 2         = 8
         * 8 / 2.0       = 4.0
         * 3 + 4.0       = 7.0
         */
        System.out.println("Result of 3 + 4 * (7 - 5) / 2.0: " + result);

        /*
        ====================================================================================
        🎓 QUICK REVIEW
        ====================================================================================
        | Operator | Meaning        | Example      | Result      |
        |----------|----------------|--------------|-------------|
        | +        | Addition        | 10 + 3       | 13          |
        | -        | Subtraction     | 10 - 3       | 7           |
        | *        | Multiplication  | 10 * 3       | 30          |
        | /        | Division        | 10 / 3       | 3 (int)     |
        | %        | Modulus         | 10 % 3       | 1           |
        | ++       | Increment       | i++          | i = i + 1   |
        | --       | Decrement       | i--          | i = i - 1   |
        | +=       | Add & assign    | x += y       | x = x + y   |
        | -=       | Subtract & assign| x -= y      | x = x - y   |

        ====================================================================================
        ✅ RECOMMENDED PRACTICES
        ====================================================================================
        ✔️ Use augmented operators (+=, *=, etc.) for cleaner code
        ✔️ Use `double` or `float` when precision is important (e.g., GPA, ratios)
        ✔️ Use parentheses to control order of operations
        ✔️ Use `%` for useful logic like checking even/odd or looping cycles
        ✔️ Always be aware of type: integer division vs. floating-point division
        ====================================================================================
        */
    }
}
