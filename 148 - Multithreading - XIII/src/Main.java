/*
 * Multithreading
 * Two threads can communicate with each other by using:
 *      wait(), notify(), and notifyAll()
 *
 * → The thread which is expecting an update calls wait() and immediately enters
 *   the waiting state.
 * → The thread responsible for performing the update calls notify(), which wakes
 *   up one waiting thread so it can resume execution.
 *
 * Note:
 * - These methods are present in Object class (not in Thread class), because
 *   a thread can call them on any Java object.
 * - To call wait(), notify(), or notifyAll(), the thread must own the lock
 *   of that object (i.e., it must be inside a synchronized area).
 *   Otherwise, we get a RuntimeException: IllegalMonitorStateException.
 * - If a thread calls wait() on an object, it releases the lock and enters
 *   the waiting state.
 * - When notify() is called, the thread releases the lock of that object
 *   (but not immediately).
 * - Except for wait(), notify(), and notifyAll(), no other method releases
 *   the lock in Java.
 *
 * Method Signatures:
 * public final void wait() throws InterruptedException
 * public final native void wait(long timeoutMillis) throws InterruptedException
 * public final void wait(long timeoutMillis, int nanos) throws InterruptedException
 * public final native void notify()
 * public final native void notifyAll()
 *
 * Every wait() method throws InterruptedException (a checked exception),
 * hence it must be handled properly.
 *
 * Thread Lifecycle (with wait/notify):
 * -----------------------------------
 *  -------------------------
 *  |     New / Born      |
 *  -------------------------
 *        ↓  (Thread object created)
 *  -------------------------
 *  |  Ready / Runnable   |
 *  -------------------------
 *        ↓  (Thread got CPU)
 *  -------------------------
 *  |      Running        |
 *  -------------------------
 *        ↓  (wait() called → releases lock)
 *  -------------------------
 *  |    Waiting State    |
 *  -------------------------
 *        ↓  (notify() / notifyAll() called)
 *  -------------------------
 *  |  Ready / Runnable   |  ← Thread moved back to ready state
 *  -------------------------
 *        ↓  (Scheduler allocates CPU again)
 *  -------------------------
 *  |  Running (resumed)  |
 *  -------------------------
 *        ↓
 *  -------------------------
 *  |  Dead / Terminated  |
 *  -------------------------
 *        ↓  (After run() completes)
 *
 * notify() vs notifyAll():
 * - notify():
 *      Used to wake up only one waiting thread.
 *      If multiple threads are waiting, only one (chosen by JVM) will be notified.
 *      The remaining threads will continue to wait for further notifications.
 *
 * - notifyAll():
 *      Used to wake up all waiting threads on the same object.
 *      Even though multiple threads are notified, they execute one by one
 *      because only one thread can acquire the lock at a time.
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        synchronized (myThread) {
            System.out.println("Main thread trying to call wait() method...");
            try {
                myThread.wait(); // main thread enters waiting state
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main thread got notification.");
            System.out.println("Total calculated by child thread: " + myThread.total);
        }
    }
}

