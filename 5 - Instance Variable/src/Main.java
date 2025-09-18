/*
 * If the value of the variable is varied from object to object
 * then such type of variables are called instance variables
 *
 * - For every object a separate copy of instance variable will be created
 * - Instance variable should be declared within the class
 *   but outside any method or block or constructor
 * - Instance variable will be created at the time of object creation
 *   and destroyed at the time of object destruction.
 *   Hence, the scope of instance variable is exactly same as the scope of an object
 * - Instance variable will be stored in heap memory as a part of java object
 * - We cannot access instance variable directly from static area (static function)
 *   but we can access by using object reference
 *   and directly from instance area (instance function)
 * - For instance variable JVM will provide the default values
 *   and we are not required to perform initialization explicitly
 * - Instance variables are also known as Object level variables or attributes
 */
public class Main {
    int int1 = 10; // instance variable
    int int2;
    double double1;
    boolean boolean1;
    String string1;

    public static void main(String[] args) { // static function
        // System.out.println(x); // CE: non-static variable x cannot be referenced from a static context

        Main main = new Main();
        // accessing via object reference
        System.out.println("main.int1: " + main.int1);
        System.out.println("main.int2: " + main.int2);
        System.out.println("main.double1: " + main.double1);
        System.out.println("main.boolean1: " + main.boolean1);
        System.out.println("main.string1: " + main.string1);
    }

    public void m1() { // instance function
        System.out.println(int1); // direct access inside instance method
    }
}