// Functional interface with one abstract method
@FunctionalInterface
interface A {
    void print();

    // Default method (optional)
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

    // Static method (optional)
    static void staticMethod() {
        System.out.println("This is a static method");
    }
}
