/*
 * TreeMap
 *
 * The underlying data structure is a **Red-Black Tree (Self-Balancing Binary Search Tree)**.
 *
 * Characteristics:
 * - It is present in java.util package.
 * - Insertion order is NOT preserved.
 * - Keys are stored in **sorted (ascending) order** by default.
 * - Duplicate KEYS are NOT allowed.
 * - Duplicate VALUES are allowed.
 * - Heterogeneous keys are NOT allowed (will cause ClassCastException).
 * - null key is NOT allowed (NullPointerException), but null values are allowed.
 * - Implements NavigableMap, SortedMap, Serializable, and Cloneable interfaces.
 * - NOT synchronized.
 * - Best choice when frequent operation is **sorting** or **range-based search**.
 *
 * Constructors:
 * TreeMap treeMap = new TreeMap();
 *   → Creates an empty TreeMap with natural ordering of keys (ascending)
 *
 * TreeMap treeMap = new TreeMap(Comparator comparator);
 *   → Creates an empty TreeMap with specified comparator for custom sorting
 *
 * TreeMap treeMap = new TreeMap(Map map);
 *   → Creates a TreeMap initialized with the entries from another map
 */

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Default natural ordering (ascending order of keys)
        TreeMap treeMap = new TreeMap<>();

        treeMap.put("Alex", 700);
        treeMap.put("Sasha", 800);
        treeMap.put("Kara", 200);
        treeMap.put("Lois", 500);

        System.out.println("TreeMap Elements (Sorted by Key): " + treeMap);
    }
}
