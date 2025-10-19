/*
 * Autoboxing and Autounboxing
 * If the wrapper object reference is null and we try to perform
 * autounboxing, the compiler will internally call the corresponding
 * xxxValue() method on that null reference.
 *
 * This results in a NullPointerException at runtime.
 *
 * Example:
 *      Integer I = null;
 *      int i = I;   // Causes NullPointerException
 *
 * Because internally compiler converts it into:
 *      int i = I.intValue();  // I is null → NPE
 *
 * Flow:
 *     Integer I = null;
 *             |
 *             v
 *   Compiler tries: I.intValue()
 *             |
 *             v
 *   NullPointerException (because I is null)
 *
 */
public class Main {
    static Integer I; // Default value of static Integer is null

    public static void main(String[] args) {
        // Runtime error — autounboxing tries to call I.intValue()
        int i = I;  // NullPointerException
        System.out.println(i);
    }
}
