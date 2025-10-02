public class Singleton {
    // Holds the single instance of the class
    private static Singleton singleton = new Singleton();

    // Private constructor prevents instantiation from other classes
    private Singleton() {

    }

    // Public method to provide access to the single instance
    public static Singleton getSingleton() {
        return singleton;
    }
}