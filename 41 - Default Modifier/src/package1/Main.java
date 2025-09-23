/*
 * Default Modifier (Package-Level Access)
 * - If a member (method/variable) is not declared with any access modifier,
 *   then by default it is considered as "default".
 * - Default members are accessible only within the **same package**.
 * - Even if the class itself is public, its default members cannot be
 *   accessed from outside the package.
 *
 * Synonym:
 * - Default access is also called "Package-Level Access".
 *
 * Example:
 * - Class A (public) with method m1() (default)
 *   → Accessible only inside package2.
 *   → From package1 (different package) → Not accessible.
 */
package package1;

import package2.A;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // CE: m1() is not public in package2.A; cannot be accessed from outside package
    }
}
