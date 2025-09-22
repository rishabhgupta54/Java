/*
 * Static Import
 * ---------------------------
 * - Introduced in Java 1.5
 * - Normally, to access a static member we use the class name (e.g., Math.sqrt()).
 * - With static import, we can access static members directly (e.g., sqrt()) without class name.
 *
 * Pros (as per Sun):
 * - Reduces length of the code.
 * - Can improve readability in some cases.
 *
 * Cons (as per experts):
 * - Can cause confusion if multiple classes have static members with the same name.
 * - Reduces clarity because it’s harder to know where a method/variable comes from.
 *
 * Rule:
 * - Use static import carefully and only when it genuinely improves readability.
 */

import static java.lang.Math.sqrt; // Explicit static import → only one member
import static java.lang.Math.*; // Implicit static import → all static members of Math
import static java.lang.System.out; // Explicit static import
import static java.lang.Integer.MAX_VALUE; // Explicit static import
import static java.lang.Byte.*; // Implicit static import → all static members of Byte

public class Main {
    static int MAX_VALUE = 999; // Current class static member

    public static void main(String[] args) {
        /*
         * Without static import → must use class name
         */
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.max(4, 5) = " + Math.max(4, 5));
        System.out.println("Math.random() = " + Math.random());

        /*
         * With static import → class name not required
         */
        System.out.println("sqrt(5) = " + sqrt(5)); // explicit import
        System.out.println("random() = " + random()); // implicit import (*)
        out.println("Using out.println instead of System.out.println"); // explicit import

        /*
         * Precedence while resolving static members:
         * 1. Current class static member
         * 2. Explicit static import
         * 3. Implicit static import (via wildcard '*')
         *
         * Example (for MAX_VALUE):
         * - Currently, it refers to the current class variable = 999.
         * - If we remove the current class variable (line 27), then
         *   Integer.MAX_VALUE (from explicit static import) will be used.
         * - If we also remove the explicit import (line 23),
         *   then Byte.MAX_VALUE (from implicit static import) will be used.
         */
        System.out.println("MAX_VALUE = " + MAX_VALUE);
    }
}
