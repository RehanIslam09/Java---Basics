/*
╔══════════════════════════════════════════════════════════════╗
║                 🔍 SEARCHING IN AN ARRAY (BASIC)             ║
╚══════════════════════════════════════════════════════════════╝

🧠 WHAT IS ARRAY SEARCHING?
───────────────────────────────────────────────────────────────
Searching in an array means finding whether a value exists or
finding where (index) a particular value is located in an array.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
📌 WHY SEARCH IN AN ARRAY?
───────────────────────────────────────────────────────────────
✅ To find if a value exists
✅ To get the index/position of a value
✅ To count how many times a value appears

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
1️⃣ LINEAR SEARCH (Most Basic Technique)
───────────────────────────────────────────────────────────────
✔ Check each element from beginning to end.
✔ Stop when you find the element or reach the end.

🧠 TIME COMPLEXITY: O(n)
   (n = number of elements in array)

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🔹 EXAMPLE USE CASE:
──────────────────────
Find whether a number exists in an array of student roll numbers.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
💡 BASIC LINEAR SEARCH PSEUDOCODE:
───────────────────────────────────────────────────────────────
for (i = 0 to array.length - 1):
    if (array[i] == target):
        return i;

If loop ends without match:
    return -1; (not found)

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
💥 CODE EXAMPLE (TO IMPLEMENT AFTER THIS THEORY):
───────────────────────────────────────────────────────────────

int[] numbers = {10, 20, 30, 40, 50};
int target = 30;

boolean found = false;
for(int i = 0; i < numbers.length; i++) {
    if(numbers[i] == target) {
        System.out.println("Found at index: " + i);
        found = true;
        break;
    }
}

if(!found) {
    System.out.println("Number not found!");
}

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🎯 HOW TO MAKE SEARCH CASE-INSENSITIVE FOR STRINGS:
───────────────────────────────────────────────────────────────

if (array[i].equalsIgnoreCase(targetString))

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🧪 TIPS FOR BEGINNERS:
───────────────────────────────────────────────────────────────
✔️ Use a boolean `found` flag to track success
✔️ Always check array bounds (i < array.length)
✔️ Use `equals()` for strings, NOT `==`
✔️ Loop stops early with `break` once found

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
📚 SUMMARY:
───────────────────────────────────────────────────────────────
- Linear search is slow for large arrays but simple.
- Works with ANY array type (int[], String[], etc.)
- Preferred when array is UNSORTED.

Next level: Binary search (for sorted arrays) 🔄

═══════════════════════════════════════════════════════════════
*/
/*
╔══════════════════════════════════════════════════════════════════════╗
║                    🔍 SEARCHING IN ARRAYS (JAVA)                     ║
╚══════════════════════════════════════════════════════════════════════╝

💡 Searching an array = the process of looking for a specific value (or values)
   within an array. Java provides several techniques, from simple to advanced.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🧠 WHY SEARCH IN AN ARRAY?
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
✅ Check if an item exists
✅ Find its index or position
✅ Count how many times it occurs
✅ Locate min, max, or matching elements

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
📌 BASIC SEARCH TECHNIQUES
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

1️⃣  LINEAR SEARCH (Brute-force search)
   ➤ Loop through the array one by one
   ➤ Compare each element with the target
   ➤ Time Complexity: O(n)
   ➤ Works on both sorted and unsorted arrays

🔍 Pseudocode:
    for each item in array:
        if item == target:
            return index

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

2️⃣  BINARY SEARCH (Efficient search - sorted arrays only)
   ➤ Requires array to be SORTED
   ➤ Divide and conquer strategy
   ➤ Time Complexity: O(log n)

🔍 Pseudocode:
    set low = 0, high = array.length - 1
    while low <= high:
        mid = (low + high) / 2
        if array[mid] == target:
            return mid
        else if array[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📌 OTHER ADVANCED SEARCH OPERATIONS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

✅ Search for multiple occurrences (counting duplicates)
✅ Return all matching indexes
✅ Case-insensitive search (for strings)
✅ Partial string search using `.contains()`
✅ Using Arrays.binarySearch() method for sorted arrays

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📦 BUILT-IN METHODS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📍 Arrays.binarySearch(array, target)
   ➤ Returns index if found
   ➤ Returns (-(insertionPoint) - 1) if not found
   ➤ Only works correctly on sorted arrays!

🧪 Example:
    int[] arr = {1, 3, 5, 7, 9};
    Arrays.sort(arr);
    int index = Arrays.binarySearch(arr, 7); // returns index 3

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🔥 BONUS: ENHANCED FOR LOOP vs INDEXED FOR LOOP
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
➡️ Use `for-each` when you only care about the value
➡️ Use `for (int i = 0; i < arr.length; i++)` when you also need index

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

⚠️ CAVEATS:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
✖️ Arrays are fixed in size – use ArrayList for dynamic resizing
✖️ For complex objects (e.g., classes), `.equals()` should be used, not `==`
✖️ Binary search requires array to be sorted beforehand!

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🏁 SUMMARY TABLE
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
| Search Type       | Complexity | Requires Sorted | Best Use Case           |
|-------------------|------------|-----------------|--------------------------|
| Linear Search     | O(n)       | ❌              | General, unsorted data   |
| Binary Search     | O(log n)   | ✅              | Fast lookup in sorted data
| Arrays.binarySearch | O(log n) | ✅              | Built-in fast search     |

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
📚 RECOMMENDED PRACTICES
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
✅ Always check bounds (avoid ArrayIndexOutOfBoundsException)
✅ Use enhanced for loop when index isn't needed
✅ For sorted data, prefer binary search
✅ Use Arrays.binarySearch() for primitives (sorted only)
✅ For objects, override .equals() to compare properly

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

👨‍🏫 REAL-WORLD EXAMPLES
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
🔹 Searching for a product in a list
🔹 Finding the best score in a game
🔹 Checking if a user exists in a list of usernames
🔹 Auto-suggest features in search bars

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

✅ CONCLUSION:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
Searching arrays is a fundamental part of programming.
Knowing the right technique improves both performance and clarity.
*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ⌨️ Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // 🔢 Define an array of integers
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};

        System.out.println("Enter the number you wish to find: ");
        int target = scanner.nextInt(); // 🎯 The number user wants to find
        scanner.nextLine(); // 🔄 Consume the newline character after nextInt()

        // 🍎 Define an array of Strings (fruit names)
        String[] fruits = {"apple", "orange", "banana"};

        System.out.println("Enter the food you wish to find: ");
        String fruitTarget = scanner.nextLine(); // 🎯 The fruit the user wants to find

        // 🎌 Booleans to track whether the target was found
        boolean isFound = false;
        boolean fruitFound = false;

        // 🔍 SEARCHING IN THE numbers[] ARRAY
        for(int i = 0; i < numbers.length; i++) {
            // 🧠 Check if current element matches the target
            if (target == numbers[i]) {
                System.out.println("Number found at index: " + i);
                isFound = true; // ✅ Found
                break; // 🚪 Exit loop once found
            }
        }

        // ❌ If number was not found, display message
        if(!isFound) {
            System.out.println("Number not found in the array!");
        }

        // 🔍 SEARCHING IN THE fruits[] ARRAY
        for(int i = 0; i < fruits.length; i++) {
            // 🧠 Use .equals() to compare strings (not ==)
            if (fruits[i].equals(fruitTarget)) {
                System.out.println("Fruit found at index: " + i);
                fruitFound = true; // ✅ Found
                break;
            }
        }

        // ❌ If fruit was not found, display message
        if(!fruitFound) {
            System.out.println("Fruit not found!");
        }

        // ✅ Always close the scanner to free resources
        scanner.close();
    }
}
