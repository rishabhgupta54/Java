/*
 * Constructor
 * - Every class in Java (including abstract classes) can have a constructor.
 * - Constructors are mainly used to initialize objects.
 * - Even if we don't write one, the compiler provides a default constructor.
 *
 * - Interfaces CANNOT have constructors.
 *   Why? Because:
 *     1. Interfaces cannot be instantiated directly.
 *     2. Their fields are implicitly public, static, and final (constants).
 *     3. Initialization responsibility is left to implementing classes.
 */
public class Main {
    Main() {

    }
    public static void main(String[] args) {

    }
}
