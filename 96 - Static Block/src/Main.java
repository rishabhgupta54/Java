/*
 * Static Block
 * - A static block is executed at the time of class loading.
 * - Hence, if we want to perform any activity at the time of class loading,
 *   we should define it inside a static block.
 *
 * Execution Flow:
 * 1. Class is loaded → static block runs first.
 *      → prints "Static Block"
 * 2. main() method starts.
 *      → prints "Main Method"
 */

public class Main {
    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
