/*
 * Functional Interface
 *
 * - The `Runnable` interface is a functional interface because it contains only one abstract method:
 *     → `public void run()`
 *
 * - Before Java 8:
 *     → We had to create a separate class (e.g., MyRunnable) implementing Runnable and override `run()`.
 *
 * - From Java 8 onwards:
 *     → We can use lambda expressions to directly define the `run()` method inline.
 *
 * - This makes thread creation more concise and readable.
 */

public class Main {
    public static void main(String[] args) {

        // Traditional way — using a class that implements Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        // Modern way — using Lambda Expression
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread running from Lambda Expression");
                try {
                    Thread.sleep(500); // Pause for 0.5 seconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

