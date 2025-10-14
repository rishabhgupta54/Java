/*
 * Multithreading
 *
 * In a very few lines of code where synchronization is required, it is not recommended
 * to declare the entire method as synchronized. Instead, we can enclose only those
 * few lines inside a synchronized block.
 *
 * The main advantage of a synchronized block over a synchronized method is that it
 * reduces the waiting time of threads and improves the performance of the system.
 *
 * We can declare synchronized block as follows:
 *
 * 1. To get the lock of the current object:
 *      synchronized (this) {
 *          // critical section
 *      }
 *    -> Thread must acquire the lock of the current object.
 *
 * 2. To get the lock of a particular object b:
 *      synchronized (b) {
 *          // critical section
 *      }
 *    -> Thread must acquire the lock of object 'b'.
 *
 * 3. To get the class level lock:
 *      synchronized (Display.class) {
 *          // critical section
 *      }
 *    -> Thread must acquire the lock of Display class.
 *
 * Lock concept is applicable for object types and class types but not for
 * primitive types. Hence, we cannot pass primitive types as arguments to
 * synchronized blocks, otherwise we will get a compile time error.
 *
 *
 * Lock Flow:
 *  ---------------------
 *  |   Thread Starts   |
 *  ---------------------
 *           |
 *           v
 *  -------------------------
 *  |  Try to Acquire Lock  |
 *  -------------------------
 *           |
 *     (Lock Acquired?)
 *         /     \
 *       Yes      No
 *       |         |
 *       v         v
 *  -------------------------          --------------------------
 *  |  Execute Critical Code |   <--   |   Wait Until Lock Free  |
 *  -------------------------          --------------------------
 *           |
 *           v
 *  -------------------------
 *  |   Release the Lock    |
 *  -------------------------
 *           |
 *           v
 *  -------------------------
 *  | Continue Execution... |
 *  -------------------------
 */

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread myThread1 = new MyThread(display, "Alex");
        MyThread myThread2 = new MyThread(display, "Kara");
        myThread1.start();
        myThread2.start();
    }
}

