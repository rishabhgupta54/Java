/*
 * Static Control Flow
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
 *   - Line 45 → static int i identified
 *   - Line 59 → first static block identified
 *   - Line 52 → main() identified
 *   - Line 57 → m1() identified
 *   - Line 73 → second static block identified
 *   - Line 65 → static int j identified
 *
 * Step 2: Static Initialization (top → bottom)
 *   - Line 45 → i = 10
 *   - Line 48 → first static block starts
 *       → Line 48 calls m1() → Line 58 prints j (j not initialized yet → default 0) → prints 0
 *       → Line 49 prints "First Static Block"
 *   - Line 62 → second static block prints "Second Static Block"
 *   - Line 65 → j = 20
 *
 * Step 3: Main Method Execution
 *   - Line 53 → m1() → Line 58 prints j (now 20)
 *   - Line 54 → prints "Main Method"
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
        m1(); // Line 48
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