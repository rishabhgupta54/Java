/*
 * HashSet
 *
 * Underlying Data Structure : Hash Table
 * Duplicates Allowed        : No
 * Insertion Order           : Not preserved (depends on hashCode)
 * Null Allowed              : Yes (only once)
 * Heterogeneous Objects     : Not recommended (should be same type for proper hashing)
 * Implements                : Serializable, Cloneable
 * RandomAccess              : No
 *
 * Use Case:
 *   - When fast search, add, remove operations are required.
 *   - HashSet provides O(1) average time complexity for these operations.
 *
 * Constructors:
 *   HashSet hashSet = new HashSet() -> initial capacity 16, load factor 0.75
 *   HashSet hashSet = new HashSet(int initialCapacity) -> specified capacity, default load factor 0.75
 *   HashSet hashSet = new HashSet(int initialCapacity, float fillRatio) -> specified capacity & load factor
 *   HashSet hashSet = new HashSet(Collection collection) -> creates HashSet containing all elements from collection
 *
 * Load Factor (Fill Ratio):
 *   - Determines when the internal hash table will resize
 *   - Default = 0.75 → resize occurs after 75% capacity filled
 *
 * Common Methods:
 *   add(Object o)          : Adds element; returns false if duplicate
 *   remove(Object o)       : Removes element if present
 *   contains(Object o)     : Checks if element exists
 *   size()                 : Returns number of elements
 *   isEmpty()              : True if HashSet is empty
 *   clear()                : Removes all elements
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        // Add elements
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add(null);
        hashSet.add(10);

        // Attempt to add duplicate
        System.out.println("Add duplicate Z: " + hashSet.add("Z")); // false

        // Print HashSet contents
        System.out.println("HashSet Contents: " + hashSet);

        // Other operations
        System.out.println("Contains 'B'? " + hashSet.contains("B"));
        hashSet.remove("C");
        System.out.println("After removing 'C': " + hashSet);
    }
}