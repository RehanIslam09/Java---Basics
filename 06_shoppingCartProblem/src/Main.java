import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ====================================================================================
        🛒 SHOPPING CART PROGRAM – BEGINNER TO ADVANCED EXPLANATION
        ====================================================================================

        🎯 GOAL:
        Prompt the user to enter:
        - Item name
        - Price per item
        - Quantity to buy

        Then calculate and display the total cost.

        WHAT YOU WILL LEARN:
        - How to use Scanner for input
        - How to work with `String`, `double`, `int`, and `char`
        - How to calculate and display totals
        - Formatting and good practices
        ====================================================================================
        */

        // 🔹 Step 1: Create a Scanner object for reading input from the user
        Scanner scanner = new Scanner(System.in);

        /*
         * 🔸 Variable Declarations
         * ------------------------
         * We'll use meaningful names for clarity and follow Java naming conventions.
         */
        String item;           // To store the name of the product
        double price;          // To store price of a single unit
        int quantity;          // To store number of items user wants
        char currency = '$';   // To store the currency symbol
        double total;          // Final total cost (price * quantity)

        /*
         * 🧾 GETTING USER INPUT
         * ---------------------
         * Ask the user for the required information one by one.
         */

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine(); // Reading the entire line (including spaces)

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble(); // Reads a decimal number (e.g., 12.99)

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt(); // Reads an integer value

        /*
         * 🧮 CALCULATION
         * --------------
         * Multiply the price by quantity to get the total amount.
         */
        total = price * quantity;

        /*
         * 📤 OUTPUT
         * ---------
         * Use `\n` to add a line break before the result to keep it clean.
         */
        System.out.println("\nOrder Summary:");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + currency + price);

        // Formatting the final total output
        System.out.println("Total cost: " + currency + total);

        /*
         * 🛑 GOOD PRACTICE: Always close the Scanner when you're done using it.
         * BUT: Don't close it too early in large programs that reuse System.in.
         */
        scanner.close();

        /*
        ====================================================================================
        WHAT YOU'VE PRACTICED:
        ------------------------------------------------------------------------------------
        ✔️ Getting string and numeric input from user
        ✔️ Basic calculations
        ✔️ Output formatting
        ✔️ Real-world problem modeling (mini e-commerce checkout)
        ====================================================================================
        */
    }
}
