/*
================================================================================
📘 JAVA STRING METHODS — COMPLETE THEORY GUIDE
================================================================================

🔰 LEVEL: Absolute Beginner → Advanced
🎯 PURPOSE: Learn how to work with and manipulate text in Java using `String` methods
📦 CLASS: java.lang.String (no need to import — it's built-in)

================================================================================
🧠 1. WHAT IS A STRING?
================================================================================

📝 A `String` is a **sequence of characters** enclosed in **double quotes ("")**.

✅ In Java, Strings are:
- Immutable → once created, they **cannot be changed**
- Objects of the `String` class
- Stored in a special memory area called the **String pool**

🔧 Java provides many **built-in methods** to manipulate and examine strings.

Example:
String name = "Rehan";

================================================================================
📦 2. STRING CREATION METHODS
================================================================================

1️⃣ Using string literals (preferred):
    String str = "Hello"; // Stored in string pool

2️⃣ Using `new` keyword:
    String str = new String("Hello"); // Stored in heap, **not** string pool

📌 Note: Prefer literals for memory efficiency.

================================================================================
📘 3. COMMONLY USED STRING METHODS
================================================================================

🎯 Used for examining, modifying, and comparing text

-------------------------------------------------------------------------------
🔹 str.length() → returns the number of characters
-------------------------------------------------------------------------------
String name = "Rehan";
int len = name.length(); // 5

-------------------------------------------------------------------------------
🔹 str.charAt(index) → returns character at a specific index
-------------------------------------------------------------------------------
char ch = name.charAt(0); // 'R'

⚠️ Index starts from 0. Throws `StringIndexOutOfBoundsException` if invalid.

-------------------------------------------------------------------------------
🔹 str.toUpperCase(), str.toLowerCase() → changes case
-------------------------------------------------------------------------------
name.toUpperCase(); // "REHAN"
name.toLowerCase(); // "rehan"

✔️ Useful for case-insensitive comparisons

-------------------------------------------------------------------------------
🔹 str.equals(str2) → checks if two strings are **equal (case-sensitive)**
🔹 str.equalsIgnoreCase(str2) → case-insensitive equality
-------------------------------------------------------------------------------
"hello".equals("hello"); → true
"hello".equals("HELLO"); → false
"hello".equalsIgnoreCase("HELLO"); → true

⚠️ NEVER use `==` to compare strings → it compares memory addresses!

-------------------------------------------------------------------------------
🔹 str.compareTo(str2) → alphabetical comparison
-------------------------------------------------------------------------------
- Returns 0 if equal
- Negative if str comes before str2
- Positive if str comes after str2

"Apple".compareTo("Banana") → negative

-------------------------------------------------------------------------------
🔹 str.contains(substring) → checks if string has given characters
-------------------------------------------------------------------------------
"hello world".contains("world"); → true

-------------------------------------------------------------------------------
🔹 str.startsWith(), str.endsWith() → prefix/suffix check
-------------------------------------------------------------------------------
"java.pdf".endsWith(".pdf") → true

-------------------------------------------------------------------------------
🔹 str.indexOf(char/str) → position of character or string (first match)
🔹 str.lastIndexOf(char/str) → last occurrence
-------------------------------------------------------------------------------
"banana".indexOf("a"); → 1
"banana".lastIndexOf("a"); → 5

-------------------------------------------------------------------------------
🔹 str.isEmpty() → true if string has length 0
🔹 str.isBlank() → true if empty or only whitespace (Java 11+)
-------------------------------------------------------------------------------
"".isEmpty(); → true
"   ".isBlank(); → true

-------------------------------------------------------------------------------
🔹 str.replace(oldChar, newChar)
🔹 str.replaceAll(regex, replacement) → regex-based replacement
-------------------------------------------------------------------------------
"cat".replace('c', 'b'); → "bat"
"123-456".replaceAll("-", ""); → "123456"

-------------------------------------------------------------------------------
🔹 str.substring(start, end) → extracts portion from start to end-1
-------------------------------------------------------------------------------
"HelloWorld".substring(0, 5); → "Hello"

⚠️ Throws error if index out of range.

-------------------------------------------------------------------------------
🔹 str.concat(str2) → appends str2 to str
-------------------------------------------------------------------------------
"Hello".concat(" World"); → "Hello World"

✔️ Prefer `+` for readability: "Hello" + " World"

-------------------------------------------------------------------------------
🔹 str.trim() → removes leading/trailing whitespace
-------------------------------------------------------------------------------
"  Hello  ".trim(); → "Hello"

================================================================================
🧪 4. ADVANCED STRING METHODS
================================================================================

🔹 str.split(delimiter) → splits string into array based on delimiter
-------------------------------------------------------------------------------
"red,blue,green".split(",") → [ "red", "blue", "green" ]

🔹 str.matches(regex) → checks full match with regex pattern
-------------------------------------------------------------------------------
"abc123".matches("[a-z]+[0-9]+"); → true

🔹 str.repeat(n) → repeats the string n times (Java 11+)
-------------------------------------------------------------------------------
"ha".repeat(3); → "hahaha"

================================================================================
💡 5. IMMUTABILITY OF STRINGS
================================================================================

Strings in Java are **immutable**, which means:
- Once created, their value cannot be changed
- Methods like `toUpperCase()` return a **new** string

This ensures:
✔️ Safety (no accidental changes)
✔️ Thread-safety
✔️ Fast access via String Pool

🧠 Analogy: Think of a string like a sealed letter. You can read it, copy it, but not edit it.

================================================================================
📌 6. MEMORY CONCEPT: STRING POOL
================================================================================

✅ String literals are stored in a special area in memory called the **String pool**

✔️ JVM reuses identical literals to save memory

Example:
String a = "Java";
String b = "Java";

`a == b` → true (same reference from pool)

But:
String c = new String("Java");

`a == c` → false (different object in heap)

Always use `.equals()` to compare **content**, not memory.

================================================================================
💬 7. BEST PRACTICES
================================================================================

✔️ Use `.equals()` instead of `==` for string comparison
✔️ Use `StringBuilder` for string concatenation inside loops (performance)
✔️ Sanitize input with `trim()` before checking `.isEmpty()`
✔️ Use `.isBlank()` instead of `.trim().isEmpty()` in Java 11+
✔️ Avoid deeply chaining methods unless readability is preserved

================================================================================
❌ 8. COMMON MISTAKES
================================================================================

❌ Using `==` instead of `.equals()` for comparison
❌ Forgetting that `substring()` uses end-exclusive index
❌ Ignoring immutability → expecting `str.toUpperCase()` to change original
❌ NullPointerException when calling methods on null strings

================================================================================
📚 9. STRING VS STRINGBUILDER VS STRINGBUFFER
================================================================================

| Type          | Mutable | Thread-Safe | Performance |
|---------------|---------|-------------|-------------|
| String        | No      | Yes         | Slowest     |
| StringBuilder | Yes     | No          | Fastest     |
| StringBuffer  | Yes     | Yes         | Medium      |

✅ Use `StringBuilder` when building large or dynamic strings (like in loops)

================================================================================
✅ 10. SUMMARY TABLE OF STRING METHODS
================================================================================

| Method             | Description                                  |
|--------------------|----------------------------------------------|
| length()           | Returns string length                        |
| charAt(index)      | Gets character at position                   |
| toUpperCase()      | Converts to uppercase                        |
| toLowerCase()      | Converts to lowercase                        |
| equals(), equalsIgnoreCase() | Compares content                  |
| contains()         | Checks substring                             |
| startsWith(), endsWith() | Prefix/suffix check                  |
| indexOf(), lastIndexOf() | Position of char or substring        |
| substring(start, end) | Extracts part of string                  |
| isEmpty(), isBlank() | Empty or whitespace check                 |
| replace(), replaceAll() | Replaces characters or patterns        |
| trim()             | Removes whitespace                          |
| split()            | Splits into array using delimiter            |
| matches()          | Regex match                                  |
| concat()           | Appends string                               |
| repeat() (Java 11) | Repeats string                               |

================================================================================
🔚 END OF STRING METHODS THEORY GUIDE
================================================================================
*/

public class Main {
    public static void main(String[] args) {

        /*
        ============================================================================
        📘 JAVA STRING METHODS DEMO
        ============================================================================
        🔰 This program demonstrates a variety of built-in methods in the `String` class.
        It covers how to:
        - Inspect strings (length, character access, indexes)
        - Modify strings (case conversion, trimming, replacing)
        - Validate and check content (isEmpty, contains, equals, etc.)
        - Understand common real-world validations

        🎯 Goal: Get comfortable manipulating text in Java
        ============================================================================
        */

        // 🧵 Creating a sample name string
        String name = "Rehan Islam";

        // 🔠 Get the length of the string (total characters including space)
        int length = name.length(); // Output: 11

        // 🔤 Get the first character using charAt(index)
        char letter = name.charAt(0); // Output: 'R'

        // 🔎 Find the position of the first occurrence of 'a'
        int index = name.indexOf("a"); // Output: 2

        // 🔎 Find the position of the last occurrence of 'a'
        int lastIndex = name.lastIndexOf("a"); // Output: 9

        // 🖨️ Print gathered information
        System.out.println(length);      // 11
        System.out.println(letter);      // R
        System.out.println(index);       // 2
        System.out.println(lastIndex);   // 9

        // 🔠 Convert the name to uppercase
        name = name.toUpperCase(); // Output: "REHAN ISLAM"
        System.out.println(name);

        // 🔡 Convert the name to lowercase
        name = name.toLowerCase(); // Output: "rehan islam"
        System.out.println(name);

        // 🧼 Trimming whitespaces from the beginning and end of a string
        name = "       Rehan Islam    "; // Intentionally padded with spaces
        System.out.println(name);        // Will show with leading/trailing spaces

        name = name.trim();              // Removes leading/trailing whitespace
        System.out.println(name);        // Output: "Rehan Islam"

        // 🧪 Replace characters → replace all 'e' with 'k'
        name = name.replace("e", "k");   // Output: "Rkhan Islam"
        System.out.println(name);

        // 🛑 Check if the string is empty
        if(name.isEmpty()) {
            System.out.println("The name is Empty! ❌");
        } else {
            System.out.println("Hello " + name + "! 😄");
        }

        // 🔍 Check if string contains a space character
        if(name.contains(" ")) {
            System.out.println("Your name contains a space 🔎");
        } else {
            System.out.println("Your name doesn't contain any spaces 🧼");
        }

        // 🔐 PASSWORD VALIDATION EXAMPLE
        name = "Password";

        // ⚠️ Incorrect way to validate password → case-sensitive
        if(name.equals("password")) {
            System.out.println("Your name can't be password! 🔒");
        }

        // ✅ Better way → case-insensitive comparison
        if(name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password! (case-insensitive check) 🚫");
        }
        else {
            System.out.println("Hello " + name + "! ✅");
        }

        /*
        ============================================================================
        📌 WHAT YOU LEARNED:
        ----------------------------------------------------------------------------
        🔹 length()         → Count number of characters
        🔹 charAt(index)    → Get character at a specific position
        🔹 indexOf()        → Find first occurrence
        🔹 lastIndexOf()    → Find last occurrence
        🔹 toUpperCase()    → Convert to uppercase
        🔹 toLowerCase()    → Convert to lowercase
        🔹 trim()           → Remove extra spaces
        🔹 replace()        → Replace characters
        🔹 isEmpty()        → Check if string is empty
        🔹 contains()       → Check for substring
        🔹 equals()         → Case-sensitive comparison
        🔹 equalsIgnoreCase() → Case-insensitive comparison
        ============================================================================
        */
    }
}

