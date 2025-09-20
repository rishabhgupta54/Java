/*
 * Bitwise Operators
 * These operators work on the binary representation of integer types.
 * They can also be applied to boolean values where they act as logical operators.
 * & - AND  - returns true if both arguments are true
 * | - OR   - returns true if at least 1 argument is true
 * ^ - XOR  - returns true if both arguments are different
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("true & false = " + (true & false));
        System.out.println("true | false = " + (true | false));
        System.out.println("true ^ false = " + (true ^ false));

        /*
         * We can apply these operators on integral types also
         */

        /*
         * 4 in binary          100
         * 5 in binary          101
         * 4 & 5 =              100 => 4 in decimal
         */
        System.out.println("4 & 5 = " + (4 & 5));

        /*
         * 4 in binary          100
         * 5 in binary          101
        * 4 | 5                 101 => 5 in decimal
         */
        System.out.println("4 | 5 = " + (4 | 5));

        /*
         * 4 in binary          100
         * 5 in binary          101
         * 4 ^ 5                001 => 1 in decimal
         */
        System.out.println("4 ^ 5 = " + (4 ^ 5));
    }
}
