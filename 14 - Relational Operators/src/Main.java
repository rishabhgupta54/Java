/*
 * Relational Operators
 * Relational operators are used to compare two values.
 * They always return a boolean result: true or false.
 *
 * <   → less than
 * <=  → less than or equal to
 * >   → greater than
 * >=  → greater than or equal to
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Relational operators can be applied to all numeric primitive types (byte, short, char, int, long, float, double)
         * They return boolean results (true or false)
         */
        System.out.println("10 < 20 = " + (10 < 20));        // true
        System.out.println("'a' < 10 = " + ('a' < 10));      // 'a' = 97 → 97 < 10 → false
        System.out.println("'a' < 97.6 = " + ('a' < 97.6));  // 97 < 97.6 → true
        System.out.println("'a' > 'A' = " + ('a' > 'A'));    // 97 > 65 → true

        /*
         * Relational operators are NOT applicable for boolean type
         */
        // System.out.println("true > false = " + (true > false)); // CE

        /*
         * Relational operators cannot be used directly on Object types like String
         */
        // System.out.println("\"Hello\" > \"Hello World\""); // CE

        /*
         * Nesting relational operators directly is not allowed
         */
        // System.out.println("10 < 20 < 30 = " + (10 < 20 < 30)); // CE
    }
}
