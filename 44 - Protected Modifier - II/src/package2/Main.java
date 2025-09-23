/*
 * Protected Modifier
 * In a different (outside) package → can only be accessed inside a child class,
 * and only through the child reference (not the parent reference).
 */
package package2;

import package1.A;

public class Main extends A {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1(); // CE: m1() has protected access in package1.A (parent reference in outside package is not allowed)

        Main main = new Main();
        main.m1(); // Allowed: child reference inside child class (outside package)

        A a2 = new Main();
        a2.m1(); // CE: m1() has protected access in package1.A (parent reference in outside package is not allowed)
    }
}
