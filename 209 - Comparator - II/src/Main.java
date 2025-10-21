/*
 * Comparator
 * - Used to define a customized sorting order for collections.
 * - Present in java.util package.
 * - Only compare() method implementation is required.
 * - equals() method is inherited from Object and usually not overridden.
 *
 * TreeSet with Comparator:
 * - Allows custom order instead of natural (Comparable) order.
 * - Duplicate elements are not added (compare() returns 0).
 *
 * Example:
 * - Sort strings in reverse alphabetical order.
 */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSet using custom Comparator (reverse order)
        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add("Kara");
        treeSet.add("Emma");
        treeSet.add("Eva");
        treeSet.add("Christmax");
        treeSet.add("Samantha");
        treeSet.add("Alex");

        System.out.println("TreeSet with custom Comparator: " + treeSet);
    }
}
