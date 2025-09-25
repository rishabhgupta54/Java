/*
 * Transient Modifier
 * - 'transient' is applicable only for variables.
 * - It is used in serialization context.
 * - When a variable is declared as transient, its value is **not saved** during serialization.
 * - During deserialization, transient variables get their **default values** (0 for int, null for objects, etc.).
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("rishabh", "mypassword");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        User deserializedUser = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            deserializedUser = (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Before Serialization: " + user);
        System.out.println("After Deserialization: " + deserializedUser);
    }
}
