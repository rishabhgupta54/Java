/*
 * Runtime Stack Mechanism
 * - For every thread, the JVM creates a separate runtime stack.
 * - Every method call performed by that thread is stored in its corresponding stack.
 * - Each entry in the stack is called a stack frame or activation record.
 * - After a method completes execution, its stack frame is removed.
 * - When all method calls are completed, the stack becomes empty.
 * - The empty stack is destroyed by the JVM just before terminating the thread.
 *
 * Stack execution flow for main() -> m1() -> m2():
 *
 * 1. JVM thread is created (stack is empty):
 * | empty |
 *
 * 2. main() is called:
 * | main() |
 *
 * 3. m1() is called from main():
 * | m1()   |
 * | main() |
 *
 * 4. m2() is called from m1():
 * | m2()   |
 * | m1()   |
 * | main() |
 *
 * 5. After m2() completes:
 * | m1()   |
 * | main() |
 *
 * 6. After m1() completes:
 * | main() |
 *
 * 7. After main() completes:
 * | empty |  // stack destroyed
 */

public class Main {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        System.out.println("Hello");
    }
}