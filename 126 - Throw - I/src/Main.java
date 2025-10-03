/*
 * Throw
 * - Sometimes we can explicitly create an exception object and hand it over to the JVM manually.
 * - For this purpose, we use the throw keyword.
 *      throw new ArithmeticException("/ by zero");
 * - "throw" → transfers the programmer-created exception object to the JVM manually.
 * - "new ArithmeticException(...)" → explicitly creates the ArithmeticException object.
 * - The main advantage of the throw keyword is that it allows us to hand over our own exception object to the JVM manually.
 */
public class Main {
    public static void main(String[] args) {
        // withoutThrow(); // JVM creates and throws exception automatically
        withThrow(); // Programmer creates and throws exception manually
    }

    /*
     * In this case, the JVM is responsible for creating the exception object
     * and handing it over automatically.
     */
    public static void withoutThrow() {
        double a = 10 / 0; // JVM throws ArithmeticException
    }

    /*
     * In this case, the programmer explicitly creates the exception object
     * and hands it over to the JVM using throw.
     */
    public static void withThrow() {
        throw new ArithmeticException("Cannot divide number by Zero");
    }
}
