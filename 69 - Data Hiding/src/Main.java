/*
 * Data Hiding
 *
 * - Outside code (external person) should not access our internal data directly.
 *   → Our internal data should not go out directly.
 *   → This OOPS feature is called Data Hiding.
 *
 * - How to achieve?
 *   → By declaring data members as private.
 *   → Provide controlled access through getters and setters.
 *
 * - Main advantage:
 *   → Security of data.
 *   → We can apply validations while setting values.
 *   → Highly recommended to declare data members as private.
 */

public class Main {
    public static void main(String[] args) {
        A a = new A();
        // System.out.println("a.int1: " + a.int1); // CE: int1 has private access in A
    }
}
