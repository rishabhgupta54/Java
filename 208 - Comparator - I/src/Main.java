/*
 * Comparator
 *
 * - Present in java.util package
 * - Defines custom sorting order for collections
 *
 * Methods:
 *   public int compare(Object o1, Object o2)
 *     return -ve : object1 comes before object2
 *     return +ve : object1 comes after object2
 *     return   0 : object1 equals object2
 *
 *   public boolean equals(Object obj)
 *       - Already inherited from Object class
 *       - Usually not overridden
 *
 * Key Points:
 * - Used when default natural sorting order (Comparable) is not suitable
 * - Can be used with TreeSet, TreeMap, Collections.sort(), etc.
 * - Only compare() method implementation is required
 * - Duplicates are not added in TreeSet (compare() returns 0)
 */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // TreeSet using custom Comparator
        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(20); // duplicate, ignored

        System.out.println("TreeSet with custom sorting: " + treeSet);
    }
}
