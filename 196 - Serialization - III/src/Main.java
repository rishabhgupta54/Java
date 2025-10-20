/*
 * Serialization
 *
 * - We can serialize multiple objects into a single file.
 * - The order of serialization matters.
 *   Objects must be deserialized in the same order they were serialized.
 * - If order is not maintained, ClassCastException or data corruption may occur.
 */

import java.io.*;

public class Main {
    static String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create objects
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        // Step 2: Serialize objects in order: A -> B -> C
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        System.out.println("Serialized object A");
        oos.writeObject(b1);
        System.out.println("Serialized object B");
        oos.writeObject(c1);
        System.out.println("Serialized object C");
        oos.close();
        fos.close();

        // Step 3: Deserialize objects in the same order
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);

        A a2 = (A) ois.readObject();
        System.out.println("Deserialized object A -> i: " + a2.i + ", j: " + a2.j);

        B b2 = (B) ois.readObject();
        System.out.println("Deserialized object B -> i: " + b2.i + ", j: " + b2.j);

        C c2 = (C) ois.readObject();
        System.out.println("Deserialized object C -> i: " + c2.i + ", j: " + c2.j);

        ois.close();
        fis.close();
    }
}

