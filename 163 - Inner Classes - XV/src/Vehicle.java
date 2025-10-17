interface Vehicle {
    void start();

    // Inner interface (nested interface)
    interface Engine {
        void run();
    }
}
