/*
 * Multithreading
 * - The default priority of the main thread is 5.
 * - For all other threads, the default priority is inherited from the parent thread.
 *   That is, a child thread inherits the priority of the thread that created it.
 *
 * Notes:
 * - Changing the parent thread’s priority before creating a child thread
 *   affects the child’s initial priority.
 * - Execution order still depends on the thread scheduler.
 */

public class Main {
    public static void main(String[] args) {
        // Main thread default priority
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        // Change main thread priority
        Thread.currentThread().setPriority(8);
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        // Create child thread
        MyThread myThread = new MyThread();
        System.out.println("MyThread priority: " + myThread.getPriority());
    }
}