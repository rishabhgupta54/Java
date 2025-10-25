/*
 *  Record Class
 *
 *  A record is a special kind of class introduced in Java 14 (as a preview)
 *  and standardized in Java 16.
 *
 *  Purpose:
 *  To model *immutable data* (data carriers) without writing boilerplate code.
 *
 *  Key Features:
 *  - Automatically generates:
 *      • private final fields
 *      • constructor
 *      • accessors (methods with same name as field)
 *      • equals(), hashCode(), and toString()
 *  - Compact, immutable, and final by design.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Using Traditional Class (CStudent)
         * - Requires manual constructor, getters, setters, and toString.
         */
        CStudent cStudent = new CStudent(1, "Alex", 28);
        System.out.println("CStudent ID: " + cStudent.getId());
        System.out.println("CStudent Name: " + cStudent.getName());
        System.out.println("CStudent Age: " + cStudent.getAge());
        System.out.println("CStudent Object: " + cStudent);

        /*
         * Using Record (RStudent)
         * - Automatically has constructor and accessors.
         * - Immutable → cannot modify after creation.
         * - No setters provided.
         */
        RStudent rStudent = new RStudent(1, "Alex", 28);
        System.out.println("RStudent ID: " + rStudent.id());
        System.out.println("RStudent Name: " + rStudent.name());
        System.out.println("RStudent Age: " + rStudent.age());
        System.out.println("RStudent Object: " + rStudent);
    }
}
