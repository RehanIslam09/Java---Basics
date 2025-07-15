import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        ╔═══════════════════════════════════════╗
        ║        🎯 NUMBER GUESSING GAME        ║
        ╚═══════════════════════════════════════╝

        🧠 OBJECTIVE:
        --------------------------
        - Generate a random number
        - Let the user guess the number
        - Give feedback: TOO LOW, TOO HIGH, CORRECT!
        - Keep track of how many guesses it took

        👨‍💻 TOOLS USED:
        --------------------------
        - Random class (for generating number)
        - Scanner class (for user input)
        - Looping (do-while)
        - Conditionals (if-else)
        */

        // 🔧 STEP 1: Import utilities and set up tools
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 🔢 STEP 2: Declare game variables
        int guess;              // to store user input
        int attempts = 0;       // count number of guesses
        int min = 1;            // minimum guessable value
        int max = 100;          // maximum guessable value

        // 🎲 STEP 3: Generate the random number (inclusive of both min and max)
        int randomNumber = random.nextInt(min, max + 1);

        // 🖥️ STEP 4: Game intro
        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.printf("🔢 Guess a number between %d and %d\n", min, max);

        // 🔁 STEP 5: Loop until the correct guess is made
        do {
            System.out.print("👉 Enter your guess: ");
            guess = scanner.nextInt(); // Get user input
            attempts++; // Count the guess

            // 🔍 STEP 6: Feedback logic
            if(guess < randomNumber){
                System.out.println("📉 TOO LOW! Try again.");
            } else if (guess > randomNumber){
                System.out.println("📈 TOO HIGH! Try again.");
            } else {
                // ✅ Correct guess
                System.out.println("🎉 CORRECT! The number was " + randomNumber);
                System.out.println("📊 Total Attempts: " + attempts);
            }

        } while(guess != randomNumber); // Loop continues while guess is wrong

        // ✅ Close resources
        scanner.close();
    }
}
