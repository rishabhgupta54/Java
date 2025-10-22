/*
 * Default and Static Methods
 *
 * - From Java 8 onwards, interfaces can have static methods.
 * - Static methods in an interface:
 *     - Belong to the interface itself, not to the objects.
 *     - Must be called using the interface name.
 *     - Are not inherited by implementing classes.
 *
 * - Static methods are useful for utility methods related to the interface.
 */

public class Main {
    public static void main(String[] args) {

        A a = new A();
        // a.m1(); // Not allowed — static methods are not part of the implementing class

        // Calling interface static method using interface name
        I.m1();
    }
}

