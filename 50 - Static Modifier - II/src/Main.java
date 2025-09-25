/*
 * Static Modifier
 *
 * - Method Overloading is applicable for static methods (including the main method).
 *
 * - JVM Rule:
 *   → The JVM always looks for and calls the main method with the signature:
 *        public static void main(String[] args)
 *   → Other overloaded main methods are treated as normal static methods and must be called explicitly by the programmer.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("String[] args"); // This is the entry point called by JVM
        main(new int[]{10, 20, 30}); // Explicit call to the overloaded main method
    }

    public static void main(int[] args) {
        System.out.println("int[] args"); // Called only when invoked explicitly
    }
}
