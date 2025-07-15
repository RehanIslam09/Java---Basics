import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ╔═════════════════════════════════════════════════════════════════════╗
        ║ 🤿 DEEP DIVE: NESTED LOOPS IN JAVA (BEGINNER → ADVANCED)            ║
        ╚═════════════════════════════════════════════════════════════════════╝

        🔁 What is a Nested Loop?
        ─────────────────────────
        A nested loop is simply a loop **inside another loop**.
        It allows us to repeat a set of instructions **multiple times** within a larger repetition.

        ⛓ Structure:
        ────────────
        for (int i = 0; i < outerLimit; i++) {         // Outer loop
            for (int j = 0; j < innerLimit; j++) {     // Inner loop
                // This block will execute outerLimit × innerLimit times
            }
        }

        ⚙️ Execution Flow:
        ──────────────────
        1. Outer loop starts (i = 0)
        2. Inner loop runs to completion (j from 0 to innerLimit)
        3. Outer loop increments (i = 1), inner loop starts again
        4. Process continues until outer loop condition fails

        🧠 Analogy:
        ──────────
        Think of:
        - Outer loop as "rows"
        - Inner loop as "columns"
        So nested loops are perfect for **tables**, **grids**, **patterns**, and **matrix** problems.

        🧮 Math:
        ───────
        Total iterations = outerLimit × innerLimit

        ⛔ Common Mistake:
        ─────────────────
        - Reusing the same variable for both loops (use i, j or x, y)
        - Forgetting to reset inner loop variables (less common in for-loops)

        ✅ Use Cases:
        ─────────────
        - Printing patterns like triangles, pyramids, boxes
        - 2D arrays (matrix)
        - Comparing items in a list to each other
        - Generating multiplication tables
        - Game board designs (chessboard, grids)
        */

        // ════════════════════════════════════════════════════════════════
        // 🧪 EXAMPLE 1: Print a 3×3 box of stars (★)
        // ════════════════════════════════════════════════════════════════
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("★ ");
            }
            System.out.println(); // Move to next line after one row
        }

        /*
        OUTPUT:
        ★ ★ ★
        ★ ★ ★
        ★ ★ ★
        */

        // ════════════════════════════════════════════════════════════════
        // 🧪 EXAMPLE 2: Multiplication Table (1 to 5)
        // ════════════════════════════════════════════════════════════════
        System.out.println("\n🧮 MULTIPLICATION TABLE:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d × %2d = %3d   ", i, j, i * j);
            }
            System.out.println();
        }

        // ════════════════════════════════════════════════════════════════
        // 🧪 EXAMPLE 3: Print a right-angled triangle pattern
        // ════════════════════════════════════════════════════════════════
        System.out.println("\n🔺 RIGHT-ANGLED TRIANGLE:");

        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }

        /*
        OUTPUT:
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        // ════════════════════════════════════════════════════════════════
        // 🧪 EXAMPLE 4: Matrix Display (Row and Column Index)
        // ════════════════════════════════════════════════════════════════
        System.out.println("\n🔢 MATRIX INDEX DISPLAY:");

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("[" + row + "," + col + "] ");
            }
            System.out.println();
        }

        /*
        OUTPUT:
        [0,0] [0,1] [0,2] [0,3]
        [1,0] [1,1] [1,2] [1,3]
        [2,0] [2,1] [2,2] [2,3]
        [3,0] [3,1] [3,2] [3,3]
        */

        // ════════════════════════════════════════════════════════════════
        // 🔚 WRAP UP:
        /*
        ⛏ PRO TIPS:
        ───────────
        ✔ Outer loop = large structures (rows, major sections)
        ✔ Inner loop = small repeated elements (columns, details)
        ✔ Don't forget line breaks (`System.out.println()`) when printing patterns

        🧠 Nested loops are POWERFUL for solving many complex problems in simple ways.
        */
// =====================================================================================================================

        // nested loop = A loop inside another loop
//                       Used often with matrices or DS&A

        /*
        ╔══════════════════════════════════════════════════════════════════════╗
        ║ 🔁 NESTED LOOPS: Repeating Patterns & Avoiding Repetition (Deep Dive)║
        ╚══════════════════════════════════════════════════════════════════════╝

        🧠 Observation:
        ───────────────
        The first 3 loops below repeat the exact same code:
        They each print numbers from 1 to 9 followed by a newline.

        Let's look at the repetitive code...
        */

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
        🧹 Problem:
        ───────────
        ❌ Code Repetition = Bad Practice
        It’s hard to maintain, read, and scale.

        ✅ Solution:
        ────────────
        Use a **nested loop**:
        - Outer loop: Runs 3 times (for 3 lines)
        - Inner loop: Prints numbers 1 to 9 in a line
        */

        System.out.println("\n✅ Using nested loops instead of repetition:");

        for (int i = 1; i <= 3; i++) {            // Outer loop → 3 rows
            for (int j = 1; j <= 9; j++) {        // Inner loop → numbers 1 to 9
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        /*
        ╔════════════════════════════════════════════════════════════════════╗
        ║ 🧪 MINI-PROGRAM: ROWS × COLUMNS SYMBOL PRINTER                     ║
        ╚════════════════════════════════════════════════════════════════════╝

        🎯 Goal:
        ────────
        Let user input:
        - Number of rows
        - Number of columns
        - A symbol (character)

        ➜ Output a grid/pattern of that symbol in specified dimensions.
        */

        Scanner scanner = new Scanner(System.in); // For user input

        int rows;
        int columns;
        char symbol;

        // 💬 Asking for user input
        System.out.print("\n📏 Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("📐 Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("🔣 Enter the symbol to print: ");
        symbol = scanner.next().charAt(0);

        /*
        🎨 PRINTING THE SYMBOL GRID:
        Outer loop → runs for each row
        Inner loop → runs for each column per row
        */

        System.out.println("\n🖨 Printing your pattern:\n");

        for (int i = 0; i < rows; i++) {              // Row loop
            for (int j = 0; j < columns; j++) {       // Column loop
                System.out.print(symbol);             // Print symbol without newline
            }
            System.out.println(); // Newline after each row is completed
        }

        /*
        🔚 Final Thoughts:
        ──────────────────
        - Nested loops allow us to build patterns, shapes, tables, and matrices.
        - The outer loop is for "repeating blocks"
        - The inner loop is for "details inside each block"
        */

        scanner.close(); // Close the Scanner to avoid memory leaks
    }
}