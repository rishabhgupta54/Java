/*
 * Overloading with respect to Autoboxing, Widening, and Var-Args
 *
 * Priority order when multiple overloaded methods are applicable:
 * - Widening
 * - Autoboxing
 * - Var-Args
 *
 * Var-Args method always has the least priority. It is used only when
 * no other matching method exists. Autoboxing has higher priority
 * than Var-Args. Widening has higher priority than Autoboxing.
 *
 * In this example:
 *   int → Integer (Autoboxing)
 *   int → int...  (Var-Args)
 *
 * Autoboxing has higher priority than Var-Args,
 * so the method m1(Integer i) will be called.
 */

public class Main {
    public static void main(String[] args) {
        int i = 10;
        m1(i); // Which method is called?
    }

    // Var-Args: int → int...
    public static void m1(int ... x) {
        System.out.println("Var-Args");
    }

    // Autoboxing: int → Integer
    public static void m1(Integer i) {
        System.out.println("Autoboxing");
    }
}