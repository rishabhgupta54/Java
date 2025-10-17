/*
 * Equals
 * We can use equals() method to check equality of two objects:
 *      object1.equals(object2)
 *
 * If our class doesn't contain an equals() method, then Object class's equals()
 * method will be executed, which performs reference comparison.
 *
 * Based on our requirement, we can override equals() method to perform
 * content comparison (compare values inside objects instead of references).
 *
 * In String class, equals() is overridden for content comparison —
 * even if objects are different, if content is same then equals() returns true.
 *
 * In StringBuffer class, equals() is NOT overridden for content comparison —
 * so if objects are different, equals() returns false even if content is same.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Object class equals() method got executed for Student objects
         * → Performs REFERENCE comparison
         * → Returns true only if both references point to the same object
         */
        Student student1 = new Student(1, "Alex");
        Student student2 = new Student(2, "Kara");
        Student student3 = new Student(1, "Alex");
        Student student4 = student1;

        System.out.println("student1.equals(student2): " + student1.equals(student2)); // false (different objects)
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // false (same content but different references)
        System.out.println("student1.equals(student4): " + student1.equals(student4)); // true  (same reference)

        /*
         * Person class has overridden equals() method
         * → Performs CONTENT comparison
         * → Returns true if name and age are same
         */
        Person person1 = new Person("Alex", 28);
        Person person2 = new Person("Kara", 27);
        Person person3 = new Person("Alex", 28);
        Person person4 = person1;

        System.out.println("person1.equals(person2): " + person1.equals(person2)); // false (different content)
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // true  (same content)
        System.out.println("person1.equals(person4): " + person1.equals(person4)); // true  (same reference)

        /*
         * String class equals() → CONTENT comparison
         */
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("String s1.equals(s2): " + s1.equals(s2)); // true (content is same)

        /*
         * StringBuffer class equals() → REFERENCE comparison
         */
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("StringBuffer sb1.equals(sb2): " + sb1.equals(sb2)); // false (different objects)
    }
}
