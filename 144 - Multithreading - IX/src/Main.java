/*
 * Multithreading
 * - Calling interrupt() signals a target thread to stop sleeping or waiting.
 * - If the target thread is not in a sleep or wait state, the interrupt has no immediate effect.
 *   It will only take effect if/when the thread enters sleep() or wait().
 * - If the thread never sleeps or waits, the interrupt call is effectively wasted.
 *
 * Thread Lifecycle with interrupt():
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
 *        ↓ --> Thread.sleep()/wait() called
 *        ↓ --> If interrupt() called ⟳ InterruptedException thrown
 *  -------------------------
 *  |  Dead / Terminated  |
 *  -------------------------
 *        ↓ --> After run() method completes
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Interrupt is called immediately; effect will happen if child thread sleeps/waits
        myThread.interrupt();

        System.out.println("End of main thread");
    }
}
