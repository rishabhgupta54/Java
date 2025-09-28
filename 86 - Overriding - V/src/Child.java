public class Child extends Parent {
    // Can't reduce scope (public → default) → Compile Time Error if attempted
    // void m1() {}

    // Same scope is allowed
    public void m1() {
        System.out.println("Child m1()");
    }

    // Increasing scope (default → public) is allowed
    public void m2() {
        System.out.println("Child m2()");
    }
}
