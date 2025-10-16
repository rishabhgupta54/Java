public class MyThread extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child Thread starts calculation...");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread completed calculation.");
            System.out.println("Child thread calling notify()...");
            this.notify(); // notify main thread
        }
    }
}
