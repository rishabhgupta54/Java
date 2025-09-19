/*
 * Var Args (Variable Arguments)
 *
 * - Until JDK 1.4:
 *     We can't declare a method with a variable number of arguments.
 *     If there is a change in number of arguments, we must overload the method.
 *     ➝ Increases length of code and reduces readability.
 *
 * - From JDK 1.5:
 *     Var-Args were introduced to overcome this problem.
 *     A method which can take a variable number of arguments is called Var-Args method.
 *     Syntax: methodName(type... varName)
 *
 * - Example: method(int... x)
 *
 * Rules:
 * 1. Wherever 1D array is present, we can replace it with Var-Args parameter.
 * 2. But wherever Var-Args parameter is present, we cannot replace it with 1D array.
 * 3. Internally, Var-Args parameter is converted into a 1D array.
 * 4. Within a class, we cannot declare both:
 *        method(int... x)   and   method(int[] x)   ➝ CE: duplicate method.
 * 5. Inside a Var-Args method we can take only one Var-Args parameter.
 * 6. If Var-Args are mixed with normal parameters, Var-Args must be the last parameter.
 * 7. Var-Args method has low priority compared to general methods.
 *    ➝ If no other method matches, only then Var-Args method will be executed
 *    ➝ Similar to 'default' case in switch statement.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * We can call this method by passing any number of int values including 0
         */
        m1();
        m1(10);
        m1(10, 20);
        m1(10, 20, 30);

        /*
         * Internally Var-Args parameter is converted into 1D array.
         * Hence within Var-Args method, we can differentiate values by index.
         */
        m2();
        m2(10);
        m2(10, 20);
        m2(10, 20, 30);

        /*
         * Mixing Var-Args with normal parameters.
         * Rule: Var-Args should always be the last parameter.
         */
        m3(1.0);
        m3(1.0, 10);
        m3(1.0, 10, 20);

        /*
         * Var-Args method has low priority compared to general method.
         */
        m6(10);      // general method
        m6();        // var-args method
        m6(10, 20);  // var-args method

        /*
         * We can also call a Var-Args method by explicitly passing a 1D array.
         */
        m7(new int[]{10, 20, 30, 40, 50});
    }

    public static void m1(int... x) {
        System.out.println("var-args method");
    }

    public static void m2(int... i) {
        int total = 0;
        for (int i1 : i) {
            total += i1;
        }
        System.out.println("The sum is: " + total);
    }

    public static void m3(double d, int... x) {
        System.out.println("var-args with normal parameters");
    }

    /*
     * CE: We cannot declare more than one Var-Args parameter in a method
     */
    /*private static void m4(double... d, double... d1) {

    }*/

    /*
     * CE: Inside a class, we cannot declare both:
     *     method(int... i)  and  method(int[] i)
     */

    /*private static void m5(int... i) {

    }

    private static void m5(int[] i) {

    }*/

    private static void m6(int... i) {
        System.out.println("var-args method called");
    }

    private static void m6(int i) {
        System.out.println("general method called");
    }

    private static void m7(int... i) {
        System.out.println("var-args method called with array");
    }
}
