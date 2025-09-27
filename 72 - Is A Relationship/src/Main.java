/*
 * Is-A Relationship (Inheritance)
 * - Also known as Inheritance.
 * - The main advantage of "Is-A" relationship is Code Reusability.
 * - Achieved using the `extends` keyword.
 *
 * Rules:
 * 1. Whatever methods the Parent has → automatically available to Child.
 *    → On Child reference, we can call both Parent + Child methods.
 *
 * 2. Whatever methods the Child has → not available to Parent.
 *    → On Parent reference, we CANNOT call child-specific methods.
 *
 * 3. Parent reference can hold a Child object,
 *    but using that reference we can call only Parent methods.
 *
 * 4. Child reference CANNOT hold a Parent object.
 *    → Compile-time error.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // valid → m1() is in A
        // a.m2(); // CE: cannot find symbol → m2() is not in A

        B b = new B();
        b.m1(); // valid → inherited from A
        b.m2(); // valid → defined in B

        A a1 = new B(); // parent reference → child object (Upcasting)
        a1.m1(); // valid → m1() is in A
        // a1.m2(); // CE: cannot find symbol → reference type is A, m2() not visible

        // B b1 = new A(); // CE: incompatible types → cannot convert from A to B
    }
}