/*
 * Final Modifier - Instance Variable
 *
 * Instance variables:
 * - If the value of a variable can vary from object to object, such variables are called instance variables.
 * - For every object, a separate copy of instance variables will be created.
 * - For normal instance variables, JVM provides default values if we don’t explicitly initialize them.
 *
 * Final instance variables:
 * - If an instance variable is declared as final, then we must explicitly initialize it (JVM will not provide a default value).
 * - Initialization of final instance variables must happen before the constructor completes.
 *
 * Allowed places to initialize a final instance variable:
 * 1. At the time of declaration.
 * 2. Inside an instance initialization block.
 * 3. Inside the constructor.
 *
 * Any attempt to initialize final instance variables outside these places
 * (like inside a normal method) will cause a compile-time error.
 */
public class Main {
    int int1; // Normal instance variable → gets default value 0

    // final int int2; // CE: variable int2 not initialized in the default constructor

    /*
     * Case 1: Final instance variable initialized inside constructor
     */
    final int int3;
    Main() {
        this.int3 = 10;
    }

    /*
     * Case 2: Final instance variable initialized inside instance block
     */
    final int int4;
    {
        this.int4 = 10;
    }

    /*
     * Invalid Case: Trying to initialize final instance variable inside a method
     */
    /*final int int5;
    public void m1() {
        this.int5 = 10; // CE: cannot assign a value to final variable int5
    }*/

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("main.int1 (default value): " + main.int1);
        System.out.println("main.int3 (initialized in constructor): " + main.int3);
        System.out.println("main.int4 (initialized in instance block): " + main.int4);
    }
}
