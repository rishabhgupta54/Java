/*
 * Coupling
 * - The degree of dependency between components (classes) is called "Coupling".
 *
 * Types:
 * 1. Tight Coupling:
 *    - When one class is highly dependent on another class.
 *    - Change in one class immediately affects other classes.
 *    - Disadvantages:
 *        * Difficult to enhance (changing one part requires changing others).
 *        * Reduces reusability.
 *        * Reduces maintainability.
 *
 * 2. Loose Coupling:
 *    - When dependency between classes is minimized.
 *    - Promotes flexibility, reusability, and easy maintenance.
 *
 * Example below shows **Tight Coupling**:
 * - Class A depends on Class B.
 * - Class B depends on Class C.
 * - Class C depends on Class D.
 * - If we modify Class D (say, change return type of m1()),
 *   then Class C, B, and A will also be impacted.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(A.I); // Prints 10
    }
}

