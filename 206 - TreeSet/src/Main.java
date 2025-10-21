/*
 * TreeSet
 *
 * Underlying Data Structure : Balanced Binary Search Tree (Red-Black Tree)
 * Duplicates Allowed        : No
 * Insertion Order           : Not preserved
 * Heterogeneous Objects     : Not allowed (ClassCastException if violated)
 * Null Allowed              : No (for natural ordering)
 * Implements                : Serializable, Cloneable, SortedSet, NavigableSet
 * RandomAccess              : No
 *
 * Use Case:
 *   - When you need automatically sorted set of elements.
 *   - Supports natural ordering or custom Comparator for sorting.
 *
 * Internal Structure (Balanced BST)
 *
 * Example insertion: "A", "a", "B", "Z", "L"
 *
 *        "A"
 *          \
 *           "B"
 *             \
 *              "L"
 *                \
 *                 "Z"
 *                   \
 *                    "a"
 *
 * ---------------------------------------------------------------------------
 *   TreeSet()                          -> natural sorting order
 *   TreeSet(Comparator comparator)     -> custom sorting order
 *   TreeSet(Collection collection)     -> elements from collection
 *   TreeSet(SortedSet sortedSet)       -> elements from SortedSet
 *
 * Common Methods:
 *   add(Object o)         : Adds element based on sorting
 *   remove(Object o)      : Removes specified element
 *   contains(Object o)    : Checks if element exists
 *   first()               : Returns first (lowest) element
 *   last()                : Returns last (highest) element
 *   size()                : Number of elements
 *   isEmpty()             : True if empty
 *   iterator()            : Traverses elements in sorted order
 *   comparator()          : Returns Comparator used (null if natural)
 *   pollFirst() / pollLast(): Removes and returns first/last element
 */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        // Adding elements (automatically sorted)
        treeSet.add("A");
        treeSet.add("a");
        treeSet.add("B");
        treeSet.add("Z");
        treeSet.add("L");

        // Print TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Additional operations
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        System.out.println("Contains 'B'? " + treeSet.contains("B"));
        treeSet.remove("A");
        System.out.println("After removing 'A': " + treeSet);
    }
}