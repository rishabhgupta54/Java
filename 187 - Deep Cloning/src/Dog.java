public class Dog implements Cloneable {
    Cat cat;
    int i;

    Dog(Cat cat, int i) {
        this.cat = cat;
        this.i = i;
    }

    protected Object clone() throws CloneNotSupportedException {
        // First perform shallow cloning
        Dog cloned = (Dog) super.clone();
        // Then clone the contained object for deep cloning
        cloned.cat = (Cat) this.cat.clone();
        return cloned;
    }
}
