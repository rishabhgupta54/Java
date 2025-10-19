/*
 * Shallow Cloning
 *
 * Shallow cloning creates a bitwise copy of an object.
 * - For primitive fields: exact copy is created in the cloned object.
 * - For reference fields: only the reference is copied; the underlying object is shared.
 *
 * Important Point:
 * - In shallow cloning, if we modify the content of a reference object using the cloned object's reference,
 *   those changes will also be reflected in the original object.
 * - To overcome this problem, we should go for Deep Cloning, where a new copy of the reference object is created.
 *
 * Object class's clone() method performs shallow cloning by default.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Original objects
        Cat cat = new Cat(10);
        Dog dog1 = new Dog(cat, 20);

        // Cloning dog1 (shallow copy)
        Dog dog2 = (Dog) dog1.clone();

        System.out.println("Before modification:");
        System.out.println("dog1.i: " + dog1.i); // 20
        System.out.println("dog2.i: " + dog2.i); // 20

        System.out.println("dog1.cat.i: " + dog1.cat.i); // 10
        System.out.println("dog2.cat.i: " + dog2.cat.i); // 10 (shared reference)

        // Modifying cloned object's primitive field
        dog2.i = 999;
        // Modifying shared reference object's field
        dog2.cat.i = 555;

        System.out.println("\nAfter modification:");
        System.out.println("dog1.i: " + dog1.i); // 20 (independent)
        System.out.println("dog2.i: " + dog2.i); // 999 (modified)

        System.out.println("dog1.cat.i: " + dog1.cat.i); // 555 (affected due to shallow copy)
        System.out.println("dog2.cat.i: " + dog2.cat.i); // 555
    }
}

