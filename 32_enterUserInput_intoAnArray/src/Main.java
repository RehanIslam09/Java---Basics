/*
╔════════════════════════════════════════════════════════════╗
║              📥 USER INPUT IN ARRAYS (JAVA)                ║
╚════════════════════════════════════════════════════════════╝

🔷 INTRODUCTION
   In Java, arrays are fixed-length data structures that store multiple values
   of the same data type. To collect input from users into an array, we commonly use:
     ➤ The Scanner class (from java.util.Scanner)
     ➤ A loop (typically for or while)

   Example Goal: Ask the user to enter N numbers and store them in an array.

──────────────────────────────────────────────────────────────

🔷 BASIC STEPS TO ACCEPT ARRAY INPUT FROM USER:

1️⃣ IMPORT the Scanner class.
2️⃣ DECLARE an array of a fixed size.
3️⃣ LOOP through the array indices.
4️⃣ INSIDE the loop, read each value using `scanner.next<Type>()`.
5️⃣ STORE the value at the current index of the array.

──────────────────────────────────────────────────────────────

🔷 COMMON ARRAY TYPES FOR INPUT:
    ➤ int[]    ← for integers
    ➤ double[] ← for decimal numbers
    ➤ String[] ← for words or full lines

──────────────────────────────────────────────────────────────

🔷 EXAMPLE 1: INPUTTING INTEGERS IN AN ARRAY

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt(); // Get size of array

        int[] numbers = new int[size]; // Create array of user-defined size

        // 🌀 Taking input in a loop
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter number #%d: ", i + 1);
            numbers[i] = scanner.nextInt(); // Storing input at index i
        }

        // 📤 Outputting all values
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}

──────────────────────────────────────────────────────────────

🔷 EXAMPLE 2: INPUTTING STRINGS IN AN ARRAY

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int size = scanner.nextInt();
        scanner.nextLine(); // ⛔ Consume leftover newline

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter name #%d: ", i + 1);
            names[i] = scanner.nextLine();
        }

        System.out.println("You entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

──────────────────────────────────────────────────────────────

🔷 EXAMPLE 3: INPUTTING DOUBLE VALUES INTO AN ARRAY

double[] prices = new double[5];

for (int i = 0; i < 5; i++) {
    System.out.print("Enter a price: ");
    prices[i] = scanner.nextDouble();
}

──────────────────────────────────────────────────────────────

🔷 COMMON MISTAKES TO AVOID

❌ Forgetting `scanner.nextLine()` after `scanner.nextInt()` or `nextDouble()`
   ➤ Causes skipped inputs when reading Strings.
   ➤ Fix: add `scanner.nextLine();` after reading number to consume newline.

❌ Accessing indices outside array bounds
   ➤ Example: `array[5]` on an array of size 5 → IndexOutOfBoundsException

──────────────────────────────────────────────────────────────

🔷 FINAL TIPS

✅ Arrays are **zero-indexed** → index starts from 0 to size-1
✅ Use enhanced `for-each` loops for clean printing
✅ Consider validating input inside the loop (optional)
✅ You can combine with other logic like sorting, searching, etc.

──────────────────────────────────────────────────────────────

🧠 REMEMBER:

     +------------------------+
     |  i     |  array[i]     |
     +------------------------+
     |  0     |  first value   |
     |  1     |  second value  |
     |  2     |  third value   |
     +------------------------+

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ╔═════════════════════════════════════════════════════════════════╗
        ║            🍽️ INTERACTIVE FOOD LIST USING ARRAYS               ║
        ╚═════════════════════════════════════════════════════════════════╝

        🎯 GOAL:
        Allow the user to input how many food items they want to add,
        store the items into an array, and then print them out nicely.

        KEY CONCEPTS:
        - Arrays
        - Scanner for input
        - for loops (standard and enhanced)
        */

        // 🛠️ Step 1: Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // 🧺 Step 2: Declare an array of Strings (for storing food names)
        String[] foods;

        // 🧮 Step 3: Ask user how many food items they want to enter
        int size;
        System.out.print("🍴 How many food items do you want to enter? ");
        size = scanner.nextInt(); // take number from user

        scanner.nextLine(); // 💡 VERY IMPORTANT: consume the leftover newline

        // 🧵 Step 4: Initialize the array with the user-specified size
        foods = new String[size];

        /*
        Example:
            size = 3  →  new String[3]
            So the array indices are: 0, 1, 2
        */

        // ✍️ Step 5: Take actual food inputs from user and store in array
        for (int i = 0; i < foods.length; i++) {
            System.out.print("🥗 Enter food item #" + (i + 1) + ": ");
            foods[i] = scanner.nextLine(); // storing at each index
        }

        // 📤 Step 6: Displaying all the food items back to the user
        System.out.println("\n🍽️ Here's what you entered:");

        // Enhanced for loop → cleaner way to loop through arrays
        for (String food : foods) {
            System.out.println("👉 " + food);
        }

        // 🔒 Step 7: Close the scanner
        scanner.close();

        /*
        ╭─────────────────────────────╮
        │ 🧠 NOTES:                   │
        │                             │
        │ - Array size must be fixed  │
        │ - Arrays store same datatype│
        │ - Indexing starts from 0    │
        │ - Use scanner.nextLine()    │
        │   after nextInt() to avoid  │
        │   input skipping            │
        ╰─────────────────────────────╯
        */
    }
}

