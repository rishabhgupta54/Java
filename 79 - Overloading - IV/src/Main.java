/*
 * Overloading
 * - Method resolution is done at compile time, based on reference types and argument matching.
 * Case 1:
 *   m1(10, 10.5F) → matches m1(int, float) Output: int float method
 *
 * Case 2:
 *   m1(10.5F, 10) → matches m1(float, int) Output: float int method
 *
 * Case 3:
 *   m1(10, 10) → both can match:
 *      - First argument (10) can be int → m1(int, float) [second 10 promoted to float]
 *      - First argument (10) can be promoted to float → m1(float, int)
 *        Ambiguity → Compile Time Error.
 *
 * Case 4:
 *   m1(10.5F, 10.5F) → no exact match:
 *      - m1(int, float) (first arg float → cannot convert to int)
 *      - m1(float, int) (second arg float → cannot convert to int)
 *        No suitable method found → Compile Time Error.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.m1(10, 10.5F);   // int float method
        main.m1(10.5F, 10);   // float int method

        // main.m1(10, 10);       // CE: reference to m1 is ambiguous
        // main.m1(10.5F, 10.5F); // CE: no suitable method found
    }

    public void m1(int i, float f) {
        System.out.println("int float method");
    }

    public void m1(float f, int i) {
        System.out.println("float int method");
    }
}
