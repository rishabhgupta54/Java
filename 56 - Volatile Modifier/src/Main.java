/*
 * Volatile Modifier
 * - volatile is applicable only for variables.
 * - It ensures **visibility** of changes made by one thread to other threads.
 * - When a variable is declared as volatile, the JVM ensures that every read/write of that variable goes directly to main memory.
 * - This prevents threads from using cached copies, reducing data inconsistency problems.
 * - Important: volatile **does not guarantee atomicity**, only visibility.
 * - Use volatile carefully; overuse may degrade performance.
 */

public class Main {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        // Thread 1: updates flag after 1 second
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                data.flag = true;
                System.out.println("Thread 1 updated flag to true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread 2: waits until flag becomes true
        new Thread(() -> {
            while (!data.flag) {
                // waiting for flag to become true
            }
            System.out.println("Thread 2 detected flag is true");
        }).start();
    }
}
