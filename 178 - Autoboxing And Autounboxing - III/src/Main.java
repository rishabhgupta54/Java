/*
 * Autoboxing and Autounboxing
 *
 * All wrapper class objects are immutable, meaning once created,
 * their value cannot be changed.
 *
 * If we try to modify (increment, add, etc.) a wrapper object,
 * a new object will be created internally — the old one remains unchanged.
 */
public class Main {
    public static void main(String[] args) {
        Integer x = 10;  // Autoboxing → new Integer(10)
        Integer y = x;   // Both point to same object initially

        x++; // Unboxing (10) → increment → Autoboxing → new Integer(11)

        System.out.println("x value: " + x); // 11
        System.out.println("y value: " + y); // 10
        System.out.println("Are x and y same object? " + (x == y)); // false
    }
}
