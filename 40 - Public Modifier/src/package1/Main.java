/*
 * Public Modifier
 *   (any class, any package).
 * - BUT → The containing class itself must also be visible.
 *   i.e. Before checking method visibility, compiler first checks the class visibility.
 *
 * Example:
 * --------
 * - Class A (public) → method m1() (public) → Accessible from everywhere.
 * - Class B (public) → method m1() (default) → Not accessible outside its package.
 *
 * Note:
 * - Class visibility + Method visibility = Access allowed.
 * - Even if the method is public, if the class is not public, you cannot access it outside the package.
 */
package package1;

import package2.A;
import package3.B;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // Accessible → Class A is public, method m1() is public
        B b = new B();
        // b.m1(); // CE: m1() is not public in package3.B; cannot be accessed from outside package
    }
}
