/*
 * Instance Control Flow
 * Whenever we are executing a Java class:
 * 1. Static control flow will execute first (class loading time).
 * 2. In static control flow, if we create an object:
 *      - Identification of instance members from top to bottom
 *      - Execution of instance variable assignments & instance blocks (top → bottom)
 *      - Execution of the constructor
 *
 * Execution Flow (line by line):
 *
 * Step 1: Class Loading → Static control flow
 *   - Line 63 → main() method identified
 *   - Nothing else is static → class loaded successfully
 *
 * Step 2: main() Execution
 *   - Line 64 → new Main() → triggers instance control flow
 *
 * Step 3: Instance Control Flow (object creation)
 *   - Line 52  → int i identified
 *   - Line 54  → first instance block identified
 *   - Line 59 → constructor identified
 *   - Line 68 → m1() identified
 *   - Line 72 → second instance block identified
 *   - Line 76 → int j identified
 *
 * Step 4: Instance initialization (top → bottom)
 *   - Line 52  → i = 10
 *   - Line 54  → first instance block starts
 *       → calls m1() (Line 29)
 *           → Line 69 prints j (not yet initialized → default 0)
 *       → prints "First Instance Block"
 *   - Line 34 → second instance block prints "Second Instance Block"
 *   - Line 76 → j = 20
 *
 * Step 5: Constructor Execution
 *   - Line 59 → prints "Constructor"
 *
 * Step 6: Back to main()
 *   - Line 65 → prints "Main method"
 *
 * -------------------------
 * Final Output:
 * 0
 * First Instance Block
 * Second Instance Block
 * Constructor
 * Main method
 */

public class Main {
    int i = 10;

    {
        m1();
        System.out.println("First Instance Block");
    }

    Main() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Main method");
    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("Second Instance Block");
    }

    int j = 20;
}
