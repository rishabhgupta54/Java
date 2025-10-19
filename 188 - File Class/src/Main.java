/*
 * File Class
 *
 * The java.io.File class is used to represent
 * files and directories in the file system.
 *
 * Example:
 * File f = new File("abc.txt");
 *
 * → This statement will NOT create any physical file.
 *   - If "abc.txt" exists, 'f' refers to it.
 *   - If not, 'f' just represents the name "abc.txt".
 *
 * The File object can represent both:
 *   - Files
 *   - Directories
 *
 * This is because Java's File I/O concept is modeled
 * after UNIX — where **everything is treated as a file.**
 *
 * Constructors
 * File file = new File(String name);
 *     → Creates a File object to represent the file or
 *       directory with the given name in the current directory.
 *
 * File file = new File(String parentDir, String name);
 *     → Creates a File object to represent the file or directory
 *       inside the given parent directory.
 *
 * Common Methods of File Class
 * boolean exists()
 *     → Returns true if the specified file/directory exists.
 *
 * boolean createNewFile()
 *     → Creates a new physical file.
 *       - If file already exists → returns false.
 *       - If file doesn’t exist → creates it and returns true.
 *
 * boolean mkdir()
 *     → Creates a new directory (only one-level deep).
 *
 * boolean isFile()
 *     → Returns true if the File object represents a file.
 *
 * boolean isDirectory()
 *     → Returns true if the File object represents a directory.
 *
 * String[] list()
 *     → Returns the list of all file and directory names present
 *       in the current directory.
 *
 * long length()
 *     → Returns the size of the file in bytes.
 *
 * boolean delete()
 *     → Deletes the specified file or directory.
 *
 * Visual Representation
 * After program execution:
 *
 *  Current Directory
 *  ├── abc.txt           (file created in main directory)
 *  └── abc/              (directory created)
 *       └── abc.txt      (file created inside abc folder)
 */

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("abc.txt");

        System.out.println("Does abc.txt exist? " + file1.exists());

        try {
            if (file1.createNewFile()) {
                System.out.println("abc.txt created successfully!");
            } else {
                System.out.println("abc.txt already exists.");
            }
        } catch (IOException ioException) {
            System.out.println("Error creating abc.txt: " + ioException);
        }

        System.out.println("Does abc.txt exist now? " + file1.exists());
        System.out.println("Is abc.txt a file? " + file1.isFile());
        System.out.println("Is abc.txt a directory? " + file1.isDirectory());
        System.out.println("Length of abc.txt (bytes): " + file1.length());
        System.out.println("------------------------------------------");


        File file2 = new File("abc");
        if (file2.mkdir()) {
            System.out.println("Directory 'abc' created successfully!");
        } else {
            System.out.println("Directory 'abc' already exists or failed to create.");
        }

        System.out.println("Is 'abc' a directory? " + file2.isDirectory());
        System.out.println("------------------------------------------");


        // Create a new file "abc.txt" inside directory "abc"
        File file3 = new File("abc", "abc.txt");
        System.out.println("Does abc/abc.txt exist? " + file3.exists());

        try {
            if (file3.createNewFile()) {
                System.out.println("abc/abc.txt created successfully!");
            } else {
                System.out.println("abc/abc.txt already exists.");
            }
        } catch (IOException ioException) {
            System.out.println("Error creating abc/abc.txt: " + ioException);
        }

        System.out.println("Does abc/abc.txt exist now? " + file3.exists());
        System.out.println("Is abc/abc.txt a file? " + file3.isFile());
        System.out.println("Is abc/abc.txt a directory? " + file3.isDirectory());
        System.out.println("Length of abc/abc.txt (bytes): " + file3.length());
        System.out.println("------------------------------------------");

        System.out.println("Listing contents of directory 'abc':");
        String[] files = file2.list();
        if (files != null) {
            for (String name : files) {
                System.out.println("  → " + name);
            }
        }
        System.out.println("------------------------------------------");

        System.out.println("Deleting abc/abc.txt: " + file3.delete());
        System.out.println("Deleting abc.txt: " + file1.delete());

        // Directory deletion will fail if not empty
        System.out.println("Deleting directory abc: " + file2.delete());
        System.out.println("------------------------------------------");

    }
}
