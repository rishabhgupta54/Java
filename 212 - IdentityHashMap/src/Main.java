/*
 * IdentityHashMap
 *
 * The underlying data structure is also a combination of:
 *      - Array (called "table" of buckets)
 *      - LinkedList (for handling hash collisions)
 *
 * Characteristics:
 * - It is present in java.util package.
 * - Insertion order is NOT preserved.
 * - Duplicate KEYS are NOT allowed (based on '==' reference equality, not equals()).
 * - Duplicate VALUES are allowed.
 * - Heterogeneous objects are allowed for both key and value.
 * - null keys and null values are allowed.
 * - Implements Serializable and Cloneable interfaces.
 * - NOT synchronized.
 * - It uses **reference equality (==)** instead of **object equality (equals())** for comparing keys.
 *
 * Constructors:
 * IdentityHashMap identityHashMap = new IdentityHashMap();
 *   → default initial capacity = 32
 *
 * IdentityHashMap identityHashMap = new IdentityHashMap(int expectedMaxSize);
 *   → creates map with specified expected maximum size
 */

import java.util.IdentityHashMap;

public class Main {
    public static void main(String[] args) {

        IdentityHashMap identityMap = new IdentityHashMap();

        String s1 = new String("Alex");
        String s2 = new String("Alex");

        identityMap.put(s1, 700);
        identityMap.put(s2, 1000);

        System.out.println("IdentityHashMap Elements: " + identityMap);
        // Both entries will exist because s1 == s2 is false (different references)

        // Demonstrating behavior
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1 == s2: " + (s1 == s2));         // false
    }
}
