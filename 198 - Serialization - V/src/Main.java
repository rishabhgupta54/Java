/*
 * Serialization
 *
 * During default serialization, transient fields are not saved,
 * leading to possible loss of information. To avoid this and perform
 * custom actions during serialization/deserialization, we can define:
 *
 *  private void writeObject(ObjectOutputStream oos) throws Exception
 *   → Executed automatically during serialization.
 *   → Used to perform extra steps (like encrypting sensitive data).
 *
 *  private void readObject(ObjectInputStream ois) throws Exception
 *   → Executed automatically during deserialization.
 *   → Used to reverse custom actions (like decrypting data).
 *
 * These methods are callback methods — automatically invoked by JVM.
 */

import java.io.*;

public class Main {
    static final String FILE_NAME = "abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account account1 = new Account();
        System.out.println("Original Object (Before Serialization):");
        System.out.println("Username: " + account1.username);
        System.out.println("Password: " + account1.password);
        System.out.println("Account ID: " + account1.accountId);

        // Serialize the object
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account1);
        oos.close();
        fos.close();
        System.out.println("\nObject serialized successfully!\n");

        // Deserialize the object
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account account2 = (Account) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Deserialized Object (After Reading):");
        System.out.println("Username: " + account2.username);
        System.out.println("Password: " + account2.password);
        System.out.println("Account ID: " + account2.accountId);
    }
}

