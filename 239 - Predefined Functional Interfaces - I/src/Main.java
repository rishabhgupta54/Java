/*
 * Predefined Functional Interfaces
 *
 *
 * - Predicate is a functional interface in java.util.function package.
 * - It is used for conditional checks.
 * - Represents a single-argument function: takes input of type T, returns boolean.
 *
 *   public interface Predicate<T> {
 *       boolean test(T t);
 *   }
 *
 * - Common methods:
 *     - and() → combines two predicates with logical AND
 *     - or() → combines two predicates with logical OR
 *     - negate() → logical NOT (opposite result)
 */

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Predicate to check if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("isEven:");
        System.out.println(isEven.test(1)); // false
        System.out.println(isEven.test(2)); // true
        System.out.println(isEven.test(3)); // false

        // Predicate to check if number is greater than 5
        Predicate<Integer> isGreaterThan5 = n -> n > 5;

        System.out.println("\nCombined Predicate (isEven AND isGreaterThan5):");
        System.out.println(isEven.and(isGreaterThan5).test(5)); // false
        System.out.println(isEven.and(isGreaterThan5).test(6)); // true
        System.out.println(isEven.and(isGreaterThan5).test(7)); // false

        System.out.println("\nCombined Predicate (isEven OR isGreaterThan5):");
        System.out.println(isEven.or(isGreaterThan5).test(5)); // true (5>5 is false, 5%2==0 false → OR=false)
        System.out.println(isEven.or(isGreaterThan5).test(6)); // true
        System.out.println(isEven.or(isGreaterThan5).test(7)); // true

        System.out.println("\nNegated Predicate (!isEven):");
        System.out.println(isEven.negate().test(5)); // true
        System.out.println(isEven.negate().test(6)); // false
    }
}
