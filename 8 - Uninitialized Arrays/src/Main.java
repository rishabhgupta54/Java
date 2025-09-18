/*
 * Uninitialized Arrays
 *
 * - In Java, array is an object, and a reference must point to an array object
 *   before we can access its elements.
 *
 * Instance Level:
 * - If we declare an array reference as an instance variable and don’t initialize it,
 *   JVM assigns it `null` (default value of object reference).
 * - If we try to access elements without initialization → Runtime Error (NullPointerException).
 *
 * Static Level:
 * - Same as instance variables → default value is `null`.
 * - Accessing elements without initialization also leads to Runtime Error (NPE).
 *
 * Local Level:
 * - Local array references are not initialized by JVM.
 * - Must be explicitly initialized before use, otherwise Compile-time Error.
 * - Once initialized (with new), elements get default values (0, 0.0, false, null, etc.).
 */
public class Main {
    /*
     * Instance Level
     */
    int[] array1;                 // default: null
    int[] array2 = new int[6];    // default values: [0,0,0,0,0,0]

    /*
     * Static Level
     */
    static int[] array3;                 // default: null
    static int[] array4 = new int[6];    // default values: [0,0,0,0,0,0]

    public static void main(String[] args) {
        Main main = new Main();

        // Instance arrays
        System.out.println("main.array1: " + main.array1);
        // System.out.println("main.array1[0]: " + main.array1[0]); // RE: NullPointerException

        System.out.println("main.array2: " + main.array2);
        System.out.println("main.array2[0]: " + main.array2[0]); // 0

        // Static arrays
        System.out.println("Main.array3: " + Main.array3);
        // System.out.println("Main.array3[0]: " + Main.array3[0]); // RE: NullPointerException

        System.out.println("Main.array4: " + Main.array4);
        System.out.println("Main.array4[0]: " + Main.array4[0]); // 0

        /*
         * Local Level
         */
        int[] array5;
        // System.out.println("array5: " + array5); // CE: variable array5 might not have been initialized

        int[] array6 = new int[6];
        System.out.println("array6: " + array6);
        System.out.println("array6[0]: " + array6[0]); // 0
    }
}
