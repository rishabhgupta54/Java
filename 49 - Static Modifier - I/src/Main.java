/*
 * Static Modifier
 *
 * - 'static' is a modifier applicable for methods and variables, but not for top-level classes.
 *   → We cannot declare a top-level class as static.
 *   → We can declare an inner class as static → such classes are called static nested classes.
 *
 * - Instance Variable:
 *   → For each object, a separate copy will be created.
 *
 * - Static Variable:
 *   → A single copy will be created at the class level.
 *   → This copy is shared among all objects of the class.
 *
 * Access rules:
 * - We cannot access instance members directly from a static area (e.g., main method).
 *   → Need an object reference.
 * - We can access instance members directly from instance methods.
 * - We can access static members directly from both static and instance methods.
 */
public class Main {
    static int int1 = 10; // static variable → one copy shared across all objects
    int int2 = 20; // instance variable → each object gets its own copy

    public static void main(String[] args) {
        // Static area (main method)
        Main main1 = new Main();
        main1.int1 = 100; // modifies the single static copy
        main1.int2 = 200; // modifies only main1's instance variable

        Main main2 = new Main();
        System.out.println("int1: " + main2.int1); // prints 100 → shared static copy
        System.out.println("int2: " + main2.int2); // prints 20  → main2's instance copy

        main2.show(); // instance method can access both static and instance directly
    }

    public void show() {
        System.out.println("Accessing static directly: " + int1);
        System.out.println("Accessing instance directly: " + int2);
    }
}
