/*
 * WeakHashMap
 *
 * The underlying data structure is a combination of:
 *      - Hashtable (array of buckets)
 *      - LinkedList (for handling hash collisions)
 *
 * Characteristics:
 * - It is present in java.util package.
 * - Insertion order is NOT preserved.
 * - Duplicate KEYS are NOT allowed (based on equals() and hashCode()).
 * - Duplicate VALUES are allowed.
 * - Heterogeneous objects are allowed for both key and value.
 * - null keys and null values are allowed.
 * - Implements Serializable and Cloneable interfaces.
 * - NOT synchronized.
 * - Keys are **weakly referenced**, meaning:
 *   → If a key object does not have any strong reference elsewhere in the program,
 *     it becomes eligible for Garbage Collection (GC).
 *   → When GC collects such a key, its entry is automatically removed from the map.
 *
 * Constructors:
 * WeakHashMap weakHashMap = new WeakHashMap();
 * WeakHashMap weakHashMap = new WeakHashMap(int initialCapacity);
 * WeakHashMap weakHashMap = new WeakHashMap(int initialCapacity, float loadFactor);
 * WeakHashMap weakHashMap = new WeakHashMap(Map map);
 */

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WeakHashMap weakMap = new WeakHashMap();

        // Creating keys as objects (not String literals)
        // String literals are stored in String pool and never GC'ed easily
        Object key1 = new String("Alex");
        Object key2 = new String("Sasha");

        weakMap.put(key1, 700);
        weakMap.put(key2, 800);

        System.out.println("Before GC: " + weakMap);

        // Removing strong reference to key1
        key1 = null;

        // Request garbage collection
        System.gc();

        // Give GC a moment to act
        Thread.sleep(1000);

        System.out.println("After GC: " + weakMap);
    }
}
