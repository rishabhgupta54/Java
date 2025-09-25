/*
 * Static Modifier
 *
 * - Inheritance is applicable for static methods (including the main method).
 *
 * - If we run the child class:
 *   → If the child class does NOT have its own main method,
 *     then the parent's main method will be executed automatically.
 *
 * - If the child class DOES declare its own main method,
 *   then the child’s main method will override (hide) the parent’s version during execution.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Parent class main method executed");
    }
}