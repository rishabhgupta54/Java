class Child extends Parent {
    private void m1() {
        System.out.println("Private method of Child class");
    }

    public void show() {
        m1(); // calls Child's private m1()
    }
}
