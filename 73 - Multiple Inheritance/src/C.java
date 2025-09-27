/*public class C extends A, B {  // CE: cannot inherit from multiple classes
}*/

public class C implements X, Y {
    public void show() {
        System.out.println("Show implemented in C");
    }
}