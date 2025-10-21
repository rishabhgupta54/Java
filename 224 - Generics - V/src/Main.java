/*
 * Generics
 *
 * Based on our requirements, we can declare any number of type parameters.
 * All these type parameters should be separated by commas.
 *
 * Syntax:
 *     class ClassName<T1, T2, T3, ...> { }
 *
 * Each type parameter can represent a different type.
 */

public class Main {
    public static void main(String[] args) {

        A<Integer, String> a1 = new A<>();
        a1.setValues(100, "Alex");
        a1.showTypes();
        a1.displayValues();

        // Another example with different type combinations
        A<Double, Boolean> a2 = new A<>();
        a2.setValues(12.5, true);
        a2.showTypes();
        a2.displayValues();
    }
}

/*
 * Generic class with two type parameters
 */
class A<T, U> {
    T first;
    U second;

    void setValues(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void showTypes() {
        System.out.println("Type of T: " + first.getClass().getName());
        System.out.println("Type of U: " + second.getClass().getName());
    }

    void displayValues() {
        System.out.println("Values: " + first + " and " + second);
        System.out.println("--------------------------------");
    }
}
