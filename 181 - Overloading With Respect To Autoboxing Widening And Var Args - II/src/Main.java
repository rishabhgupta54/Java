/*
 * Overloading with respect to Autoboxing, Widening, and Var-Args
 *
 * Priority order when multiple overloaded methods are applicable:
 * - Widening
 * - Autoboxing
 * - Var-Args
 *
 * Example in this code:
 *   int → long (Widening)
 *   int → int... (Var-Args)
 *
 * Since Widening has higher priority than Var-Args,
 * the method m1(long l) will be called.
 */

public class Main {
    public static void main(String[] args) {
        int i = 10;
        m1(i); // Which method is called?
    }

    // Var-Args: int → int...
    public static void m1(int... i) {
        System.out.println("Var-Args");
    }

    // Widening: int → long
    public static void m1(long l) {
        System.out.println("Widening");
    }
}