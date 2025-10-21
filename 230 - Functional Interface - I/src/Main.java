/*
 * Functional Interface
 *
 * - Functional interfaces are interfaces with exactly one abstract method.
 *   → Also called Single Abstract Method (SAM) interfaces.
 *
 * - Functional interfaces can contain any number of:
 *     - default methods
 *     - static methods
 *
 * - Functional interfaces can be used with lambda expressions.
 *   → Lambda expressions are anonymous functions:
 *       - Without name
 *       - Without return type declaration
 *       - Without modifiers
 *
 * - Lambda syntax rules:
 *     - Without curly braces, the return value is inferred automatically.
 *     - With curly braces, if returning a value, the `return` keyword is mandatory.
 */

public class Main {
    public static void main(String[] args) {

        // Lambda expressions for functional interface A
        A a = () -> System.out.println("Hello World");
        A b = () -> System.out.println("Hello From Functional Interface");

        // Calling the abstract method via lambda
        a.print();
        b.print();
    }
}

