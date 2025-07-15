import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        ╔════════════════════════════════════════════════╗
        ║         🎮 ROCK, PAPER, SCISSORS GAME!         ║
        ╚════════════════════════════════════════════════╝

        ➤ A simple game where the user competes against the computer.
        ➤ Each round, both make a move: rock, paper, or scissors.
        ➤ Rock beats scissors, scissors beats paper, paper beats rock.
        ➤ The game continues until the player chooses to stop.
        */

        // 🧾 CREATE SCANNER TO READ USER INPUT
        Scanner scanner = new Scanner(System.in);

        // 🎲 CREATE RANDOM OBJECT FOR COMPUTER MOVE
        Random random = new Random();

        // 📦 AVAILABLE CHOICES
        String[] choices = {"rock", "paper", "scissors"};

        // 🎮 VARIABLES TO STORE CHOICES
        String playerChoice;
        String computerChoice;

        // 🔁 Loop controller for replaying game
        String playAgain = "yes";

        /*
        ╔════════════════════════════════════════════════╗
        ║              🔁 GAME LOOP STARTS               ║
        ╚════════════════════════════════════════════════╝
        */
        do{
            // 🎤 GET PLAYER INPUT
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            // ❌ HANDLE INVALID CHOICE
            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("❌ Invalid Choice! Try again.");
                continue; // go back to start of loop
            }

            // 🎲 GET COMPUTER CHOICE RANDOMLY
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            /*
            ╔═══════════════════════════════════════════════╗
            ║                  🤺 WHO WINS?                  ║
            ╚═══════════════════════════════════════════════╝
            */

            if(playerChoice.equals(computerChoice)){
                // ➖ Tie condition
                System.out.println("😐 It's a tie!");
            }
            else if(
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ){
                // ✅ Win condition
                System.out.println("🎉 You win!");
            }
            else{
                // ❌ Lose condition
                System.out.println("💀 You lose!");
            }

            // 🔁 ASK TO PLAY AGAIN
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        /*
        ╔════════════════════════════════════════════════╗
        ║              👋 GAME ENDS HERE                 ║
        ╚════════════════════════════════════════════════╝
        */

        // 🙏 THANK YOU MESSAGE
        System.out.println("Thanks for playing! 👋");

        // 🛑 CLOSE SCANNER
        scanner.close();
    }
}
