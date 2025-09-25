/*
 * Interfaces
 * If two interfaces contain methods with the same name but different argument types,
 * then in the implementation class we must provide implementation for both methods.
 * These methods act as overloaded methods.
 */
public class Main implements A, B {
    @Override
    public void m1() {
        System.out.println("Implementation of m1() with no arguments");
    }

    @Override
    public void m1(int i) {
        System.out.println("Implementation of m1(int i) with argument: " + i);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m1(); // calls m1() from interface A
        main.m1(10); // calls m1(int) from interface B
    }
}
