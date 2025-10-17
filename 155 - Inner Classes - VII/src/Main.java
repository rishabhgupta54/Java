/*
 * Inner Classes
 * Method Local Inner Class
 * A method local inner class is a class defined inside a method.
 * - Its scope is limited to the method where it is declared.
 * - Useful for defining functionality specific to a method.
 * - Cannot be accessed outside the method.
 *
 * Example Flow:
 * 1. Call m1() → method executes.
 * 2. Method defines Inner class locally.
 * 3. Create Inner object → Inner inner = new Inner();
 * 4. Call inner.sun(5, 10) → prints 15
 * 5. Call inner.sun(50, 100) → prints 150
 */

public class Main {
    public void m1() {
        // Method Local Inner Class
        class Inner {
            public void sun(int x, int y) {
                System.out.println(x + y); // prints sum of x and y
            }
        }

        Inner inner = new Inner(); // create object of method local in ner class
        inner.sun(5, 10); // prints 15
        inner.sun(50, 100); // prints 150
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
    }
}
