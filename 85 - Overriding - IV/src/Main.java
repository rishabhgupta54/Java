/*
 * Overriding
 * - For parent class abstract methods, child classes must override
 *   them to provide implementation.
 * - We can also override a non-abstract (concrete) method of the parent
 *   as abstract in the child class.
 *   → This forces the next-level child classes to provide their own
 *     implementation.
 * - The main advantage: we can stop the availability of the parent method
 *   implementation in the next level child classes.
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.m1(); // Child implementation

        GrandChild grandChild = new GrandChild();
        grandChild.m1(); // GrandChild implementation
    }
}

