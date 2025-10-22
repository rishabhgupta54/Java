// Interface with private method
interface A {

    // Default method calling private method
    default void showMessage() {
        System.out.println("Default method:");
        printMessage("Hello from default method");
    }

    // Static method calling private method
    static void staticMethod() {
        System.out.println("Static method:");
        printStaticMessage("Hello from static method");
    }

    // Private instance method
    private void printMessage(String msg) {
        System.out.println(msg);
    }

    // Private static method
    private static void printStaticMessage(String msg) {
        System.out.println(msg);
    }
}
