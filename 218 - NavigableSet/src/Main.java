/*
 * NavigableSet
 *
 * The underlying data structure is a **Red-Black Tree** (via TreeSet implementation).
 *
 * Characteristics:
 * --------------------
 * - Present in java.util package.
 * - It is a **SortedSet** with navigation methods for traversing in both directions.
 * - Elements are stored in **sorted (ascending)** order by default.
 * - Duplicate elements are NOT allowed.
 * - Heterogeneous elements are NOT allowed (ClassCastException at runtime).
 * - Null elements are NOT allowed (NullPointerException in TreeSet).
 * - Implements NavigableSet, SortedSet, Set, Cloneable, Serializable.
 * - Not synchronized.
 * - Best suited for **range searches**, **floor/ceiling lookups**, and **sorted traversal**.
 *
 * Implementations:
 * - TreeSet (most common)
 * - ConcurrentSkipListSet (thread-safe alternative)
 *
 *
 * Important Methods:
 * - E lower(E e)       → greatest element < e
 * - E floor(E e)       → greatest element ≤ e
 * - E ceiling(E e)     → smallest element ≥ e
 * - E higher(E e)      → smallest element > e
 * - E pollFirst()      → removes and returns first element
 * - E pollLast()       → removes and returns last element
 * - NavigableSet<E> descendingSet() → reverse order view
 * - NavigableSet<E> subSet(E from, boolean fromInclusive, E to, boolean toInclusive)
 * - NavigableSet<E> headSet(E to, boolean inclusive)
 * - NavigableSet<E> tailSet(E from, boolean inclusive)
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableSet navSet = new TreeSet<>();

        navSet.add(10);
        navSet.add(30);
        navSet.add(20);
        navSet.add(50);
        navSet.add(40);
        navSet.add(60);

        System.out.println("NavigableSet Elements (Ascending): " + navSet);
        // Output: [10, 20, 30, 40, 50, 60]

        System.out.println("\n---- Navigation Methods ----");
        System.out.println("lower(30): " + navSet.lower(30));     // < 30 → 20
        System.out.println("floor(30): " + navSet.floor(30));     // ≤ 30 → 30
        System.out.println("ceiling(30): " + navSet.ceiling(30)); // ≥ 30 → 30
        System.out.println("higher(30): " + navSet.higher(30));   // > 30 → 40

        System.out.println("\nFirst Element: " + navSet.first());
        System.out.println("Last Element: " + navSet.last());

        System.out.println("\n---- Subset Views ----");
        System.out.println("headSet(<40): " + navSet.headSet(40, false)); // [10, 20, 30]
        System.out.println("tailSet(30, true): " + navSet.tailSet(30, true)); // [30, 40, 50, 60]
        System.out.println("subSet(20, true, 50, false): " + navSet.subSet(20, true, 50, false)); // [20, 30, 40]

        System.out.println("\nDescending Order View: " + navSet.descendingSet());

        System.out.println("\n---- Polling Elements ----");
        System.out.println("pollFirst(): " + navSet.pollFirst()); // removes 10
        System.out.println("pollLast(): " + navSet.pollLast());   // removes 60
        System.out.println("After Polling: " + navSet);
    }
}
