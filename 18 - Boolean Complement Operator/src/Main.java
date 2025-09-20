/*
 * Boolean Complement Operator (!)
 *
 * - The ! operator is used to invert a boolean value.
 *   true → false, false → true
 * - It can only be applied to boolean types.
 * - Applying it to integral types (int, byte, etc.) causes a compile-time error:
 *       System.out.println(!4); // CE: bad operand type int for unary operator '!'
 */

public class Main {
    public static void main(String[] args) {
        // Example 1: Applying ! on boolean values
        System.out.println("!false: " + (!false)); // true
        System.out.println("!true: " + (!true));   // false

        // Example 2: Invalid usage on integral types
        // System.out.println(!4); // CE: bad operand type int for unary operator '!'
    }
}
