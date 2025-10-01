public class Parent {
    Parent(int x) {
        System.out.println("Parent int-arg constructor");
    }

    // Recommended: provide a no-arg constructor
    Parent() {
        System.out.println("Parent no-arg constructor");
    }
}