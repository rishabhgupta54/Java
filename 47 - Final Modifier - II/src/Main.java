/*
 * Final Variable - Static Variable
 *
 * Static variables:
 * - If the value of a variable does not vary from object to object, then it should be declared as static (class-level variable).
 * - For static variables, only one copy exists per class, and it is shared by all objects of that class.
 * - JVM provides default values to normal static variables if not initialized explicitly.
 *
 * Final static variables:
 * - If a static variable is declared as final, then we must explicitly initialize it (JVM does not provide default values).
 * - Initialization must be done before the class is loaded into memory.
 *
 * Allowed places to initialize a final static variable:
 * 1. At the time of declaration.
 * 2. Inside a static initialization block.
 *
 * Invalid places:
 * - Inside a normal method → causes compile-time error.
 */
public class Main {
    static int int1; // Normal static variable → default value 0

    // final static int int2; // CE: variable int2 not initialized in the default constructor

    /*
     * Case 1: Final static variable initialized inside static block
     */
    final static int int3;
    static {
        int3 = 10;
    }

    /*
     * Invalid Case: Trying to initialize final static variable inside a method
     */
    /*final static int int4;
    public static void m1() {
        int4 = 10; // CE: cannot assign a value to final variable int4
    }*/

    public static void main(String[] args) {
        System.out.println("Normal static variable (int1): " + int1);
        System.out.println("Final static variable (int3): " + int3);
    }
}
