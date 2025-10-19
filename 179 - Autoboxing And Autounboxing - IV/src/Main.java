/*
 * Autoboxing and Autounboxing — Wrapper Object Buffering (Caching)
 * -------------------------------------------------------------------
 * Internally, to improve performance and memory efficiency,
 * the JVM maintains a cache (buffer) of wrapper objects for commonly used values.
 *
 * Example for Integer class:
 *     Range: -128 to +127
 *
 *  During class loading:
 *  ----------------------------------------------------
 *  | -128 | -127 | ... | 0 | 1 | ... | 126 | 127 |
 *  ----------------------------------------------------
 *  These Integer objects are created and stored in the cache.
 *
 *  When we autobox a value (e.g., Integer i = 10;),
 *  JVM first checks the cache:
 *    If value is in range (-128 to 127), reuse cached object.
 *    If value is outside this range, create a new object.
 *
 *  Caching (Buffering) ranges:
 *  ---------------------------
 *  Byte      → -128 to 127
 *  Short     → -128 to 127
 *  Integer   → -128 to 127
 *  Long      → -128 to 127
 *  Character → 0 to 127
 *  Boolean   → true / false (always cached)
 *
 *  Note: The cache applies to both Autoboxing and valueOf() method.
 */
public class Main {
    public static void main(String[] args) {

        Integer x1 = new Integer(10);
        Integer y1 = new Integer(10);
        System.out.println("new Integer(10) vs new Integer(10): " + (x1 == y1));
        // false — Both are new objects in heap, no caching involved.

        Integer x2 = new Integer(10);
        Integer y2 = 10; // Autoboxing uses cache
        System.out.println("new Integer(10) vs 10 (autoboxed): " + (x2 == y2));
        // false — x2 is new object; y2 comes from cache.

        Integer x3 = 10; // Cached object
        Integer y3 = 10; // Cached object reused
        System.out.println("10 vs 10 (autoboxed within range): " + (x3 == y3));
        // true — Same cached object reused from -128 to 127 range.

        Integer x4 = 100; // Cached (since within range)
        Integer y4 = 100; // Same cached object reused
        System.out.println("100 vs 100 (autoboxed within range): " + (x4 == y4));
        // true — Still within -128 to 127 cache range.

        Integer x5 = 1000; // Outside cache range
        Integer y5 = 1000; // New object created
        System.out.println("1000 vs 1000 (autoboxed outside range): " + (x5 == y5));
        // false — Outside cache range, new object created.
    }
}
