/*
 * Wrapper Classes
 *
 * The main objectives of Wrapper Classes are:
 *  - To wrap (convert) primitive data types into objects so that primitives can be treated as objects.
 *  - To define several utility methods which are required for primitive data types.
 *
 * Constructors in Wrapper Classes:
 *
 * Byte        → byte or String
 * Short       → short or String
 * Integer     → int or String
 * Long        → long or String
 * Float       → float or double or String
 * Double      → double or String
 * Character   → char
 * Boolean     → boolean or String
 *
 * Notes:
 * - If the String argument does not represent a valid number, a NumberFormatException is thrown.
 * - For Boolean(String s):
 *      Case and content both matter.
 *      If s equalsIgnoreCase("true") → true; otherwise false.
 * - For Character: Only one constructor taking a single char argument.
 *
 * Important Points:
 * - In all wrapper classes, toString() is overridden to return the content directly.
 * - In all wrapper classes, equals() is overridden for content comparison.
 *
 * Utility Methods:
 *  valueOf()   → Create Wrapper Object from primitive or String
 *  xxxValue()  → Get primitive value from Wrapper Object
 *  parseXxx()  → Convert String to primitive
 *  toString()  → Convert Wrapper Object or primitive to String
 *
 * Conversion Summary:
 *
 *  Wrapper Object → String     → toString()
 *  String         → Wrapper    → valueOf()
 *
 *  String         → Primitive  → parseXxx()
 *  Primitive      → String     → toString()
 *
 *  Primitive      → Wrapper    → valueOf()
 *  Wrapper        → Primitive  → xxxValue()
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Almost all wrapper classes contain two constructors:
         * 1. One takes the corresponding primitive type.
         * 2. The other takes a String argument representing the same value.
         */
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer("10");

        /*
         * valueOf()
         * Used to create a wrapper object from a given primitive or String.
         */
        Integer integer3 = Integer.valueOf("10");
        Integer integer4 = Integer.valueOf(10);

        /*
         * xxxValue()
         * Used to get the primitive value from the given wrapper object.
         * Every numeric wrapper class (Byte, Short, Integer, Long, Float, Double)
         * contains the following six methods:
         *
         * public byte byteValue();
         * public short shortValue();
         * public int intValue();
         * public long longValue();
         * public float floatValue();
         * public double doubleValue();
         */
        Integer integer5 = new Integer(10);
        System.out.println("byteValue(): " + integer5.byteValue());
        System.out.println("shortValue(): " + integer5.shortValue());
        System.out.println("intValue(): " + integer5.intValue());
        System.out.println("longValue(): " + integer5.longValue());
        System.out.println("floatValue(): " + integer5.floatValue());
        System.out.println("doubleValue(): " + integer5.doubleValue());

        /*
         * parseXxx()
         * Used to convert String to corresponding primitive type.
         */
        int int1 = Integer.parseInt("10");
        double double1 = Double.parseDouble("10.5");
        boolean boolean1 = Boolean.parseBoolean("True");
        System.out.println("Parsed int: " + int1);
        System.out.println("Parsed double: " + double1);
        System.out.println("Parsed boolean: " + boolean1);

        /*
         * toString()
         * Used to convert wrapper object or primitive to String.
         * Every wrapper class overrides Object’s toString() method to return content directly.
         */
        Integer integer6 = new Integer(25);
        String string1 = integer6.toString();
        System.out.println("String representation of integer6: " + string1);

        // Primitive → String using static toString()
        String string2 = Integer.toString(100);
        System.out.println("Primitive to String using toString(): " + string2);
    }
}
