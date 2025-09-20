/*
 * Type Cast Operator
 *
 * - Type casting allows us to convert a value from one data type to another.
 * - Two types of casting:
 *      1. Implicit Type Casting (Widening / Upcasting)
 *      2. Explicit Type Casting (Narrowing / Downcasting)
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Implicit Type Casting (Widening / Upcasting)
         * - Compiler automatically converts smaller datatype to bigger datatype.
         * - No loss of information.
         * - Common combinations:
         *      byte -> short -> int -> long -> float -> double
         *      char -> int -> long -> float -> double
         */
        int int1 = 'a';  // char → int
        System.out.println("int1 = " + int1);

        double double1 = 10; // int → double
        System.out.println("double1 = " + double1);

        /*
         * Explicit Type Casting (Narrowing / Downcasting)
         * - Programmer explicitly converts bigger datatype to smaller datatype.
         * - Possible loss of information.
         * - Common combinations:
         *      byte <- short <- int <- long <- float <- double
         *      char <- int <- long <- float <- double
         */
        int int2 = 130;
        // byte byte1 = int2; // CE: incompatible types: possible lossy conversion from int to byte
        // Step 1: 130 in 32-bit binary
        // 00000000 00000000 00000000 10000010
        // Step 2: Explicit type cast to byte
        byte byte2 = (byte) int2;
        // Step 3: Keep only the lowest 8 bits
        // Lowest 8 bits: 10000010
        // Step 4: Interpret 10000010 in two's complement (byte)
        // - Since MSB = 1, it is negative
        // - Invert all bits: 01111101
        // - Add 1:           01111101
        //                    01111110
        // - Apply negative sign → -126
        System.out.println("byte2 = " + byte2);

        /*
         * If we assign floating point values to the integral types by explicit casting,
         * the digits after the decimal point will be lost.
         */
        double double2 = 123.456;
        int int3 = (int) double2; // Decimal part lost
        System.out.println("int3 = " + int3);
    }
}
