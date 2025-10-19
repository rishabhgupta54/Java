/*
 * FileWriter Class
 *
 * We can use FileWriter to write CHARACTER DATA to a file.
 * It is the character-oriented alternative to FileOutputStream.
 *
 * Constructors
 * FileWriter fileWriter = new FileWriter(String name);
 * FileWriter fileWriter = new FileWriter(File file);
 *   → These constructors create a new file or overwrite existing data.
 *
 * FileWriter fileWriter = new FileWriter(String name, boolean append);
 * FileWriter fileWriter = new FileWriter(File file, boolean append);
 *   → If 'append' is true, data is written at the end of file (not overwritten).
 *
 * Note:
 * If the specified file does NOT exist, these constructors will create it.
 *
 * Important Methods
 * write(int ch) → Writes a single character
 * write(char[] ch) → Writes an array of characters
 * write(String s) → Writes a string
 * flush() → Ensures all data is physically written to file
 * close() → Closes the FileWriter and releases resources
 *
 * Problem:
 * The main problem with FileWriter is that we have to insert line separators
 * (like '\n' or '\r\n') manually, which vary from system to system.
 *
 * Solution:
 * We can solve this problem by using BufferedWriter or PrintWriter classes,
 * which provide platform-independent methods like newLine() and println().
 *
 * Typical Lifecycle
 *  [Open FileWriter] → [Write Data] → [Flush] → [Close]
 */

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            System.out.println("Creating FileWriter for 'abc.txt'...");

            // Creates new file or overwrites existing one
            fileWriter = new FileWriter("abc.txt");

            System.out.println("Writing single character (97 -> 'a')...");
            fileWriter.write(97); // 'a'

            System.out.println("Writing string ' For Apple'...");
            fileWriter.write(" For Apple");

            System.out.println("Writing newline character...");
            fileWriter.write('\n');

            System.out.println("Writing character array {'b','c','d','e'}...");
            fileWriter.write(new char[]{'b', 'c', 'd', 'e'});

            System.out.println("Flushing data to ensure all is written...");
            fileWriter.flush();

            System.out.println("Writing complete! Check 'abc.txt' for output.");

        } catch (IOException ioException) {
            System.out.println("Error during file writing: " + ioException);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    System.out.println("FileWriter closed successfully.");
                } catch (IOException ioException) {
                    System.out.println("Error closing FileWriter: " + ioException);
                }
            }
        }
    }
}
