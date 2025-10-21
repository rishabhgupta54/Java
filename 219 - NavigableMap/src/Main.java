/*
 * NavigableMap
 *
 * The underlying data structure is a **Red-Black Tree** (implemented via TreeMap).
 *
 * - Present in java.util package.
 * - It is a **SortedMap** with extra navigation methods for key-based search.
 * - Keys are stored in **sorted (ascending)** order by default.
 * - Duplicate KEYS are NOT allowed.
 * - Duplicate VALUES are allowed.
 * - Heterogeneous keys are NOT allowed (ClassCastException at runtime).
 * - Null key is NOT allowed (NullPointerException) — but null values are allowed.
 * - Not synchronized.
 * - Implements NavigableMap, SortedMap, Map, Cloneable, Serializable.
 * - Best suited for **range lookups**, **floor/ceiling key operations**, and **ordered traversal**.
 *
 *
 * Important Methods:
 * - K lowerKey(K key)        → greatest key < key
 * - K floorKey(K key)        → greatest key ≤ key
 * - K ceilingKey(K key)      → smallest key ≥ key
 * - K higherKey(K key)       → smallest key > key
 * - Map.Entry firstEntry() / lastEntry()
 * - Map.Entry pollFirstEntry() / pollLastEntry()
 * - NavigableMap descendingMap()
 * - NavigableMap subMap(K from, boolean fromInclusive, K to, boolean toInclusive)
 * - NavigableMap headMap(K to, boolean inclusive)
 * - NavigableMap tailMap(K from, boolean inclusive)
 *
 * Constructors (via TreeMap):
 * TreeMap treeMap = new TreeMap<>();
 * TreeMap treeMap = new TreeMap<>(Comparator comparator);
 * TreeMap treeMap = new TreeMap<>(Map map);
 * TreeMap treeMap = new TreeMap<>(SortedMap map);
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        NavigableMap navMap = new TreeMap<>();

        navMap.put(30, "C");
        navMap.put(10, "A");
        navMap.put(20, "B");
        navMap.put(40, "D");
        navMap.put(50, "E");
        navMap.put(60, "F");

        System.out.println("NavigableMap Elements (Ascending): " + navMap);
        // Output: {10=A, 20=B, 30=C, 40=D, 50=E, 60=F}

        System.out.println("\n---- Navigation Methods ----");
        System.out.println("lowerKey(30): " + navMap.lowerKey(30));     // < 30 → 20
        System.out.println("floorKey(30): " + navMap.floorKey(30));     // ≤ 30 → 30
        System.out.println("ceilingKey(30): " + navMap.ceilingKey(30)); // ≥ 30 → 30
        System.out.println("higherKey(30): " + navMap.higherKey(30));   // > 30 → 40

        System.out.println("\nFirst Entry: " + navMap.firstEntry());
        System.out.println("Last Entry: " + navMap.lastEntry());

        System.out.println("\n---- Submap Views ----");
        System.out.println("headMap(<40): " + navMap.headMap(40, false)); // {10=A, 20=B, 30=C}
        System.out.println("tailMap(30, true): " + navMap.tailMap(30, true)); // {30=C, 40=D, 50=E, 60=F}
        System.out.println("subMap(20, true, 50, false): " + navMap.subMap(20, true, 50, false)); // {20=B, 30=C, 40=D}

        System.out.println("\nDescending Map View: " + navMap.descendingMap());

        System.out.println("\n---- Polling Entries ----");
        System.out.println("pollFirstEntry(): " + navMap.pollFirstEntry()); // removes 10=A
        System.out.println("pollLastEntry(): " + navMap.pollLastEntry());   // removes 60=F
        System.out.println("After Polling: " + navMap);
    }
}
