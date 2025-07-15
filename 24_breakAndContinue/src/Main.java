 /*
        ╔════════════════════════════════════════════════════════════════════╗
        ║ 🔍 FULL THEORY DEEP DIVE: break & continue STATEMENTS IN JAVA 🧠   ║
        ╚════════════════════════════════════════════════════════════════════╝

        📌 What are `break` and `continue`?

        These are special jump/control flow statements used inside loops and switch cases.

        ══════════════════════════════════════════════════════════════════════
        🔴 1. break STATEMENT
        ══════════════════════════════════════════════════════════════════════

        🚀 PURPOSE:
        - The `break` statement is used to exit a loop or a switch statement prematurely.
        - Once encountered, control jumps out of the loop entirely and continues after the loop.

        📦 SYNTAX:
            break;

        ✅ Can be used in:
        - for loops
        - while loops
        - do-while loops
        - switch statements

        🧪 EXAMPLE: Exiting a loop when a condition is met
        */
//
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break; // stops loop when i = 5
//            }
//            System.out.println("Break Example i = " + i);
//        }

        /*
        🟢 OUTPUT:
        Break Example i = 1
        Break Example i = 2
        Break Example i = 3
        Break Example i = 4

        ══════════════════════════════════════════════════════════════════════
        🟡 2. continue STATEMENT
        ══════════════════════════════════════════════════════════════════════

        🚀 PURPOSE:
        - The `continue` statement skips the current iteration of a loop.
        - Loop continues with the next iteration.

        📦 SYNTAX:
            continue;

        ✅ Can be used in:
        - for loops
        - while loops
        - do-while loops

        🧪 EXAMPLE: Skip printing number 5
        */

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue; // skips the number 5
//            }
//            System.out.println("Continue Example i = " + i);
//        }

        /*
        🟢 OUTPUT:
        Continue Example i = 1
        Continue Example i = 2
        Continue Example i = 3
        Continue Example i = 4
        Continue Example i = 6
        ...
        Continue Example i = 10

        ══════════════════════════════════════════════════════════════════════
        🎯 COMPARISON: break vs continue
        ══════════════════════════════════════════════════════════════════════

        | Keyword   | Effect                            | Loop ends? |
        |-----------|-----------------------------------|------------|
        | break     | Exits the loop completely         | ✅ Yes     |
        | continue  | Skips current iteration only      | ❌ No      |

        ══════════════════════════════════════════════════════════════════════
        🔁 BONUS: Nested Loops + Labeled break/continue
        ══════════════════════════════════════════════════════════════════════
        */

//        System.out.println("\n🔁 Nested Loop with simple break:");
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) break; // breaks only inner loop
//                System.out.println("i = " + i + ", j = " + j);
//            }
//        }
//
//        System.out.println("\n🔁 Nested Loop with labeled break:");
//        outer:
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) break outer; // breaks outer loop too
//                System.out.println("Labeled Break i = " + i + ", j = " + j);
//            }
//        }
//
//        System.out.println("\n🔁 Nested Loop with continue:");
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) continue; // skips j = 2
//                System.out.println("i = " + i + ", j = " + j);
//            }
//        }

        /*
        ══════════════════════════════════════════════════════════════════════
        🧠 BEST PRACTICES
        ══════════════════════════════════════════════════════════════════════

        ✔ Use `break` to:
          - Exit a loop when a target condition is met
          - Improve performance by not doing unnecessary iterations

        ✔ Use `continue` to:
          - Skip unwanted iterations (invalid input, banned word, etc.)

        ❗ Avoid overusing these as they can make logic harder to follow.

        ══════════════════════════════════════════════════════════════════════
        🧪 MINI EXERCISE:
        ══════════════════════════════════════════════════════════════════════
        Print numbers from 1 to 10
        Skip number 5 using continue
        Stop loop entirely at number 8 using break
        */

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) continue;
//            if (i == 8) break;
//            System.out.println("Exercise i = " + i);
//        }

        /*
        🟢 OUTPUT:
        Exercise i = 1
        Exercise i = 2
        Exercise i = 3
        Exercise i = 4
        Exercise i = 6
        Exercise i = 7

        ══════════════════════════════════════════════════════════════════════
        ✅ SUMMARY:
        - `break`: Ends the loop.
        - `continue`: Skips current loop step, goes to next iteration.
        - Use labels for nested loops when needed.
        - Helpful in input validation, search operations, game loops, etc.

        🏁 That's your complete Java guide to `break` and `continue` 🎉
        */

 public class Main {
     public static void main(String[] args) {

        /*
        ╔══════════════════════════════════════════════════════════════╗
        ║ 🔁 BREAK & CONTINUE DEMO — EXPLAINED STEP BY STEP IN JAVA ☕ ║
        ╚══════════════════════════════════════════════════════════════╝

        📌 `break`   = Immediately exits the loop when a condition is met ✅
        📌 `continue` = Skips the current loop iteration and goes to next 🔄

        🧪 This loop will demonstrate:
        - Skipping the number 3 using `continue`
        - Exiting the loop completely when number reaches 8 using `break`
        */

         for (int i = 0; i < 10; i++) {

             // 🔎 If the number reaches 8, stop the loop completely!
             if (i == 8) {
                 break; // ☠️ break out of the loop
             }

             // 🔎 If the number is 3, skip this iteration and continue to the next
             if (i == 3) {
                 continue; // ⏭️ skip printing this number
             }

             // ✅ This line is reached only if i != 3 and i != 8
             System.out.println(i + " ");
         }

        /*
        ═══════════════════════════════════════════════════════════════
        🧾 OUTPUT:
        0
        1
        2
        4
        5
        6
        7
        ✅ 3 was skipped using `continue`
        ✅ Loop exited before reaching 8 using `break`

        🔁 Loop range: i = 0 to i < 10 (i = 0 to 9)
        🛑 Loop broke at i == 8, so i = 8 and i = 9 never printed.
        */
     }
 }
