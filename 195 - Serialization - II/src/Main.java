/*
 * Serialization
 *
 * transient:
 *  - The `transient` modifier is applicable **only for variables** (not for classes or methods).
 *  - During serialization, JVM **ignores** the original value of a transient variable.
 *  - It saves the **default value** of that variable type instead.
 *  - Purpose: To protect sensitive data (e.g., passwords, keys).
 *
 * static:
 *  - Static variables belong to the class, **not the object**.
 *  - They are **not part of the object state**, hence not serialized.
 *  - Declaring a variable as both `static` and `transient` has no extra effect.
 *
 * final:
 *  - Final variables are constants.
 *  - Their values are directly stored in the object and hence **are serialized**.
 *  - Declaring a variable as both `final` and `transient` has **no impact** — the value will still be serialized.
 */

import java.io.*;

public class Main {

    static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create object and print initial state
        A a1 = new A();
        System.out.println("Original Object (before serialization):");
        System.out.println("i = " + a1.i);
        System.out.println("j = " + a1.j);
        System.out.println("k = " + A.k);
        System.out.println("password = " + a1.password);

        // Step 2: Serialize the object
        System.out.println("\n🔸 Serializing object to file: " + FILE_NAME);
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(a1);
        }
        System.out.println("Object serialized successfully!");

        // Step 3: Change static variable (to show it's not serialized)
        A.k = 999;

        // Step 4: Deserialize object
        System.out.println("\n🔹 Deserializing object from file: " + FILE_NAME);
        A a2;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            a2 = (A) ois.readObject();
        }
        System.out.println("Object deserialized successfully!");

        // Step 5: Print deserialized state
        System.out.println("\nDeserialized Object (after reading):");
        System.out.println("i = " + a2.i); // normal instance variable → serialized
        System.out.println("j = " + a2.j); // final variable → serialized
        System.out.println("k = " + A.k); // static variable → NOT serialized
        System.out.println("password = " + a2.password); // transient → default value (null)
    }
}

