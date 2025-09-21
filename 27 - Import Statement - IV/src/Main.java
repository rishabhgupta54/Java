/*
 * Import Statement - IV
 *
 * In Java, a class can be used in two ways:
 * 1. Using fully qualified name
 * 2. Using import statement
 *
 * - If we use the fully qualified name (with package), code compiles fine even without an import statement.
 * - Example: java.rmi.server.RemoteObject is used with its full package name, so no import is needed.
 * - Conversely, if we use import statement, we can use the short class name directly without the package.
 */
public class Main extends java.rmi.server.RemoteObject {
    public static void main(String[] args) {
        System.out.println("Using fully qualified class name, import not required.");
    }
}
