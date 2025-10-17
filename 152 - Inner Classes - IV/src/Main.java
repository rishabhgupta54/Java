/*
 * Inner Classes
 * Accessing Inner Class from Outside the Outer Class
 * To access an inner class from outside its outer class:
 *
 * Syntax:
 *   Outer outer = new Outer();
 *   Outer.Inner inner = outer.new Inner();
 *   inner.m1();
 *
 * Explanation:
 * - Inner classes are always associated with an instance of the outer class.
 * - Hence, to create an Inner object, we first need an Outer object.
 * - Using the Outer object, we create the Inner object with:
 *      outer.new Inner();
 *
 * Flow Diagram:
 *  --------------------------
 *  |        Outer           |
 *  |-------------------------|
 *  | + new Inner()          |
 *  |       ↓                |
 *  |   -------------------  |
 *  |   |     Inner        | |
 *  |   |  m1() → prints   | |
 *  |   |  "Inner class..."| |
 *  |   -------------------  |
 *  --------------------------
 */

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(); // Step 1: Create Outer object
        Outer.Inner inner = outer.new Inner(); // Step 2: Create Inner object using outer
        inner.m1(); // Step 3: Call Inner method
    }
}

class Outer {
    public class Inner {
        public void m1() {
            System.out.println("Inner class method");
        }
    }
}
