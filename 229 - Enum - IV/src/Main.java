/*
 * Enum
 *
 * - Java enums are more powerful than traditional enums.
 *   → Besides constants, enums can have:
 *       - fields (variables)
 *       - constructors
 *       - concrete methods
 *       - implement interfaces
 *       - even a main method
 *
 * - Methods declared in an enum must be concrete.
 *   → Abstract methods are not allowed unless each constant provides its own implementation.
 *
 * - Each enum constant represents an object of the enum type.
 *   → Any method applicable on normal Java objects (toString, hashCode, equals, etc.) can be used on enum constants.
 *
 * - If an enum contains extra members (fields/methods/constructors),
 *   the list of constants must be the first line and end with a semicolon.
 *
 * - Enum constructors are executed once for each constant at the time of class loading.
 */

public class Main {
    public static void main(String[] args) {
        // Access enum constants and their level
        for (Priority p : Priority.values()) {
            System.out.println(p + " -> Level: " + p.getLevel());
        }

        // Example with default level
        System.out.println("DEFAULT priority level: " + Priority.DEFAULT.getLevel());

        // Enum constants are objects, so we can use Object methods
        System.out.println("HIGH constant toString(): " + Priority.HIGH.toString());
        System.out.println("Compare HIGH and LOW: " + Priority.HIGH.equals(Priority.LOW));
    }
}