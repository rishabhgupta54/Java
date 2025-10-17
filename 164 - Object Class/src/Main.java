/*
 * Object Class

 * The most commonly required methods for every Java class (whether predefined or custom)
 * are defined in a separate class called the Object class.
 *
 * Key Points:
 * 1. Every class in Java is a child of the Object class (either directly or indirectly).
 * 2. Hence, Object class methods are available to every Java class by default.
 * 3. The Object class is considered the root of all Java classes.
 * 4. If a class does not explicitly extend any other class, it automatically extends Object.
 * 5. If a class extends another class, then it becomes an *indirect* child of Object.
 * 6. Java does not support multiple inheritance with classes (only single inheritance).
 */

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.toString()); // Method inherited from Object
        System.out.println(b.toString()); // Method inherited from Object
    }
}

