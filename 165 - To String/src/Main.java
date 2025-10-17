/*
 * To String
 *
 * We can use toString() to get a string representation of an Object.
 * Whenever we try to print an object reference, internally toString() method is called.
 *
 * If our class doesn't contain a toString() method, then Object class's toString() method
 * will be executed, which gives output in the form:
 *      ClassName@hashCode_in_hexadecimal
 *
 * Based on our requirements, we can override toString() to provide a meaningful
 * string representation.
 *
 * Note:
 * - All Wrapper classes, Collection classes, String, StringBuffer, and StringBuilder classes
 *   override toString() for a human-readable representation.
 * - It is highly recommended to override toString() in our own classes as well.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Alex");
        System.out.println("Student toString(): " + student.toString());
        System.out.println("Student (direct print): " + student);

        Person person = new Person("Kara", 28);
        System.out.println("Person toString(): " + person.toString());
        System.out.println("Person (direct print): " + person);
    }
}

