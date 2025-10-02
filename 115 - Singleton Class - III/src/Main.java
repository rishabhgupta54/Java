/*
 * Singleton Class
 * - This example demonstrates a lazy-initialized singleton.
 * - The single instance is created only when it is first requested.
 * - Steps to implement lazy singleton:
 *      1. Private constructor to prevent external instantiation
 *      2. Private static variable initialized to null
 *      3. Public static method checks if the instance is null and creates it if necessary
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2); // true, both references point to the same instance
    }
}


