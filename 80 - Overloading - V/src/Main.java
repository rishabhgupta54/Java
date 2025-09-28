/*
 * Overloading
 * - If both general method and var-args method are available,
 *   compiler always gives preference to the general method.
 *
 * Case 1:
 *   m1() → matches only var-args (since no parameter matches int x)
 *   Output: var-args Method
 *
 * Case 2:
 *   m1(10) → matches both:
 *      - m1(int x) → exact match
 *      - m1(int... x) → also valid (treated as array of length 1)
 *   Compiler chooses exact/general method.
 *   Output: General Method
 *
 * Case 3:
 *   m1(10, 20) → matches only var-args method (treated as array of 2 ints)
 *   Output: var-args Method
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.m1(); // var-args Method
        main.m1(10); // General Method
        main.m1(10, 20); // var-args Method
    }

    public void m1(int x) {
        System.out.println("General Method");
    }

    public void m1(int... x) {
        System.out.println("var-args Method");
    }
}
