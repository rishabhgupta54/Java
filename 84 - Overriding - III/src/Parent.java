public class Parent {
    private void m1() {
        System.out.println("Private method of Parent class");
    }

    public void show() {
        m1(); // calls Parent's private m1()
    }
}
