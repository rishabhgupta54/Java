/*
 * Multithreading - Synchronized
 *
 * synchronized is a modifier applicable only for methods and blocks, but not for classes or variables.
 *
 * If multiple threads try to operate simultaneously on the same Java object,
 * there may be a chance of data inconsistency. To overcome this problem,
 * we should go for the synchronized keyword.
 *
 * If a method or block is declared as synchronized, then at a time only one thread
 * is allowed to execute that method or block on the given object — ensuring data consistency.
 *
 * Advantage:
 *     - Resolves data inconsistency problems.
 * Disadvantage:
 *     - Increases waiting time of threads, causing performance overhead.
 *     - Hence, avoid synchronization unless necessary.
 *
 * Internally, synchronization is implemented using a **lock**.
 * Every object in Java has a unique lock.
 *
 * Lock Mechanism:
 *   - A thread must acquire the lock of an object before executing its synchronized method.
 *   - Once method execution completes, the lock is automatically released.
 *   - Acquiring and releasing locks are managed internally by the JVM.
 *
 * While a thread is executing a synchronized method on a given object,
 * other threads are **not allowed** to execute any synchronized method simultaneously
 * on the same object. However, they **can execute non-synchronized methods**.
 *
 * Lock concept is implemented **based on objects**, not methods.
 *
 * If we do not declare the wish() method as synchronized → both threads execute simultaneously → irregular output.
 * If we declare the wish() method as synchronized → one thread executes at a time → regular output.
 *
 * Lock Lifecycle Visualization:
 *  -------------------------
 *  |      Object (Display)     |
 *  -------------------------
 *         ↓ Thread T1 requests lock
 *  -------------------------
 *  |   Lock Acquired by T1    |
 *  -------------------------
 *         ↓ executes wish()
 *  -------------------------
 *  |  Other Threads (T2...)   |
 *  -------------------------
 *         ↓ waiting for lock
 *  -------------------------
 *  |   Lock Released by T1    |
 *  -------------------------
 *         ↓ JVM assigns lock to T2
 *  -------------------------
 *  |   Next thread executes   |
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

