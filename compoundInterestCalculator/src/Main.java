import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ╔════════════════════════════════════════════════════════════╗
        ║ 💰 COMPOUND INTEREST CALCULATOR - FULLY COMMENTED GUIDE 💡 ║
        ╚════════════════════════════════════════════════════════════╝

        ➤ Purpose: Calculate compound interest based on user input
        ➤ Formula Used:
            A = P * (1 + r/n)^(nt)

            Where:
            A = Total Amount (Final Value)
            P = Principal (Initial Investment)
            r = Annual Interest Rate (decimal)
            n = Number of times interest is compounded per year
            t = Time in years

        ➤ Example:
            If you invest ₹10,000 at 5% interest compounded 4 times per year for 5 years,
            it calculates how much money you'll have at the end of 5 years.

        📌 Topics Covered:
            - Scanner for user input
            - Math.pow() for exponents
            - Type conversion and formatting
            - Precision output using printf()
        */

        // 🛠️ Step 1: Setup Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // 🧮 Step 2: Declare variables
        double principal;         // P → Initial amount deposited
        double rate;              // r → Annual interest rate (as decimal)
        int timeCompounded;       // n → Times interest applied per year
        int years;                // t → Total years of investment
        double amount;            // A → Final amount after interest

        // 🧾 Step 3: Prompt user for input values

        System.out.print("Enter the Principal Amount (Initial Investment): ");
        principal = scanner.nextDouble();  // E.g., ₹10000

        System.out.print("Enter the Annual Interest Rate (in %): ");
        rate = scanner.nextDouble() / 100; // Convert percent to decimal (5% → 0.05)

        System.out.print("Enter the Number of Times Interest is Compounded per Year: ");
        timeCompounded = scanner.nextInt(); // E.g., 4 for quarterly

        System.out.print("Enter the Number of Years: ");
        years = scanner.nextInt(); // E.g., 5 years

        // 📐 Step 4: Calculate total amount using compound interest formula
        // A = P * (1 + r/n)^(nt)
        amount = principal * Math.pow((1 + (rate / timeCompounded)), timeCompounded * years);

        // 🖨️ Step 5: Display the result with 2 decimal places using printf()
        System.out.printf("The total amount after %d years is: $%.2f%n", years, amount);

        // ✅ Best Practice: Close scanner to free up resources
        scanner.close();


        /*
        ╔══════════════════════════════════════════════════════╗
        ║ 🔍 DEEP DIVE EXPLANATION                              ║
        ╚══════════════════════════════════════════════════════╝

        💡 Why Math.pow()?
        - Compound interest requires raising a base to an exponent.
        - Math.pow(base, exponent) handles this in Java.
        - Here, base = (1 + r/n) and exponent = n × t

        💡 Why use rate/100?
        - Users usually input rate in % (e.g., 5), but Java needs it as 0.05.

        💡 Why printf() with %.2f?
        - %.2f → shows 2 decimal places, making money amounts more readable
        - %d → formats the integer (years)

        💡 Good Input Examples:
            P = 10000
            r = 5 (entered as 5 → converted to 0.05)
            n = 4
            t = 5
            Output: "The total amount after 5 years is: $12833.59"

        💡 Real-World Use Cases:
            - Bank savings account estimations
            - Retirement investment projections
            - Recurring deposit calculators

            ====Output Sample====
                If user inputs:
                Principal = 10000
                Rate = 5
                Compounded = 4
                Years = 5

                Output:
                The total amount after 5 years is: $12833.59

        */
    }
}

