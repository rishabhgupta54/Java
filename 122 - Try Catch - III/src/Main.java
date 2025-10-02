/*
 * Try Catch
 * Throwable class define the following methods to print the exception information
 * - printStackTrace() - Name of the exception:Description
 *   Stack Trace
 * - toString() - Name of the exception:Description
 * - getMessage() - Description
 * Internally default exception handler will use printStackTrace() method to print exception information to the console
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.toString()); // => System.out.println(exception);
            System.out.println(exception.getMessage());
        }
    }
}
