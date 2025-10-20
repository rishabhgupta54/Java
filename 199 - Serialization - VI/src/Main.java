/*
 * Serialization
 *
 * If a parent class implements Serializable,
 * then all its child classes automatically become serializable.
 *
 *  → Serializable nature is inherited from parent to child.
 *
 * Even if a child class does NOT explicitly implement Serializable,
 * it can still be serialized because its parent is serializable.
 *
 * Object class itself does NOT implement Serializable interface.
 * Hence, serialization starts from the first class in the hierarchy
 * that implements Serializable.
 *
 * Hence, even though class B doesn’t implement Serializable,
 * we can still serialize its objects.
 */

import java.io.*;

public class Main {
    static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create object of B (child class)
        B b1 = new B();
        b1.i = 100;
        b1.j = 200;

        System.out.println("Original Object (Before Serialization):");
        System.out.println("i = " + b1.i);
        System.out.println("j = " + b1.j);

        // Step 2: Serialize the object
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(b1);
        oos.close();
        fos.close();
        System.out.println("\nObject serialized successfully!\n");

        // Step 3: Deserialize the object
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        B b2 = (B) ois.readObject();
        ois.close();
        fis.close();

        // Step 4: Display deserialized data
        System.out.println("Deserialized Object (After Reading):");
        System.out.println("i = " + b2.i);
        System.out.println("j = " + b2.j);
    }
}

