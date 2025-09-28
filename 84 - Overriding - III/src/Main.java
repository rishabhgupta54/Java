/*
 * Overriding
 * - Parent class private methods are not available to the child.
 *   Hence overriding is not applicable for private methods.
 * - Based on our requirement, we can define a method in the child
 *   with the same name/signature, but it is treated as a new method (not overriding).
 * - If we try to Override on a private method, we will get a
 *   compile-time error.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show(); // Calls Parent's show() which internally calls Parent.m1()

        Child child = new Child();
        child.show(); // Calls Child's show() which internally calls Child.m1()

        Parent parentChild = new Child();
        parentChild.show(); // Calls Child's show() because of overriding on show()
    }
}

