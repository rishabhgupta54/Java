/*
 * Has-A Relationship
 * - Also known as Composition or Aggregation.
 *
 * - "Has-A" means one class contains the reference of another class.
 *   Example: Car "has a" Engine, Student "has a" Address, etc.
 *
 * - There is no specific keyword in Java for Has-A relationship.
 *   → Mostly implemented using the `new` keyword or by passing objects.
 *
 * - The main advantage of Has-A relationship is Code Reusability.
 *
 * Types:
 * 1. Composition → Strong Has-A relationship
 *    - Child object cannot exist without parent object.
 *    - Example: Car has an Engine → Engine is essential.
 *
 * 2. Aggregation → Weak Has-A relationship
 *    - Child object can exist without parent object.
 *    - Example: Student has an Address → Student can exist without Address.
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine); // Car HAS-A Engine
        car.start();
    }
}
