/*
 * HashMap
 *
 * The underlying data structure is a combination of:
 *      - Array (called "table" of buckets)
 *      - LinkedList / Tree (for handling hash collisions)
 *
 * Characteristics:
 * - Insertion order is NOT preserved (based on hashcode of keys)
 * - Duplicate KEYS are NOT allowed (latest value replaces old one)
 * - Duplicate VALUES are allowed
 * - Heterogeneous objects allowed for both key and value
 * - null key is allowed (only one), multiple null values allowed
 * - Implements Serializable and Cloneable interfaces
 * - NOT synchronized (use Collections.synchronizedMap() for thread-safety)
 * - Best choice when frequent operation is SEARCH (get/put)
 *
 * Constructors:
 * HashMap hashMap = new HashMap();
 *   → default capacity = 16, default load factor = 0.75
 *
 * HashMap hashMap = new HashMap(int initialCapacity);
 *   → specified capacity, default load factor = 0.75
 *
 * HashMap hashMap = new HashMap(int initialCapacity, float loadFactor);
 *
 * HashMap hashMap = new HashMap(Map map);
 *
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap<>();

        hashMap.put("Alex", 700);
        hashMap.put("Sasha", 800);
        hashMap.put("Kara", 200);
        hashMap.put("Lois", 500);

        System.out.println("HashMap Elements: " + hashMap);
    }
}
