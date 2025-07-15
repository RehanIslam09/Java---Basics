/*
    ⬛ JAVA ARRAYS - FULL THEORY AND DEEP DIVE
    ========================================

    ✅ What is an Array?
    ---------------------
    An array is a data structure used to store multiple values of the **same data type** in a single variable.

    🔹 Syntax:
        type[] arrayName = new type[size];

    🔹 Example:
        int[] numbers = new int[5]; // Array of 5 integers

    🔹 You can also initialize an array with values directly:
        String[] names = {"Alice", "Bob", "Charlie"};

    🔹 Indexing:
        - Arrays in Java are **zero-indexed**, meaning the first element is at index 0.
        - If `int[] a = {10, 20, 30};`, then:
            a[0] = 10
            a[1] = 20
            a[2] = 30

    --------------------------------------------

    ✅ Declaring and Initializing Arrays
    -------------------------------------
    int[] scores;                    // Declaration
    scores = new int[3];            // Memory Allocation

    // Both together:
    int[] scores = new int[3];      // Array of 3 integers, default initialized to 0

    // Initialize with values:
    int[] scores = {85, 90, 95};

    --------------------------------------------

    ✅ Accessing & Modifying Array Elements
    ---------------------------------------
    scores[0] = 100;       // Modify the first element
    int x = scores[2];     // Access the third element

    --------------------------------------------

    ✅ Looping Through Arrays
    --------------------------

    🔸 Using for loop:
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

    🔸 Using enhanced for loop (for-each):
        for(int score : scores){
            System.out.println(score);
        }

    --------------------------------------------

    ✅ Default Values in Arrays
    ----------------------------
    - int[]     → 0
    - double[]  → 0.0
    - boolean[] → false
    - String[]  → null

    --------------------------------------------

    ✅ Array Length
    ----------------
    Use `.length` property to get the size of the array:
        int len = scores.length;

    --------------------------------------------

    ✅ Common Mistakes
    -------------------
    ❌ Accessing index out of bounds:
        int[] arr = {1, 2, 3};
        arr[3] = 10;  // Error! Only indexes 0-2 are valid.

    ❌ Using .length() instead of .length:
        arr.length ✅     arr.length() ❌

    --------------------------------------------

    ✅ Arrays of Objects
    ---------------------
    String[] students = new String[3];
    students[0] = "Alice";

    --------------------------------------------

    ✅ Multidimensional Arrays (2D Arrays)
    ---------------------------------------
    🔸 Declaration:
        int[][] matrix = new int[3][3];

    🔸 Initialization:
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

    🔸 Access:
        matrix[0][2] = 30;    // Row 0, Column 2

    🔸 Looping through 2D array:
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    --------------------------------------------

    ✅ Passing Arrays to Methods
    -----------------------------
    public static void printArray(int[] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }

    int[] data = {10, 20, 30};
    printArray(data);

    --------------------------------------------

    ✅ Returning Arrays from Methods
    --------------------------------
    public static int[] getArray(){
        return new int[]{1, 2, 3, 4};
    }

    int[] values = getArray();

    --------------------------------------------

    ✅ Arrays vs ArrayList
    -----------------------
    - Arrays are fixed in size.
    - ArrayLists are resizable and part of Java's Collections framework.
    - Use Arrays when the size is known and fixed.

    --------------------------------------------

    ✅ Arrays Utility Class (java.util.Arrays)
    ------------------------------------------

    🔹 Import first:
        import java.util.Arrays;

    🔹 Useful methods:
        Arrays.toString(arr);         // Convert array to string
        Arrays.sort(arr);             // Sort array
        Arrays.equals(arr1, arr2);    // Compare arrays
        Arrays.fill(arr, value);      // Fill array with value
        Arrays.copyOf(arr, newLength) // Copy array

    Example:
        int[] numbers = {3, 1, 4, 2};
        Arrays.sort(numbers);  // Now numbers = [1, 2, 3, 4]
        System.out.println(Arrays.toString(numbers));

    --------------------------------------------

    ✅ Summary
    -----------
    - Arrays are foundational in Java to store multiple elements of the same type.
    - They are **fixed-size**, **zero-indexed**, and **efficient**.
    - Looping, indexing, and utility functions make them powerful for many scenarios.

    🔰 If you need a dynamic-sized collection, consider using **ArrayList**.

 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        ┌────────────────────────────────────────────┐
        │       📦 ARRAY BASICS IN JAVA               │
        └────────────────────────────────────────────┘

        ➤ An array is a container object that holds a fixed number of values of the same data type.
        ➤ Think of it as a "list of variables" of the same type, stored together in memory.
        ➤ Arrays are indexed starting from 0.
        */

        // 🟡 Declaring and Initializing a String array
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // 🔄 Updating elements using index:
        // fruits[0] = "pineapple"; // Uncomment to replace "apple" with "pineapple"

        // 📏 Finding the number of elements in the array
        int numOfFruits = fruits.length;

        // 🔽 Accessing and printing specific elements
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Number of fruits: " + numOfFruits);

        /*
        ┌────────────────────────────────────────────┐
        │     🔁 LOOPING THROUGH AN ARRAY (Classic)  │
        └────────────────────────────────────────────┘
        */

        System.out.println("\n🔁 Printing all fruits using regular for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        /*
        ┌────────────────────────────────────────────┐
        │       🔤 SORTING AN ARRAY ALPHABETICALLY   │
        └────────────────────────────────────────────┘
        */

        Arrays.sort(fruits); // 🔠 Sorts the array in alphabetical order

        System.out.println("\n✅ Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /*
        ┌────────────────────────────────────────────┐
        │            🔁 ENHANCED FOR LOOP             │
        └────────────────────────────────────────────┘

        ➤ A shorthand version of the traditional for loop
        ➤ Great for reading each element in an array
        */

        System.out.println("\n🔁 Printing using enhanced for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /*
        ┌────────────────────────────────────────────┐
        │           🔁 FILLING AN ARRAY               │
        └────────────────────────────────────────────┘

        ➤ Arrays.fill(array, value) replaces every element with the specified value.

        Example (Uncomment to try):
        Arrays.fill(fruits, "pineapple");
        */

        // System.out.println("\n🧃 After filling array with 'pineapple':");
        // Arrays.fill(fruits, "pineapple");
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }

        /*
        ┌────────────────────────────────────────────┐
        │               🔚 SUMMARY                   │
        └────────────────────────────────────────────┘

        ✅ Arrays are fixed-size containers of same-type elements.
        ✅ Use loops or utility methods like Arrays.sort() and Arrays.fill() for operations.
        ✅ Use `.length` to get the number of items.
        ✅ Use enhanced `for-each` loop to iterate cleanly.

        */

    }
}
