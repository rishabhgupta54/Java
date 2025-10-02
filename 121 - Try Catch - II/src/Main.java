/*
 * Try Catch
 * - It is highly recommended to handle exceptions to prevent abnormal program termination.
 * - The code which may raise an exception is called risky code and should be placed inside the try block.
 * - The handling code must be placed inside the catch block.
 *
 * Execution Flow:
 * try {
 *     statement 1
 *     statement 2
 *     statement 3
 * } catch (Exception e) {
 *     statement 4
 * }
 * statement 5
 *
 * - If no exception occurs:
 *   Output → statement 1, statement 2, statement 3, statement 5 → Normal termination
 *
 * - If an exception occurs at statement 2 and the corresponding catch block matches:
 *   Output → statement 1, statement 4, statement 5 → Normal termination
 *
 * - If an exception occurs at statement 2 and no matching catch block is found:
 *   Output → statement 1 → Abnormal termination
 *
 * - If an exception occurs at statement 4 or statement 5:
 *   Output → Always abnormal termination
 *
 * Important Points:
 * - If an exception occurs inside the try block, the remaining statements inside try are skipped.
 * - Execution continues after the catch block (if the exception is handled).
 * - Therefore, the try block should contain only risky code, and its length should be minimal.
 * - Exceptions may also occur inside catch and finally blocks.
 * - If an exception occurs in a statement outside of try, it always results in abnormal termination.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Case 1: No Exception");
        noExceptionCase();

        System.out.println("\nCase 2: Exception Handled (ArithmeticException)");
        handledExceptionCase();

        System.out.println("\nCase 3: Exception Not Handled (ArrayIndexOutOfBoundsException)");
        unhandledExceptionCase();

        System.out.println("\nCase 4: Exception Inside Catch Block");
        exceptionInCatchCase();
    }

    // Case 1: No exception → Normal termination
    public static void noExceptionCase() {
        try {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
        } catch (Exception e) {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("Normal termination");
    }

    // Case 2: Exception handled → Normal termination
    public static void handledExceptionCase() {
        try {
            System.out.println("statement 1");
            System.out.println(10 / 0); // ArithmeticException
            System.out.println("statement 3"); // skipped
        } catch (ArithmeticException e) {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("Normal termination");
    }

    // Case 3: Exception not handled → Abnormal termination
    public static void unhandledExceptionCase() {
        try {
            System.out.println("statement 1");
            int[] arr = new int[2];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            System.out.println("statement 3"); // skipped
        } catch (ArithmeticException e) {
            System.out.println("statement 4"); // not executed (different type)
        }
        System.out.println("statement 5"); // not reached
        System.out.println("Normal termination"); // not reached
    }

    // Case 4: Exception inside catch block → Always abnormal termination
    public static void exceptionInCatchCase() {
        try {
            System.out.println("statement 1");
            System.out.println(10 / 0); // ArithmeticException
            System.out.println("statement 3"); // skipped
        } catch (ArithmeticException e) {
            System.out.println("statement 4");
            String str = null;
            System.out.println(str.length()); // NullPointerException inside catch
        }
        System.out.println("statement 5"); // not reached
        System.out.println("Normal termination"); // not reached
    }
}
