/*
 * Abstract Modifier
 * -----------------------------------------------------------------
 * - The `abstract` modifier is applicable for classes and methods (not variables).
 *
 * Abstract Methods:
 * -----------------
 * - A method without implementation (only declaration) is called an abstract method.
 * - Abstract methods end with a semicolon (no body).
 * - Child classes are responsible for providing the implementation.
 * - By declaring an abstract method, a parent class defines a contract
 *   → child classes must implement that method.
 *
 * Illegal combinations for abstract methods (because they deal with implementation):
 * - final
 * - native
 * - synchronized
 * - static
 * - private
 * - strictfp
 *
 * Abstract Classes:
 * -----------------
 * - If a class is declared `abstract`, we cannot create its objects.
 * - Useful for "partial implementation" where complete details are not known.
 * - If a class has at least 1 abstract method → class must be abstract.
 * - Abstract class can have 0 or more abstract methods.
 * - If a child class extends an abstract class:
 *      - It must provide implementation for all abstract methods.
 *      - Otherwise, the child class itself must be declared abstract.
 */
public class Main {
    public static void main(String[] args) {
        // Parent parent = new Parent(); // CE: Parent is abstract; cannot be instantiated
        SubChild subChild = new SubChild();
        subChild.m1();
        subChild.m2();
        subChild.m3();
    }
}