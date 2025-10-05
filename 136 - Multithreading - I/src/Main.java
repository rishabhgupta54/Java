/*
 * Multithreading
 * Executing several tasks simultaneously is known as multithreading.
 *
 * Types of Multithreading:
 * 1. Process-based Multithreading
 *    → Executing multiple tasks simultaneously where each task is a separate independent program.
 *
 * 2. Thread-based Multithreading
 *    → Executing multiple tasks simultaneously where each task is a separate independent part of the same program.
 *
 * Ways to Define a Thread:
 * - By extending the Thread class.
 * - By implementing the Runnable interface.
 *
 * Thread Scheduler:
 * - Part of the JVM responsible for scheduling threads.
 * - Determines which thread gets CPU time when multiple threads are waiting.
 * - The scheduling algorithm is JVM-dependent, so execution order and output are not guaranteed.
 *
 * Difference between start() and run():
 * - thread.start():
 *     → Creates a new thread.
 *     → The new thread executes the run() method.
 * - thread.run():
 *     → Does not create a new thread.
 *     → run() executes like a normal method in the main thread.
 *
 * Importance of Thread class start() method:
 * - The start() method performs the following:
 *     1. Registers the thread with the Thread Scheduler.
 *     2. Performs other mandatory setup.
 *     3. Invokes the run() method.
 *
 * Overloading and Overriding:
 * - Overloading run() is possible, but start() always calls the no-argument run().
 * - If run() is not overridden, Thread class’s empty run() executes (no output).
 * - If start() is overridden, it behaves like a normal method (no new thread).
 *
 * Restarting a Thread:
 * - Once a thread has been started, restarting it will cause a RuntimeException (IllegalThreadStateException).
 *
 * Thread Lifecycle
 *  -------------------------
 *  |     New / Born      |
 *  -------------------------
 *        ↓ --> Thread object created
 *  -------------------------
 *  |  Ready / Runnable   |
 *  -------------------------
 *        ↓ --> start() called, thread registered with scheduler
 *  -------------------------
 *  |      Running        |
 *  -------------------------
 *        ↓ --> Scheduler allocates CPU, run() method executes
 *  -------------------------
 *  |  Dead / Terminated  |
 *  -------------------------
 *        ↓ --> After run() method completes
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // Thread initialization
        // Till this line, only the main thread exists.
        myThread.start(); // Starting the new thread

        // Once myThread.start() executes, now we have two threads:
        // 1. Main thread
        // 2. MyThread (child thread)
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread");
        }
    }
}
