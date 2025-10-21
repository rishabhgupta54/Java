/*
 * Functional Interface
 *
 * - If a parent interface is a functional interface,
 *   then a child interface without any additional abstract methods
 *   is also considered a functional interface.
 *
 * - This allows us to use lambda expressions to implement the child interface as well.
 *
 * - Note:
 *   - If the child interface declares another abstract method,
 *     it is no longer a functional interface.
 */

public class Main {
    public static void main(String[] args) {

        // Lambda expression for child interface B
        B b = () -> System.out.println("Using inheritance to access print function");

        // Calling the abstract method via lambda
        b.print();
    }
}

// Parent functional interface
@FunctionalInterface
interface A {
    void print();
}

// Child interface inheriting functional interface
interface B extends A {
    // No additional abstract methods → still a functional interface
}
