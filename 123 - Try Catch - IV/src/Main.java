/*
 * Try Catch
 * - The way of handling an exception can vary depending on the type of exception.
 * - For this reason, it is highly recommended to provide a separate catch block for each specific exception type.
 * - Java allows multiple catch blocks for a single try block, and this practice is both possible and recommended.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Order of catch blocks is very important.
         * - Always place child exception types first and parent types later.
         * - Otherwise, the compiler will throw an error:
         *   "exception <exception> has already been caught"
         */
        /*
        try {

        } catch (ArithmeticException arithmeticException) {

        } catch (Exception exception) {

        }
        */

        /*
         * Declaring two catch blocks for the same exception type is not allowed.
         * - This will result in a compile-time error:
         *   "exception <exception> has already been caught"
         */
        /*
        try {

        } catch (ArithmeticException arithmeticException) {

        } catch (ArithmeticException arithmeticException) {

        }
        */
    }
}
