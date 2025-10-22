// Implementation class overriding default method
public class C implements I {
    public void m1() {
    }

    public void m2() {
    }

    @Override
    public void m3() {
        System.out.println("Overridden default method in class C");
    }
}
