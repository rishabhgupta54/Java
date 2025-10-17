/*
 * Inner Classes
 * Method Local Inner Class and Local Variables
 * From a method local inner class, we **cannot directly access local variables** of the method.
 * The exception is if the local variable is **final** (or effectively final in Java 8+), then it can be accessed.
 *
 * Example:
 * - Local variable x = 10 is effectively final here (not modified after initialization)
 * - Inner class can access it safely
 */

public class Main {
    public void m1() {
        int x = 10; // effectively final variable
        class Inner {
            public void m2() {
                System.out.println(x); // prints 10
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }

    public static void main(String[] args) {
        new Main().m1(); // prints 10
    }
}
