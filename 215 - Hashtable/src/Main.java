/*
 * Hashtable
 *
 * The underlying data structure is a **Hashtable** (array of buckets + linked lists for collisions).
 *
 * Characteristics:
 * - It is present in java.util package (legacy class, introduced in JDK 1.0).
 * - Insertion order is NOT preserved (depends on hashCode of keys).
 * - Duplicate KEYS are NOT allowed (latest value replaces old one).
 * - Duplicate VALUES are allowed.
 * - Heterogeneous objects are allowed for both key and value.
 * - **null key and null values are NOT allowed** (throws NullPointerException).
 * - Implements Serializable, Cloneable, and Map interfaces.
 * - **Synchronized** (thread-safe) — only one thread can access it at a time.
 * - Slower than HashMap due to synchronization overhead.
 * - Considered **obsolete** — replaced by `HashMap` (non-synchronized) and `ConcurrentHashMap` (better thread-safety).
 *
 * Constructors:
 * Hashtable hashtable = new Hashtable();
 *   → default initial capacity = 11, load factor = 0.75
 *
 * Hashtable hashtable = new Hashtable(int initialCapacity);
 *
 * Hashtable hashtable = new Hashtable(int initialCapacity, float loadFactor);
 *
 * Hashtable hashtable = new Hashtable(Map map);
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("Alex", 700);
        hashtable.put("Sasha", 800);
        hashtable.put("Kara", 200);
        hashtable.put("Lois", 500);

        System.out.println("Hashtable Elements: " + hashtable);
        // Order is not preserved

        // Uncommenting below line will throw NullPointerException
        // hashtable.put(null, 1000);   // Null key not allowed
        // hashtable.put("Bruce", null); // Null value not allowed

        System.out.println("\nKeys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());
    }
}
