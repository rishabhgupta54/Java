/*
 * Abstract Class And Interface Constructor
 *
 * - We cannot create objects for abstract classes and interfaces.
 *
 * - Abstract Class:
 *      ✔ Can contain constructors.
 *      ✔ Purpose: To initialize instance variables that will be inherited
 *        by child class objects.
 *
 * - Interface:
 *      ✘ Cannot contain constructors.
 *      ✘ Why? → Because every variable in an interface is always
 *        public static final (constants).
 *        → No instance variables exist inside an interface.
 *        → Since there are no instance variables, there’s no need for a constructor.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rishabh", 12, 48);
        student.display();
    }
}
