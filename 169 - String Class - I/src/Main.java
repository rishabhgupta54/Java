/*
 * String Class
 * Once we create a String object, we cannot perform any changes on the existing object.
 * If we try to perform any change, a NEW object will be created with the modified content.
 * This non-changeable behavior is known as IMMUTABILITY of String.
 *
 * Once we create a StringBuffer object, we can perform changes on the existing object
 * (like append, insert, delete). This changeable behavior is known as MUTABILITY
 * of StringBuffer.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * String (Immutable)
         * Any modification creates a new object.
         */
        String string = new String("Hello");
        System.out.println("Original String: " + string);

        string.concat(" World");  // This creates a new object, but not assigned
        System.out.println("After concat (without reassignment): " + string);

        String newString = string.concat(" World"); // assign new reference
        System.out.println("After concat (with reassignment): " + newString);

        System.out.println("---------------------------------------------");

        /*
         * StringBuffer (Mutable)
         * Changes are made in the same existing object.
         */
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);

        stringBuffer.append(" World");  // Modifies the same object
        System.out.println("After append: " + stringBuffer);
    }
}
