/*
 * Deep Cloning
 *
 * Deep cloning creates an exact independent copy of an object,
 * including all contained reference objects.
 * - For primitive fields: duplicate variables are created in the cloned object.
 * - For reference fields: new copies of the contained objects are created in the cloned object.
 *
 * By default, Object class's clone() method performs shallow cloning,
 * but we can implement deep cloning by overriding the clone() method in our class.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat(10);
        Dog dog1 = new Dog(cat, 100);

        // Perform deep cloning
        Dog dog2 = (Dog) dog1.clone();

        // Change values in cloned object
        dog2.i = 200;
        dog2.cat.i = 50;

        // Original object remains unaffected
        System.out.println("Original Dog i: " + dog1.i); // 100
        System.out.println("Original Dog Cat i: " + dog1.cat.i); // 10
        System.out.println("Cloned Dog i: " + dog2.i); // 200
        System.out.println("Cloned Dog Cat i: " + dog2.cat.i); // 50
    }
}

