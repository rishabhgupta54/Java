/*
 * Constructor and Instance Block
 * -------------------------------------------------
 * - The main purpose of constructor → perform initialization of an object.
 *
 * - If we want to perform any activity for every object creation
 *   (other than initialization), then we should go for **Instance Block**.
 *
 * - Both constructor and instance block have their own purpose and
 *   one cannot fully replace the other.
 *
 * - Execution Order (for every object creation):
 *     1. Instance Block executes first
 *     2. Then Constructor executes
 *
 * - The only applicable modifiers for constructors are:
 *     public, private, protected, and default.
 *   If we try to use any other modifier (like static, final, abstract, etc.),
 *   then we will get a compile time error.
 */
public class Main {
    {
        System.out.println("Instance Block");
    }

    Main() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Creating First Object...");
        Main obj1 = new Main();

        System.out.println("\nCreating Second Object...");
        Main obj2 = new Main();
    }
}
