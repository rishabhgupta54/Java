/*
 * Inner Classes
 * Accessing Outer Class Members
 * Within an inner class:
 * - `this` refers to the current inner class object.
 * - To refer to the current outer class object, use: OuterClassName.this
 *
 * Object Reference Flow:
 * ----------------------
 *  ----------------------------
 *  |        Outer (x=10)      |
 *  |---------------------------|
 *  |  new Inner() → creates   |
 *  |     -------------------  |
 *  |     |  Inner (x=100)   | |
 *  |     |  m1(): uses      | |
 *  |     |  this → Inner    | |
 *  |     |  Outer.this → Outer|
 *  |     -------------------  |
 *  ----------------------------
 */

public class Main {
    int x = 10;

    class Inner {
        int x = 100;

        public void m1() {
            int x = 1000;
            System.out.println("Local variable: " + x);
            System.out.println("Inner class variable (this.x): " + this.x);
            System.out.println("Inner class variable (Inner.this.x): " + Inner.this.x);
            System.out.println("Outer class variable (Main.this.x): " + Main.this.x);
        }
    }

    public static void main(String[] args) {
        new Main().new Inner().m1();
    }
}
