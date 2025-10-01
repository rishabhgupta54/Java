/*
 * Constructor
 * - In every constructor, either `super()` (parent constructor call)
 *   or `this()` (current class constructor call) is inserted
 *   automatically by the compiler if we don’t specify it.
 *
 * - Important Rule:
 *   `super()` or `this()` must always be the first statement inside a constructor.
 *
 * - If we try to place them anywhere else (after some statements),
 *   we get a compile-time error:
 *   "Constructor call must be the first statement in a constructor".
 */
public class Main {
    Main() {
        System.out.println("Constructor");
        // super(); // CE: call to super must be first statement in constructor
        // this(10); // CE: call to this must be first statement in constructor
    }

    Main(int i) {

    }
    public static void main(String[] args) {

    }
}
