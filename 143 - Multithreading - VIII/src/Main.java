/*
 * Multithreading
 * If a thread don't want to perform any operations for a particular amount of time then we should go for sleep method
 * public static native void sleep(long millis) throws InterruptedException;
 * public static void sleep(long millis, int nanos) throws InterruptedException
 *
 * Thread Lifecycle with sleep():
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
 *        ↓ --> Thread.sleep() called ⟳
 *  -------------------------
 *  |  Ready / Runnable   |  <-- Thread moved back to ready state
 *  -------------------------
 *        ↓ --> Scheduler allocates CPU again
 *  -------------------------
 *  |  Dead / Terminated  |
 *  -------------------------
 *        ↓ --> After run() method completes
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
