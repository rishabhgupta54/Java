/*
 * Multithreading
 * We can define a thread by implementing the Runnable interface.
 *
 * Runnable interface is present in java.lang package,
 * and it contains only one method:
 *     public void run();
 *
 * Flow:
 * 1. Create MyRunnable object.
 * 2. Pass it to Thread constructor.
 * 3. Call start() → Thread internally calls run() of MyRunnable.
 *
 * Class Relationship
 *  +--------------------+
 *  |     Runnable       |  <-- Interface
 *  +--------------------+
 *           ▲
 *           | implements
 *           |
 *  +--------------------+
 *  |    MyRunnable      |  <-- User-defined class
 *  +--------------------+
 *           │
 *           | used as target by
 *           ▼
 *  +--------------------+
 *  |      Thread        |  <-- Executes run() of MyRunnable
 *  +--------------------+
 *
 * Recommendation:
 * Implementing Runnable is preferred over extending Thread
 * because implementing Runnable allows inheritance from other classes,
 * whereas extending Thread prevents it.
 */

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}