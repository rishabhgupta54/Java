/*
 * Interfaces - Variables
 *
 * - An interface can contain variables.
 * - The main purpose of interface variables is to define requirement-level constants.
 *
 * Key Rules:
 * 1. Every variable declared in an interface is always:
 *      → public
 *      → static
 *      → final
 *    (whether we declare them explicitly or not).
 *
 * 2. Why?
 *    - public → So every implementation class can access it.
 *    - static → Because variables belong to the interface itself, not to objects.
 *               Hence, they can be accessed without creating an object.
 *    - final  → Once assigned, the value cannot be changed.
 *               This prevents one implementation from modifying it and affecting others.
 *
 * 3. Initialization:
 *    - For interface variables, it is compulsory to perform initialization
 *      at the time of declaration.
 *    - Otherwise, we will get a compile-time error
 *      (because final variables must be initialized and there’s no constructor in interface).
 *
 * 4. No matter how we declare them (with or without modifiers),
 *    the compiler treats them the same: public static final.
 */

public interface A {
    int int1 = 10;                        // implicitly public static final
    public int int2 = 10;                 // explicitly public
    static int int3 = 10;                 // explicitly static
    final int int4 = 10;                  // explicitly final
    public static int int5 = 10;          // explicitly public static
    public final int int6 = 10;           // explicitly public final
    static final int int7 = 10;           // explicitly static final
    public static final int int8 = 10;    // explicitly public static final
}
