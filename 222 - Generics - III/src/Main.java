/*
 * Generics
 *
 * - We can define our own generic classes to handle multiple types.
 * - Type parameter (T) acts as a placeholder for the actual type provided during object creation.
 * - Benefits:
 *   Type safety: only specified type can be used.
 *   No explicit casting required.
 *   Reusable class for different types.
 */

public class Main {
    public static void main(String[] args) {

        // Generic class with String type
        A<String> a1 = new A<>("Hello");
        a1.show();             // Prints runtime type info
        System.out.println(a1.getT()); // Retrieves value without casting

        // Generic class with Integer type
        A<Integer> a2 = new A<>(10);
        a2.show();
        System.out.println(a2.getT());
    }
}
