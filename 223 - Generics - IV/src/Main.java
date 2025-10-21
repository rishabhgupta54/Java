/*
 * Generics
 *
 * We can restrict (bound) the type parameter within a particular range using the extends keyword.
 *
 * Syntax:
 *     class A<T extends X> { }
 *
 * X can be either a class or an interface.
 *
 * Rules:
 * - If X is a class, then the type parameter can be X or its subclasses.
 * - If X is an interface, then the type parameter can be X or its implementing classes.
 * - We can also define multiple bounds, but:
 *     - The class type must come first.
 *     - We can extend only one class.
 *     - We can implement multiple interfaces.
 *
 * Example:
 *     class C<T extends Number & Runnable> { } // Valid → Class first, then interface
 *     class D<T extends Runnable & Number> { } // Invalid → Class must come first
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Class-based bound
         */
        A<Integer> a1 = new A<>();   // Integer extends Number
        A<Double> a2 = new A<>();    // Double extends Number
        // A<String> a3 = new A<>(); // Error: String does not extend Number

        /*
         * Interface-based bound
         */
        B<Thread> b1 = new B<>();    // Thread implements Runnable
        B<Runnable> b2 = new B<>();  // Runnable itself allowed
        // B<String> b3 = new B<>(); // Error: String does not implement Runnable

        /*
         * Multiple bounds
         */
        // C<T extends Number & Runnable> → valid type must extend Number and implement Runnable
        // Example class that fits: custom class extending Number and implementing Runnable
        // But no standard Java class satisfies both conditions

        // C<Integer> c1 = new C<>(); // Error: Integer doesn't implement Runnable
        // C<Thread> c2 = new C<>();  // Error: Thread doesn't extend Number
    }
}

