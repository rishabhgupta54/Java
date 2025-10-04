/*
 * Throws
 * - The throws keyword can be used only with Throwable types (i.e., classes that extend Throwable).
 * - If we try to use it with normal Java classes (non-Throwable), we get a compile-time error:
 *   "incompatible types: <class> cannot be converted to Throwable".
 */
public class Main {

    /*
     * Invalid: Main is not a subclass of Throwable
     */
    /*public static void main(String[] args) throws Main {

    }*/

    // Valid: RuntimeException is a subclass of Throwable
    public static void main(String[] args) throws RuntimeException {

    }
}
