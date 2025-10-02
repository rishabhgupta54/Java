/*
 * Default Exception Handling
 * - When an exception occurs, the method where it occurs creates an exception object
 *   and hands it over to the JVM.
 * - JVM checks the current method for exception handling:
 *      - If none, the method is terminated abnormally and its stack frame is removed.
 *      - JVM then checks the caller method and repeats the process until main().
 * - If main() also does not handle it, JVM invokes the default exception handler, prints the exception, and terminates the program.
 *
 * Example: main() -> m1() -> m2() (ArithmeticException in m2)
 *
 * Stack execution flow during exception propagation:
 *
 * Step 1: JVM thread created, stack empty
 * | empty |
 *
 * Step 2: main() is called
 * | main() |
 *
 * Step 3: m1() is called from main()
 * | m1()   |
 * | main() |
 *
 * Step 4: m2() is called from m1()
 * | m2()   |
 * | m1()   |
 * | main() |
 *
 * Step 5: Exception occurs in m2()
 * - m2() has no handling code → m2() terminated, frame removed
 * | m1()   |
 * | main() |
 *
 * Step 6: m1() has no handling code → m1() terminated, frame removed
 * | main() |
 *
 * Step 7: main() has no handling code → main() terminated, frame removed
 * | empty |  // JVM default exception handler takes over and prints stack trace
 *
 * Stack trace printed by JVM:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *      at Main.m2(Main.java:21)
 *      at Main.m1(Main.java:17)
 *      at Main.main(Main.java:13)
 *
 * - Each line of the stack trace corresponds to a stack frame that existed during the exception.
 */
public class Main {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        System.out.println(10 / 0); // ArithmeticException occurs here
    }
}
