/*
 * Autoboxing and Autounboxing

 * Autoboxing:
 * Automatic conversion of a primitive datatype into its
 * corresponding Wrapper object by the compiler.
 *
 * Example:
 *      Integer i = 10;
 *  →  Internally compiler converts it to:
 *      Integer i = Integer.valueOf(10);
 *  i.e. Autoboxing is internally implemented using valueOf() method.
 *
 * Autounboxing:
 * Automatic conversion of a Wrapper object into its
 * corresponding primitive value by the compiler.
 *
 * Example:
 *      Integer I = new Integer(10);
 *      int i = I;
 *  →  Internally compiler converts it to:
 *      int i = I.intValue();
 *  i.e. Autounboxing is internally implemented using xxxValue() method.
 *
 * Summary:
 *  Primitive → Wrapper Object   : Autoboxing (valueOf())
 *  Wrapper Object → Primitive   : Autounboxing (xxxValue())
 *
 * Conversion Flow:
 *
 *     +--------------------+       Autoboxing        +----------------------+
 *     |    Primitive Type  |  -------------------->  |   Wrapper Class Obj  |
 *     |   (int, double...) |                        | (Integer, Double...)  |
 *     +--------------------+                         +----------------------+
 *              ^                                              |
 *              |                Autounboxing                  |
 *              +----------------------------------------------+
 */
public class Main {
    static Integer I = 10; // Autoboxing (int → Integer)

    public static void main(String[] args) {
        int i = I; // Autounboxing (Integer → int)
        m1(i);     // Autoboxing (int → Integer)
    }

    public static void m1(Integer I) {
        int i = I; // Autounboxing (Integer → int)
        System.out.println(i);
    }
}
