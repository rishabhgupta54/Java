/*
 * Composition And Aggregation
 * ----------------------------
 *
 * Composition:
 * - Strong Has-A relationship.
 * - Without the container object, the contained object cannot exist.
 * - Example: Car HAS-A Engine → if Car is destroyed, Engine is also destroyed.
 *
 * Aggregation:
 * - Weak Has-A relationship.
 * - Without the container object, the contained object can still exist.
 * - Example: Student HAS-A Address → Student may exist without Address.
 */
public class Main {
    public static void main(String[] args) {
        // Composition Example
        Car car = new Car();
        car.start();

        // Aggregation Example
        Address address = new Address("New Delhi");
        Student student = new Student("Rishabh", address);
        student.display();
    }
}
