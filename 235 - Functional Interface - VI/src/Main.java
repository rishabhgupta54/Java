/*
 * Functional Interface
 *
 * - The `Comparator` interface is a functional interface because it has only one abstract method:
 *     → int compare(T o1, T o2);
 *
 * - Before Java 8:
 *     → We had to create a separate class (e.g., MyComparator) implementing Comparator.
 *
 * - From Java 8 onwards:
 *     → We can use lambda expressions to directly define custom comparison logic.
 *
 * - This makes sorting logic short, expressive, and avoids extra boilerplate classes.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Sorting using traditional Comparator implementation
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(15);
        arrayList1.add(45);
        arrayList1.add(5);
        arrayList1.add(90);

        System.out.println("Original List (Traditional): " + arrayList1);
        arrayList1.sort(new MyComparator()); // Sort in descending order
        System.out.println("Sorted (Using MyComparator Class): " + arrayList1);


        // Sorting using Lambda Expression (Functional Interface)
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(20);
        arrayList2.add(15);
        arrayList2.add(45);
        arrayList2.add(5);
        arrayList2.add(90);

        System.out.println("\nOriginal List (Lambda): " + arrayList2);

        // Lambda comparator for descending order
        Comparator<Integer> comparator = (i1, i2) -> {
            if (i1 > i2)
                return -1;
            else if (i1 < i2)
                return 1;
            else
                return 0;
        };

        arrayList2.sort(comparator);
        System.out.println("Sorted (Using Lambda): " + arrayList2);
    }
}

