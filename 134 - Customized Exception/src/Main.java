/*
 * Customized Exception or User Defined Exception
 * - Sometimes, to meet specific programming requirements, we can define our own exceptions.
 *   Such exceptions are called Customized or User Defined Exceptions.
 * - The 'throws' keyword is best suited for user-defined exceptions (not for predefined ones).
 * - It is highly recommended to define user-defined exceptions as unchecked exceptions
 *   (by extending RuntimeException), not checked exceptions (by extending Exception).
 * - The super(message) call is used to make the exception description available
 *   to the default exception handler.
 */
public class Main {
    public static void main(String[] args) throws TooYoungException {
        int age = 8;
        if (age < 18) {
            throw new TooYoungException("You are too young to apply.");
        }
    }
}