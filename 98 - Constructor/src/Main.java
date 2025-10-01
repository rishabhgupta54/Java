/*
 * Constructors
 * - Once we create an object, compulsory we should perform initialization,
 *   then only the object will be in a position to respond properly.
 *
 * - Whenever we are creating an object, some piece of code will be executed
 *   automatically to perform initialization of the object.
 *   This piece of code is called Constructor.
 *
 * - Main purpose of constructor:
 *     → To perform initialization of an object
 *     → NOT to create an object (object creation is done by JVM with `new` keyword).
 *
 * Example:
 *   Student student = new Student("Rishabh", 48);
 *   → Here `new` keyword creates the object
 *   → Constructor initializes the object with name and roll number
 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rishabh", 48); // Constructor call
    }
}

