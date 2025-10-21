/*
 * Properties
 *
 * The underlying data structure is a Hashtable (inherited directly).
 *
 * Characteristics:
 * - It is a subclass of Hashtable (java.util.Properties extends java.util.Hashtable).
 * - It is used to maintain key–value pairs where both key and value are Strings.
 * - It is commonly used to store configuration data such as:
 *      → database settings
 *      → application settings
 *      → environment parameters
 * - Keys and values are always Strings.
 * - Thread-safe (inherits synchronization from Hashtable).
 * - Null key or value is NOT allowed.
 * - Often used with files having `.properties` extension.
 * - Implements Map<Object,Object>, Serializable, Cloneable.
 *
 * Constructors:
 * Properties properties = new Properties();
 *   → Creates an empty property list.
 *
 * Properties properties = new Properties(defaults);
 *   → Creates a property list with default values from another Properties object.
 *
 *
 * Important Methods:
 * - Object setProperty(String key, String value)
 * - String getProperty(String key)
 * - Enumeration propertyNames()
 * - void load(InputStream inStream)              → reads from .properties file
 * - void store(OutputStream out, String comments) → writes to .properties file
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        // 1️⃣ Adding entries (keys & values must be Strings)
        properties.setProperty("username", "admin");
        properties.setProperty("password", "root123");
        properties.setProperty("timeout", "30");

        System.out.println("Properties: " + properties);

        // 2️⃣ Retrieving properties
        System.out.println("\nUsername: " + properties.getProperty("username"));
        System.out.println("Password: " + properties.getProperty("password"));
        System.out.println("Timeout: " + properties.getProperty("timeout"));
        System.out.println("Mode: " + properties.getProperty("mode", "dark")); // default value

        // 4️⃣ Storing properties to a file
        FileOutputStream fos = new FileOutputStream("appConfig.properties");
        properties.store(fos, "Application Configuration File");
        fos.close();
        System.out.println("\nProperties saved to appConfig.properties");

        // 5️⃣ Loading properties from a file
        FileInputStream fis = new FileInputStream("appConfig.properties");
        Properties loaded = new Properties();
        loaded.load(fis);
        fis.close();

        System.out.println("\nLoaded from file: " + loaded);
    }
}
