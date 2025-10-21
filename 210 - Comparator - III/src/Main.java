/*
 * TreeSet
 *
 * - Employee class implements Comparable for natural ordering by `id`.
 * - MyComparator defines custom ordering by `name`.
 * - TreeSet uses Comparable by default if no Comparator is provided.
 * - Duplicates are not added (compareTo() or compare() returns 0).
 *
 * Key Points:
 * - Comparable: defines default natural order
 * - Comparator: defines custom order (if default is not suitable)
 */

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Create Employee objects
        Employee employee1 = new Employee(3, "Kara");
        Employee employee2 = new Employee(2, "Alex");
        Employee employee3 = new Employee(1, "Emma");

        // TreeSet using natural ordering (Comparable) → sorts by id
        TreeSet<Employee> treeSet1 = new TreeSet<>();
        treeSet1.add(employee1);
        treeSet1.add(employee2);
        treeSet1.add(employee3);

        System.out.println("TreeSet with Comparable (by id): " + treeSet1);

        // TreeSet using custom Comparator → sorts by name
        TreeSet<Employee> treeSet2 = new TreeSet<>(new MyComparator());
        treeSet2.add(employee1);
        treeSet2.add(employee2);
        treeSet2.add(employee3);

        System.out.println("TreeSet with Comparator (by name): " + treeSet2);
    }
}

