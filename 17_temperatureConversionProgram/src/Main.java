import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        =========================================================================================
        🌡️ TEMPERATURE CONVERTER PROGRAM – Celsius ↔ Fahrenheit
        =========================================================================================

        📥 INPUTS:
        ----------
        1. A temperature value (double)
        2. A conversion target unit → 'C' for Celsius, 'F' for Fahrenheit

        ⚙️ FUNCTIONALITY:
        -----------------
        🔁 Convert input temperature from:
           - Fahrenheit to Celsius if user chooses 'C'
           - Celsius to Fahrenheit if user chooses 'F'

        Uses the ternary operator for a clean one-liner conversion logic ✅

        📌 FORMULAS:
        ------------
        °C = (°F - 32) × 5/9
        °F = (°C × 9/5) + 32

        =========================================================================================
        */

        // 🛠️ 1. Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // 🔢 Declare variables
        double temp;      // Stores original temperature
        double newTemp;   // Stores converted temperature
        String unit;      // Stores desired conversion unit (C or F)

        // 🔡 Step 1: Ask user for the temperature value
        System.out.println("🌡️ Enter the temperature: ");
        temp = scanner.nextDouble();

        // 🔡 Step 2: Ask user for the target conversion unit
        System.out.println("Convert to Celsius or Fahrenheit? (C or F):");
        unit = scanner.next().toUpperCase(); // Convert input to uppercase (e.g., "c" → "C")

        // ✅ Step 3: Use ternary operator for conditional conversion
        // If unit is "C" → convert to Celsius
        // Else → convert to Fahrenheit

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9
                : (temp * 9 / 5) + 32;

        // 💬 Step 4: Display the result
        System.out.printf("✅ Your converted temperature is %.1f %s°\n", newTemp, unit);

        // 🧹 Step 5: Close scanner to free up system resources
        scanner.close();

        /*
        =========================================================================================
        🔁 SAMPLE RUN:

        🌡️ Enter the temperature:
        100
        Convert to Celsius or Fahrenheit? (C or F):
        C
        ✅ Your converted temperature is 37.8 C°

        =========================================================================================
        💡 NOTES:
        ---------
        🔹 toUpperCase() ensures input like "f" or "c" still works
        🔹 Ternary operator makes the conversion logic super compact!
        🔹 You can add more validation later (e.g., checking invalid letters)

        ✅ Use this as a beginner-friendly, real-world example of:
            - Conditional logic
            - Scanner input
            - Ternary operator
            - Temperature formulas
            - Formatted output with printf()
        =========================================================================================
        */

    }
}
