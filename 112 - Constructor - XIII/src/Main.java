import java.io.IOException;

/*
 * Constructor
 * - If the parent class constructor throws any checked exception,
 *   then it is COMPULSORY for the child class constructor to either:
 *      1. Declare the SAME exception, OR
 *      2. Declare its PARENT exception.
 *
 * - Otherwise, the code will not compile.
 *
 * Why?
 * - Because every child constructor by default calls **super()** as the first line,
 *   and that may throw a checked exception. Hence the child constructor must
 *   handle or declare it.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Child child = new Child();
    }
}
