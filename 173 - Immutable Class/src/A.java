public final class A { // class should be final to prevent subclassing
    private final int i; // field should be final

    A(int i) {
        this.i = i;
    }

    public A modify(int i) {
        if (this.i == i) {
            return this; // reuse existing object if no change
        }
        return new A(i); // create new object if content changes
    }

    public int getValue() {
        return i;
    }
}
