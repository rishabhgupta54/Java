/*
 * Object Type Casting
 * -------------------------------
 * We can use parent reference to hold child object:
 *   Object object = new String("Hello");
 *
 * We can use interface reference to hold implemented class object:
 *   Runnable runnable = new Thread();
 *
 * General Syntax:
 *   A b = (C) d;
 *   A = Class or Interface name (target type)
 *   b = reference variable name
 *   (C) = Class or Interface name (cast type)
 *   d = reference variable name (source reference)
 *
 * Compile-time checking:
 *   1. The type of 'd' and 'C' must have some relationship
 *      (either parent-child or child-parent).
 *      Otherwise → CE: incompatible types.
 *
 *   2. 'C' must be same or a derived type of 'A'.
 *      Otherwise → CE: incompatible types.
 *
 * Runtime checking:
 *   - The runtime object type of 'd' must be either the same or derived type of 'C'.
 *   - Otherwise → Runtime error: ClassCastException.
 */

public class Main {
    public static void main(String[] args) {
        // Valid casting: Object → String
        Object object = new String("Hello");
        String string = (String) object; // Safe downcasting
        System.out.println("Casted String: " + string);

        // Interface reference holding implemented class object
        Runnable runnable = new Thread();
        Thread thread = (Thread) runnable; // Safe cast
        System.out.println("Thread obtained from Runnable");

        // Runtime error example:
        Object obj2 = new Object();
        // String str2 = (String) obj2; // RTE: ClassCastException

        // Compile-time error example:
        // String s = (String) new Integer(10); // CE: incompatible types
    }
}
