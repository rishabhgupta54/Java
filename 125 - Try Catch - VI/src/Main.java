/*
 * Try Catch
 * - The order of try, catch, and finally is important.
 * - Whenever we use a try block, it must be followed by either a catch block or a finally block.
 *   → try without catch or finally is invalid.
 * - Whenever we use a catch block, it must always be associated with a try block.
 *   → catch without try is invalid.
 * - Whenever we use a finally block, it must always be associated with a try block.
 *   → finally without try is invalid.
 * - Nesting of try-catch-finally blocks is allowed (i.e., we can declare a try-catch-finally inside another try, catch, or finally).
 * - Curly braces are mandatory for try, catch, and finally blocks (even if there is only one statement).
 */
public class Main {
    public static void main(String[] args) {
        // Valid: try with single catch
        try {

        } catch (Exception exception) {

        }

        // Valid: try with multiple catch blocks
        try {

        } catch (ArithmeticException exception) {

        } catch (Exception exception) {

        }

        // Valid: try with catch and finally
        try {

        } catch (Exception exception) {

        } finally {

        }

        // Valid: try with only finally
        try {

        } finally {

        }

        // Invalid examples (uncomment to see compile-time errors)

        /*try {

        }*/ // Error: try without catch/finally

        /*} catch (Exception exception) {

        }*/ // Error: catch without try

        /*finally{

        }*/ // Error: finally without try

        /*try {

        } finally {

        } catch (Exception exception) {

        }*/ // Error: catch cannot come after finally

        // Nested try-catch-finally (valid example)
        try {
            try {

            } catch (Exception exception) {

            }
        } catch (Exception exception) {
            try {

            } catch (Exception exception1) {

            }
        } finally {
            try {

            } catch (Exception exception) {

            }
        }

        /*try
        catch (Exception exception)
        finally*/ // Error: curly braces are mandatory
    }
}
