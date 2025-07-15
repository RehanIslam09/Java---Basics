import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 🎲✨ DICE ROLLING SIMULATOR ✨🎲
        // This program simulates rolling one or more 6-sided dice.
        // It displays the face of each die using ASCII art,
        // prints the value of each roll, and calculates the total.

        // 🔄 Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // 🎲 Create a Random object to generate random dice rolls
        Random random = new Random();

        // 📦 Declare the number of dice to be rolled
        int numOfDice;

        // ➕ Variable to store the running total of all dice rolled
        int total = 0;

        // 📝 Prompt the user to input the number of dice
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // ✅ Validate user input
        if(numOfDice > 0){
            // 🔁 Loop to simulate rolling each die
            for(int i = 0; i < numOfDice; i++){

                // 🎲 Generate a random number between 1 and 6 (inclusive)
                int roll = random.nextInt(1, 7);  // 7 is exclusive, so this gives 1–6

                // 🖼️ Print the ASCII art of the die face
                printDie(roll);

                // 📣 Print the rolled value
                System.out.println("You rolled: " + roll);

                // ➕ Add the roll to the total sum
                total += roll;
            }

            // 🧮 Print the final total after all dice have been rolled
            System.out.println("Total: " + total);
        }
        else {
            // ⚠️ If user entered a number less than 1, show an error
            System.out.println("Number of dice must be greater than 0");
        }

        // 🧼 Close scanner to prevent resource leaks
        scanner.close();
    }

    // 🖨️ printDie(int roll)
    // This method displays a visual (ASCII) representation of the rolled die face.
    // It uses multi-line strings for each dice face (from 1 to 6).
    static void printDie(int roll){

        // 🎲 Each string represents a dice face using ASCII characters

        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
               """;

        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
               """;

        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
               """;

        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
               """;

        String dice5 = """
                 -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
               """;

        String dice6 = """
               -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
               """;

        // 📦 Match the rolled value with its corresponding ASCII art
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }
}
