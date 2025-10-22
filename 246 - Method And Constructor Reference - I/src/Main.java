/*
 * Method and Constructor Reference
 *
 * - Your program demonstrates a method reference.
 * - `Main::runThread` is a reference to the static method `runThread` in the Main class.
 * - It is equivalent to the lambda: `() -> Main.runThread()`.
 * - The method reference is used wherever a functional interface matches the method signature.
 *   Here, Runnable’s run() method matches: `void run()`.
 *
 * - Using method references makes the code shorter and more readable.
 */

public class Main {
    public static void main(String[] args) {

        // Lambda expression
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread running from Lambda Expression");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // Method reference to static method
        Runnable runnable2 = Main::runThread; // This calls the static method runThread
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

    public static void runThread() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread running from Lambda Expression");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
