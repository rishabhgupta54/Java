/*
 * Multithreading
 * - The yield() method causes the current running thread to pause
 *   and give a chance to other waiting threads of the same or higher priority.
 * - If no other thread is ready or waiting, the same thread may continue execution.
 * - Execution order after yield() depends on the thread scheduler.
 *
 * Thread Lifecycle with yield():
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
 *        ↓ --> Thread.yield() called ⟳
 *  -------------------------
 *  |  Ready / Runnable   |  <-- Thread moved back to ready state
 *  -------------------------
 *        ↓ --> Scheduler allocates CPU again
 *  -------------------------
 *  |  Dead / Terminated  |
 *  -------------------------
 *        ↓ --> After run() method completes
 *
 * Example Flow:
 * - Child Thread prints a line, calls yield(), moves back to Ready/Runnable.
 * - Main Thread and Child Thread execute alternately depending on scheduler.
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Start child thread

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}