/*
 * Default and Static Methods
 *
 * - Until Java 7:
 *     → All methods in an interface were implicitly public and abstract:
 *         void m1();
 *         public void m1();
 *         abstract void m1();
 *         public abstract void m1();
 *
 * - From Java 8 onwards:
 *     → Interfaces can also have:
 *         - default methods (a.k.a. virtual extension or defender methods)
 *         - static methods
 *
 * - From Java 9 onwards:
 *     → private methods are also allowed in interfaces.
 *
 * Default Methods:
 * - Provide a method implementation directly inside the interface.
 * - Do not require implementing classes to override them.
 * - If an implementation class wants, it can override the default method.
 * - Only applicable inside interfaces (not classes).
 * - Cannot override methods from Object class as default.
 */

public class Main {
    public static void main(String[] args) {

        I obj1 = new A();
        obj1.m3(); // Calls default method from interface

        I obj2 = new C();
        obj2.m3(); // Calls overridden default method
    }
}

