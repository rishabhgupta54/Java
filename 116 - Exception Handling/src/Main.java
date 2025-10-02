/*
 * Exception Handling
 * - An exception is an unexpected event that disrupts the normal flow of a program.
 * - Handling exceptions ensures that the program can terminate gracefully instead of crashing.
 * - Exception handling does not fix the root cause; it provides an alternative way
 *   to continue program execution safely.
 * - try block: contains code that might throw an exception
 * - catch block: handles the exception and allows the program to continue
 */

public class Main {
    public static void main(String[] args) {
        int result = 0;

        try {
            // This will throw ArithmeticException (division by zero)
            result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            // Handles the exception and allows the program to continue
            System.out.println(result); // prints 0 since the operation failed
        }
    }
}
