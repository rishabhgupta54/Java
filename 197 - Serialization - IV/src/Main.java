/*
 * Serialization
 *
 * - Whenever we serialize an object, all objects reachable from that object
 *   (its references) are automatically serialized. This set of objects is called
 *   the object graph.
 * - Every object in the object graph must implement Serializable.
 *   If even one object is not serializable, a runtime exception
 *   (NotSerializableException) will occur.
 * - This ensures that the complete state of the object and its reachable objects
 *   is preserved and restored during deserialization.
 */

import java.io.*;

public class Main {
    static String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create the main object
        A a1 = new A();

        // Step 2: Serialize object A
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);  // automatically serializes reachable objects: B and C
        System.out.println("Object graph serialized (A -> B -> C)");
        oos.close();
        fos.close();

        // Step 3: Deserialize object A
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        A a2 = (A) ois.readObject();
        ois.close();
        fis.close();

        // Step 4: Access nested object data
        System.out.println("Deserialized value of C.i: " + a2.b.c.i); // 10
    }
}

