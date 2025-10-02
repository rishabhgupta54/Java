/*
 * Try Catch
 * - The Throwable class defines the following methods to print exception information:
 *      1. printStackTrace()
 *         - Prints the name of the exception, description, and the complete stack trace.
 *      2. toString()
 *         - Prints the name of the exception and its description.
 *      3. getMessage()
 *         - Prints only the description of the exception.
 * - Internally, the JVM’s default exception handler uses printStackTrace() to display exception details on the console.
 */

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0); // risky code
        } catch (Exception exception) {
            exception.printStackTrace(); // Name + Description + Stack Trace
            System.out.println(exception.toString()); // Same as System.out.println(exception);
            System.out.println(exception.getMessage()); // Only description
        }
    }
}
