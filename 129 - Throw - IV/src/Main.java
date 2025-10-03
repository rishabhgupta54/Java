/*
 * Throw
 * - The throw keyword can be used only with objects of type Throwable or its subclasses.
 * - If we try to use throw with a normal Java object (not a Throwable type),
 *   we will get a compile-time error: "incompatible types".
 */

/*public class Main {
    public static void main(String[] args) {
        // Invalid: Main is not a subclass of Throwable
        throw new Main(); // Compile-time error: incompatible types
    }
}*/

public class Main extends RuntimeException {
    public static void main(String[] args) {
        throw new Main(); // Compile-time error: incompatible types
    }
}
