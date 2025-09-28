/*
 * Overriding
 * -----------------------------------
 * - Method name and argument types must be the same (method signature must match).
 *
 * - Return Type Rule:
 *   → Until JDK 1.4: Return types must be exactly the same.
 *   → From JDK 1.5 onwards: Covariant return types are allowed.
 *       - Child class method return type can be a subtype of parent class method return type.
 *
 * - Note:
 *   Covariant return type concept is applicable only for object/reference types
 *   → NOT applicable for primitive types.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent returns: " + parent.m1());

        Child child = new Child();
        System.out.println("Child returns: " + child.m1());

        Parent parentChild = new Child();
        System.out.println("Parent reference, Child object returns: " + parentChild.m1());
    }
}

