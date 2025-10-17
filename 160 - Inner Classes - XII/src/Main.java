/*
 * Inner Classes
 * Anonymous Inner Class Defined Inside Arguments
 *
 * An anonymous inner class is a class without a name.
 * It is used when we need a one-time implementation of a class or interface.
 *
 * In this example:
 * - Runnable is an interface that defines the run() method.
 * - Instead of creating a separate class that implements Runnable,
 *   we directly define an anonymous inner class as an argument
 *   to the Thread constructor.
 *
 * This approach is concise — useful when we don’t need to reuse the class.
 *
 * Execution Flow:
 * 1. The anonymous inner class implementing Runnable is defined inline.
 * 2. Its object is passed directly to the Thread constructor.
 * 3. Calling start() begins execution of the child thread.
 * 4. Both main and child threads run concurrently.
 */

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        }).start();

        // Main thread continues simultaneously
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
