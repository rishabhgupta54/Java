/*
 * Class A implements Cloneable to allow cloning.
 */
public class A implements Cloneable {
    int i = 10;
    int j = 20;

    /*
     * Overriding clone() method to make it public and to call Object's clone().
     * Returns a shallow copy of the current object.
     */
    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}
