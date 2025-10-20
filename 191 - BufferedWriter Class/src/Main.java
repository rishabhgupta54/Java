/*
 * BufferedWriter Class
 *
 * We can use BufferedWriter to WRITE CHARACTER DATA to a file efficiently.
 * It provides buffering, which improves performance compared to FileWriter.
 *
 * Constructors
 * BufferedWriter bufferedWriter = new BufferedWriter(Writer writer);
 * BufferedWriter bufferedWriter = new BufferedWriter(Writer writer, int bufferSize);
 *  → BufferedWriter cannot communicate directly with the file.
 *    It must wrap another Writer object (like FileWriter).
 *
 * Important Methods
 * void write(int ch)         → Writes a single character.
 * void write(char[] ch)      → Writes an array of characters.
 * void write(String s)       → Writes a string.
 * void newLine()             → Inserts a platform-dependent line separator (unlike FileWriter).
 * void flush()               → Ensures all buffered data is written to the file.
 * void close()               → Closes the BufferedWriter (and also the underlying FileWriter).
 *
 * Note:
 * Whenever we close the BufferedWriter, it automatically closes the internal FileWriter.
 * Hence, we are not required to close FileWriter explicitly.
 *
 * Why use BufferedWriter?
 * The main problem with FileWriter is that we have to insert line separators manually,
 * which vary from system to system. BufferedWriter solves this problem using newLine().
 *
 * Typical Lifecycle
 * [Open FileWriter] → [Wrap in BufferedWriter] → [Write Data] → [Flush] → [Close]
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            System.out.println("Opening file 'abc.txt' for writing using BufferedWriter...");
            FileWriter fileWriter = new FileWriter("abc.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Writing data to file...");
            bufferedWriter.write(97); // Writes 'a'
            bufferedWriter.newLine(); // System-dependent line separator
            bufferedWriter.write("for Apple");
            bufferedWriter.newLine();
            bufferedWriter.write(new char[]{'b', 'c', 'd', 'e'});
            bufferedWriter.newLine();

            bufferedWriter.flush();
            System.out.println("Data flushed to file successfully.");

        } catch (IOException ioException) {
            System.out.println("Error while writing to file: " + ioException);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    System.out.println("BufferedWriter closed successfully.");
                }
            } catch (IOException ioException) {
                System.out.println("Error while closing BufferedWriter: " + ioException);
            }
        }
    }
}
