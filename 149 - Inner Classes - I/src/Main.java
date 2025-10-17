/*
 * Inner Classes
 *
 * Sometimes we can declare a class inside another class; such classes are called Inner Classes.
 * Inner classes were introduced in Java 1.1 to fix GUI bugs (as part of event handling), but because
 * of their powerful features and benefits, developers now use them in general coding as well.
 *
 * Concept:
 * Without the existence of one type of object, if there is no chance of existence for another type
 * of object, then we should go for inner classes.
 *
 * Note:
 * - Without an existing outer class object, there is no chance of an existing inner class object.
 * - The relationship between outer and inner class is a "has-a" relationship, not "is-a".
 *
 * Types of Inner Classes:
 * Based on position of declaration and behavior, all inner classes are divided into:
 *  1. Normal or Regular Inner Class
 *  2. Method Local Inner Class
 *  3. Anonymous Inner Class
 *  4. Static Nested Class
 *
 * Normal or Regular Inner Class:
 * If we declare any named class directly inside another class without the static modifier,
 * such type of inner class is called a normal or regular inner class.
 *
 * Inside an inner class, we cannot declare static members (including the main method),
 * hence we cannot run an inner class directly from the command prompt.
 *
 * Differences between Normal and Anonymous Inner Classes:
 * 1. A normal Java class can extend only one class at a time.
 *    → An anonymous inner class can also extend only one class at a time.
 *
 * 2. A normal Java class can implement any number of interfaces simultaneously.
 *    → An anonymous inner class can implement only one interface at a time.
 *
 * 3. A normal Java class can extend a class and implement any number of interfaces simultaneously.
 *    → An anonymous inner class can either extend a class or implement an interface,
 *      but not both at the same time.
 *
 * 4. A normal Java class can have multiple constructors.
 *    → An anonymous inner class cannot have any constructors explicitly,
 *      because the class has no name.
 */

public class Main {
    public static void main(String[] args) {
        // 1. Using an existing Outer object
        Outer outer = new Outer(); // Create Outer object
        Outer.Inner inner = outer.new Inner(); // Create Inner object using Outer object
        inner.m1(); // Call method of Inner class

        // 2. Inline creation using new Outer()
        Outer.Inner inner1 = new Outer().new Inner();
        inner1.m1();

        // 3. One-liner call without storing references
        new Outer().new Inner().m1();
    }
}

