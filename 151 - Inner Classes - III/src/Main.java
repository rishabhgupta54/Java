/*
 * Inner Classes
 * Accessing Inner Class from Instance Area
 * - Since `m2()` is a non-static (instance) method, it already has access
 *   to the current `Main` object (this).
 * - Hence, we can directly create an object of the inner class
 *   using `new Inner()` (no need for `outer.new Inner()`).
 *
 * Syntax:
 *   Inner inner = new Inner();
 *   inner.m1();
 *
 * Flow Diagram:
 *  -----------------------
 *  |      Main (Outer)   |
 *  |----------------------|
 *  |   + new Inner() -->  |
 *  |   | Inner Object     |
 *  |   | .m1() called     |
 *  -----------------------
 *         ↓
 *  "Inner class method"
 */

public class Main {
    public class Inner {
        public void m1() {
            System.out.println("Inner class method");
        }
    }

    // Instance area → has implicit reference to 'this' (outer object)
    public void m2() {
        Inner inner = new Inner(); // Directly create inner object
        inner.m1(); // Access inner method
    }

    public static void main(String[] args) {
        Main main = new Main(); // Create outer object
        main.m2(); // Call instance method that accesses inner class
    }
}
