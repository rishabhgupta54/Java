class Counter {
    private int count = 0;

    // synchronized method → only one thread can increment at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}