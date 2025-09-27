/*
 * Overloading
 * When resolving overloaded methods, the compiler will always give
 * preference to the child class argument over the parent type argument.
 *
 * Example:
 * - Object is the parent class of all classes in Java.
 * - String is a child class of Object.
 * - When we pass a String argument, the compiler will prefer the method
 *   with String parameter instead of Object parameter.
 *
 * Special Case: null
 * - null can be passed to any reference type.
 * - If multiple overloaded methods accept reference types, the compiler
 *   chooses the most specific one.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.m1(new Object()); // Calls m1(Object)
        main.m1("Hello"); // Calls m1(String)
        main.m1(null); // Calls m1(String) because String is more specific
    }

    public void m1(Object object) {
        System.out.println("Object method");
    }

    public void m1(String string) {
        System.out.println("String method");
    }
}
