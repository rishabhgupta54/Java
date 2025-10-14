/*
 * Multithreading
 *
 * Every class in Java has a unique lock — called the Class Level Lock.
 *
 * If a thread wants to execute a static synchronized method, it must acquire
 * the class-level lock of that class.
 *
 * Once a thread acquires the class-level lock, it is allowed to execute
 * any static synchronized method of that class.
 *
 * After method execution completes, the thread automatically releases the lock.
 *
 * While one thread is executing a static synchronized method,
 * the remaining threads are not allowed to execute *any* other
 * static synchronized method of that class simultaneously.
 *
 * However, remaining threads can still execute:
 *  - Normal static methods
 *  - Synchronized instance methods
 *  - Normal instance methods
 *
 * Remember:
 *   - Object-level lock → for synchronized instance methods
 *   - Class-level lock → for static synchronized methods
 *
 * Class-Level Lock Visualization:
 *  -------------------------------
 *  |          Class: Display       |
 *  -------------------------------
 *         ↓ Thread T1 requests class-level lock
 *  -------------------------------
 *  |   Lock Acquired by Thread T1  |
 *  -------------------------------
 *         ↓ Executes static synchronized wish()
 *  -------------------------------
 *  |   Other Threads (T2...)       |
 *  -------------------------------
 *         ↓ Waiting for lock
 *  -------------------------------
 *  |   Lock Released by Thread T1  |
 *  -------------------------------
 *         ↓ JVM gives lock to T2
 *  -------------------------------
 *  |   Next thread executes wish() |
 *  -------------------------------
 */

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Alex");
        MyThread t2 = new MyThread("Kara");

        t1.start();
        t2.start();
    }
}

