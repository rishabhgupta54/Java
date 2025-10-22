/*
 * Predefined Functional Interfaces
 *
 * - BiPredicate is similar to Predicate but works with two input arguments instead of one.
 * - Represents a function that takes two inputs (T and U) and returns a boolean.
 *
 *   public interface BiPredicate<T, U> {
 *       boolean test(T t, U u);
 *   }
 *
 * - Useful for conditions that involve two values (e.g., comparing two numbers, checking two strings, etc.)
 * - Common methods:
 *     - and() → combines two BiPredicates with logical AND
 *     - or() → combines two BiPredicates with logical OR
 *     - negate() → opposite of the original BiPredicate
 */

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        // BiPredicate to check if first number is greater than the second
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

        System.out.println(isGreater.test(10, 5));  // true
        System.out.println(isGreater.test(3, 8));   // false

        // BiPredicate to check if two strings have the same length
        BiPredicate<String, String> sameLength = (s1, s2) -> s1.length() == s2.length();

        System.out.println(sameLength.test("Java", "Code"));   // true
        System.out.println(sameLength.test("Hello", "World!")); // false

        // Chaining BiPredicates using and()
        BiPredicate<Integer, Integer> lessThan20 = (a, b) -> (a + b) < 20;
        BiPredicate<Integer, Integer> combined = isGreater.and(lessThan20);

        System.out.println(combined.test(10, 5));  // true (10>5 && 10+5<20)
        System.out.println(combined.test(15, 10)); // false (15>10 && 15+10<20 → false)
    }
}
