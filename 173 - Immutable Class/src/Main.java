/*
 * Immutable Class
 *
 * Once we create an object, we cannot change its state. If we try to "modify" it,
 * a new object will be created only if the content changes. If the content is the same,
 * the existing object can be reused. This is called immutability.
 */

public class Main {
    public static void main(String[] args) {
        // Creating immutable objects
        A a1 = new A(10);
        A a2 = new A(100);
        A a3 = new A(10);

        System.out.println("a1 == a2: " + (a1 == a2)); // false (different objects)
        System.out.println("a1 == a3: " + (a1 == a3)); // false (different objects)

        // Modifying objects
        A a4 = a1.modify(10);  // Same value, should reuse existing object
        A a5 = a1.modify(50);  // Different value, creates new object

        System.out.println("a1 == a4 (modify with same value): " + (a1 == a4)); // true
        System.out.println("a1 == a5 (modify with different value): " + (a1 == a5)); // false

        // Displaying values
        System.out.println("a1 value: " + a1.getValue());
        System.out.println("a4 value: " + a4.getValue());
        System.out.println("a5 value: " + a5.getValue());
    }
}

