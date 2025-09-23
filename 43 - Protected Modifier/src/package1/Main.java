/*
 * Protected Modifier
 * If a member is declared as protected, then:
 * - It can be accessed anywhere within the same package.
 * - From outside the package, it can only be accessed through child classes (inheritance).
 */
package package1;

import package2.A;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // CE: m1() has protected access in package2.A; cannot be accessed directly
    }
}