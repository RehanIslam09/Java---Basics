import java.util.Scanner;

public class Main {

    // 🔁 Global Scanner Object (used by all methods)
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 🏦 JAVA BANKING PROGRAM FOR BEGINNERS 🏦

        // 💰 Declare balance variable to track user's funds
        double balance = 0;

        // 🧭 Flag to keep the app running
        boolean isRunning = true;

        // 🧠 Variable to store user's menu choice
        int choice;

        // 🔁 Banking menu loop
        while (isRunning) {

            // 📋 Display main menu
            System.out.println("\n===============================");
            System.out.println("         BANKING MENU         ");
            System.out.println("===============================");
            System.out.println("1️⃣  Show Balance");
            System.out.println("2️⃣  Deposit Funds");
            System.out.println("3️⃣  Withdraw Funds");
            System.out.println("4️⃣  Exit");
            System.out.println("===============================");

            // ⌨️ Get user input
            System.out.print("👉 Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // 🧠 Process user choice using enhanced switch
            switch (choice) {

                case 1 -> {
                    // 💳 Show current balance
                    System.out.println("===============================\n");
                    System.out.println("\n🧾 Your Current Balance:");
                    showBalance(balance);
                }

                case 2 -> {
                    // ➕ Deposit amount to balance
                    double amount = deposit();
                    balance += amount;
                    System.out.println("✅ Deposit successful!");
                    System.out.println("===============================\n");
                    System.out.printf("💰 New Balance: $%.2f\n", balance);
                }

                case 3 -> {
                    // ➖ Withdraw amount from balance
                    double amount = withdraw(balance);
                    balance -= amount;
                    System.out.println("✅ Withdrawal processed!");
                    System.out.println("===============================\n");
                    System.out.printf("💰 New Balance: $%.2f\n", balance);
                }

                case 4 -> {
                    // ❌ Exit program
                    System.out.println("\n👋 Exiting the Banking Program...");
                    isRunning = false;
                }

                default -> {
                    // ⚠️ Handle invalid input
                    System.out.println("❌ INVALID CHOICE! Please select between 1 to 4.");
                }
            }
        }

        // 👋 Exit message
        System.out.println("\n===============================");
        System.out.println("✅ Thank you! Have a great day!");
        System.out.println("===============================");

        // 🧼 Close scanner to free memory
        scanner.close();
    }

    // 📦 showBalance() – displays current balance
    static void showBalance(double balance) {
        System.out.println("-------------------------------");
        System.out.printf("💲 $%.2f\n", balance);
        System.out.println("-------------------------------");
    }

    // 💸 deposit() – asks user for deposit amount and validates input
    static double deposit() {
        System.out.print("💵 Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("❌ Amount cannot be negative!");
            return 0;
        } else {
            return amount;
        }
    }

    // 🏧 withdraw() – asks user for withdrawal amount and checks balance
    static double withdraw(double balance) {
        System.out.print("🏧 Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("❌ INSUFFICIENT FUNDS!");
            return 0;
        } else if (amount < 0) {
            System.out.println("❌ Amount cannot be negative!");
            return 0;
        } else {
            return amount;
        }
    }
}
