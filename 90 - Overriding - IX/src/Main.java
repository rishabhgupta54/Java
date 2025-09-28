/*
 * Overriding
 * Key points:
 * - Unlike methods, variables are NOT polymorphic in Java.
 * - Variable resolution is always done at **compile-time** based on the reference type.
 * - It doesn’t matter whether the variable is static or non-static.
 * - Overloading/Overriding concepts are applicable only for methods, not for variables.
 */

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.x); // prints 888 → Parent reference, Parent variable

        Child child = new Child();
        System.out.println(child.x); // prints 999 → Child reference, Child variable

        Parent parentChild = new Child();
        System.out.println(parentChild.x); // prints 888 → Reference type is Parent, so Parent variable is accessed
    }
}

