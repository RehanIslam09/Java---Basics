import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         ╔════════════════════════════════════════════════════╗
         ║              🎰 JAVA SLOT MACHINE GAME             ║
         ╠════════════════════════════════════════════════════╣
         ║ - Start with a balance
         ║ - Place a bet
         ║ - Spin the reels
         ║ - Match symbols to win multipliers!
         ║ - Game ends when balance reaches 0 or player exits
         ╚════════════════════════════════════════════════════╝
        */

        // 📥 Scanner for input
        Scanner scanner = new Scanner(System.in);

        // 🎮 Game state variables
        int balance = 100; // starting balance
        int bet;           // amount user bets each round
        int payout;        // amount won
        String[] row;      // result of the spin
        String playAgain;  // Y/N for replay

        // 👋 Welcome Message
        System.out.println("==========================");
        System.out.println("   🎰 Welcome to Java Slots ");
        System.out.println("   Symbols: 🍒 🍉 🥭 🔔 ⭐ ");
        System.out.println("==========================");

        /*
         ╔════════════════════════════════════╗
         ║         💸 MAIN GAME LOOP          ║
         ╚════════════════════════════════════╝
         */
        while (balance > 0) {

            System.out.println("💰 Current balance: $" + balance);

            // ➕ GET USER BET
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // 🛑 INVALID BET CHECKS
            if (bet > balance) {
                System.out.println("❌ INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("❌ Bet must be greater than 0!");
                continue;
            } else {
                balance -= bet;
            }

            // 🎲 SPIN THE SLOT MACHINE
            System.out.println("Spinning...");
            row = spinRow();          // generates random symbols
            printRow(row);            // display symbols
            payout = getPayout(row, bet); // calculate payout based on match

            // 🎉 HANDLE RESULTS
            if (payout > 0) {
                System.out.println("🎉 You won $" + payout + "!");
                balance += payout;
            } else {
                System.out.println("🙁 Sorry, you lost this round!");
            }

            // 🔁 Ask if user wants to play again
            System.out.println("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        /*
         ╔════════════════════════════════════════════╗
         ║              🚪 GAME OVER!                 ║
         ║       Final balance is shown to user       ║
         ╚════════════════════════════════════════════╝
         */
        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
    }

    // 🔁 SPINNING FUNCTION — generates a row of 3 random symbols
    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🥭", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // 🖨️ DISPLAY ROW NICELY FORMATTED
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    // 💰 CALCULATE PAYOUT BASED ON MATCHED SYMBOLS
    static int getPayout(String[] row, int bet) {
        // 🎯 All 3 symbols match
        if (row[0].equals(row[1]) && row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        // 🎯 First 2 symbols match
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        // 🎯 Last 2 symbols match
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        // 🚫 No matches
        return 0;
    }
}
