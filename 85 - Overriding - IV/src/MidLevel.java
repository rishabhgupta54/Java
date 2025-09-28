// Overriding non-abstract as abstract
abstract class MidLevel extends Child {
    // redefining as abstract → Child’s implementation is hidden
    public abstract void m1();
}
