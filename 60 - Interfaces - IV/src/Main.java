/*
 * Interfaces
 * If two interfaces contain a method with the same signature and same return type,
 * then in the implementation class we only need to provide implementation once.
 */

public class Main implements A, B {
    @Override
    public void m1() {
        System.out.println("Implementation of m1() from both A and B");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
    }
}
