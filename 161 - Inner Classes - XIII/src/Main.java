/*
 * Inner Classes
 * Static Nested Classes

 * Sometimes we can declare an inner class with the 'static' modifier — such classes are called
 * static nested classes.
 *
 * Difference between Normal Inner Class and Static Nested Class:
 * - In the case of a normal (non-static) inner class:
 *      → Without an existing outer class object, there is no chance of existing an inner class object.
 *      → Inner class object is strongly associated with the outer class object.
 *
 * - In the case of a static nested class:
 *      → Without an existing outer class object, we can still create a static nested class object.
 *      → Hence, the static nested class object is **not strongly associated** with the outer class object.
 *
 * Static nested classes behave more like top-level classes but are logically grouped inside another class.
 *
 * Access:
 *  - We can access static nested class directly by using:
 *        Outer.Nested obj = new Outer.Nested();
 *
 *  - Static nested class can access only static members of the outer class directly.
 *    (To access non-static members, we must use an outer class object.)
 *
 * Object Relationship Diagram:
 *   [Outer Class]
 *        │
 *        ├───(has static nested class)
 *        ▼
 *   [Static Nested Class]  ← Independent of Outer object
 */

public class Main {
    static class Nested {
        public void m1() {
            System.out.println("Static nested class method");
        }
    }

    public static void main(String[] args) {
        // Accessing Static Nested Class without creating Outer class object
        Nested nested1 = new Nested();
        nested1.m1();

        // Alternatively (fully qualified name)
        Main.Nested nested2 = new Main.Nested();
        nested2.m1();
    }
}
