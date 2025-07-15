import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        ╔═════════════════════════════════════════════╗
        ║                🎮 JAVA QUIZ GAME             ║
        ╚═════════════════════════════════════════════╝

        ➤ A simple console-based multiple choice quiz game.
        ➤ The player will be asked 5 questions.
        ➤ Each question has 4 options (1-4).
        ➤ The program checks the answer, gives feedback, and tracks the score.
        */

        // 📋 QUESTIONS ARRAY — Stores all quiz questions
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"
        };

        // 📝 OPTIONS ARRAY — Stores answer choices for each question
        String[][] options = {
                {"1. Strong files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        // ✅ CORRECT ANSWERS (by option number)
        int[] answers = {3, 1, 2, 4, 3};

        // 🏆 Score counter
        int score = 0;

        // 🧠 Variable to store user's guess
        int guess;

        // 🎤 Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        /*
        ╔═════════════════════════════════════════════╗
        ║             🚀 GAME STARTS HERE             ║
        ╚═════════════════════════════════════════════╝
        */

        System.out.println("=================================");
        System.out.println("🎉 Welcome to the Java Quiz Game!");
        System.out.println("=================================\n");

        // 📚 LOOP THROUGH ALL QUESTIONS
        for (int i = 0; i < questions.length; i++) {

            // 🧾 Print question
            System.out.println("Q" + (i + 1) + ": " + questions[i]);

            // 🧾 Print options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // 🎯 Get user guess
            System.out.print("👉 Enter your guess (1-4): ");
            guess = scanner.nextInt();

            // ✅ Check answer
            if (guess == answers[i]) {
                System.out.println("✅ CORRECT!\n");
                score++;
            } else {
                System.out.println("❌ WRONG! Correct answer was: " + answers[i] + "\n");
            }

            System.out.println("---------------------------------");
        }

        /*
        ╔═════════════════════════════════════════════╗
        ║              🧾 FINAL RESULTS                ║
        ╚═════════════════════════════════════════════╝
        */
        System.out.println("\n🎯 Your final score is: " + score + " / " + questions.length);
        if (score == questions.length) {
            System.out.println("🌟 Perfect score! You're a genius!");
        } else if (score >= 3) {
            System.out.println("👍 Great job! You know your stuff.");
        } else {
            System.out.println("📘 Keep practicing and try again!");
        }

        // 🛑 Close scanner
        scanner.close();
    }
}
