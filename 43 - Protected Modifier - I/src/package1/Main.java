/*
 * Protected Modifier
 * If a member is declared as protected, then:
 * - It can be accessed anywhere within the same package, using either a parent reference or a child reference.
 * - In an outside package, it can only be accessed within child classes, and only through a child reference.
 *   (A parent reference cannot be used to access protected members outside the package.)
 */
package package1;

public class Main extends A {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1(); // Valid: same package (can use parent reference)

        Main main = new Main();
        main.m1(); // Valid: same package (can use child reference)

        A a2 = new Main();
        a2.m1(); // Valid: same package (can use parent reference pointing to child object)
    }
}
