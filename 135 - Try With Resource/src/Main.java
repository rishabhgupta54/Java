/*
 * Try With Resource
 * As a part of Java v1.7, two important concepts were introduced in exception handling:
 * 1. try-with-resources
 * 2. multi-catch block
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        tryWithoutResource();
        tryWithResource();
        tryWithMultiCatch();
    }

    /*
     * Until Java v1.6, it was highly recommended to write a finally block to close
     * resources that were opened as part of the try block.
     *
     * Problems with this approach:
     * - The programmer must explicitly close the resources inside the finally block.
     * - It increases the complexity of programming.
     * - The code length increases and readability decreases.
     */
    public static void tryWithoutResource() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("input.txt"));
            System.out.println("Reading file using try-finally (Java v1.6 style).");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    System.out.println("Resource closed manually inside finally block.");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /*
     * To overcome these problems, Sun introduced try-with-resources in Java v1.7.
     *
     * Advantages:
     * - Resources opened inside the try() will be closed automatically once
     *   control exits the try block, either normally or abnormally.
     * - No need to close resources explicitly.
     * - Multiple resources can be declared inside try(), separated by semicolons.
     * - All resources must be AutoCloseable (i.e., implement java.lang.AutoCloseable).
     * - All resource reference variables are implicitly final.
     * - Until v1.6, try had to be associated with either catch or finally.
     *   From v1.7 onwards, try-with-resources can be used without catch or finally.
     */
    public static void tryWithResource() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            System.out.println("Reading file using try-with-resources (Java v1.7+ style).");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
     * Multi-Catch Block
     * Introduced in Java v1.7 to reduce code duplication.
     *
     * - We can handle multiple exception types in a single catch block using '|'.
     * - There should be no relationship between exception types (no parent-child or same type),
     *   otherwise, we get a compile-time error.
     */
    public static void tryWithMultiCatch() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception handled using multi-catch: " + e.getClass().getSimpleName());
        }

        //Invalid Example (will cause compile-time error):
        // catch (IOException | FileNotFoundException e) { }
        // Because FileNotFoundException is a subclass of IOException
    }
}
