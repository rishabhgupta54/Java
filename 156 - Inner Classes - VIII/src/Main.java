/*
 * Inner Classes - Method Local Inner Class
 * Method local inner class can be declared inside both instance and static methods.
 *
 * Rules:
 * - If declared inside an instance method:
 *     → Can access both instance (non-static) and static members of the outer class.
 * - If declared inside a static method:
 *     → Can access only static members of the outer class.
 *
 * Example:
 * - Outer class has:
 *     int x = 10;     // instance member
 *     static int y=20; // static member
 * - Inner class declared inside instance method m1()
 *     → Can access both x and y directly
 */

public class Main {
    int x = 10;       // instance variable
    static int y = 20; // static variable

    public void m1() { // instance method
        // Method local inner class inside instance method
        class Inner {
            public void m2() {
                System.out.println(x); // prints 10 (instance member)
                System.out.println(y); // prints 20 (static member)
            }
        }
        Inner inner = new Inner(); // create inner object
        inner.m2(); // call method
    }

    public static void main(String[] args) {
        new Main().m1();
    }
}
