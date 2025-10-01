public class Child extends Parent {
    Child() {
        super(); // compiler will insert this by default if not written
        System.out.println("Child constructor");
    }
}