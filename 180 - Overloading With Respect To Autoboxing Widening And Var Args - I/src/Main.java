/*
 * Overloading with respect to Autoboxing, Widening, and Var-Args
 *
 * When more than one overloaded method can be matched to a given argument,
 * Java follows a specific priority order to decide which one to call:
 *
 *  Priority order (highest → lowest):
 *  - Widening
 *  - Autoboxing
 *  - Var-Args
 *
 * Example:
 *   int → long (Widening)
 *   int → Integer (Autoboxing)
 *
 * Why?
 * Java gives priority to older features — Widening was introduced in JDK 1.0,
 * while Autoboxing came in JDK 1.5. So older rules take precedence.
 */
public class Main {
    public static void main(String[] args) {
        int i = 10;
        m1(i); // Which version will be called?
    }

    // Autoboxing: int → Integer
    public static void m1(Integer i) {
        System.out.println("Autoboxing");
    }

    // Widening: int → long
    public static void m1(long l) {
        System.out.println("Widening");
    }
}
