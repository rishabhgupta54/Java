/*
 * Flow Control
 * Flow control decides the order in which statements are executed at runtime.
 *
 * Types of flow control statements in Java:
 * - Selection Statements
 *      - if-else
 *      - switch
 * - Iteration Statements (Loops)
 *      - while
 *      - do-while
 *      - for
 *      - for-each
 * - Transfer of Control
 *      - break
 *      - continue
 *      - return
 *      - try-catch-finally
 *      - assert
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Selection Statements
         */

        /*
         * if-else
         * Syntax:
         * if (condition) {
         *      // executes if condition is true
         * } else {
         *      // executes if condition is false
         * }
         *
         * Note:
         * - The condition must be of boolean type.
         * - Using any other type results in a compile-time error.
         */

        /*int int1 = 0;
        if (int1) { // CE: incompatible types: int cannot be converted to boolean
            System.out.println("int1 if condition");
        } else {
            System.out.println("int1 else condition");
        }*/

        /*int int2 = 10;
        if (int2 = 20) { // CE: incompatible types: int cannot be converted to boolean
            System.out.println("int2 if condition");
        } else {
            System.out.println("int2 else condition");
        }*/

        int int3 = 10;
        if (int3 == 20) {
            System.out.println("int3 -> if block executed");
        } else {
            System.out.println("int3 -> else block executed");
        }

        boolean boolean1 = false;
        if (boolean1 = false) {
            System.out.println("boolean1 -> if block executed");
        } else {
            System.out.println("boolean1 -> else block executed");
        }

        boolean boolean2 = false;
        if (!boolean2) {
            System.out.println("boolean2 -> if block executed");
        } else {
            System.out.println("boolean2 -> else block executed");
        }

        /*
         * else part and curly braces are optional.
         * Without curly braces, only ONE statement is allowed
         * and that statement cannot be a variable declaration.
         */
        if (true)
            System.out.println("Single statement allowed without braces");

        /*if (true)
            int int4 = 10; // CE: variable declaration not allowed here
        */

        if (true) {
            int int5 = 10;
            System.out.println("Block with curly braces is fine");
        }

        /*
         * Switch
         * - Used when multiple options are available (better than nested if-else for readability).
         * - Syntax:
         *   switch(expression) {
         *       case value1: action; break;
         *       case value2: action; break;
         *       ...
         *       default: action;
         *   }
         *
         * - Allowed types for switch expression:
         *   v1.4 and earlier: char, byte, short, int
         *   v1.5 onwards: corresponding wrapper classes + enum
         *   v1.7 onwards: String also allowed
         *
         * Rules:
         * - Curly braces are mandatory.
         * - Both case and default are optional (empty switch is valid).
         * - Only one default is allowed.
         * - default executes only if no case matches.
         */
        int int6 = 10;
        switch (int6) {
        }

        /*
         * Independent statements are not allowed inside switch.
         */
        /*int int7 = 10;
        switch (int7) {
            System.out.println("Hello"); // CE: statement not under any case or default
        }*/

        /*
         * Case labels must be compile-time constants.
         */
        /*int int8 = 10;
        int int9 = 20;
        switch (int8) {
            case 10:
                System.out.println("Ten");
            case int9: // CE: case label must be constant
                System.out.println("Twenty");
        }*/

        /*
         * Declaring int9 as final makes it a compile-time constant.
         */
        int int10 = 10;
        final int int9 = 20;
        switch (int10) {
            case 10:
                System.out.println("Case 10 matched");
            case int9:
                System.out.println("Case 20 matched");
        }

        /*
         * Both switch expression and case labels can be expressions,
         * but case labels must be constant expressions.
         */
        int int11 = 10;
        switch (int11 + 1) {
            case 10:
                System.out.println("Case 10 matched");
                break;
            case 10 + 20 + 30:
                System.out.println("Case 60 matched");
                break;
        }

        /*
         * Case labels must be within the range of switch expression type.
         */
        /*byte byte1 = 10;
        switch (byte1) {
            case 10:
                System.out.println("Case 10");
                break;
            case 100:
                System.out.println("Case 100");
                break;
            case 1000: // CE: possible lossy conversion from int to byte
                System.out.println("Case 1000");
                break;
        }*/

        byte byte2 = 10;
        switch (byte2 + 1) { // max(int, byte, int) = int → expression type is int
            case 10:
                System.out.println("Case 10");
                break;
            case 100:
                System.out.println("Case 100");
                break;
            case 1000:
                System.out.println("Case 1000");
                break;
        }

        /*
         * Duplicate case labels are not allowed.
         */
        /*int int12 = 10;
        switch (int12) {
            case 97:
                System.out.println("Ninety Seven");
                break;
            case 98:
                System.out.println("Ninety Eight");
                break;
            case 99:
                System.out.println("Ninety Nine");
                break;
            case 'a': // CE: duplicate case label (97)
                System.out.println("Character 'a'");
                break;
        }*/

        /*
         * Fall-through behavior:
         * - If a case matches, execution continues until a break or end of switch.
         * - Useful for grouping cases with common actions.
         */
        int int13 = 10;
        switch (int13) {
            case 1:
            case 2:
            case 3:
                System.out.println("Case 1 to Case 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Case 4 to Case 6");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Case 7 to Case 9");
                break;
            default:
                System.out.println("Case 10 to Case 12 (default)");
        }

        /*
         * Iteration Statements
         */

        /*
         * while loop
         * - Best choice when number of iterations is unknown.
         * Syntax:
         * while(condition) {
         *      action
         * }
         *
         * Rules:
         * - Condition must be boolean.
         * - Without braces, only one statement is allowed (not a declaration).
         */

        /*while (1) { // CE: incompatible types: int cannot be converted to boolean
            System.out.println("While Loop");
        }*/

        /*while(true) {
            System.out.println("Hello"); // CE: unreachable statement
        }*/

        /*int int14 = 10;
        int int15 = 20;
        while (int14 < int15) {
            System.out.println("Infinite loop since condition always true");
        }*/

        /*
         * Final variables are replaced with values at compile time.
         */
        /*final int int16 = 10;
        final int int17 = 20;
        while (int16 > int17) { // while(10 > 20)
            System.out.println("Hello"); // CE: unreachable statement
        }*/

        /*
         * Compile-time evaluation when all operands are final.
         */
        final int int18 = 10, int19 = 20;
        int int20 = 20;
        System.out.println("int18 + int19 = " + (int18 + int19)); // replaced with 30
        System.out.println("int18 + int20 = " + (int18 + int20)); // replaced with (10 + int20)
        System.out.println("int18 < int19 = " + (int18 < int19)); // replaced with true
        System.out.println("int18 < int20 = " + (int18 < int20)); // replaced with (10 < int20)

        /*
         * do-while loop
         * - Executes at least once because condition is checked at the end.
         * Syntax:
         * do {
         *      action
         * } while(condition);
         */
        do
            System.out.println("Do-While executes at least once even if condition is false");
        while (false);

        /*
         * for loop
         * - Most commonly used loop.
         * - Best choice when number of iterations is known in advance.
         * Syntax:
         * for(initialization; condition; increment/decrement) {
         *      action
         * }
         *
         * Notes:
         * - Initialization executes only once.
         * - Multiple variables allowed in initialization but must be of same type.
         * - Condition must be boolean. If omitted, compiler treats it as true.
         * - Increment/decrement part can be any valid statement.
         * - All three parts are optional.
         */
        for (int int21 = 0; int21 < 3; int21++) {
            System.out.println("for loop iteration: int21 = " + int21);
        }

        /*for (; ; ) {
            System.out.println("Infinite loop: all parts optional, works like while(true)");
        }*/

        /*
         * for-each loop
         * - Introduced in Java 1.5
         * - Specially designed for iterating over arrays and collections.
         */
        int[] array1 = {10, 20, 30, 40, 50};
        for (int value : array1) {
            System.out.println("Array element: " + value);
        }

        /*
         * Transfer of Control
         */

        /*
         * break
         * - Used inside switch to stop fall-through.
         * - Used inside loops to terminate execution early.
         */
        for (int int21 = 0; int21 < 10; int21++) {
            if (int21 == 5) {
                break;
            }
            System.out.println("break example -> int21 = " + int21);
        }

        /*
         * continue
         * - Used inside loops to skip current iteration and continue with next.
         */
        for (int int22 = 0; int22 < 10; int22++) {
            if (int22 == 5) {
                continue;
            }
            System.out.println("continue example -> int22 = " + int22);
        }
    }
}
