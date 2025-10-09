public  class MyThread extends Thread {
    Display display;
    String name;

    MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}
