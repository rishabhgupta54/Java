/*
 * FileReader Class
 *
 * We can use FileReader to READ CHARACTER DATA from a file.
 * It is the character-oriented alternative to FileInputStream.
 *
 * Constructors
 * -------------------------------------------------------------
 * FileReader fileReader = new FileReader(String name);
 * FileReader fileReader = new FileReader(File file);
 *    → Both constructors create a FileReader object to read data from an existing file.
 *
 * Note:
 * If the specified file does NOT exist, FileReader constructor throws FileNotFoundException.
 *
 * Important Methods
 * int read()
 *   → Reads the next character from the file and returns its Unicode value (int).
 *   → Returns -1 if the end of the file (EOF) is reached.
 *   → Must typecast to (char) when printing characters.
 *
 * int read(char[] ch)
 *   → Reads multiple characters from file into the given char array.
 *   → Returns the number of characters actually read.
 *
 * void close()
 *   → Closes the FileReader and releases resources.
 *
 * Limitation:
 * By using FileReader, we can read data character by character or in small chunks.
 * This is not convenient for programmers — hence, we often use BufferedReader for efficiency.
 *
 * Typical Lifecycle
 * [Open FileReader] → [Read Data] → [Close FileReader]
 */

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            System.out.println("Opening file 'abc.txt' for reading...");
            fileReader = new FileReader("abc.txt");

            System.out.println("\n--- Reading file character by character ---");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }

            System.out.println("\n\n--- Reading file using character array ---");
            fileReader.close(); // Close and reopen for second read
            fileReader = new FileReader("abc.txt");

            char[] buffer = new char[50];
            int charsRead = fileReader.read(buffer);
            System.out.println("Characters read: " + charsRead);
            System.out.println("File content read using array:");
            System.out.println(new String(buffer, 0, charsRead));

        } catch (IOException ioException) {
            System.out.println("Error reading file: " + ioException);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                    System.out.println("\nFileReader closed successfully.");
                }
            } catch (IOException ioException) {
                System.out.println("Error closing FileReader: " + ioException);
            }
        }
    }
}
