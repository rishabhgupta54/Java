/*
 * Functional Interface
 *
 * - Functional interfaces can have parameters just like normal methods.
 * - When using lambda expressions:
 *     → You can specify parameter types (e.g., `(int a, int b) -> ...`)
 *     → Or let the compiler infer types (e.g., `(a, b) -> ...`)
 *
 * - The compiler automatically knows that the lambda implements the single abstract method.
 * - Functional interfaces make code shorter, cleaner, and remove the need for extra classes.
 */

public class Main {
    public static void main(String[] args) {
        // Traditional way using class implementation
        A a = new A();
        a.sum(5, 10);
        a.sum(50, 100);

        // Lambda expression (explicit parameter types)
        AI ai1 = (int a1, int b1) -> System.out.println("Sum of " + a1 + " + " + b1 + " = " + (a1 + b1));

        ai1.sum(5, 10);
        ai1.sum(10, 15);

        // Lambda expression (implicit parameter types — cleaner)
        AI ai2 = (x, y) -> System.out.println("Result: " + (x + y));
        ai2.sum(20, 30);
    }
}

