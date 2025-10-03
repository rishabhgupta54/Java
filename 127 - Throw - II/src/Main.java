/*
 * Throw
 * - When we use "throw e", the reference variable "e" must point to a valid exception object.
 * - If "e" refers to null, then we will get a NullPointerException at runtime.
 */
public class Main {
    // Example with a valid exception object
    static ArithmeticException arithmeticException = new ArithmeticException("Manually created exception");

    public static void main(String[] args) {
        throw arithmeticException;
    }
}
