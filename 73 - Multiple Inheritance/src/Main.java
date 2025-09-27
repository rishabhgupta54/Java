/*
 * Multiple Inheritance
 * - A Java class cannot extend more than one class at a time.
 *   → Hence, Java does NOT support multiple inheritance with classes.
 *
 * - If a class does not extend any other class, it is a direct child of Object class.
 * - If a class extends another class, it is an indirect child of Object class.
 *
 * Why Java does not support multiple inheritance with classes?
 * - Because of ambiguity problems (Diamond problem).
 *   → If two parent classes have methods with the same signature,
 *     the child will not know which one to inherit → ambiguity.
 *
 * Interfaces:
 * - An interface can extend any number of interfaces simultaneously.
 * - A class can implement any number of interfaces.
 *
 * Why no ambiguity with interfaces?
 * - Even though multiple declarations are there,
 *   implementation is provided by the implementing class.
 * - Hence, no chance of ambiguity problem.
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
