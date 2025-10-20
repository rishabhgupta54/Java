import java.io.Serializable;

// Nested serializable class
public class C implements Serializable {
    int i = 10; // primitive field will be serialized automatically
}
