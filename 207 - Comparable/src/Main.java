/*
 * Comparable
 *
 * - Present in java.lang package
 * - Single method to define natural ordering:
 *
 *     public int compareTo(Object object)
 *
 * - Usage: object1.compareTo(object2)
 *
 *     return -ve : object1 comes before object2
 *     return +ve : object1 comes after object2
 *     return   0 : object1 equals object2
 *
 * Examples:
 *     "A".compareTo("Z") → negative
 *     "Z".compareTo("K") → positive
 *     "A".compareTo("A") → 0
 *     "A".compareTo(null) → Runtime Exception (NullPointerException)
 *
 * How TreeSet uses Comparable:
 *
 * - TreeSet maintains sorted order automatically.
 * - When inserting a new element:
 *
 *     objectToInsert.compareTo(existingObject)
 *
 *   Determines the position in the tree:
 *     - Negative → left subtree
 *     - Positive → right subtree
 *     - Zero     → duplicate, not added
 *
 * - If default natural sorting order is not available or we are not satisfied
 *   with the default, we can use a custom sorting order by using Comparator.
 */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add("K");
        treeSet.add("Z");

        System.out.println("\"K\".compareTo(\"Z\") = " + "K".compareTo("Z")); // -ve

        treeSet.add("A");
        System.out.println("\"A\".compareTo(\"K\") = " + "A".compareTo("K")); // -ve

        treeSet.add("A"); // duplicate, will not be added
        System.out.println("\"A\".compareTo(\"K\") = " + "A".compareTo("K")); // -ve
        System.out.println("\"A\".compareTo(\"A\") = " + "A".compareTo("A")); // 0

        System.out.println("TreeSet Contents: " + treeSet); // Sorted order
    }
}