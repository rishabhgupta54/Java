/*
 * Functional Interface
 *
 * - Runnable is a Functional Interface because it has exactly one abstract method:
 *       → void run();
 *
 * - Before Java 8:
 *       → We used to create threads using either:
 *           a) A class implementing Runnable, OR
 *           b) An Anonymous Inner Class.
 *
 * - From Java 8 onwards:
 *       → We can create threads using Lambda Expressions because Runnable
 *         is a Functional Interface (Single Abstract Method).
 *
 * - Both ways produce the same result, but lambda expressions make code
 *   more concise, readable, and expressive.
 */

public class Main {
    public static void main(String[] args) {
        // Using Anonymous Inner Class (Old Way)
        Runnable runnable1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread running from Anonymous Class");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();


        // Using Lambda Expression (New Way - Java 8+)
        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread running from Lambda Expression");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
