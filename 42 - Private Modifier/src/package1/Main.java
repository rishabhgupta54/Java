/*
 * Private Modifier
 * If a member is declared as private, then it can be accessed only within that class.
 * From outside the class, it cannot be accessed.
 *
 * Abstract methods must be available to child classes for implementation,
 * but private methods are not visible to child classes.
 * Hence, the combination of private and abstract is illegal for methods.
 */
package package1;

import package2.A;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // CE: m1() has private access in package2.A; cannot be accessed from outside class
    }
}
