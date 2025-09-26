/*
 * Need Of Abstract Class Constructor
 *
 * - We cannot create objects for abstract classes directly or indirectly,
 *   but abstract classes can still have constructors.
 *
 * - Why? → The main purpose of an abstract class constructor is to perform
 *   initialization for the instance variables declared in the abstract class,
 *   which will be inherited by child classes.
 *
 * - Whenever we create a child class object:
 *      1. Parent (abstract class) constructor will execute → initializes parent variables.
 *      2. Child constructor will execute → initializes child variables.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rishabh", 12, 48);
    }
}
