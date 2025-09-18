/*
 * Local Variable
 *
 * - A variable declared inside a method, block, or constructor is called a Local Variable.
 * - Also known as: temporary variable, stack variable, automatic variable.
 * - Stored inside the Stack memory.
 *
 * Life cycle:
 * - Created when the block/method is entered
 * - Destroyed automatically once the block/method execution completes
 *
 * Scope:
 * - Limited to the block in which it is declared.
 *
 * Initialization:
 * - JVM will NOT provide default values for local variables.
 * - Hence, we must initialize them explicitly before use.
 * - If a variable is declared but not used → initialization is not required.
 * - It is not recommended to initialize inside conditional/logical blocks,
 *   since execution is not guaranteed.
 *
 * Modifiers:
 * - The only applicable modifier for local variables is 'final'.
 * - Other modifiers (public, private, protected, static, transient, volatile) → CE.
 *
 * Thread-safety:
 * - Instance and static variables can be accessed by multiple threads simultaneously → not thread-safe.
 * - Local variables are thread-safe because each thread gets its own copy.
 */
public class Main {
    public static void main(String[] args) {
        int int1 = 0; // local variable declared inside main method

        for (int int2 = 0; int2 < 10; int2++) { // int2 is local to the for-loop
            int1 += int2;
        }

        System.out.println("int1: " + int1);
        // System.out.println("int2: " + int2); // CE: cannot find symbol (int2 out of scope)

        try {
            int int3 = Integer.parseInt("ten"); // local variable inside try block
        } catch (NumberFormatException e) {
            // int3 = 10; // CE: int3 is out of scope here
        }
        // System.out.println("int3: " + int3); // CE: cannot find symbol (int3 out of scope)

        int int4; // declaration without initialization → fine since unused

        int int5;
        // System.out.println("int5: " + int5); // CE: variable int5 might not have been initialized

        int int6;
        if (args.length > 0) {
            int6 = 10;
        }
        // System.out.println(int6); // CE: variable int6 might not have been initialized

        final int int7 = 10; // only 'final' is allowed for local variables

        // Invalid modifiers → all give CE:
        // public int int8 = 10;
        // private int int8 = 10;
        // protected int int8 = 10;
        // static int int8 = 10;
        // transient int int8 = 10;
        // volatile int int8 = 10;
    }
}
