public class Display {
    // Static synchronized → needs class-level lock
    public static synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning: " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Normal static → does not need lock
    public static void greet(String name) {
        System.out.println("Hello " + name + " (normal static method)");
    }

    // Instance synchronized → needs object lock
    public synchronized void sayHi(String name) {
        System.out.println("Hi " + name + " (instance synchronized method)");
    }
}
