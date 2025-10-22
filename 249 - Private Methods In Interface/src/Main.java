/*
 * Private Methods in Interface
 *
 * - Introduced in Java 9
 * - Can only be used inside default or static methods of the interface
 * - Cannot be called by implementing classes
 */

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.showMessage();
        A.staticMethod();
    }
}

