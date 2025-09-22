abstract class Parent {
    // public abstract final void m2(); // CE: illegal combination of modifiers: abstract and final
    // public abstract native void m2(); // CE: illegal combination of modifiers: abstract and native
    // public abstract synchronized void m2(); // CE: illegal combination of modifiers: abstract and synchronized
    // public abstract static void m2(); // CE: illegal combination of modifiers: abstract and static
    // private abstract void m2(); // CE: illegal combination of modifiers: abstract and private
    // public abstract strictfp void m2(); // CE: illegal combination of modifiers: abstract and strictfp
    public abstract void m1();

    public abstract void m2();

    public void m3() {
        System.out.println("Non abstract method in abstract class");
    }
}
