public class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}
