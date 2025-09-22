/*
 * Default Classes (Package-Private)
 * - If a class is declared without any modifier, it has
 *   default (package-private) access.
 * - Such a class can be accessed only within the same package.
 * - Trying to access it from a different package will cause
 *   a compile-time error:
 *   "package1.A is not public in package1;
 *    cannot be accessed from outside package"
 *
 * - This is also called package-level access.
 */

package package2;

import package1.A; // CE: class A is default in package1, cannot be accessed outside package

public class Main {
    public static void main(String[] args) {
        A a = new A(); // Compile-time error
        a.m1();
    }
}
