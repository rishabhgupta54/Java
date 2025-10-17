/*
 * Inner Classes
 * Accessing Inner Class from Static Area
 * - We cannot directly create an object of a non-static inner class inside a static area (like main()).
 * - To access it, we must first create an object of the Outer class.
 * - Using that Outer class object, we can create an Inner class object.
 *
 * Syntax:
 *   Outer outer = new Outer();
 *   Outer.Inner inner = outer.new Inner();
 *
 * Object Creation Flow:
 *  +-------------------+       creates       +-------------------+
 *  |      Main         | ------------------> |       Inner       |
 *  +-------------------+       (HAS-A)       +-------------------+
 *          ↑
 *          | (Outer object must exist first)
 *          |
 *        new Main()
 */

public class Main {
    public class Inner {
        public void m1() {
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
        // Create outer class object
        Main main = new Main();

        // Use outer object to create inner class object
        Main.Inner inner = main.new Inner();

        // Call inner class method
        inner.m1();
    }
}
