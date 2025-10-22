// Interface with default method
interface I {
    void m1();

    void m2();

    default void m3() {
        System.out.println("Default method in interface");
    }
}
