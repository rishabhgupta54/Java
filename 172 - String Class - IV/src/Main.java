/*
 * String Class
 *
 * String is an immutable class present in java.lang package.
 * Once we create a String object, we cannot modify it — any modification results in a new object.
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Different ways of creating String objects
         */
        String string1 = new String(); // Empty String
        String string2 = new String("Hello"); // From String literal
        String string3 = new String(new StringBuffer("Hello")); // From StringBuffer
        String string4 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}); // From char array
        String string5 = new String(new byte[]{72, 101, 108, 108, 111}); // From byte array (ASCII)

        System.out.println("string1: \"" + string1 + "\"");
        System.out.println("string2: \"" + string2 + "\"");
        System.out.println("string3: \"" + string3 + "\"");
        System.out.println("string4: \"" + string4 + "\"");
        System.out.println("string5: \"" + string5 + "\"");

        System.out.println("\n===== Common String Methods Demonstration =====\n");

        String str = "  Java Programming  ";

        /*
         * charAt(int index)
         */
        System.out.println("charAt(2): " + str.charAt(2)); // Returns character at index 2

        /*
         * concat(String str)
         */
        System.out.println("concat(): " + str.concat(" Language"));

        /*
         * equals(Object obj)
         */
        System.out.println("equals('Java Programming'): " + str.equals("Java Programming")); // false (extra spaces)
        System.out.println("equals('  Java Programming  '): " + str.equals("  Java Programming  ")); // true

        /*
         * equalsIgnoreCase(String another)
         */
        System.out.println("equalsIgnoreCase('  java programming  '): " + str.equalsIgnoreCase("  java programming  ")); // true

        /*
         * substring(int beginIndex), substring(int beginIndex, int endIndex)
         */
        System.out.println("substring(2): \"" + str.substring(2) + "\""); // From index 2 to end
        System.out.println("substring(2, 6): \"" + str.substring(2, 6) + "\""); // From index 2 to 5

        /*
         * length()
         */
        System.out.println("length(): " + str.length()); // Includes spaces

        /*
         * replace(char oldChar, char newChar)
         */
        System.out.println("replace('a', '@'): " + str.replace('a', '@'));

        /*
         * toLowerCase() and toUpperCase()
         */
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());

        /*
         * trim() — Removes leading and trailing spaces
         */
        System.out.println("trim(): \"" + str.trim() + "\"");

        /*
         * indexOf(char ch) — Returns first index of specified character
         */
        System.out.println("indexOf('a'): " + str.indexOf('a'));

        /*
         * lastIndexOf(char ch) — Returns last index of specified character
         */
        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));

        System.out.println("\n===== Original String (Immutability Proof) =====");
        System.out.println("Original String still unchanged: \"" + str + "\"");
    }
}
