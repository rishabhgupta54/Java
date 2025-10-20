import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    String username = "Alex";
    transient String password = "Kara";  // transient = not serialized by default
    transient int accountId = 98765;     // transient = we’ll handle manually

    /*
     * Custom serialization logic
     * Encrypts password and accountId before writing to file
     */
    private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
        objectOutputStream.defaultWriteObject(); // write non-transient fields

        // Custom encryption for password
        String encryptedPassword = "123" + this.password;

        // Custom encryption for accountId
        int encryptedAccountId = this.accountId * 1234;

        // Write encrypted data manually
        objectOutputStream.writeObject(encryptedPassword);
        objectOutputStream.writeInt(encryptedAccountId);
    }

    /*
     * Custom deserialization logic
     * Decrypts password and accountId after reading from file
     */
    private void readObject(ObjectInputStream objectInputStream) throws Exception {
        objectInputStream.defaultReadObject(); // read non-transient fields

        // Read and decrypt password
        String encryptedPassword = (String) objectInputStream.readObject();
        this.password = encryptedPassword.substring(3);

        // Read and decrypt accountId
        int encryptedAccountId = objectInputStream.readInt();
        this.accountId = encryptedAccountId / 1234;
    }
}
