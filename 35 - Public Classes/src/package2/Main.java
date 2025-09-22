/*
 * Public Classes
 * - If a class is declared as public, it can be accessed
 *   from anywhere (any package).
 *
 * - If a class is not declared as public, then it has
 *   default (package-private) access.
 *   → In that case, it can only be accessed within the
 *     same package.
 *   → Trying to access it from another package will cause
 *     a compile-time error:
 *     "package1.A is not public in package1;
 *      cannot be accessed from outside package"
 */

package package2;

import package1.A;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
