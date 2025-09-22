/*
 * Strictfp Modifier (Strict Floating Point)
 * -----------------------------------------------------------------
 * - Introduced in Java 1.2.
 * - Can be applied to classes and methods (but NOT variables).
 * - Purpose: To make floating-point calculations platform-independent.
 *
 * Why?
 * ----
 * - Normally, floating-point results may differ across platforms (due to hardware/CPU differences).
 * - If a method or class is declared `strictfp`, all floating-point calculations
 *   inside it must follow the IEEE 754 standard.
 * - This ensures consistent results across all platforms.
 *
 * strictfp Method:
 * ----------------
 * - All floating-point calculations in the method follow IEEE 754.
 * - Illegal with `abstract` (because abstract means "no implementation",
 *   while strictfp always talks about "how to implement").
 *   → abstract strictfp method
 *
 * strictfp Class:
 * ---------------
 * - All concrete methods in the class will follow IEEE 754 for floating-point arithmetic.
 * - Legal to combine with `abstract` at class level.
 *   → abstract strictfp class
 *   → abstract strictfp method
 */
public class Main {
    public static void main(String[] args) {

    }
}
