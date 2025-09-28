import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent {
    // Allowed: Child throws subclass exception (EOFException ⊂ IOException)
    public void m1() throws EOFException {
        System.out.println("Child m1()");
    }

    // Compile-time error:
    // Parent declares IOException, Child declares Exception (broader type)
    // public void m2() throws Exception { }

    // Correct way: same exception or subclass
    public void m2() throws IOException {
        System.out.println("Child m2()");
    }
}
