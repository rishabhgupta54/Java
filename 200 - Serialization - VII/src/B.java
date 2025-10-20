import java.io.Serializable;

// Serializable child class
public class B extends A implements Serializable {
    int j = 20;

    B() {
        System.out.println("B class constructor (serializable child)");
    }
}
