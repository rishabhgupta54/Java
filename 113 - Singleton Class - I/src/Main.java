/*
 * Singleton Class
 * - A Singleton Class is a class for which only one instance (object)
 *   is allowed to be created in the entire JVM.
 * - Examples of Singleton Classes in Java:
 *      - java.lang.Runtime
 *      - java.awt.Desktop
 *      - java.lang.System (indirectly, since all members are static and no public constructor is provided)
 * - Advantages of Singleton Class:
 *      - When multiple clients share the same requirement, it is inefficient
 *        to create a new object for each client.
 *      - A single object can be created and reused across the application.
 *      - This improves performance, reduces memory overhead, and provides
 *        a global point of access.
 */

public class Main {
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        System.out.println(r1 == r2); // true, proving that Runtime is a Singleton
    }
}
