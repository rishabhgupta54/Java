/*
 * Overriding
 *
 * - If child class method throws any checked exception:
 *      → Parent class method must throw the same checked exception
 *        or its parent type.
 *      → Otherwise, Compile-Time Error (CE).
 *
 * - For unchecked exceptions (RuntimeException and its subclasses):
 *      → No restrictions.
 */

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        try {
            parent.m1();
            child.m1();
            parent.m2();
            child.m2();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}

