/*
 * Overloading with respect to Autoboxing, Widening, and Var-Args
 *
 * In this example:
 *   int → Long
 *
 * Explanation:
 * - Widening is not applicable here because int cannot be directly widened to Long (wrapper class).
 * - Autoboxing cannot convert int → Long automatically either. Autoboxing only allows int → Integer.
 * - No var-args method exists, so no fallback available.
 *
 * Result:
 * - This program will NOT compile because the compiler cannot find a suitable method
 *   to match int → Long conversion.
 *
 * Note:
 * - Autoboxing supports int → Integer, long → Long, etc., but it does NOT combine
 *   with widening to convert int → Long automatically.
 */
public class Main {
    public static void main(String[] args) {
        int i = 10;
        m1(i); // Compilation Error: No suitable method found
    }

    public static void m1(Long l) {
        System.out.println("Long method");
    }
}
