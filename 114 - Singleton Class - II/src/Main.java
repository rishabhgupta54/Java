/*
 * Singleton Class
 * - We can create our own singleton class by using:
 *      1. A private constructor to prevent external instantiation
 *      2. A private static variable to hold the single instance
 *      3. A public static factory method to provide global access to the instance
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2); // true, both references point to the same instance
    }
}
