/*
 * Abstraction
 * - Hiding internal implementation and just highlighting the set of services
 *   that we are offering is the concept of **Abstraction**.
 *
 * Advantages of Abstraction:
 * - We can achieve security because we are not exposing internal implementation.
 * - Without affecting outside code, we can change our internal implementation → easier enhancements.
 * - Improves maintainability of the application.
 * - Makes it easier to use the system.
 *
 * Ways to achieve abstraction in Java:
 * 1. Abstract classes (partial abstraction)
 * 2. Interfaces (full abstraction, before Java 8)
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(); // upcasting → abstraction in action
        car.start();
        car.stop();
    }
}
