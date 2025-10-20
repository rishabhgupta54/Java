import java.io.Serializable;

// Nested serializable class
public class B implements Serializable {
    C c = new C(); // reference to another serializable object
}
