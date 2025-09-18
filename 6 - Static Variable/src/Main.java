/*
 * Static Variable
 *
 * - If the value of a variable does not vary from object to object,
 *   then it is not recommended to declare it as an instance variable.
 *   Such variables should be declared at class level using the 'static' modifier.
 *
 * - Instance variable → separate copy for every object
 * - Static variable   → single copy created at class level, shared by all objects of the class
 *
 * Declaration:
 * - Declared within the class but outside any method, block, or constructor.
 *
 * Life cycle:
 * - Created at the time of class loading
 * - Destroyed at the time of class unloading
 * - Scope of static variable = scope of .class file
 *
 * JVM process flow:
 *   1. Start JVM
 *   2. Create and start main thread
 *   3. Locate .class file
 *   4. Load .class file   → static variables created
 *   5. Execute main method
 *   6. Unload .class file → static variables destroyed
 *   7. Terminate main thread
 *   8. Shutdown JVM
 *
 * Memory:
 * - Stored in the Method Area (a part of JVM memory).
 *
 * Access:
 * - Can be accessed by:
 *       1) Class name (recommended)
 *       2) Object reference
 * - Within the same class, class name is optional → can be accessed directly.
 * - Accessible from both instance area and static area.
 *
 * Initialization:
 * - JVM provides default values, explicit initialization is not mandatory.
 *
 * - Static variables are also known as class level variables or fields.
 */
public class Main {
    static int int1 = 10;
    static int int2;
    static double double1;
    static boolean boolean1;
    static String string1;

    static int int3 = 10;
    static int int4 = 10;


    public static void main(String[] args) {
        Main main1 = new Main();

        // Accessing static variable in 3 ways:
        System.out.println("Via object reference: main1.int1 = " + main1.int1);
        System.out.println("Via class name: Main.int1 = " + Main.int1);
        System.out.println("Directly (inside same class): int1 = " + int1);

        // Default values of other static variables
        System.out.println("Main.int2     = " + Main.int2);
        System.out.println("Main.double1  = " + Main.double1);
        System.out.println("Main.boolean1 = " + Main.boolean1);
        System.out.println("Main.string1  = " + Main.string1);

        /*
         * - Static variables are stored at class level.
         * - A single copy is shared by all objects.
         * - If one object modifies a static variable, the change is reflected
         *   across all other objects of the class.
         */
        Main main2 = new Main();
        main2.int3 = 100;
        main2.int4 = 200;
        Main main3 = new Main();
        System.out.println("main2.int3 = " + main2.int3 + ", main2.int4 = " + main2.int4);
        System.out.println("Main.int3  = " + Main.int3 + ", Main.int4  = " + main3.int4);

    }

    public void m1() {
        // Accessing static variable from instance method
        System.out.println("Access from instance area: int1 = " + int1);
    }
}
