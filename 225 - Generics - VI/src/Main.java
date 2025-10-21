/*
 * Generics
 *
 * Sometimes we don't want to restrict the type parameter to a specific type.
 * In such cases, we can use a wildcard (?).
 *
 * Types of Wildcards:
 *
 * - Unbounded Wildcard ( ? )
 *     - Used when you can accept any type.
 *     - Example: List<?> list
 *
 * - Upper Bounded Wildcard ( ? extends X )
 *     - Used when you want to accept X or its subclasses.
 *     - Example: List<? extends Number>
 *     - Read as: "List of some type which is either Number or a subclass of Number"
 *
 * - Lower Bounded Wildcard ( ? super X )
 *     - Used when you want to accept X or its superclasses.
 *     - Example: List<? super Integer>
 *     - Read as: "List of some type which is either Integer or a superclass of Integer"
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);
        List<String> stringList = Arrays.asList("Alex", "Kara", "Sasha");

        /*
         * Unbounded Wildcard
         */
        printList(stringList);   // Works for any type of list
        printList(intList);
        printList(doubleList);

        /*
         * Upper Bounded Wildcard (? extends Number)
         */
        sumOfNumbers(intList);
        sumOfNumbers(doubleList);
        // sumOfNumbers(stringList);  // Error: String is not a subclass of Number

        /*
         * Lower Bounded Wildcard (? super Integer)
         */
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println("After adding elements (Lower bound): " + numbers);
    }

    /*
     * Unbounded Wildcard Example
     */
    public static void printList(List<?> list) {
        System.out.println("Printing list elements: " + list);
    }

    /*
     * Upper Bounded Wildcard Example
     */
    public static void sumOfNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        System.out.println("Sum of elements: " + sum);
    }

    /*
     * Lower Bounded Wildcard Example
     */
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }
}
