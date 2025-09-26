/*
 * Child Object And Parent Constructor
 *
 * - Whenever we create a child class object, automatically the parent class
 *   constructor will also be executed.
 *
 * - Why? → Because the child object contains both:
 *      (a) its own instance variables, and
 *      (b) inherited instance variables from the parent.
 *
 * - Parent constructor initializes the parent's instance variables,
 *   and child constructor initializes the child's instance variables.
 *
 * - Whenever we are creating child class object, parent constructor will be executed
 *   but parent object won't be created.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rishabh", 12, 48, 98);
    }
}
