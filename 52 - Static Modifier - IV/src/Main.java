/*
 * Static Modifier
 *
 * - It may appear that overriding is applicable for static methods,
 *   but in reality, **overriding does not apply to static methods**.
 *   Instead, the concept is called **method hiding**.
 *
 * - For static methods:
 *   → Overloading (allowed)
 *   → Inheritance (allowed)
 *   → Overriding (not allowed, replaced by method hiding)
 *
 * - Method hiding:
 *   → If a child class defines a static method with the same signature
 *     as the parent class static method, the child’s version hides
 *     the parent’s version. It does not override it.
 *
 * - Choosing between instance and static methods:
 *   → If a method implementation uses at least one instance variable,
 *     it is tied to a specific object → declare it as an **instance method**.
 *   → If a method does not use any instance variable,
 *     it is not tied to a specific object → declare it as a **static method**,
 *     regardless of whether it uses static variables or not.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Parent class main method executed");
    }
}
