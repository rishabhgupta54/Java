/*
 * ArrayList
 *
 * Key Points:
 * - Underlying data structure → Resizable array
 * - Insertion order → Preserved
 * - Duplicate and heterogeneous elements → Allowed
 * - Null insertion → Allowed
 * - Implements Serializable, Cloneable, and RandomAccess
 *
 * Constructors
 * ArrayList arrayList = new ArrayList();
 * → Creates an empty ArrayList with default capacity = 10
 *
 * ArrayList arrayList = new ArrayList(int initialCapacity);
 * → Creates an empty ArrayList with given initial capacity
 *
 * ArrayList arrayList = new ArrayList(Collection collection);
 * → Creates an ArrayList with elements copied from the given collection
 *
 * Capacity Growth Formula:
 * newCapacity = (oldCapacity * 3/2) + 1
 *
 * Performance
 * - Best for retrieval (fast random access via index)
 * - Worst for frequent insertions/deletions in the middle
 *
 * Marker Interfaces:
 * - Serializable → Supports object serialization
 * - Cloneable → Supports object cloning
 * - RandomAccess → Marker interface (no methods) indicating
 *   that ArrayList supports fast random access by index.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList arrayList = new ArrayList();

        System.out.println("Adding elements to ArrayList...");
        arrayList.add("A");
        arrayList.add(10);
        arrayList.add("A"); // duplicate
        arrayList.add(null); // null insertion
        System.out.println("Current list: " + arrayList);

        System.out.println("\nRemoving element at index 2 (the duplicate 'A')...");
        arrayList.remove(2);
        System.out.println("After removal: " + arrayList);

        System.out.println("\nAdding element 'M' at index 2...");
        arrayList.add(2, "M");

        System.out.println("Adding element 'N' at the end...");
        arrayList.add("N");

        System.out.println("Final ArrayList: " + arrayList);
    }
}
