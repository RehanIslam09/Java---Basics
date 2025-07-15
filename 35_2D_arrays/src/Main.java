/*
╔════════════════════════════════════════════════════════════════════════════╗
║                            📚 2D ARRAYS IN JAVA                            ║
╚════════════════════════════════════════════════════════════════════════════╝

╭───────────────────────────────────────────────────────────────╮
│                  🔷 WHAT IS A 2D ARRAY?                        │
╰───────────────────────────────────────────────────────────────╯

A 2D array in Java is essentially an "array of arrays".
It allows you to store data in a **grid or table-like** format,
with **rows and columns**.

🧠 Think of it as a matrix:

      ┌───────────────┐
      │ 10  20  30    │  ← Row 0
      │ 40  50  60    │  ← Row 1
      │ 70  80  90    │  ← Row 2
      └───────────────┘
        ↑   ↑   ↑
      Col0 Col1 Col2

Each element in the 2D array can be accessed using **two indices**:
1. The row index
2. The column index

✏️ Syntax to declare a 2D array:
────────────────────────────────
  dataType[][] arrayName;

✏️ Syntax to create a 2D array:
────────────────────────────────
  arrayName = new dataType[rows][columns];

💡 Example:
  int[][] matrix = new int[3][3];  // 3 rows, 3 columns

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│                 🛠️  INITIALIZING A 2D ARRAY                   │
╰───────────────────────────────────────────────────────────────╯

There are two main ways to initialize a 2D array:

1️⃣ Static Initialization:
────────────────────────────
int[][] grid = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};

2️⃣ Dynamic Initialization:
────────────────────────────
int[][] grid = new int[3][3];
grid[0][0] = 1;
grid[0][1] = 2;
...and so on

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│                🔎 ACCESSING ELEMENTS IN 2D ARRAY              │
╰───────────────────────────────────────────────────────────────╯

To access an element in the 2D array:
  arrayName[row][column];

⚠️ Always remember:
 - Indexing in Java starts from 0
 - So, array[0][0] refers to the first row, first column.

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│              🔁 LOOPING THROUGH A 2D ARRAY                    │
╰───────────────────────────────────────────────────────────────╯

We use **nested loops** to iterate through all elements:

for(int i = 0; i < rows; i++){
  for(int j = 0; j < columns; j++){
    System.out.println(array[i][j]);
  }
}

🌟 Enhanced for-loop (for-each) can also be used:
for(int[] row : array){
  for(int value : row){
    System.out.println(value);
  }
}

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│            ⚒️ COMMON OPERATIONS ON 2D ARRAYS                 │
╰───────────────────────────────────────────────────────────────╯

✔️ Filling a 2D array
✔️ Printing in matrix form
✔️ Summing all elements
✔️ Transposing a matrix
✔️ Searching for an element
✔️ Sorting rows or columns individually

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│                 📦 REAL-WORLD USE CASES                       │
╰───────────────────────────────────────────────────────────────╯

✅ Game boards (like Tic-Tac-Toe, Chess)
✅ Excel-like spreadsheets
✅ Image pixel data (RGB matrices)
✅ Seating arrangements
✅ Maze/grid-based problems

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│                   🧠 TIPS AND REMINDERS                      │
╰───────────────────────────────────────────────────────────────╯

⚠️ You can have **jagged arrays** in Java.
    That means each row can have a different length.

    Example:
    int[][] jagged = {
      {1, 2},
      {3, 4, 5},
      {6}
    };

⚠️ Always check `.length` safely:
    - array.length → gives number of rows
    - array[i].length → gives number of columns in row i

🧠 Be careful with `ArrayIndexOutOfBoundsException` when accessing elements.

═════════════════════════════════════════════════════════════════════

╭───────────────────────────────────────────────────────────────╮
│                    🏁 SUMMARY CHECKLIST                       │
╰───────────────────────────────────────────────────────────────╯

✅ Declared with two square brackets: [][]
✅ Accessed using: array[row][col]
✅ Nested loops are used to traverse
✅ Can be rectangular or jagged
✅ Very useful in matrices, games, tables

═════════════════════════════════════════════════════════════════════
*/

public class Main {
    public static void main(String[] args) {

        /*
        ╔═════════════════════════════════════════════╗
        ║             🛒 GROCERY MATRIX               ║
        ╚═════════════════════════════════════════════╝

        A 2D array where each element is an array.
        It's useful for representing structured, matrix-like data.
        */

        // Individual category arrays
        String[] fruits     = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats      = {"chicken", "pork", "beef", "fish"};

        // Option 1: Combine the above arrays
        // String[][] groceries = {fruits, vegetables, meats};

        // Option 2: Declare 2D array directly
        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}
        };

        // ✅ Modifying elements inside the 2D array
        groceries[0][0] = "pineapple";  // Change apple → pineapple
        groceries[1][0] = "celery";     // Change potato → celery
        groceries[2][1] = "eggs";       // Change pork → eggs

        /*
        ╔═════════════════════════════════════════════╗
        ║            📋 DISPLAY GROCERY LIST          ║
        ╚═════════════════════════════════════════════╝
        */

        System.out.println("🛒 Grocery List:");
        for (String[] category : groceries) {
            for (String item : category) {
                System.out.print(item + " ");
            }
            System.out.println(); // move to next row
        }

        /*
        ╔═════════════════════════════════════════════╗
        ║          ☎️ TELEPHONE NUMBER PAD            ║
        ╚═════════════════════════════════════════════╝

        A 2D character array representing a keypad layout:

            ┌─────┬─────┬─────┐
            │  1  │  2  │  3  │
            │  4  │  5  │  6  │
            │  7  │  8  │  9  │
            │  *  │  0  │  #  │
            └─────┴─────┴─────┘
        */

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        // 📞 Display the telephone keypad layout
        System.out.println("\n☎️ Telephone Keypad:");
        for (char[] row : telephone) {
            for (char key : row) {
                System.out.print(key + " ");
            }
            System.out.println(); // new row
        }

    }
}

