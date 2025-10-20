import java.io.Serializable;

// Main class implementing Serializable
public class A implements Serializable {
    B b = new B(); // reference to another serializable object
}
