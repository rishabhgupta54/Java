public class Main {
    public static void main(String[] args) {
        /*
         * An array is an indexed collection of a fixed number of homogeneous data elements.
         *
         * Advantages:
         * 1. We can represent a huge number of values using a single variable (instead of multiple variables).
         * 2. Code readability and maintainability improve.
         *
         * Disadvantages:
         * 1. Arrays are fixed in size.
         *    - Once we create an array, we cannot increase or decrease its size dynamically.
         * 2. To use arrays, we must know the required size in advance, which is not always possible.
         */

        /*
         * Array Declaration
         */

        // 1 Dimensional Array declaration
        int[] intArray;    // recommended
        int []intArray1;   // valid but less readable
        int intArray3[];   // valid but C-style (not recommended)

        // int[6] intArray4; // CE: array dimension missing

        // 2 Dimensional Array declaration
        int[][] intArray5;
        int [][]intArray6;
        int intArray7[][];
        int[] []intArray8;
        int[] intArray9[];
        int []intArray10[];

        /*
         * Multiple variables in single declaration
         */

        int[] intArray11, intArray12; // both 1D
        int[] intArray13[], intArray14; // intArray13 → 2D, intArray14 → 1D
        int[] intArray15[], intArray16[]; // both 2D
        int[][] intArray17, intArray18; // both 2D
        int[][] intArray19, intArray20[]; // intArray19 → 2D, intArray20 → 3D
        // int[][] intArray21, []intArray22; // invalid

        // 3 Dimensional Array declaration
        int[][][] intArray23;
        int [][][]intArray24;
        int intArray25[][][];
        int[] [][]intArray26;
        int[] intArray27[][];
        int[] []intArray28[];
        int [][] []intArray29;
        int [][]intArray30[];
        int []intArray31[][];

        /*
         * Array Creation
         * Every array in java is an object only. Hence we can create an array by using new operator
         */

        int[] intArray32 = new int[6]; //intArray32 is a reference variable [][][][][][]

        // For every array type, corresponding classes are available.
        // These classes are part of the Java language and are not directly available to programmers.

        int[] intArray33 = new int[6]; // intArray33 is a reference variable for a 1D int array
        System.out.println(intArray33.getClass().getName()); // Prints the runtime class name of the array

        /*
         * Array Type      → Corresponding Class Name
         * -------------------------------------------
         * byte[]          → [B
         * byte[][]        → [[B
         * short[]         → [S
         * int[]           → [I
         * long[]          → [J
         * float[]         → [F
         * double[]        → [D
         * char[]          → [C
         * boolean[]       → [Z
         */

        // It is legal to create an array with size 0
        int[] intArray34 = new int[0];   // Valid, but array has no elements

        // If we try to create an array with a negative size,
        // we get a Runtime Exception: NegativeArraySizeException
        // int[] intArray35 = new int[-6];  // RTE at runtime

        // To specify array size, allowed data types are: char, byte, short, int
        // If we try to use any other type (like long, float, double, boolean),
        // the compiler will give a compile-time error like incompatible types: possible lossy conversion from long to int

        int[] intArray36 = new int[6]; // Valid: simple int literal as size

        int[] intArray37 = new int['a']; // Valid: char 'a' is automatically promoted to int (Unicode value 97)

        byte byte1 = 20;
        int[] intArray38 = new int[byte1]; // Valid: byte is automatically promoted to int

        short short1 = 20;
        int[] intArray39 = new int[short1]; // Valid: short is automatically promoted to int

        // int[] intArray40 = new int[10L]; // CE: incompatible types - long cannot be used as array size

        // Maximum allowed array size in Java is 2,147,483,647
        // int[] intArray41 = new int[2_147_483_647]; // Even if array size is within int range, a RuntimeException (OutOfMemoryError) may occur if sufficient heap memory is not available
        // int[] intArray42 = new int[2_147_483_648]; // CE: integer number too large - exceeds maximum int value



        /*
         * 2 Dimensional Array creation
         * In Java, 2D arrays are implemented as "array of arrays" (not as a contiguous matrix).
         * This approach allows each row to have different lengths, improving memory utilization.
         */

        int[][] intArray43 = new int[2][];
        intArray43[0] = new int[2];
        intArray43[1] = new int[3];

        /*
         * Memory Representation of intArray43 (2D Array):
         *
         * intArray43 → 2D array (array of arrays)
         *
         * Heap Memory Structure:
         *
         * intArray43 (reference to 2D array object)
         * ├── [0] → reference to int[2] array
         * │       ├── [0] → 0
         * │       └── [1] → 0
         * └── [1] → reference to int[3] array
         *         ├── [0] → 0
         *         ├── [1] → 0
         *         └── [2] → 0
         *
         * Visual Representation (each "[]" is one element):
         *
         * intArray43[0] → [][]       (2 elements)
         * intArray43[1] → [][][]     (3 elements)
         *
         * Notes:
         * 1. Each row is a separate array object in the heap.
         * 2. The 2D array itself is an object holding references to each row.
         * 3. Row lengths can vary (jagged array), unlike a traditional matrix.
         */


        /*
         * Memory Representation of intArray44 (3D Array):
         *
         * intArray44 → 3D array (array of 2D arrays)
         *
         * Heap Memory Structure:
         *
         * intArray44[0] → 2D array with 3 rows
         *   ├── intArray44[0][0] → []       (1 element)
         *   ├── intArray44[0][1] → [][]     (2 elements)
         *   └── intArray44[0][2] → [][][]   (3 elements)
         *
         * intArray44[1] → 2D array with 2 rows
         *   ├── intArray44[1][0] → [][]     (2 elements)
         *   └── intArray44[1][1] → [][]     (2 elements)
         *
         */

        int[][][] intArray44 = new int[2][][];
        intArray44[0] = new int[3][];
        intArray44[0][0] = new int[1];
        intArray44[0][1] = new int[2];
        intArray44[0][2] = new int[3];
        intArray44[1] = new int[2][2];

        /*
         * Array Initialization
         *
         * 1. Once we create an array, every element is automatically initialized with its default value:
         *    - byte, short, int, long → 0
         *    - float, double          → 0.0
         *    - char                   → '\u0000' (null char, prints as blank)
         *    - boolean                → false
         *    - object references      → null
         *
         * 2. Printing an array reference:
         *    - Multidimensional array reference → [[I@hashcode
         *    - One-dimensional int array reference → [I@hashcode
         *    - A specific element → actual value (default 0 here)
         */

        int[][] intArray45 = new int[2][3];
        System.out.println("2D array reference: " + intArray45);
        System.out.println("1D array reference (row 0): " + intArray45[0]);
        System.out.println("Element at [0][0]: " + intArray45[0][0]);

        // If we are not satisfied with the default values, we can override those values with customized values
        int[] intArray46 = new int[5];

        // Assigning custom values
        intArray46[0] = 1;
        intArray46[1] = 1;
        intArray46[2] = 1;
        intArray46[3] = 1;
        intArray46[4] = 1;
        // intArray46[5] = 1; // RE: ArrayIndexOutOfBoundsException - Reason → array size is 5, valid indexes are 0 to 4 only
        // intArray46[-5] = 1; // RE: ArrayIndexOutOfBoundsException: Index -5 out of bounds for length 5
        // intArray46[2.5] = 1; // Array index must be an integer type (byte, short, char, int).

        /*
         * Array Declaration, Creation and Initialization in a single line
         * Shortcut initialization: values directly enclosed within { }.
         * This syntax automatically creates the array with given size.
         * We can extend this shortcut for multidimensional arrays as well.
         */

        int[] intArray47 = {10, 20, 30, 40, 50}; // 1D array
        int[][] intArray48 = { {10, 20}, {30, 40, 50} };// 2D array:
        int[][][] intArray49 = { { {10, 20}, {30, 40, 50}, {60, 70} } }; // 3D array

        /*
         * length
         * 'length' is an instance variable of every array object.
         * It represents the total size (number of elements) in that array.
         * Note: 'length' is a variable, not a method → so we don’t write () after it.
         * In multidimensional array, length variable represent only the base size but not the total size
         */

        int[] intArray50 = {10, 20, 30, 40, 50};
        System.out.println("Length of intArray50: " + intArray50.length); // Output: 5

        int[][] intArray51 = {{10, 20, 30}, {40, 50}};
        System.out.println("Length of intArray51: " + intArray51.length); // Output: 2

        /*
         * Anonymous Arrays
         * Sometimes we can create an array without storing it in a reference variable.
         * Such nameless arrays are called anonymous arrays.
         *
         * Key Points:
         * 1. They are mainly used for instant / one-time use.
         * 2. Useful when we just need to pass an array to a method.
         * 3. We cannot reuse them because they don’t have a name (reference).
         */

        sum(new int[]{1, 2, 3, 4, 5});

        /*
         * Array element assignment
         * -------------------------
         * - In case of primitive type arrays, we can assign any value that can be
         *   implicitly promoted to the declared type.
         * - Example: int[] can hold int, char, byte, short (all auto-promote to int).
         * - But long, float, double cannot be assigned directly → Compile-time Error.
         */

        int[] intArray52 = new int[6];
        intArray52[0] = 10;       // int → int (direct)
        intArray52[1] = 'a';      // char → int (ASCII/Unicode: 'a' = 97)
        byte byte2 = 20;
        intArray52[2] = byte2;    // byte → int (widening conversion)
        short short2 = 30;
        intArray52[3] = short2;   // short → int (widening conversion)
        // intArray52[4] = 40L;   // CE: incompatible types: possible lossy conversion from long to int
        // intArray52[5] = 3.14;  // CE: incompatible types: possible lossy conversion from double to int

        /*
         * In the case of float type arrays:
         * Allowed data types for assigning elements:
         * - char, byte, short, int, long, float (all will be implicitly promoted to float)
         */


        /*
         * In the case of object type arrays
         * Allowed elements  →  Objects of declared type
         *                   →  Objects of child classes (polymorphism allowed)
         */
        Object[] objects1 = new Object[3];
        objects1[0] = new Object();   // declared type Object
        objects1[1] = "Alex";         // String is child of Object
        objects1[2] = new Integer(100); // Integer also child of Object

        Number[] numbers = new Number[5];
        numbers[0] = Integer.valueOf(10); // Integer extends Number
        numbers[1] = 10.5;  // compiler automatically converts double → Double
        // numbers[2] = new Object();   // CE: Object is parent of Number
        // numbers[3] = new String("Hi"); // CE: String not related to Number

        /*
         * In the case of interface type arrays:
         * Allowed elements  →  Objects of classes that implement that interface
         */

        Runnable[] runnable = new Runnable[2];
        runnable[0] = new Thread();   // Thread implements Runnable
        // runnable[1] = new String(); // CE: String does not implement Runnable

        /*
         * Arrays variable assignment
         * --------------------------
         * Element-level promotion is NOT applicable at array level.
         * Example:
         *   - A char element can be promoted to int (char → int).
         *   - But a char[] cannot be assigned to int[] (char[] ≠ int[]).
         */

        int[] intArray53 = {10, 20, 30, 40, 50, 60};
        char[] char1 = {'a', 'b', 'c', 'd', 'e'};

        int[] intArray54 = intArray53;
        // int[] intArray55 = char1; // CE: incompatible types: char[] cannot be converted to int[]

        /*
         * Which of the following promotions are valid?
         * --------------------------------------------
         * char     → int        : Valid (widening primitive conversion)
         * char[]   → int[]      : Invalid (array-level promotion not allowed)
         * int      → double     : Valid (widening primitive conversion)
         * int[]    → double[]   : Invalid (array-level promotion not allowed)
         * float    → int        : Invalid (narrowing, needs explicit cast)
         * float[]  → int[]      : Invalid (different array types, no promotion)
         * String   → Object     : Valid (String is subclass of Object)
         * String[] → Object[]   : Valid (array of subclass can be assigned to array of superclass)
         */

        /*
         * Array Reference Assignment
         * Whenever we assign one array to another array:
         * - Internal elements are NOT copied.
         * - Only the reference variable is reassigned (both variables point to the same array).
         */
        int[] intArray56 = {10, 20, 30, 40, 50};
        int[] intArray57 = {60, 70, 80, 90, 100};
        // At this point:
        // intArray56 → [10, 20, 30, 40, 50]
        // intArray57 → [60, 70, 80, 90, 100]
        intArray56 = intArray57;
        // Now intArray56 also points to [60, 70, 80, 90, 100]
        // The array [10, 20, 30, 40, 50] becomes unreferenced (eligible for GC).
        intArray57 = intArray56;
        // Both intArray56 and intArray57 still point to [60, 70, 80, 90, 100]

        /*
         * Whenever we are assigning one array to another array,
         * the dimensions must match.
         * Example: In the place of 1D array we should assign only a 1D array.
         * If we try to assign arrays of different dimensions,
         * we will get a compile-time error.
         */
        int[][] intArray58 = new int[3][];
        // intArray58[0] = new int[4][3] // CE: incompatible types: int[][] cannot be converted to int[]


    }

    public static void sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("The sum is: " + total);
    }
}
