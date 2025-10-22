/*
 * Predefined Functional Interfaces
 *
 * - BiFunction is similar to Function but works with two input arguments.
 * - Represents a function that takes two inputs (T and U) and returns a result (R).
 *
 *   public interface BiFunction<T, U, R> {
 *       R apply(T t, U u);
 *   }
 *
 * - Useful for combining or transforming two values into a single result.
 * - Common methods:
 *     - andThen(Function after) → applies this function first, then applies the 'after' function
 */

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        // BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Add 5 + 10: " + add.apply(5, 10)); // 15

        // BiFunction to concatenate two strings
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;
        System.out.println(concat.apply("Hello", "World")); // Hello World

        // BiFunction with andThen() → apply another function after
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.andThen(result -> result + 100).apply(5, 4));
        // (5*4) + 100 = 120
    }
}
