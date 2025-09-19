/*
 * Increment And Decrement Operators
 * Types:
 * - Pre Increment (++x) / Pre Decrement (--x)
 * - Post Increment (x++) / Post Decrement (x--)
 *
 * Difference:
 * Pre (++x / --x) → First update the value, then use it.
 * Post (x++ / x--) → First use the old value, then update it.
 */
public class Main {
    public static void main(String[] args) {
        int x, y;

        /*
         * Pre Increment: ++x
         * Step 1: Increment x
         * Step 2: Assign updated value to y
         */
        x = 10;
        y = ++x; // x = 11, y = 11
        System.out.println("++x: " + x);
        System.out.println("y: " + y);

        /*
         * Post Increment: x++
         * Step 1: Assign old value of x to y
         * Step 2: Increment x
         */
        x = 10;
        y = x++; // y = 10, x = 11
        System.out.println("x++: " + x);
        System.out.println("y: " + y);

        /*
         * Pre Decrement: --x
         * Step 1: Decrement x
         * Step 2: Assign updated value to y
         */
        x = 10;
        y = --x; // x = 9, y = 9
        System.out.println("--x: " + x);
        System.out.println("y: " + y);

        /*
         * Post Decrement: x--
         * Step 1: Assign old value of x to y
         * Step 2: Decrement x
         */
        x = 10;
        y = x--; // y = 10, x = 9
        System.out.println("x--: " + x);
        System.out.println("y: " + y);

        /*
         * Error Case:
         * Increment/Decrement operators can only be applied on variables.
         * They cannot be applied on constants or results of expressions.
         */
        x = 10;
        y = ++x; // Valid
        System.out.println(y);

        // y = ++10;        // Compile Time Error
        // y = ++(x + 1);   // Compile Time Error

        /*
         * Final Variables:
         * Once assigned, final variables cannot be modified.
         * Hence, applying increment/decrement causes Compile Time Error.
         */
        final int x1 = 1;
        // ++x1; // Compile Time Error

        /*
         * Applicability:
         * Increment/Decrement works on all primitive types except boolean.
         */
        char ch = 'a';
        System.out.println(++ch); // b

        double d = 10.5;
        System.out.println(++d); // 11.5

        boolean b = true;
        // System.out.println(++b); // Compile Time Error

        /*
         * Arithmetic Promotion Rule:
         * If we apply any arithmetic operator between two variables a and b:
         * Result type = max(int, type of a, type of b)
         *
         * Examples:
         * - byte + byte → int
         * - short + byte → int
         * - char + char → int
         * - int + long → long
         * - long + float → float
         * - float + double → double
         * - double + int → double
         */
        byte a1 = 10;
        byte b1 = 20;
        // byte c1 = a1 + b1; // Compile Time Error (int cannot be directly assigned to byte)
        byte c1 = (byte) (a1 + b1); // Explicit casting required
        System.out.println("c1: " + c1);

        double d1 = 5.5;
        int i1 = 2;
        double result = d1 + i1; // double + int = double
        System.out.println("double + int = " + result);

        /*
         * Special Case with ++ / --:
         * For increment/decrement operators, internal type casting happens automatically.
         * Example: a2++ → a2 = (byte)(a2 + 1)
         */
        byte a2 = 10;
        a2++;
        System.out.println(a2);
    }
}
