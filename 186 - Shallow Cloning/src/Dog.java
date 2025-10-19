// Class implementing Cloneable for shallow cloning
public class Dog implements Cloneable {
    Cat cat; // reference type field
    int i;   // primitive type field

    Dog(Cat cat, int i) {
        this.cat = cat;
        this.i = i;
    }

    // Overriding clone() to make it public and call Object's clone
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}
