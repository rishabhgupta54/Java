/*
 * Throws
 * - It is generally recommended to use try-catch blocks instead of the throws keyword.
 * - Using try-catch allows us to handle exceptions at the same place where they occur,
 *   ensuring better control and preventing abnormal termination.
 * - Using throws simply delegates the responsibility to the caller,
 *   which may lead to unhandled exceptions if not managed properly.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        m1(); // Exception responsibility passed to main()
    }

    public static void m1() throws InterruptedException {
        m2(); // Exception responsibility passed to m1()
    }

    public static void m2() throws InterruptedException {
        Thread.sleep(5000); // Checked exception (InterruptedException)
    }
}
