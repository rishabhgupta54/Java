/*
 * Inner Classes
 * Anonymous Inner Class (implements an interface)
 *
 * An anonymous inner class is a class without a name.
 * It is typically used when we need to provide a short implementation
 * of an interface or extend a class only once (one-time use).
 *
 * In this example:
 * - Runnable is a functional interface that contains a single method: run().
 * - We are creating an anonymous inner class that implements Runnable
 *   and provides its own implementation of the run() method.
 * - We then pass this object to a Thread constructor.
 *
 * Execution flow:
 * 1. An anonymous inner class implements Runnable and overrides run().
 * 2. A Thread is created using that Runnable object.
 * 3. When start() is called, a new thread begins execution and runs run().
 * 4. The main thread continues executing simultaneously.
 */

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
