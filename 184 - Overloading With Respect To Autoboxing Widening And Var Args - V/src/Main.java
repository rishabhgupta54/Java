/*
 * Overloading with respect to Autoboxing, Widening, and Var-Args
 *
 * In this example:
 *   int → Object
 *
 * Explanation:
 * - Widening: int can be widened to long, float, double, etc., but no such method exists here.
 * - Autoboxing: int can be autoboxed to Integer.
 * - Object method exists: After autoboxing int → Integer, Integer is-a Object, so this method is applicable.
 *
 * Result:
 * - The int value is autoboxed to Integer.
 * - The method with Object parameter is called.
 * - Output: "Object"
 *
 * Note:
 * - This shows that Object parameter can act as a fallback for any type if no exact, widening, or autoboxing match exists.
 */
public class Main {
    public static void main(String[] args) {
        int i = 10;
        m1(i); // Calls m1(Object object)
    }

    public static void m1(Object object) {
        System.out.println("Object");
    }
}
