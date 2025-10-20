/*
 * Serialization
 *
 * Serialization:
 *  - Process of writing the state of an object to a file.
 *  - Technically, converting an object from **Java-supported form**
 *    → to **file-supported** or **network-supported** form.
 *
 * Deserialization:
 *  - Process of reading the state of an object from a file.
 *  - Technically, converting an object from **file-supported**
 *    → to **Java-supported** form.
 *
 * Classes used:
 *  - For Serialization → FileOutputStream + ObjectOutputStream
 *  - For Deserialization → FileInputStream + ObjectInputStream
 *
 * Serializable Object:
 *  - A class must implement `Serializable` interface to allow its
 *    objects to be serialized.
 *  - `Serializable` is a **marker interface** (no methods inside it)
 *     defined in `java.io` package.
 *
 * If we try to serialize a non-serializable object:
 *  - We get `java.io.NotSerializableException`
 *
 * Serialization Lifecycle Diagram
 *
 *       ┌──────────────────────┐
 *       │   Java Object (A)    │
 *       └─────────┬────────────┘
 *                 │
 *                 │   Serialization
 *                 ▼
 *       ┌──────────────────────┐
 *       │   File: abc.ser      │
 *       │ (Binary Serialized)  │
 *       └─────────┬────────────┘
 *                 │
 *                 │  Deserialization
 *                 ▼
 *       ┌──────────────────────┐
 *       │   Java Object (A)    │
 *       └──────────────────────┘
 *
 * Notes
 * - Serializable interface → marker interface, no methods.
 * - ObjectOutputStream → writes object to file.
 * - ObjectInputStream  → reads object from file.
 * - Always close your streams to prevent resource leaks.
 */

import java.io.*;

public class Main {

    static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create an object
        A a1 = new A();
        System.out.println("Original Object (before serialization):");
        System.out.println("i = " + a1.i);
        System.out.println("j = " + a1.j);

        // Step 2: Serialization — writing object to file
        System.out.println("\n🔸 Serializing object to file: " + FILE_NAME);
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a1);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object serialized successfully!");

        // Step 3: Deserialization — reading object back
        System.out.println("\n🔹 Deserializing object from file: " + FILE_NAME);
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        // Step 4: Display the deserialized object
        System.out.println("Object deserialized successfully!");
        System.out.println("\nDeserialized Object (after reading):");
        System.out.println("i = " + a2.i);
        System.out.println("j = " + a2.j);
    }
}

