public class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        Display.wish(name); // uses class-level lock
    }
}
