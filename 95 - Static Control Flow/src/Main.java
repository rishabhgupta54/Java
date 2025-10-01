/*
 * Static Control Flow
 *
 * Steps followed when executing a Java class:
 * 1. Identification of static members (variables, static blocks, static methods) from top to bottom.
 * 2. Execution of static variable assignments and static blocks from top to bottom.
 * 3. Execution of the main method.
 *
 * RIWO - Read Indirectly Write Only
 * - Inside a static block:
 *    Indirect read (via method call) is allowed even if the variable is not initialized yet.
 *    Direct read is not allowed → CE: illegal forward reference.
 *
 * -------------------------
 * Execution Flow (line by line):
 *
 * Step 1: Class Loading & Member Identification (top → bottom)
 *   - Line 46 → static int i identified
 *   - Line 48 → first static block identified
 *   - Line 53 → main() identified
 *   - Line 58 → m1() identified
 *   - Line 62 → second static block identified
 *   - Line 66 → static int j identified
 *
 * Step 2: Static Initialization (top → bottom)
 *   - Line 46 → i = 10
 *   - Line 49 → first static block starts
 *       → Line 49 calls m1() → Line 59 prints j (j not initialized yet → default 0) → prints 0
 *       → Line 50 prints "First Static Block"
 *   - Line 63 → second static block prints "Second Static Block"
 *   - Line 66 → j = 20
 *
 * Step 3: Main Method Execution
 *   - Line 54 → m1() → Line 59 prints j (now 20)
 *   - Line 55 → prints "Main Method"
 *
 * Final Output:
 *   0
 *   First Static Block
 *   Second Static Block
 *   20
 *   Main Method
 */

public class Main {
    static int i = 10;

    static {
        m1();
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");
    }

    public static void m1() {
        System.out.println(j);
    }

    static {
        System.out.println("Second Static Block");
    }

    static int j = 20;
}
