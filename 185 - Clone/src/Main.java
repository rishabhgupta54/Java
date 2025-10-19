/*
 * Clone
 *
 * Cloning is the process of creating an exact duplicate of an object.
 * The main purpose of cloning is to maintain a backup copy or preserve the state of an object.
 *
 * Object class provides the clone() method:
 *   protected native Object clone() throws CloneNotSupportedException;
 *
 * Only objects of classes that implement the Cloneable interface can be cloned.
 * Cloneable is a marker interface (no methods) in java.lang package.
 * If we attempt to clone a non-cloneable object, a CloneNotSupportedException is thrown.
 *
 * By default, clone() provides a shallow copy:
 * - Primitive fields are copied.
 * - Reference fields still point to the same objects.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating the original object
        A a1 = new A();

        // Cloning a1 to create a new object a2
        A a2 = a1.clone();

        // Modifying fields of the cloned object
        a2.i = 888;
        a2.j = 999;

        // Printing values of cloned object
        System.out.println("Cloned a2.i: " + a2.i); // 888
        System.out.println("Cloned a2.j: " + a2.j); // 999

        // Printing values of original object to show it is unaffected
        System.out.println("Original a1.i: " + a1.i); // 10
        System.out.println("Original a1.j: " + a1.j); // 20
    }
}

