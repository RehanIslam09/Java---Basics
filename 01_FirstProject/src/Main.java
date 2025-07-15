// This is a Java source file containing our first program
// The file name should match the public class name: Main.java

// Every Java program starts with a class declaration.
// Here, 'Main' is the name of the class.
public class Main {

    // The 'main' method is the entry point of any Java application.
    // This is where the program starts executing.
    // It must always have this exact signature: 'public static void main(String[]
    // args)'
    public static void main(String[] args) {

        // ---------- Single-line comment ----------
        // Comments are used to explain code to humans and are ignored by the compiler.
        // They start with two slashes: //

        // THIS IS MY FIRST JAVA PROGRAM.

        // ---------- Multi-line comment ----------
        /*
         * You can also write comments across multiple lines like this.
         * This is useful when you want to explain something in more detail.
         */

        // ----------- Output Section -----------
        // System.out.print() prints text to the console WITHOUT moving to a new line.
        // System.out.println() prints text and then moves the cursor to the next line.
        // \n is a special character called a "newline character" that forces a line
        // break.

        // Printing two sentences using System.out.print and \n manually:
        System.out.print("I like pizza!\n"); // Output: I like pizza! (then moves to next line)
        System.out.print("It's really good! \n"); // Output: It's really good! (new line after this)

        // You can also write both lines using System.out.println() like this:
        // System.out.println("I like pizza!");
        // System.out.println("It's really good!");

        // Print another line without using \n at the end (we'll use println next to add
        // a blank line)
        System.out.print("Buy me pizza!"); // Output stays on same line unless we add \n or use println

        // Adds an empty line (like pressing Enter once in console)
        // Shortcut in most IDEs: typing 'sout' + Tab = System.out.println();
        System.out.println(); // This just moves the cursor to the next line without printing anything

        // *HOW TO PRINT MULTIPLE LINES?*

        // This is the most clear and readable way, especially for beginners.
        // Each line is printed using a new System.out.println() call.

        // Each System.out.println() prints a line and moves the cursor to the next line
        System.out.println("Line 1: Hello!");
        System.out.println("Line 2: This is a Java program.");
        System.out.println("Line 3: I am learning how to print multiple lines.");
        System.out.println("Line 4: Each line has its own print statement.");

        // 2. Using \n Inside a Single System.out.print() or println()
        // The \n character tells Java to move to the next line, just like pressing
        // "Enter".

        // \n is a special "escape character" for new lines
        System.out.print(
                "Line 1: Hello!\nLine 2: This is a Java program.\nLine 3: I am learning Java.\nLine 4: Let's keep going!\n");

        // OR, with println, which already ends with a new line:
        System.out.println("This is line 1.\nThis is line 2.\nThis is line 3.");

        // Java 15 introduced Text Blocks using triple quotes """ (just like Python).
        // This is the cleanest way to write multiline strings.

        // Text block: use triple quotes and maintain indentation
        String message = """
                Line 1: Welcome to Java!
                Line 2: This is a multi-line string.
                Line 3: It preserves formatting.
                Line 4: And it's easy to read.
                """;

        // Print the entire text block at once
        System.out.println(message);
    }
}
// This is a Java source file containing our first program
// The file name should match the public class name: Main.java
