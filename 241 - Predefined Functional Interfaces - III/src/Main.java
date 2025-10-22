/*
 * Predefined Functional Interfaces
 *
 * - Consumer is a functional interface in java.util.function package.
 * - Represents an operation that takes a single input and returns no result.
 * - Mainly used when performing actions like:
 *     → printing
 *     → logging
 *     → saving data
 *
 *   public interface Consumer<T> {
 *       void accept(T t);
 *   }
 *
 * - Common method:
 *     - andThen(Consumer after) → allows chaining multiple Consumers in sequence
 */

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Consumer to print an integer
        Consumer<Integer> printNumber = n -> System.out.println("Number: " + n);

        printNumber.accept(5); // Number: 5
        printNumber.accept(10); // Number: 10

        // Consumer to square a number and print
        Consumer<Integer> printSquare = n -> System.out.println("Square: " + (n * n));
        printSquare.accept(4); // Square: 16

        // Chaining Consumers using andThen()
        Consumer<Integer> combinedConsumer = printNumber.andThen(printSquare);
        combinedConsumer.accept(3);

        // Example with list
        List<String> names = Arrays.asList("Alex", "Kara", "Sasha");
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        names.forEach(greet);
    }
}
