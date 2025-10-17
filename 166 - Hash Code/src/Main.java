/*
 * Hash Code
 *
 * For every object, JVM generates a unique integer number which is called hash code.
 *
 * Key Points:
 * - hash code does NOT represent the memory address of the object.
 * - JVM uses hash code internally while storing objects into hashing-based data structures
 *   like HashMap, HashSet, or Hashtable.
 * - The main advantage of hashing is faster search operations.
 *
 * If we do not override hashCode(), Object class provides a default implementation that
 * generates hash code based on the internal address of the object (though not equal to it).
 *
 * Based on our requirement, we can override hashCode() in our class to generate
 * our own hash code. It is considered proper overriding only if:
 *   → For every distinct object, we generate a distinct hash code.
 *
 * Formula (commonly used example):
 *   hashCode = unique combination of fields (like id, roll number, etc.)
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex");
        Student student2 = new Student(2, "Kara");

        System.out.println("Student 1 hashCode: " + student1.hashCode());
        System.out.println("Student 2 hashCode: " + student2.hashCode());
    }
}

