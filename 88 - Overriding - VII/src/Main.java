/*
 * Overriding
 *
 * - We CANNOT override a static method as a non-static method
 *   → Compile-Time Error.
 *
 * - We CANNOT override a non-static method as a static method
 *   → Compile-Time Error.
 *
 * - If both parent and child methods are static, then it's NOT overriding.
 *   It's called **Method Hiding**.
 *
 *   In Method Hiding:
 *   - Method resolution is taken care of by the compiler (based on reference type).
 *   - It is NOT runtime polymorphism.
 *
 * Method Hiding
 * - Both parent and child class methods should be static
 * - Compiler is responsible for method resolution based on reference type
 * - It is always known as compile time polymorphism or static polymorphism or early binding
 *
 * Overriding
 * - Both parent and child class methods should be non-static
 * - JVM is always responsible for method resolution based on runtime object
 * - It is also known as runtime polymorphism or dynamic polymorphism or late binding
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(); // Parent static method

        Child child = new Child();
        child.m1(); // Child static method

        Parent parentRef = new Child();
        parentRef.m1(); // Parent static method (because of method hiding, not overriding)
    }
}

