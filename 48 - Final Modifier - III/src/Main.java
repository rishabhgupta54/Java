/*
 * Final Variable - Local Variable
 *
 * Local Variables:
 * - Declared inside a method, constructor, or block.
 * - Also called temporary variables, stack variables, or automatic variables.
 * - JVM does NOT assign default values to local variables.
 *   → You must explicitly initialize them before use.
 * - If a local variable is declared but never used, initialization is not required.
 *
 * Note:
 * - If we don’t declare a modifier for instance/static variables, the default access modifier is applied.
 * - This "default modifier" rule does NOT apply to local variables → they cannot have any access modifier.
 */
public class Main {
    public static void main(String[] args) {
        int int1; // Declared but not used → valid

        /*int int2;
        System.out.println("int2: " + int2);
        // CE: variable int2 might not have been initialized
        */

        /*
         * Final Local Variable:
         * - Initialization is required only before use, not necessarily at declaration.
         * - If a final local variable is declared but never used, no error occurs.
         */
        /*final int int3;
        System.out.println("int3: " + int3);
        // CE: variable int3 might not have been initialized
        */

        /*
         * Invalid Modifiers for Local Variables:
         * - The ONLY valid modifier for local variables is 'final'.
         * - Any other modifier will cause a compile-time error.
         */
        // public int int4 = 10;     // CE: illegal modifier for local variable
        // private int int5 = 10;    // CE: illegal modifier for local variable
        // protected int int6 = 10;  // CE: illegal modifier for local variable
        // static int int7 = 10;     // CE: illegal modifier for local variable
        // transient int int8 = 10;  // CE: illegal modifier for local variable
        // volatile int int9 = 10;   // CE: illegal modifier for local variable

        final int int10 = 10; // ✅ valid final local variable
        System.out.println("Final local variable int10: " + int10);
    }
}
