/*
 * Stream
 *
 * - A Stream in Java is a sequence of elements (from a Collection, Array, or I/O source)
 *   that supports functional-style operations like filtering, mapping, and reducing.
 * - Streams do not store data; they process data from a source.
 * - Belongs to `java.util.stream` package.
 * - Can work with sequential and parallel execution.
 *
 * Methods
 * 1. Creation Methods:
 *    - stream() → converts a Collection to a Stream
 *    - Arrays.stream(array) → converts an array to Stream
 *    - Stream.of(...) → creates a Stream from given values
 *
 * 2. Intermediate Operations (return Stream; can be chained):
 *    - filter(Predicate<T> predicate) → filters elements based on a condition
 *    - map(Function<T, R> mapper) → transforms each element to another form
 *    - mapToInt / mapToDouble / mapToLong → specialized mapping to primitive streams
 *    - distinct() → removes duplicate elements
 *    - sorted() → sorts elements (natural order)
 *    - sorted(Comparator<T>) → sorts using custom comparator
 *    - limit(long maxSize) → returns first n elements
 *    - skip(long n) → skips first n elements
 *    - peek(Consumer<T> action) → performs an action on each element (mainly for debugging)
 *
 * 3. Terminal Operations (produce result or side-effect):
 *    - forEach(Consumer<T> action) → performs action on each element
 *    - forEachOrdered(Consumer<T> action) → performs action in encounter order (for parallel streams)
 *    - toArray() → collects elements into an array
 *    - reduce(BinaryOperator<T>) → reduces elements to a single value
 *    - reduce(identity, BinaryOperator<T>) → reduces elements with an initial value
 *    - collect(Collector) → collects elements into Collection, Map, or other forms
 *      Example: Collectors.toList(), Collectors.toSet(), Collectors.toMap()
 *    - min(Comparator<T>) / max(Comparator<T>) → finds min/max element
 *    - count() → returns number of elements
 *    - anyMatch(Predicate<T>) → returns true if any element matches predicate
 *    - allMatch(Predicate<T>) → returns true if all elements match predicate
 *    - noneMatch(Predicate<T>) → returns true if no element matches predicate
 *    - findFirst() → returns Optional<T> with the first element
 *    - findAny() → returns Optional<T> with any element (useful for parallel streams)
 *
 * 4. Other Methods:
 *    - parallel() → converts sequential stream to parallel stream
 *    - sequential() → converts parallel stream to sequential
 *    - iterator() → returns iterator of stream elements
 *
 * Notes:
 * - Streams are lazy, intermediate operations are not executed until terminal operation is called.
 * - Streams cannot be reused once a terminal operation is invoked.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1. Stream Creation
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20, 30);

        Stream<Integer> numberStream = numbers.stream(); // from collection
        Stream<Integer> numberStream2 = Stream.of(5, 15, 25, 35); // from values
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4}); // from array

        // 2. Intermediate Operations

        // filter() → only numbers greater than 20
        List<Integer> filtered = numbers.stream().filter(n -> n > 20).collect(Collectors.toList());
        System.out.println("Filtered (>20): " + filtered);

        // map() → square each number
        List<Integer> squared = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared: " + squared);

        // distinct() → remove duplicates
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct: " + distinctNumbers);

        // sorted() → natural order
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted: " + sortedNumbers);

        // limit() → first 3 elements
        List<Integer> first3 = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("First 3: " + first3);

        // skip() → skip first 2 elements
        List<Integer> skip2 = numbers.stream().skip(2).collect(Collectors.toList());
        System.out.println("Skip first 2: " + skip2);

        // peek() → print each element during processing
        System.out.println("Peek example:");
        numbers.stream().peek(n -> System.out.println("Processing: " + n)).map(n -> n * 2).collect(Collectors.toList());

        // 3. Terminal Operations

        // forEach() → print each number
        System.out.print("forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // reduce() → sum all numbers
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // min() and max()
        int min = numbers.stream().min(Integer::compareTo).get();
        int max = numbers.stream().max(Integer::compareTo).get();
        System.out.println("Min: " + min + ", Max: " + max);

        // count()
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // anyMatch(), allMatch(), noneMatch()
        boolean anyGT40 = numbers.stream().anyMatch(n -> n > 40);
        boolean allGT5 = numbers.stream().allMatch(n -> n > 5);
        boolean noneGT100 = numbers.stream().noneMatch(n -> n > 100);
        System.out.println("Any > 40: " + anyGT40);
        System.out.println("All > 5: " + allGT5);
        System.out.println("None > 100: " + noneGT100);

        // findFirst() and findAny()
        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println("First: " + first.get());
        System.out.println("Any: " + any.get());

        // Collectors.toSet() → collect into set
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        System.out.println("Set: " + numberSet);

        // Parallel Stream
        int parallelSum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel sum: " + parallelSum);
    }
}

