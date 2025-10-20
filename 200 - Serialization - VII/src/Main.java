/*
 * Serialization
 *
 * A child class can be serialized even if its parent class does NOT
 * implement Serializable interface.
 *
 * During serialization:
 * JVM checks if any variable is inherited from a non-serializable
 * parent class.
 * → If yes, JVM ignores its original value and saves the default value.
 *
 * During deserialization:
 * JVM checks if parent class is non-serializable.
 * → If yes, JVM executes the instance control flow (constructor)
 *   of every non-serializable parent to initialize inherited variables.
 *
 * While executing the parent’s instance control flow,
 * JVM always calls the **no-argument constructor**.
 * Hence, every non-serializable parent class must have a no-arg constructor.
 * Otherwise, JVM throws: InvalidClassException.
 *
 * ASCII Object Construction Flow (Deserialization Phase)
 *         ┌───────────────────────────────┐
 *         │         Object Class          │
 *         └──────────────┬────────────────┘
 *                        │
 *         ┌──────────────▼──────────────┐
 *         │  A (non-serializable)      │
 *         │  ↓ No-arg constructor runs │
 *         │  ↓ i = default or reinit   │
 *         └──────────────┬──────────────┘
 *                        │
 *         ┌──────────────▼──────────────┐
 *         │  B (serializable)          │
 *         │  ↓ Fields restored from    │
 *         │    serialized stream       │
 *         └────────────────────────────┘
 */

import java.io.*;

public class Main {
    static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Creating and serializing object...");
        B b1 = new B();
        b1.i = 100; // from non-serializable parent
        b1.j = 200; // from serializable child

        // Serialization
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(b1);
        oos.close();
        fos.close();
        System.out.println("Object serialized successfully!\n");

        // Deserialization
        System.out.println("🔹 Deserializing object...");
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        B b2 = (B) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Object deserialized successfully!\n");

        System.out.println("Values after deserialization:");
        System.out.println("i (from A) = " + b2.i + "  ← default value, parent not serialized");
        System.out.println("j (from B) = " + b2.j + "  ← restored from file");
    }
}

