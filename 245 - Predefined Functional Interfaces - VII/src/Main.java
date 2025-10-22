/*
 * Predefined Functional Interfaces
 *
 * - BiConsumer is similar to Consumer but works with two input arguments.
 * - Represents an operation that takes two inputs (T and U) and returns nothing.
 *
 *   public interface BiConsumer<T, U> {
 *       void accept(T t, U u);
 *   }
 *
 * - Useful for performing actions that involve two values (e.g., printing, logging, saving) without returning a result.
 * - Common method:
 *     - andThen(BiConsumer after) → chains multiple BiConsumers in sequence
 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        // BiConsumer to print two values
        BiConsumer<String, Integer> printNameAndAge = (name, age) -> System.out.println(name + " is " + age + " years old");

        printNameAndAge.accept("Alex", 25); // Alex is 25 years old
        printNameAndAge.accept("Kara", 30); // Kara is 30 years old

        // BiConsumer to update a map
        Map<String, Integer> scores = new HashMap<>();
        BiConsumer<String, Integer> addToMap = (key, value) -> scores.put(key, value);

        addToMap.accept("Math", 90);
        addToMap.accept("Science", 85);

        System.out.println(scores); // {Math=90, Science=85}

        // Chaining BiConsumers using andThen()
        BiConsumer<String, Integer> printAndAdd = addToMap.andThen(printNameAndAge);
        printAndAdd.accept("Sasha", 28);
        // Adds to map and prints: Sasha is 28 years old

        System.out.println(scores); // {Math=90, Science=85, Sasha=28}
    }
}
