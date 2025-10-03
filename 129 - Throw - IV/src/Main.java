/*
 * Throw
 * - The throw keyword can be used only with objects of type Throwable or its subclasses.
 * - If we try to use throw with a normal Java object (not a Throwable type),
 *   we will get a compile-time error: "incompatible types".
 *
 * Example 1 (Invalid):
 * class Main {
 *     public static void main(String[] args) {
 *         throw new Main(); // Compile-time error: incompatible types
 *     }
 * }
 *
 * Example 2 (Valid):
 * - If the class extends Throwable (directly or indirectly), then it can be thrown.
 */
public class Main extends RuntimeException {
    public static void main(String[] args) {
        // Valid, because Main is a subclass of RuntimeException (which extends Throwable)
        throw new Main();
    }
}
