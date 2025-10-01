/*
 * Constructor
 * - Recursive method call → allowed at compile time but fails at runtime
 *   → Results in Runtime Exception: StackOverflowError.
 *
 * - But for constructors:
 *   If there is a chance of **recursive constructor invocation**,
 *   compiler will catch it at **compile time** itself and give
 *   an error → "recursive constructor invocation".
 *
 * Why?
 * - Because constructor chaining (`this(...)` / `super(...)`)
 *   must definitely terminate at some constructor, otherwise
 *   object creation can never complete.
 */
public class Main {
    Main() {
        this(1);
    }

    Main(int i) {
        this();
    }

    public static void main(String[] args) {

    }
}
