/*
 * Enum
 *
 * - Every enum is a direct subclass of `java.lang.Enum`.
 *   → Therefore, an enum cannot extend another enum or class.
 *   → This is because Java does not support multiple inheritance.
 *
 * - Every enum is implicitly final.
 *   → We cannot create a subclass of an enum.
 *
 * - Because of the above two points:
 *   → Traditional inheritance using `extends` is not applicable for enums.
 *
 * - However, an enum can implement one or more interfaces.
 *   → This allows enums to provide additional behavior.
 *
 * - Internally, enum automatically implements:
 *   - `Serializable`
 *   - `Comparable` (but `clone()` is protected to prevent cloning)
 *
 * Summary:
 * - Cannot extend any class or enum
 * - Cannot be subclassed
 * - Can implement interfaces
 * - Serializable and Comparable by default
 */
public class Main {
    public static void main(String[] args) {

    }
}
