/*
 * Main Method
 *
 * - Compiler does NOT check whether main() method exists in the class or not.
 * - At runtime JVM checks for main(). If not found → Runtime Exception.
 *
 * Prototype required by JVM:
 *   public static void main(String[] args)
 *
 * Meaning of keywords:
 * - public   → JVM can call it from anywhere
 * - static   → JVM can call without creating object
 * - void     → main() does not return anything
 * - main     → special name recognized by JVM
 * - String[] args → command-line arguments
 *
 * If any change in this signature → JVM throws:
 *   Error: Main method not found in class Main,
 *   please define the main method as:
 *   public static void main(String[] args)
 *
 * Acceptable variations:
 * - Modifier order does not matter: static public void main(String[] args)
 * - Array declaration forms allowed:
 *      main(String[] args)
 *      main(String []args)
 *      main(String args[])
 * - Parameter name can be any valid identifier: main(String[] hello)
 * - Can replace String[] with var-args: main(String... args)
 *
 * Extra modifiers allowed:
 * - final, synchronized, strictfp
 * Example:
 *   static final synchronized strictfp public void main(String... hello)
 *
 * Inheritance:
 * - If child class does not define main(), parent class main() will be executed.
 * - Looks like overriding, but actually it is "method hiding" (because main is static).
 *
 * Overloading:
 * - Overloading main() is possible.
 * - JVM always calls main(String[] args).
 * - Other overloaded versions must be invoked explicitly.
 *
 * From Java v1.7 onwards:
 * - More descriptive error message if main() not found.
 * - Main method is mandatory for execution (static blocks won’t run without main()).
 *
 * Execution flow:
 *   v1.6
 *   - Identify static members
 *   - Execute static blocks and static variable assignments
 *   - Check for main()
 *   - If not found → RE: NoSuchMethodError: main
 *   - If found → execute main()
 *
 *   v1.7+
 *   - Check for main()
 *   - If not found → RE with detailed message
 *   - If found:
 *        Identify static members
 *        Execute static blocks and static variable assignments
 *        Execute main()
 */
public class Main {

    static {
        // Static block
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(new int[]{10, 20, 30}); // Explicit call to overloaded main
    }

    // Overloaded main()
    public static void main(int[] args) {
        System.out.println("Overloaded main(int[] args) called");
    }
}
