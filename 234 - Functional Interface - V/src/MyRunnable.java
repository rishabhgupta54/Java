// Traditional implementation of Runnable
public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread running from MyRunnable class");
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
