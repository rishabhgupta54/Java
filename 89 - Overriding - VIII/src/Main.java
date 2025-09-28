/*
 * Overriding
 *
 * Parent method: m1(int x)
 * Child method:  m1(int... x)
 *
 * Key points:
 * - Varargs (int...) is internally treated as int[].
 * - For overriding, method signature must match exactly.
 * - Here, m1(int) ≠ m1(int[]) → so this is overloading, not overriding.
 * - Overloaded method resolution is done at compile-time based on reference type.
 * - Important: We can override varargs methods with another varargs method,
 *   but we cannot override a normal (non-varargs) method with a varargs method,
 *   or vice versa. That would result in overloading instead of overriding.
 */

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(10); // calls Parent.m1(int)

        Child child = new Child();
        child.m1(10); // calls Child.m1(int...) → single-element array

        Parent parentChild = new Child();
        parentChild.m1(10); // calls Parent.m1(int) because reference type is Parent
    }
}

