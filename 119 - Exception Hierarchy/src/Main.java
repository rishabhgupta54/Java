/*
 * Exception Hierarchy
 *
 * Throwable (Root class for all errors & exceptions)
 * ├── Error (Represents serious problems - non recoverable)
 * │     ├── OutOfMemoryError
 * │     ├── StackOverflowError
 * │     ├── VirtualMachineError
 * │     ├── AssertionError
 * │     └── InternalError
 * │
 * └── Exception (Represents conditions that can be handled - recoverable)
 *       ├── Checked Exceptions (Compiler checks these)
 *       │     ├── IOException
 *       │     │     ├── FileNotFoundException
 *       │     ├── SQLException
 *       │     ├── ClassNotFoundException
 *       │     ├── InterruptedException
 *       │     └── ParseException
 *       │
 *       └── Unchecked Exceptions (RuntimeException and its child classes)
 *             ├── NullPointerException
 *             ├── ArrayIndexOutOfBoundsException
 *             ├── ArithmeticException
 *             ├── NumberFormatException
 *             └── IllegalArgumentException
 *
 * Checked vs Unchecked
 * Checked Exception
 *    - Checked at compile time by compiler
 *    - Must be either handled using try-catch or declared using throws
 *    - Example: IOException, SQLException, ClassNotFoundException
 *
 * Unchecked Exception
 *    - Not checked at compile time (occur at runtime)
 *    - Example: NullPointerException, ArithmeticException
 *
 * Fully Checked Exception
 * - An exception is fully checked if ALL of its child classes are also checked exceptions.
 * - Example: IOException
 *   (All child classes like FileNotFoundException are also checked exceptions)
 *
 * Partially Checked Exception
 * - An exception is partially checked if SOME of its child classes are unchecked exceptions.
 * - Example: Exception class itself
 *   (It has both checked exceptions like IOException, SQLException
 *    and unchecked ones like RuntimeException as its child)
 */

public class Main {
    public static void main(String[] args) {

    }
}
