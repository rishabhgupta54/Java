/*
 * Interfaces - Variables in Implementation Class
 * - Inside an implementation class we can access interface variables.
 * - But we CANNOT modify their values because they are always final.
 */

public class Main implements A {
    public static void main(String[] args) {
        System.out.println("A.int1: " + A.int1);
        System.out.println("Access via Main: " + Main.int1);
    }
}
