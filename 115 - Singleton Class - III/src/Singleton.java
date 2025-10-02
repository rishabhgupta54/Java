public class Singleton {
    // Holds the single instance, initially null
    private static Singleton singleton = null;

    // Private constructor prevents instantiation from other classes
    private Singleton() {

    }

    // Returns the single instance, creates it if it does not exist
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}