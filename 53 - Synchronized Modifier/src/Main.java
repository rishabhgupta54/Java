/*
 * Synchronized Modifier
 *
 * - 'synchronized' is applicable for methods and blocks, but NOT for classes and variables.
 *
 * - Problem:
 *   → If multiple threads operate simultaneously on the same object,
 *     it can cause data inconsistency (Race Condition).
 *
 * - Solution:
 *   → Use 'synchronized' so that only one thread at a time can execute
 *     the method or block on the same object.
 *
 * - Drawback:
 *   → Increases waiting time of threads (performance overhead).
 *   → Hence, use it only when necessary.
 *
 * - Note:
 *   → Synchronized methods must have implementation.
 *   → 'abstract synchronized' is an illegal modifier combination.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads incrementing the same counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
        // Without synchronized → unpredictable results (e.g., 1800, 1900, etc.)
        // With synchronized → always 2000
    }
}
