/*
 * Overloading
 * Two methods are said to be overloaded if and only if both methods
 * have the same name but different argument types.
 *
 * In overloading:
 * - Method resolution is taken care of by the compiler based on the reference type.
 * - Hence, overloading is also considered as
 *   Compile-Time Polymorphism / Early Binding.
 *
 * Type Promotion in Overloading:
 * - When resolving overloaded methods, if the exact match is not found,
 *   the compiler tries to promote the argument to the next higher type.
 * - Promotion chain for primitives:
 *   byte → short → int → long → float → double
 *   char → int → long → float → double
 * - If after all possible promotions no match is found → Compile Time Error.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.m1(10); // int → matches m1(int)
        main.m1(10.5F); // float → matches m1(float)
        main.m1('a'); // char → promoted to int → matches m1(int)
        main.m1(10L); // long → promoted to float → matches m1(float)
        // main.m1(10.5); // CE: no suitable method for m1(double)
    }

    public void m1(int i) {
        System.out.println("int argument");
    }

    public void m1(float f) {
        System.out.println("float argument");
    }
}