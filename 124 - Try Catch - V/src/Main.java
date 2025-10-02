/*
 * Try Catch
 * - The finally block is always associated with try-catch to maintain clean-up code.
 * - The specialty of the finally block is that it will always execute,
 *   irrespective of whether an exception is raised or not, and whether it is handled or not.
 */
public class Main {
    public static void main(String[] args) {
        // Case 1: No exception occurs
        try {
            System.out.println("Inside try block (no exception)");
        } catch (ArithmeticException e) {
            System.out.println("This catch block will not execute");
        } finally {
            System.out.println("Finally block executed (Case 1)");
        }

        System.out.println();

        // Case 2: Exception occurs and is handled
        try {
            System.out.println("Trying risky code: 10/0");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (Case 2)");
        }

        System.out.println();

        // Case 3: Exception occurs and is not handled
        try {
            System.out.println("Trying risky code: Array out of bounds");
            int[] arr = new int[2];
            System.out.println(arr[5]); // will throw exception
        } finally {
            System.out.println("Finally block executed (Case 3)");
        }
    }
}
