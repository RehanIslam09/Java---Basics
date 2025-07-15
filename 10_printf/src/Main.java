/*
====================================================================================
🖨️ JAVA printf() – FORMATTED OUTPUT METHOD (Beginner → Advanced)
====================================================================================

🎯 PURPOSE:
-----------
Java’s `printf()` method (short for "print formatted") allows you to display output
in a clean, precise, and structured way by formatting variables and text into strings.

🧠 Analogy:
------------
Think of `printf()` like a customizable label printer 🖨️ where you:
  1️⃣ Design a label template (the format string)
  2️⃣ Fill in the values (arguments)
And it prints a beautiful, properly aligned result.

------------------------------------------------------------------------------------
📦 LOCATION:
-----------
Method: `System.out.printf()`
Belongs to: `PrintStream` class (java.io package)
No import is needed because `System.out` is pre-initialized.

====================================================================================
🔣 1. FORMAT STRING STRUCTURE
====================================================================================

The format string is the main pattern/template you define inside `printf()`.

SYNTAX:
--------
System.out.printf("format_string", arguments);

Examples (DO NOT TYPE):
------------------------
System.out.printf("My name is %s", "Rehan");
System.out.printf("My GPA is %.2f", 3.85);

====================================================================================
🧩 2. PLACEHOLDERS / FORMAT SPECIFIERS
====================================================================================

Format specifiers are special codes (starting with `%`) that act as placeholders
for values you want to insert.

MOST COMMON SPECIFIERS:
-------------------------
| Specifier | Stands For       | Example Input | Output Example     |
|-----------|------------------|---------------|---------------------|
| %d        | Integer           | 25            | 25                  |
| %f        | Floating-point    | 3.14159       | 3.141590            |
| %.2f      | Float (2 decimals)| 3.14159       | 3.14                |
| %s        | String            | "Hello"       | Hello               |
| %c        | Character         | 'A'           | A                   |
| %b        | Boolean           | true          | true                |
| %n        | Newline (OS safe) | —             | line break          |

🧠 `%n` is OS-independent (preferred over \n).

====================================================================================
🎨 3. PRECISION CONTROL (Especially for Decimals)
====================================================================================

➕ Format: %.nf
Where `n` is the number of digits after the decimal point.

Examples:
----------
- %.1f → one digit after decimal → 3.1
- %.3f → three digits → 3.142

Useful for:
- GPA
- Currency
- Measurements
- Percentages

====================================================================================
📐 4. WIDTH & ALIGNMENT
====================================================================================

You can control **field width** and **alignment** for cleaner tabular output.

SYNTAX:
---------
%[flags][width][.precision]specifier

Flags:
--------
- `-` → Left-align
- `0` → Pad with zeros (only with numbers)

Examples (DO NOT TYPE):
------------------------
| Format        | Input   | Output        |
|---------------|---------|---------------|
| %10s          | "Hi"    | "        Hi"  |
| %-10s         | "Hi"    | "Hi        "  |
| %05d          | 42      | "00042"       |

====================================================================================
🛠️ 5. ESCAPE CHARACTERS (Same as in println)
====================================================================================

| Escape | Meaning         |
|--------|-----------------|
| \n     | New line        |
| \t     | Tab             |
| \"     | Double quote    |
| \\     | Backslash       |

🔔 Tip: `%n` is a better cross-platform newline than `\n`.

====================================================================================
💎 6. REAL-WORLD USE CASES
====================================================================================

✔️ Displaying currency or prices:
System.out.printf("Total: ₹%.2f%n", price);

✔️ Aligned tables and reports:
System.out.printf("%-10s %-10s %-5d%n", "Item", "Price", 3);

✔️ Percentages:
System.out.printf("Success Rate: %.2f%%%n", 99.25);

✔️ Time/dates (via `String.format()` or `Formatter`):
System.out.printf("Time: %02d:%02d%n", 9, 5); // → Time: 09:05

====================================================================================
⚠️ 7. COMMON PITFALLS
====================================================================================

🚫 Forgetting to match specifier to data type:
  - `%d` with a float → throws `IllegalFormatConversionException`

🚫 Mismatched number of arguments:
  - Too many or too few arguments after format string

🚫 Confusing `\n` vs `%n`:
  - `%n` is platform-independent → use in `printf()`

🚫 Using `printf()` without flushing (rare in buffered IO)

====================================================================================
📚 8. printf() VS print() VS println()
====================================================================================

| Method     | What It Does                         |
|------------|--------------------------------------|
| print()    | Prints without newline               |
| println()  | Prints with newline                  |
| printf()   | Prints formatted output (no newline) |

🔁 Want newline with printf?
→ Add `%n` at end OR manually `System.out.println();`

====================================================================================
🧠 9. BONUS – printf() Inside Loops
====================================================================================

```java
// Print aligned multiplication table:
for (int i = 1; i <= 5; i++) {
    System.out.printf("%-10s%-10d%n", "Row " + i, i * 10);
}

Result:
Row 1 10
Row 2 20
Row 3 30
Row 4 40
Row 5 50

====================================================================================
✅ 10. SUMMARY
📌 Use printf() when:

You want precision (like 2 decimals)

You need clean tables or reports

You want formatted numbers, currency, or padding

You’re working with multiple variables in one line

🧪 Practice Ideas:

Format a receipt

Print a leaderboard

Create a calendar grid

Time formatting with %02d:%02d:%02d

====================================================================================
🏁 THAT'S THE COMPLETE printf() THEORY!
 */

public class Main {
    public static void main(String[] args) {

        /*
        ==========================================================
        🧪 BASIC FORMATTED OUTPUT WITH printf()
        ==========================================================
        */

        // ✅ Declaring sample variables to be formatted using printf()
        String name = "Rehan";
        char firstLetter = 'R';
        int age = 18;
        double height = 172.5;
        boolean isEmployed = true;

        // %s → String placeholder
        System.out.printf("Hello %s%n", name);

        // %c → Single character
        System.out.printf("Your name starts with a %c%n", firstLetter);

        // %d → Integer values
        System.out.printf("You are %d years old%n", age);

        // %f → Floating point (by default prints 6 decimal places)
        System.out.printf("You are %f cms tall%n", height);

        // %b → Boolean
        System.out.printf("Employed: %b%n", isEmployed);

        // Using multiple placeholders in one line
        System.out.printf("%s is %d years old%n", name, age);


        /*
        ==========================================================
        🎯 PRECISION CONTROL (%.nf)
        ----------------------------------------------------------
        Controls how many decimal places to show
        ==========================================================
        */

        double price1 = 90000.99;
        double price2 = 10000.15;
        double price3 = -54000.01;

        System.out.printf("%.1f%n", price1); // 1 decimal place
        System.out.printf("%.2f%n", price2); // 2 decimal places
        System.out.printf("%.3f%n", price3); // 3 decimal places


        /*
        ==========================================================
        💎 FLAGS in printf()
        ----------------------------------------------------------
        Enhance formatting with special symbols and alignment
        ==========================================================

        +   → Show sign (+ or -)
        ,   → Use comma separators for thousands
        (   → Enclose negative numbers in parentheses
        [space] → Leave space for positive, minus for negative
        */

        // ➕ Show positive sign (+)
        System.out.printf("%+.1f%n", price1); // +90000.9
        System.out.printf("%+.2f%n", price2); // +10000.15
        System.out.printf("%+.3f%n", price3); // -54000.010

        // ➗ Comma grouping
        System.out.printf("%,.1f%n", price1); // 90,000.9
        System.out.printf("%,.2f%n", price2); // 10,000.15
        System.out.printf("%,.3f%n", price3); // -54,000.010

        // 📦 Enclose negatives in parentheses
        System.out.printf("%(.1f%n", price1); // 90000.9
        System.out.printf("%(.2f%n", price2); // 10000.15
        System.out.printf("%(.3f%n", price3); // (54000.010)

        // ➖ Space padding
        System.out.printf("% .1f%n", price1); //  90000.9
        System.out.printf("% .2f%n", price2); //  10000.15
        System.out.printf("% .3f%n", price3); // -54000.010


        /*
        ==========================================================
        🧱 WIDTH, ALIGNMENT & PADDING
        ----------------------------------------------------------
        - Use fixed width for table-like alignment
        - Pad with 0, right-align or left-align
        ==========================================================

        Format: %[flags][width]specifier
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // 🔢 ZERO-PAD with width 4 → total 4 characters, pad with 0s
        System.out.printf("%04d%n", id1);
        System.out.printf("%04d%n", id2);
        System.out.printf("%04d%n", id3);
        System.out.printf("%04d%n", id4);

        /*
            ✅ OUTPUT (zero-padded to 4 digits):
            0001
            0023
            0456
            7890
        */


        // 📐 RIGHT-JUSTIFIED padding (default, with spaces)
        System.out.printf("%4d%n", id1);
        System.out.printf("%4d%n", id2);
        System.out.printf("%4d%n", id3);
        System.out.printf("%4d%n", id4);

        /*
            ✅ OUTPUT (aligned right):
               1
              23
             456
            7890
        */


        // ⬅️ LEFT-JUSTIFIED padding using '-' flag
        System.out.printf("%-4d%n", id1);
        System.out.printf("%-4d%n", id2);
        System.out.printf("%-4d%n", id3);
        System.out.printf("%-4d%n", id4);

        /*
            ✅ OUTPUT (aligned left):
            1
            23
            456
            7890
        */

    }
}

/*

============= BONUS SUMMARY CHEATSHEET ================

// Placeholder types:
%s → string
%c → char
%d → integer
%f → float/double
%b → boolean
%n → newline

// Precision:
%.2f → 2 decimal places

// Flags:
%+d  → show sign
%,d  → comma grouping
%(f  → wrap negatives in ( )
% d  → space for positive

// Width and alignment:
%6d   → 6-character wide, right-aligned
%-6d  → 6-character wide, left-aligned
%06d  → 6-character wide, zero-padded

*/
