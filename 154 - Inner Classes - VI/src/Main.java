/*
 * Inner Classes
 * Nested Inner Classes
 * ------------------------------------
 * Inside an inner class, we can declare another inner class.
 * This is called *nesting of inner classes*.
 *
 * Structure Example:
 *
 *  ----------------------------
 *  |          A               |
 *  |--------------------------|
 *  |  class B {               |
 *  |      ------------------  |
 *  |      |    class C {   |  |
 *  |      |      m1() →   |  |
 *  |      | "Inner class" |  |
 *  |      ------------------  |
 *  |  }                       |
 *  ----------------------------
 *
 * Access Steps:
 * -------------
 * 1. Create outer object → A a = new A();
 * 2. Create inner B object → A.B ab = a.new B();
 * 3. Create inner C object → A.B.C abc = ab.new C();
 * 4. Call abc.m1();
 */

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B ab = a.new B();
        A.B.C abc = ab.new C();
        abc.m1();
    }
}

