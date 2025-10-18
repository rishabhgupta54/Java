/*
 * String Class
 * Object creation in the String Constant Pool (SCP) is optional.
 *  → First, JVM checks if an object with the required content already exists in SCP.
 *     - If yes → existing object will be reused.
 *     - If not → a new object will be created in SCP.
 *
 * NOTE: This rule applies only to the SCP, not to the heap.
 *
 * - Whenever we use the 'new' operator, a new object is always created in the Heap area.
 * - Hence, duplicates are possible in the Heap area but NOT in the SCP.
 *
 * Garbage Collector cannot access SCP objects.
 * Even if a literal String has no reference variable, it is not eligible for GC
 * until JVM shuts down.
 *
 * All SCP objects will be destroyed automatically when the JVM shuts down.
 *
 * Below example demonstrates:
 *  1. How literal strings share memory in SCP.
 *  2. How 'new String()' always creates a new object in Heap.
 *  3. Why == behaves differently for Heap vs SCP strings.
 */

public class Main {
    public static void main(String[] args) {
        String string1 = new String("Hello");  // Heap object + "Hello" literal in SCP (if not already)
        String string2 = new String("Hello");  // New Heap object, "Hello" already in SCP
        String string3 = "Hello";              // Reuses SCP object
        String string4 = "Hello";              // Reuses same SCP object (no duplicate)

        System.out.println("string1 == string2 : " + (string1 == string2)); // false (different heap objects)
        System.out.println("string1.equals(string2) : " + string1.equals(string2)); // true (same content)

        System.out.println("------------------------------------------------------");

        System.out.println("string3 == string4 : " + (string3 == string4)); // true (same SCP object)
        System.out.println("string3.equals(string4) : " + string3.equals(string4)); // true (same content)

        System.out.println("------------------------------------------------------");

        System.out.println("string1 == string3 : " + (string1 == string3)); // false (Heap vs SCP)
        System.out.println("string1.equals(string3) : " + string1.equals(string3)); // true (same content)
    }
}

/*
 * MEMORY REPRESENTATION:
 *
 *             +------------------------------------------+
 *             |                 HEAP AREA                |
 *             |------------------------------------------|
 *             | new String("Hello")   <-- string1        |
 *             | new String("Hello")   <-- string2        |
 *             +------------------------------------------+
 *                           ↑
 *                           |   (refers to literal)
 *                           ↓
 *             +------------------------------------------+
 *             |        STRING CONSTANT POOL (SCP)        |
 *             |------------------------------------------|
 *             | "Hello"   <-- string3, string4           |
 *             +------------------------------------------+
 *
 *  => string1 & string2 : separate objects in HEAP (== false)
 *  => string3 & string4 : same SCP object (== true)
 *  => string1 vs string3 : different memory areas (== false)
 */
