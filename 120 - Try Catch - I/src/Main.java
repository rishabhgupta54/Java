/*
 * Try Catch
 * - It is highly recommended to handle exceptions to avoid abnormal termination of the program.
 * - The code which may raise an exception is called risky code.
 * - Risky code must be placed inside the try block.
 * - The corresponding handling code should be placed inside the catch block.
 */

public class Main {
    public static void main(String[] args) {
        withTryCatchBlock();
        withoutTryCatchBlock();
    }

    public static void withTryCatchBlock() {
        try {
            System.out.println("Trying to divide 10/0");
            System.out.println(10 / 0); // risky code
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Unable to divide 10/0"); // handling code
        }
    }

    public static void withoutTryCatchBlock() {
        // No exception handling, JVM default handler will terminate program abnormally
        System.out.println(10 / 0);
    }
}
