/*
 * Arithmetic Operators
 * If we apply any arithmetic operator between two variables a and b:
 * Result type = max(int, type of a, type of b)
 *
 * Examples:
 * - byte + byte → int
 * - short + byte → int
 * - char + char → int
 * - int + long → long
 * - long + float → float
 * - float + double → double
 * - double + int → double
 *
 * Promotion Hierarchy:
 * byte → short → int → long → float → double
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Integral Arithmetic (byte, short, int, long)
         * - In integer arithmetic, there is no representation for infinity.
         * - If a division by zero occurs, JVM throws ArithmeticException.
         */
        // System.out.println("10 / 0 = " + (10 / 0)); // Runtime Error: ArithmeticException: / by zero

        /*
         * Floating Point Arithmetic (float, double)
         * - In floating-point arithmetic, infinity and NaN (Not a Number) are well-defined values.
         * - Float and Double classes provide constants:
         *   POSITIVE_INFINITY, NEGATIVE_INFINITY, NaN
         * - So, no ArithmeticException will be thrown even for division by zero.
         */
        System.out.println("Float.POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY);
        System.out.println("Float.NEGATIVE_INFINITY: " + Float.NEGATIVE_INFINITY);
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);

        // Division by zero in floating point gives infinity
        System.out.println("10 / 0.0 = " + (10 / 0.0));   // Infinity
        System.out.println("-10 / 0.0 = " + (-10 / 0.0)); // -Infinity

        /*
         * Undefined Results
         * - In integral arithmetic, undefined results (like 0/0) → ArithmeticException
         * - In floating point, undefined results (like 0.0/0.0) → NaN
         */
        System.out.println("Float.NaN: " + Float.NaN);
        System.out.println("Double.NaN: " + Double.NaN);

        // Division where numerator is 0 and denominator is also 0
        System.out.println("0.0 / 0 = " + (0.0 / 0));   // NaN
        System.out.println("-0.0 / 0 = " + (-0.0 / 0)); // NaN

        /*
         * Quick Reference:
         *   int / 0   → ArithmeticException
         *   10.0 / 0  → Infinity
         *   0.0 / 0   → NaN
         */
    }
}
