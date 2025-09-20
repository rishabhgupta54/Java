/*
 * Bitwise Complement Operator (~)
 *
 * 1. The ~ operator works for integral types (byte, short, int, long, char) but NOT for boolean.
 * 2. Applying it to a boolean causes a compile-time error:
 *       System.out.println(~true); // CE: bad operand type boolean
 * 3. What ~ does:
 *       - It inverts every bit of the number: 0 -> 1, 1 -> 0
 * 4. Negative numbers in Java are represented using two's complement.
 *       - If the leftmost bit (MSB) is 1, the number is negative.
 *       - To get the decimal value of a negative binary number:
 *             decimal = -(invert all bits + 1)
 */

public class Main {
    public static void main(String[] args) {

        // Example 1: ~4
        int num1 = 4; // Decimal number
        System.out.println("Decimal: " + num1); // Print original number

        // Step 1: 4 in 32-bit binary
        // 00000000 00000000 00000000 00000100

        // Step 2: Apply bitwise complement (~)
        // Flip all bits
        // 11111111 11111111 11111111 11111011

        // Step 3: Convert binary result to decimal using two's complement
        // Invert bits: 00000000 00000000 00000000 00000100
        // Add 1:     00000000 00000000 00000000 00000101
        // Apply negative sign → -5

        System.out.println("~4 = " + (~num1)); // Output: -5

        // Example 2: ~-4
        int num2 = -4; // Decimal number

        // Step 1: -4 in 32-bit binary (two's complement)
        // 11111111 11111111 11111111 11111100

        // Step 2: Apply bitwise complement (~)
        // Flip all bits
        // 00000000 00000000 00000000 00000011

        // Step 3: Convert binary result to decimal
        // Leftmost bit = 0 → positive number
        // Decimal value = 3

        System.out.println("~-4 = " + (~num2)); // Output: 3
    }
}
