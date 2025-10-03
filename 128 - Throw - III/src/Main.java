/*
 * Throw
 * - After a throw statement, we are not allowed to write any statements directly.
 * - This is because the compiler considers all subsequent statements as unreachable.
 * - If we try, we will get a compile-time error: "unreachable statement".
 */
public class Main {
    public static void main(String[] args) {
        throw new ArithmeticException("Manually created exception");
        // The below statement will cause a compile-time error
        // System.out.println("Unreachable statement");
    }
}
