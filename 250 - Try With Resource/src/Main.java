/*
 * Try With Resources
 *
 * Java 7:
 * - try-with-resources was introduced in Java 7
 * - Resource must be declared inside the parentheses of try
 * - Automatically calls close() at the end of try block
 *
 * Example:
 * try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
 *      // use br
 * }
 * // br is automatically closed
 *
 * Java 8:
 * - Still requires resource declaration inside try
 * - No major change in try-with-resources
 *
 * Java 9:
 * - You can declare the resource outside the try block
 * - Resource must be effectively final
 * - Useful when resource needs to be shared or initialized before try block
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Resource initialized outside
            reader = new BufferedReader(new FileReader("sample.txt"));

            // Try-with-resources using the externally declared resource (Java 9+ feature)
            try (BufferedReader br = reader) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } // br (and reader) will be automatically closed here

        } catch (IOException e) {
            e.printStackTrace();
        }

        // reader cannot be used here as it is already closed
    }
}
