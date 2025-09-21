import java.util.ArrayList;

/*
 * Import Statement - III
 *
 * In Java, there are 2 types of import statements:
 * 1. Explicit Class Import
 * 2. Implicit Class Import
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Explicit Class Import
         * - Recommended way to import classes.
         * - Improves code readability and makes code cleaner.
         * - Example: We can directly use ArrayList without package prefix.
         */
        ArrayList arrayList = new ArrayList();

        /*
         * Implicit Class Import
         * - Not recommended for general use because it reduces readability.
         * - Requires using fully qualified class name every time.
         * - Example: Using java.util.LinkedList with full package name.
         */
        java.util.LinkedList linkedList = new java.util.LinkedList<>();
    }
}
