/*
 * Equality Operators
 * Equality operators are used to compare two values or references.
 * They return boolean results: true if the values are equal, false otherwise.
 *
 * ==  → checks if two values or references are equal
 * !=  → checks if two values or references are not equal
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Equality operators can be applied to all primitive types
         */
        System.out.println("10 == 20 = " + (10 == 20));        // false
        System.out.println("'a' == 'b' = " + ('a' == 'b'));    // false
        System.out.println("'a' == 97.0 = " + ('a' == 97.0));  // true
        System.out.println("false == false = " + (false == false)); // true

        /*
         * Equality operators can also be applied to object references
         * r1 == r2 returns true only if both references point to the same object (reference comparison)
         */
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = thread1;

        System.out.println("thread1 == thread2 = " + (thread1 == thread2)); // false
        System.out.println("thread1 == thread3 = " + (thread1 == thread3)); // true

        /*
         * When using equality operators with objects, there must be a relationship between argument types:
         * - Same type
         * - Parent to child
         * - Child to parent
         * Otherwise, compile-time error occurs.
         */
        Thread thread4 = new Thread();
        Object object1 = new Object();
        String string1 = new String("Hello");
        System.out.println("thread4 == object1 = " + (thread4 == object1));
        System.out.println("object1 == string1 = " + (object1 == string1));
        // System.out.println("string1 == thread4 = " + (string1 == thread4)); // CE: incompatible types: String cannot be compared to Thread
    }
}
