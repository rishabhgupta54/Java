/*
 * Vector
 *
 * Underlying Data Structure : Resizable Array
 * Insertion Order            : Preserved
 * Duplicates Allowed         : Yes
 * Heterogeneous Objects      : Allowed
 * Null Insertion             : Allowed
 * Thread-Safe                : Yes (All methods are synchronized)
 * Implements                 : Serializable, Cloneable, RandomAccess, List
 *
 * When to Use:
 *   - When thread safety is required.
 *   - When you need dynamic resizing like ArrayList, but with synchronization.
 *
 * Internal Growth Mechanism:
 *   Initial Capacity = 10
 *   On Overflow:
 *       newCapacity = currentCapacity * 2
 *
 * Constructors:
 *   Vector vector = new Vector() -> default capacity = 10
 *   Vector vector = new Vector(int initialCapacity)
 *   Vector vector = new Vector(int initialCapacity, int capacityIncrement)
 *   Vector vector = new Vector(Collection collection)
 *
 * Common Methods:
 *   add(Object o)                      : Add element at end
 *   add(int index, Object o)           : Insert at specific position
 *   addElement(Object o)               : Legacy method, same as add()
 *   remove(Object o)                   : Remove first occurrence of o
 *   removeElement(Object o)            : Legacy method, same as remove()
 *   remove(int index)                  : Remove element at index
 *   removeElementAt(int index)         : Legacy method
 *   clear()                            : Remove all elements
 *   removeAllElements()                : Legacy method for clear()
 *   get(int index)                     : Retrieve element by index
 *   elementAt(int index)               : Legacy method for get()
 *   firstElement()                     : Get first element
 *   lastElement()                      : Get last element
 *   size()                             : Current number of elements
 *   capacity()                         : Current total capacity
 *   contains(Object o)                 : Check existence
 *   isEmpty()                          : Check if empty
 *   clone()                            : Create shallow copy
 */

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(); // default capacity 10
        System.out.println("Initial Capacity: " + vector.capacity());

        // Add 10 elements
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        System.out.println("Capacity after 10 elements: " + vector.capacity());

        // Adding 11th element forces capacity to double
        vector.addElement("A");

        System.out.println("Capacity after adding 11th element: " + vector.capacity());
        System.out.println("Vector Contents: " + vector);

        // Demonstrate legacy and modern methods
        vector.removeElementAt(2);
        vector.add(2, "Inserted");

        System.out.println("After modifications: " + vector);
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}