/*
 * Import Statement - VIII
 *
 * Some packages are implicitly available in every Java program,
 * so we don’t need to explicitly write an import statement for them.
 *
 * 1. java.lang package
 *    - Contains most commonly used classes like String, Object, Integer, Character, Math, etc.
 *    - This package is imported by default in every Java program.
 *
 * 2. Default package (current working directory)
 *    - All classes present in the same package (or no package, i.e., default package)
 *      are available without import.
 *
 * Note:
 * - This is why we can directly use classes like String and Character without writing "import java.lang.String".
 */
public class Main {
    public static void main(String[] args) {
        String s = "String 1"; // String belongs to java.lang (import not needed)
        Character ch = 'a'; // Character belongs to java.lang (import not needed)
    }
}
