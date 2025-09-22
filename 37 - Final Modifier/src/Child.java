public final class Child extends Parent {
    public void m2() { // CE: m2() in Child cannot override m2() in Parent overridden method is final
        System.out.println("Trying to override parent class m2 function in child class");
    }
}