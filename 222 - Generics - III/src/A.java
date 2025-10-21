/*
 * Generic Class Definition
 * ------------------------
 * T is a type parameter.
 */
public class A<T> {
    private T t;

    // Constructor
    A(T t) {
        this.t = t;
    }

    // Method to show type info at runtime
    public void show() {
        System.out.println("Type of object: " + t.getClass().getName());
    }

    // Getter method
    public T getT() {
        return this.t;
    }
}
