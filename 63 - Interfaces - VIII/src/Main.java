/*
 * Interfaces
 *
 * Marker Interfaces:
 * → If an interface does not contain any methods and by implementing that interface
 *   if our object gets some special ability, such types of interfaces are called marker interfaces.
 *
 * Examples of Marker Interfaces in Java:
 *
 * 1. java.io.Serializable
 *    - If a class implements Serializable, its objects can be saved to a file (serialization)
 *      and can travel across the network.
 *
 * 2. java.lang.Cloneable
 *    - If a class implements Cloneable, its objects can produce an exactly duplicate (cloned) object
 *      using Object.clone().
 *
 * 3. java.util.RandomAccess
 *    - Implemented by List classes that support fast (constant time) random access.
 *      Example: ArrayList implements RandomAccess.
 *
 * 4. java.rmi.Remote
 *    - Used in Remote Method Invocation (RMI).
 *      If an object implements Remote, it can be invoked from a non-local virtual machine.
 *
 * 5. java.util.EventListener
 *    - Super interface for all event listener interfaces in event handling.
 *      Example: ActionListener, MouseListener, etc.
 *
 * Purpose:
 * → Marker interfaces are used as "tags" to signal the JVM or frameworks
 *   that a particular class has a special property or should be treated differently.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Marker interfaces demonstration");
    }
}
