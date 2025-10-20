/*
 * PrintWriter Class
 *
 * The most enhanced writer to write character data to the file is **PrintWriter**,
 *    whereas the most enhanced reader to read character data from the file is **BufferedReader**.
 *
 * In general:
 *   - Use **Readers/Writers** → to handle **character data**.
 *   - Use **Streams (InputStream / OutputStream)** → to handle **binary data**.
 *
 * OutputStream → used to WRITE binary data to a file.
 * InputStream  → used to READ binary data from a file.
 *
 * Unified Java I/O Hierarchy Diagram
 *
 *                          ┌─────────────────────┐
 *                          │       Object        │
 *                          └────────┬────────────┘
 *                                   │
 *          ┌────────────────────────┼────────────────────────┐
 *          │                                                 │
 *   ┌───────┴──────┐                                     ┌──────┴──────┐
 *   │   Streams    │                                     │  Character  │
 *   │ (Binary I/O) │                                     │     I/O     │
 *   └───────┬──────┘                                     └──────┬──────┘
 *          │                                                      │
 *   ┌──────┴─────────────┐                              ┌─────────┴───────────┐
 *   │   OutputStream     │  <— For Writing Bytes        │      Writer         │  <— For Writing Characters
 *   │   (Abstract Class) │                              │   (Abstract Class)  │
 *   └──────┬─────────────┘                              └─────────┬───────────┘
 *          │                                                      │
 *   ┌──────┴─────────────┐                              ┌─────────┴───────────┐
 *   │   FileOutputStream │                              │  OutputStreamWriter │
 *   └──────┬─────────────┘                              └─────────┬───────────┘
 *          │                                                      │
 *   ┌──────┴──────────────                              ┌─────────┴───────────┐
 *   │ BufferedOutputStream│                             │     FileWriter      │
 *   └─────────────────────┘                             └─────────┬───────────┘
 *                                                                 │
 *                                                        ┌────────┴─────────┐
 *                                                        │   PrintWriter    │
 *                                                        └──────────────────┘
 *
 *
 *   ┌──────┴─────────────┐                              ┌─────────┴───────────┐
 *   │   InputStream      │  <— For Reading Bytes        │      Reader         │  <— For Reading Characters
 *   │   (Abstract Class) │                              │   (Abstract Class)  │
 *   └──────┬─────────────┘                              └─────────┬───────────┘
 *          │                                                      │
 *   ┌──────┴─────────────┐                              ┌─────────┴───────────┐
 *   │   FileInputStream  │                              │  InputStreamReader  │
 *   └──────┬─────────────┘                              └─────────┬───────────┘
 *          │                                                      │
 *   ┌──────┴─────────────┐                              ┌─────────┴───────────┐
 *   │ BufferedInputStream│                              │   BufferedReader    │
 *   └────────────────────┘                              └─────────────────────┘
 *
 * Overview
 * - PrintWriter is the most advanced Writer for character data.
 * - It supports writing of all primitive data types directly (int, double, boolean, etc.).
 * - It can communicate directly with a file or via another Writer (like FileWriter).
 *
 * Constructors
 * PrintWriter printWriter = new PrintWriter(String fileName);
 * PrintWriter printWriter = new PrintWriter(File file);
 * PrintWriter printWriter = new PrintWriter(Writer writer);
 *
 * Methods (with one-line explanations)
 * write(int ch)         → Writes a single character.
 * write(char[] ch)      → Writes an array of characters.
 * write(String s)       → Writes a string.
 * flush()               → Ensures all buffered data is written to file.
 * close()               → Closes the stream and releases system resources.
 *
 * print(char ch)        → Prints a character (no newline).
 * print(int i)          → Prints an integer (no newline).
 * print(double d)       → Prints a double (no newline).
 * print(boolean b)      → Prints a boolean (no newline).
 * print(String s)       → Prints a string (no newline).
 *
 * println(char ch)      → Prints a character followed by newline.
 * println(int i)        → Prints an integer followed by newline.
 * println(double d)     → Prints a double followed by newline.
 * println(boolean b)    → Prints a boolean followed by newline.
 * println(String s)     → Prints a string followed by newline.
 *
 * Notes
 * - `print()` → same line output.
 * - `println()` → new line output.
 * - Always call `flush()` before `close()` to ensure data is written.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Creating 'abc.txt' and writing data using PrintWriter...");

        PrintWriter printWriter = new PrintWriter("abc.txt");

        // Writing various types of data
        System.out.println("Writing character 97 ('a') using write(int ch)");
        printWriter.write(97); // Writes 'a'

        System.out.println("Writing integer 98 using println(int)");
        printWriter.println(98);

        System.out.println("Writing boolean true using println(boolean)");
        printWriter.println(true);

        System.out.println("Writing character 'c' using println(char)");
        printWriter.println('c');

        System.out.println("Writing string 'Hello' using println(String)");
        printWriter.println("Hello");

        printWriter.flush();
        printWriter.close();

        System.out.println("Data written successfully to abc.txt");
    }
}
