/*
 * Predefined Functional Interfaces
 *
 * - Supplier is a functional interface in java.util.function package.
 * - Represents a function that takes no input but returns a result.
 * - Essentially the opposite of Consumer:
 *     - Consumer → takes input, returns nothing
 *     - Supplier → takes nothing, returns output
 *
 *   public interface Supplier<T> {
 *       T get();
 *   }
 *
 * - Useful for lazy evaluation, generating values on demand, or providing default values.
 */

import java.util.Date;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Supplier to provide current date
        Supplier<Date> currentDateSupplier = () -> new Date();
        System.out.println("Current Date: " + currentDateSupplier.get());

        // Supplier to generate a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomNumberSupplier.get());

        // Supplier to return a fixed string
        Supplier<String> greetingSupplier = () -> "Hello, Java!";
        System.out.println(greetingSupplier.get());
    }
}
