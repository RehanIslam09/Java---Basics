/*
================================================================================
📘 JAVA `.substring()` METHOD - COMPLETE DEEP DIVE
================================================================================

🔰 PURPOSE:
-----------
The `.substring()` method in Java is used to **extract a portion (substring) of a string**.
It is part of the `String` class, which is one of the most commonly used classes in Java.

Think of it like cutting a section from a sentence:
✂️ "Hello World" → "World"

================================================================================
🧠 BASIC DEFINITION
---------------------
➡️ `substring()` is an instance method in the `String` class.
➡️ It returns a **new string** that is a subsequence of the original string.

--------------------------------------------------------------------------------
🧾 SYNTAX:
--------------------------------------------------------------------------------
1️⃣ `string.substring(beginIndex);`
   ➤ Extracts substring from `beginIndex` to the end of the string.

2️⃣ `string.substring(beginIndex, endIndex);`
   ➤ Extracts substring from `beginIndex` **up to but not including** `endIndex`.

📌 Both `beginIndex` and `endIndex` are **zero-based indexes** (i.e., first char is at index 0).

================================================================================
📌 EXAMPLES:
================================================================================

// Original string:
String message = "Java Programming";

// Example 1: Extract from index 5 to end
String sub1 = message.substring(5); // Output: "Programming"

// Example 2: Extract from index 0 to 4 (excluding 4)
String sub2 = message.substring(0, 4); // Output: "Java"

// Example 3: Full string using substring
String full = message.substring(0, message.length()); // Output: "Java Programming"

================================================================================
🚨 COMMON PITFALLS (Read Carefully!)
================================================================================

⚠️ 1. IndexOutOfBoundsException:
   - If `beginIndex` or `endIndex` are out of the valid range, Java throws this error.

✔️ Range must satisfy:
   - `0 ≤ beginIndex ≤ endIndex ≤ string.length()`

⚠️ 2. `beginIndex == endIndex`:
   - Returns an **empty string**. (Valid but not very useful.)

⚠️ 3. `beginIndex > endIndex`:
   - ❌ Illegal! Will throw `StringIndexOutOfBoundsException`

================================================================================
🔍 INTERNAL BEHAVIOR
================================================================================

✔️ `substring()` doesn't change the original string (strings are immutable).
✔️ It returns a **new string object**.
✔️ Internally, it uses character copying (Java 7+) or memory sharing (Java 6 and below).
✔️ Efficient for parsing tokens from strings, like CSV or user input.

================================================================================
💡 REAL-WORLD USE CASES
================================================================================

✅ Extract domain name from email:
   ➤ "user@example.com" → `substring(email.indexOf("@") + 1)` → "example.com"

✅ Get file extension:
   ➤ "document.pdf" → `substring(fileName.lastIndexOf(".") + 1)` → "pdf"

✅ Slice names, passwords, IDs, dates, etc.

================================================================================
🎯 BEST PRACTICES
================================================================================

✔️ Always validate string length and indexes before calling `substring()`
✔️ Use `.indexOf()` or `.lastIndexOf()` for dynamic positions
✔️ Chain with `.trim()` or `.toLowerCase()` if needed

================================================================================
📌 SUMMARY TABLE:
================================================================================

| Method                       | What it does                             |
|-----------------------------|------------------------------------------|
| substring(5)                | From index 5 to end                      |
| substring(0, 4)             | From index 0 to 3                        |
| substring(i, j)             | From i (inclusive) to j (exclusive)      |
| substring(0, str.length())  | Full string (creates a copy)             |

================================================================================
🧪 TEST THIS YOURSELF (CODE SNIPPET INSIDE COMMENT)
================================================================================

// Sample String:
String word = "OpenAI GPT";

// Substrings:
System.out.println(word.substring(0, 6));  // "OpenAI"
System.out.println(word.substring(7));    // "GPT"
System.out.println(word.substring(4, 4)); // "" (Empty string)
System.out.println(word.substring(0));    // "OpenAI GPT"

================================================================================
🔚 END OF `.substring()` THEORY
================================================================================
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        ==============================================================================
        📌 .substring() METHOD PRACTICAL USAGE
        ==============================================================================
        👉 The `.substring(start, end)` method extracts a part of a string:
           - It starts **at index `start` (inclusive)**
           - Ends **before index `end` (exclusive)**
           - Returns a **new string** with the extracted portion

        👉 Common real-life usage: extracting usernames, domains, file extensions, etc.
        ------------------------------------------------------------------------------
        */

        // 🎯 EXAMPLE 1: Basic hardcoded email slicing
        String email = "rehanislamcontact@gamil.com";

        // Extracting username manually from index 0 to 17 (not very flexible)
        String username = email.substring(0, 17);

        // Extracting domain manually from index 18 to the end
        String domain = email.substring(18);

        System.out.println("👤 Username: " + username);
        System.out.println("📧 Domain: " + domain);

        /*
        ==============================================================================
        ⚠️ This above method is NOT scalable.
        Why? If the username or domain length changes, the indexes will break.
        So let's fix that using `.indexOf()` to dynamically find the '@' position.
        ==============================================================================
        */

        // 🎯 EXAMPLE 2: Making email parsing dynamic
        email = "rehanislamnewcontact@gamil.com";

        // Extract username from beginning up to '@' symbol
        username = email.substring(0, email.indexOf("@"));

        // Extract domain from '@' symbol till end
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println("👤 Username: " + username);
        System.out.println("📧 Domain: " + domain);

        /*
        ==============================================================================
        🔴 EXAMPLE 3: Making it interactive! Let's allow user input with Scanner
        ==============================================================================
        */

        Scanner scanner = new Scanner(System.in);

        String userInputEmail;
        String userInputUsername;
        String userInputDomain;

        // 🧑 Asking user for their email
        System.out.print("📨 Please enter your email: ");
        userInputEmail = scanner.nextLine();

        /*
        ==============================================================================
        🧪 Now we’ll check if the email is valid (contains "@")
        ------------------------------------------------------------------------------
        If valid:
           → Extract and display username & domain
        If not:
           → Show error message
        ==============================================================================
        */

        if(userInputEmail.contains("@")){
            userInputUsername = userInputEmail.substring(0, userInputEmail.indexOf("@"));
            userInputDomain = userInputEmail.substring(userInputEmail.indexOf("@") + 1);

            System.out.printf("✅ Your username is: %s\n", userInputUsername);
            System.out.printf("✅ Your domain is: %s\n", userInputDomain);
        }
        else{
            System.out.println("❌ Invalid email! An email must contain the '@' symbol.");
        }

        scanner.close();

        /*
        ==============================================================================
        ✅ OUTPUT EXAMPLES:
        ==============================================================================
        Input:
        ➤ Please enter your email: john.doe@example.com

        Output:
        ➤ Your username is: john.doe
        ➤ Your domain is: example.com

        ==============================================================================
        🔚 End of Program
        ==============================================================================
        */
    }
}
