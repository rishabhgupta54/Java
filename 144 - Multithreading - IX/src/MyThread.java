public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
        }

        System.out.println("Putting child thread to sleep");
        try {
            Thread.sleep(5000); // Interruptable sleep
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}