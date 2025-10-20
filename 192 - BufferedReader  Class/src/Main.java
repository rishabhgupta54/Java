/*
 * BufferedReader Class
 *
 * We can use BufferedReader to READ CHARACTER DATA from a file efficiently.
 *
 * Advantage
 * The main advantage of BufferedReader over FileReader is that
 * we can read data LINE BY LINE in addition to character by character.
 * (FileReader can only read character by character.)
 *
 * Constructors
 * BufferedReader bufferedReader = new BufferedReader(Reader reader);
 * BufferedReader bufferedReader = new BufferedReader(Reader reader, int bufferSize);
 *
 * BufferedReader cannot communicate directly with a file.
 * It must wrap another Reader object (like FileReader).
 *
 * Important Methods
 * int read()                 → Reads a single character and returns its Unicode value.
 * int read(char[] ch)        → Reads characters into a char array and returns the count.
 * String readLine()          → Reads the next line from the file.
 *                              Returns null when the end of file is reached.
 * void close()               → Closes the BufferedReader and the underlying Reader automatically.
 *
 * Note:
 * Whenever we close BufferedReader, the underlying FileReader is
 * automatically closed — no need to close explicitly.
 *
 * Why use BufferedReader?
 * Reading data line by line is very convenient for text processing
 * (e.g., configuration files, logs, CSV data).
 *
 * Typical Lifecycle
 * [Open FileReader] → [Wrap in BufferedReader] → [Read Lines] → [Close]
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            System.out.println("Opening file 'abc.txt' for reading using BufferedReader...");
            FileReader fileReader = new FileReader("abc.txt");
            bufferedReader = new BufferedReader(fileReader);

            System.out.println("Reading file contents line by line:\n----------------------------------");
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            System.out.println("----------------------------------\nEnd of file reached.");

        } catch (IOException ioException) {
            System.out.println("Error while reading file: " + ioException);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    System.out.println("BufferedReader closed successfully.");
                }
            } catch (IOException ioException) {
                System.out.println("Error while closing BufferedReader: " + ioException);
            }
        }
    }
}