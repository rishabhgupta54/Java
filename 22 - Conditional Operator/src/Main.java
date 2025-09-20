/*
 * Conditional Operator
 *
 * - Java provides only one ternary operator called the conditional operator.
 * - Syntax: condition ? value_if_true : value_if_false
 * - It evaluates the condition first:
 *      - If true, it returns the first value (after ?)
 *      - If false, it returns the second value (after :)
 * - Nesting of conditional operators is allowed for more complex decisions.
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Simple conditional operator
         */
        int int1 = 10 < 20 ? 30 : 40;
        System.out.println("10 < 20 ? 30 : 40 = " + int1);

        /*
         * Nested conditional operator
         */
        int int2 = 10 > 20 ? 30 : (40 > 50 ? 60 : 70);
        System.out.println("10 > 20 ? 30 : (40 > 50 ? 60 : 70) = " + int2);
    }
}
