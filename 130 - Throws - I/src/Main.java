/*
 * Throws
 * - In our program, if there is a possibility of a checked exception being raised,
 *   we must handle it; otherwise, the compiler will throw an error:
 *   "unreported exception <ExceptionName>; must be caught or declared to be thrown".
 * - We can handle this compile-time error in two ways:
 *     1. Using a try-catch block
 *     2. Using the throws keyword
 * - The throws keyword is used to delegate the responsibility of exception handling
 *   to the caller method (which could be another method or the JVM).
 * - The throws keyword is required only for checked exceptions.
 *   Using it with unchecked exceptions has no effect.
 * - The throws keyword exists only to satisfy the compiler; it does not prevent
 *   abnormal termination of the program.
 */
public class Main {

    /*
     * Using try-catch block
     */
    /*
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }
    }
    */

    /*
     * Using throws keyword
     * - Here, the responsibility of handling InterruptedException is passed to the JVM.
     */
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
    }
}
