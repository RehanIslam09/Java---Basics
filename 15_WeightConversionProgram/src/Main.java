import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ================================================================================
        ⚖️ WEIGHT CONVERTER PROGRAM – BEGINNER TO ADVANCED
        ================================================================================
        🧠 GOAL:
        - Convert weight between pounds (lbs) and kilograms (kg)
        - Let user choose conversion direction
        - Provide formatted and clean output

        📦 FORMULAS:
        - lbs ➡️ kg:     multiply by 0.453592
        - kg  ➡️ lbs:    multiply by 2.20462

        📌 User-driven program using Scanner for input
        ================================================================================
        */

        // 🛠️ Step 1: Import Scanner class for taking input
        Scanner scanner = new Scanner(System.in);

        // 🔢 Step 2: Declare required variables
        double weight;      // stores original input weight
        double newWeight;   // stores converted weight
        int choice;         // user's conversion direction

        /*
        ================================================================================
        🖐️ Step 3: Display user-friendly instructions
        ================================================================================
        */
        System.out.println("🌟 Welcome to the Weight Conversion Program 🌟\n");
        System.out.println("🔽 Choose an option:");
        System.out.println("1️⃣ Convert pounds (lbs) to kilograms (kg)");
        System.out.println("2️⃣ Convert kilograms (kg) to pounds (lbs)");

        /*
        ================================================================================
        🧑‍💻 Step 4: Ask user for their choice
        ================================================================================
        */
        System.out.print("\n👉 Your choice (1 or 2): ");
        choice = scanner.nextInt();

        /*
        ================================================================================
        ✅ Step 5: Handle Choice 1 – LBS ➡️ KG Conversion
        ================================================================================
        */
        if (choice == 1) {
            System.out.print("\n⚖️ Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            // 💡 1 lb = 0.453592 kg
            newWeight = weight * 0.453592;

            System.out.printf("✅ The weight in kilograms is: %.2f kg\n", newWeight);
        }

        /*
        ================================================================================
        ✅ Step 6: Handle Choice 2 – KG ➡️ LBS Conversion
        ================================================================================
        */
        else if (choice == 2) {
            System.out.print("\n⚖️ Enter the weight in kilograms: ");
            weight = scanner.nextDouble();

            // 💡 1 kg = 2.20462 lbs
            newWeight = weight * 2.20462;

            System.out.printf("✅ The weight in pounds is: %.2f lbs\n", newWeight);
        }

        /*
        ================================================================================
        ❌ Step 7: Handle Invalid Input
        ================================================================================
        */
        else {
            System.out.println("\n❌ Invalid option! Please choose 1 or 2 only.");
        }

        /*
        ================================================================================
        🔚 Step 8: Close Scanner (Best Practice)
        ================================================================================
        */
        scanner.close();

        /*
        ================================================================================
        📌 SAMPLE OUTPUT:

        🌟 Welcome to the Weight Conversion Program 🌟
        🔽 Choose an option:
        1️⃣ Convert pounds (lbs) to kilograms (kg)
        2️⃣ Convert kilograms (kg) to pounds (lbs)

        👉 Your choice (1 or 2): 1
        ⚖️ Enter the weight in lbs: 180
        ✅ The weight in kilograms is: 81.65 kg

        ================================================================================
        */
    }
}
