import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ==========================================================================================
        🧮 CALCULATOR PROGRAM – Using ENHANCED SWITCH (Java 14+)
        ==========================================================================================

        🎯 PURPOSE:
        This program performs basic arithmetic operations:
        ➕ Addition
        ➖ Subtraction
        ✖️ Multiplication
        ➗ Division
        ⌃ Exponentiation (using ^)

        🧠 KEY CONCEPTS COVERED:
        - User input using Scanner
        - char input using `next().charAt(0)`
        - Enhanced `switch-case` expression
        - Input validation (e.g. divide by zero)
        - Math.pow() usage
        - Clean result output with `if` check

        ==========================================================================================
        */

        Scanner scanner = new Scanner(System.in); // 🛠️ Create Scanner object for user input

        // 📦 Variable declarations
        double num1;            // First number input by user
        double num2;            // Second number input by user
        char operator;          // Operator input by user (+, -, *, /, ^)
        double result = 0;      // Stores the calculated result
        boolean validOperation = true; // Used to prevent output if invalid input

        // 📥 Take first number input
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // 📥 Take operator input (as a character)
        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // 📥 Take second number input
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        /*
        ==========================================================================================
        🔄 ENHANCED SWITCH: Evaluate based on operator input
        ==========================================================================================
        */

        switch (operator) {
            case '+' -> result = num1 + num2; // ➕ Addition
            case '-' -> result = num1 - num2; // ➖ Subtraction
            case '*' -> result = num1 * num2; // ✖️ Multiplication
            case '/' -> {
                // ❗ Handle divide by zero error
                if (num2 == 0) {
                    System.out.println("❌ Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2; // ➗ Division
                }
            }
            case '^' -> result = Math.pow(num1, num2); // ⌃ Exponentiation (e.g. 2^3 = 8)
            default -> {
                // 🚫 Invalid operator
                System.out.println("❌ Invalid operator! Please use one of +, -, *, /, ^");
                validOperation = false;
            }
        }

        // ✅ Display result only if operation was valid
        if (validOperation) {
            System.out.println("✅ Result: " + result);
        }

        // 🔒 Close the scanner to avoid memory leak
        scanner.close();
    }
}
