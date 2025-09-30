/*
 * Polymorphism
 * Meaning: "One name, multiple forms"
 *
 * Types:
 * 1. Compile-time polymorphism → Method Overloading
 *    - Same method name, but different parameter lists.
 *
 * 2. Runtime polymorphism → Method Overriding
 *    - Same method signature, but different implementations in Parent and Child.
 *
 * Key Rule:
 * - A Parent class reference can hold a Child object (upcasting).
 * - But using the Parent reference, we can only call methods that are declared in Parent.
 *   (Compile-time checking depends on reference type, NOT the object type.)
 *
 * - A Child class reference can access both Parent methods (inherited)
 *   and Child-specific methods.
 */

public class Main {
    public static void main(String[] args) {
        // Case 1: Parent reference → Parent object
        Parent parent = new Parent();
        parent.m1(); // Allowed → "Parent class method"
        // parent.m2(); // CE: m2() is not defined in Parent

        // Case 2: Child reference → Child object
        Child child = new Child();
        child.m1(); // Allowed → Inherited from Parent
        child.m2(); // Allowed → Child-specific method

        // Case 3: Parent reference → Child object (Polymorphism)
        Parent parentChild = new Child();
        parentChild.m1(); // Allowed → Method available in Parent (runtime call resolves to Parent's m1)
        // parentChild.m2(); // CE: m2() is not defined in Parent
    }
}

