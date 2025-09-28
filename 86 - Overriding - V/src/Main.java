/*
 * Overriding
 * - While overriding we cannot reduce the scope of the access modifier.
 *   Example: Parent's public → Child cannot make it default/protected/private.
 * - But we can increase the scope.
 *   Example: Parent's default/protected → Child can make it public.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        Child child = new Child();
        child.m1();
        child.m2();
    }
}

