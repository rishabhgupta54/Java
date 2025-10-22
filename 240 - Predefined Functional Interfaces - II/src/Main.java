/*
 * Predefined Functional Interfaces
 *
 * - Function is a functional interface in java.util.function package.
 * - Represents a function that takes an input of type T and returns a result of type R.
 *   → Unlike Predicate, which always returns boolean, Function can return any type.
 *
 *   public interface Function<T, R> {
 *       R apply(T t);
 *   }
 *
 * - Common methods:
 *     - andThen(Function after) → first apply this function, then apply the 'after' function
 *     - compose(Function before) → first apply the 'before' function, then this function
 *     - identity() → returns a function that returns its input as it is
 */

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Function to calculate square of a number
        Function<Integer, Integer> square = n -> n * n;

        System.out.println("Square Function:");
        System.out.println(square.apply(4)); // 16
        System.out.println(square.apply(5)); // 25
        System.out.println(square.apply(6)); // 36

        // Function to calculate cube of a number
        Function<Integer, Integer> cube = n -> n * n * n;

        // Using andThen() → first square, then cube
        Function<Integer, Integer> squareThenCube = square.andThen(cube);
        System.out.println("\nSquare then Cube:");
        System.out.println(squareThenCube.apply(2)); // (2^2)^3 = 64

        // Using compose() → first cube, then square
        Function<Integer, Integer> cubeThenSquare = square.compose(cube);
        System.out.println("\nCube then Square:");
        System.out.println(cubeThenSquare.apply(2)); // (2^3)^2 = 64

        // Using identity() → returns input as is
        Function<Integer, Integer> identity = Function.identity();
        System.out.println("\nIdentity Function:");
        System.out.println(identity.apply(10)); // 10
        System.out.println(identity.apply(20)); // 20
    }
}
