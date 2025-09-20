/*
 * Assignment Operators
 *
 * - Assignment operators are used to assign values to variables.
 * - There are three types:
 *     - Simple Assignment: Assign a value directly to a variable.
 *     - Chained Assignment: Assign the same value to multiple variables in a single statement.
 *     - Compound Assignment: Combine an arithmetic or bitwise operation with assignment (e.g., +=, -=, *=, /=, %=, |=, &=, ^=, >>=, <<=, >>>=).
 *
 * Notes:
 * - Chained assignment cannot be used directly at the time of declaration.
 * - For compound assignment, implicit type casting is performed internally.
 * - The rightmost expression is evaluated first in chained/compound assignments.
 *
 * Example:
 * - Simple: int a = 10;
 * - Chained: int a, b, c; a = b = c = 20;
 * - Compound: int a = 10; a += 5; // equivalent to a = (int)(a + 5)
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Simple Assignment
         */
        int int1 = 10;

        /*
         * Chained Assignment
         */
        int int2, int3, int4;
        int2 = int3 = int4 = 20;
        System.out.println(int2 + "..." + int3 + "..." + int4);

        /*
         * Cannot perform chained assignment directly at declaration
         */
        // int int5 = int6 = int7 = 20; // CE: cannot find symbol

        /*
         * Compound Assignment
         */
        int int5 = 10;
        int5 += 10; // equivalent to int5 = int5 + 10;
        System.out.println(int5);

        /*
         * Implicit type casting with compound assignment
         */
        byte byte1 = 10;
        // byte1 = byte1 + 1; // CE: possible lossy conversion from int to byte

        byte byte2 = 10;
        byte2++; // internally byte2 = (byte)(byte2 + 1);
        System.out.println("byte2: " + byte2);

        byte byte3 = 10;
        byte3 += 10; // internally byte3 = (byte)(byte3 + 10);
        System.out.println("byte3: " + byte3);

        /*
         * Compound assignment with multiple operators
         */
        int int8, int9, int10, int11;
        int8 = int9 = int10 = int11 = 20;
        int8 += int9 -= int10 *= int11 / 2; // evaluated right to left
        System.out.println("int8: " + int8);
        System.out.println("int9: " + int9);
        System.out.println("int10: " + int10);
        System.out.println("int11: " + int11);
    }
}
