/*
 * Import Statement - VII
 *
 * When importing a Java package using wildcard (e.g., import java.util.*;),
 * all classes and interfaces present directly in that package become available.
 * However, classes in sub-packages are NOT imported automatically.
 * To use classes from sub-packages, we must explicitly write an import statement for that sub-package.
 *
 * Example package structure:
 * java
 *  └─ util
 *      └─ regex
 *          └─ Pattern
 */

import java.util.*;         // Imports all classes and interfaces from java.util
import java.util.regex.*;   // Imports all classes and interfaces from java.util.regex
import java.util.regex.Pattern; // Explicit import of Pattern class (also allowed)

public class Main {
    public static void main(String[] args) {
        Pattern p; // Using the Pattern class from java.util.regex
    }
}
