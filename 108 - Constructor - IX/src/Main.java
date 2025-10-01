/*
 * Constructor
 * Within a class, we can declare multiple constructors.
 * All constructors have the same name (class name).
 * They must differ in the number/type/order of arguments.
 * This is called constructor overloading (just like method overloading).
 *
 * Constructor Inheritance:
 *   -> Constructors are NOT inherited in Java.
 * Constructor Overriding:
 *   -> Overriding is applicable only to methods, not to constructors.
 * Constructor Overloading:
 *   -> Possible in Java (by changing number or type of parameters).
 */
public class Main {
    Main() {
        this(10);
        System.out.println("no args");
    }

    Main(int i) {
        this(10.5);
        System.out.println("int args");
    }

    Main(double d) {
        System.out.println("double args");
    }

    public static void main(String[] args) {
        Main maini = new Main();
        Main main2 = new Main(10);
        Main main3 = new Main(10.5);
        Main main4 = new Main(10L);
    }
}
