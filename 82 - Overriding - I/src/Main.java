/*
 * Overriding
 * - Whatever methods the parent has are by default available to the child
 *   through inheritance.
 * - If the child class is not satisfied with the parent implementation,
 *   it can redefine the method → this is called Overriding.
 *
 * - The parent class method which is replaced is called the Overridden method.
 * - The child class method which replaces it is called the Overriding method.
 *
 * Method Resolution:
 * - In Overloading → done by the Compiler (based on reference type).
 *   → Compile-time polymorphism / Early binding.
 *
 * - In Overriding → done by the JVM (based on runtime object).
 *   → Runtime polymorphism / Late binding.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(); // Parent's version
        parent.property();
        parent.marriage();

        Child child = new Child(); // Child's version
        child.property();
        child.marriage();

        Parent parentChild = new Child(); // Child's version (runtime object = Child)
        parentChild.property();
        parentChild.marriage();
    }
}
