import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 🎮 MAD LIBS GAME – Basic String Input Practice
        // Mad Libs is a word game where you insert random user input into a preset story.
        // Great exercise for practicing:
        // ✅ Scanner
        // ✅ String input
        // ✅ Concatenation
        // ✅ Console interaction

        // 🛠️ Step 1: Create a Scanner instance to take user input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 🧠 Step 2: Declare variables to store words (adjectives, nouns, verbs)
        // These will be used to build the silly story
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // 🗣️ Step 3: Prompt the user for inputs
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();  // e.g., "beautiful"

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();       // e.g., "monkey"

        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();  // e.g., "furry"

        System.out.print("Enter a verb (present tense ending in -ing): ");
        verb1 = scanner.nextLine();       // e.g., "dancing"

        System.out.print("Enter one last adjective (description): ");
        adjective3 = scanner.nextLine();  // e.g., "amazed"

        // 🧩 Step 4: Construct and print the final Mad Libs story using the inputs
        System.out.println("\n📖 Your Mad Libs Story:\n");

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        /*
         📌 SAMPLE OUTPUT:

         Enter an adjective (description): gigantic
         Enter a noun (animal or person): elephant
         Enter another adjective (description): grey
         Enter a verb (present tense ending in -ing): painting
         Enter one last adjective (description): impressed

         📖 Your Mad Libs Story:

         Today I went to a gigantic zoo.
         In an exhibit, I saw a elephant.
         The elephant was grey and painting!
         I was impressed!
        */

        // ✅ Step 5: Close the scanner after use (good practice to prevent memory leaks)
        scanner.close();
    }
}

