/*
 * Multithreading
 * - If a thread wants to wait until another thread completes, we can use the join() method.
 * - Example: If thread1 wants to wait until thread2 finishes, thread1 calls thread2.join().
 * - When join() is called:
 *   - thread1 immediately enters the waiting/blocked state until thread2 completes.
 *   - After thread2 finishes, thread1 resumes execution.
 *
 * Thread Lifecycle with join():
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
 *        ↓ --> Thread.join() called ⟳ waiting/blocked for joining
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

        try {
            myThread.join(); // Main thread waits for child thread to complete
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}