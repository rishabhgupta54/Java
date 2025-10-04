/*
 * Throws
 * - The throws keyword can be used only with methods and constructors.
 * - It cannot be used with classes.
 */
public class Main {
    // Valid: throws used with constructor
    Main() throws Exception {

    }

    // Valid: throws used with method
    public static void main(String[] args) throws Exception {

    }

    /*
     * Invalid example (for reference):
     * throws cannot be applied to a class declaration.
     *
     * public class Main throws Exception {  // Compile-time error
     * }
     */
}
