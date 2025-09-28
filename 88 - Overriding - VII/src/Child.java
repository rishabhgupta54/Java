public class Child extends Parent {
    public static void m1() { // Method hiding (not overriding)
        System.out.println("Child static method");
    }

    // static void m2() { } // CE: Cannot change from instance to static
}
