/*
 * Constructor
 * - We can use `super()` or `this()` only inside a constructor.
 * - They must always be the first statement in the constructor.
 * - If we try to use them:
 *      1. Inside a method  → Compile-time error
 *      2. After some statements in constructor → Compile-time error
 */
public class Main {
    public void m1() {
        // super(); // CE: call to super must be first statement in constructor
        // his(); // CE: call to this must be first statement in constructor
    }
    public static void main(String[] args) {

    }
}
