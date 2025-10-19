public class Cat implements Cloneable {
    int i;

    Cat(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
