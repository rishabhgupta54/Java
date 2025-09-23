package package2;

import package1.A;

public class Main extends B {
    public static void main(String[] args) {

        // 1. Parent reference outside package
        A a1 = new A();
        // a1.m1(); // CE: m1() has protected access in package1.A
        // Reason: 'a1' is of type A (parent class), and we're outside package1.
        // Protected members cannot be accessed via parent references outside the package.

        // 2. Child reference of sibling class B
        B b1 = new B();
        // b1.m1(); // CE: m1() has protected access in package1.A
        // Reason: 'b1' is a B reference. Outside package1, B can access A's protected members
        // only within B itself or subclasses, not through a sibling reference.

        // 3. Child reference of current class
        Main main = new Main();
        main.m1();
        // Reason: 'main' is a reference of Main (subclass of A), allowed to access protected members outside package.

        // 4. Parent reference to a B object
        A a2 = new B();
        // a2.m1(); // CE: m1() has protected access in package1.A
        // Reason: Reference type is A (parent). Outside package, parent references cannot access protected members.

        // 5. Parent reference to a Main object
        A a3 = new Main();
        // a3.m1(); // CE: m1() has protected access in package1.A
        // Reason: Reference type is A (parent). Even though object is Main, protected member can't be accessed via parent reference outside package.

        // 6. Sibling child reference
        B b2 = new Main();
        // b2.m1(); // CE: m1() has protected access in package1.A
        // Reason: Reference type is B (sibling). Outside package, protected member can't be accessed via sibling reference.
    }
}
