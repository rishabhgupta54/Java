/*
 * Class Level Modifiers
 * ---------------------------------------------------------
 * Whenever we create a class, we can specify certain modifiers
 * to tell the JVM about the class behavior:
 * - Whether this class can be accessed from anywhere or not
 * - Whether child class creation is possible or not
 * - Whether object creation is possible or not
 *
 * Applicable modifiers for top-level classes:
 * - public
 * - default (no modifier)
 * - final
 * - abstract
 * - strictfp
 *
 * Applicable modifiers for inner classes:
 * - public
 * - default
 * - final
 * - abstract
 * - strictfp
 * - private
 * - protected
 * - static
 */

// Valid top-level classes
public class Main { // public → accessible from anywhere
    public static void main(String[] args) {

    }
}

/*class Main { // default (package-private) → accessible only within the same package
    public static void main(String[] args) {

    }
}*/

/*final class Main { // final → inheritance not allowed
    public static void main(String[] args) {

    }
}*/

/*abstract class Main { // abstract → cannot create objects, only extend
    public static void main(String[] args) {

    }
}*/

/*strictfp class Main { // strictfp → floating-point calculations follow IEEE 754 standards
    public static void main(String[] args) {

    }
}*/

// Invalid top-level classes (compilation error)
/*private class Main { // private not allowed for top-level class
    public static void main(String[] args) {

    }
}*/

/*protected class Main { // protected not allowed for top-level class
    public static void main(String[] args) {

    }
}*/

/*static class Main { // static not allowed for top-level class (only inner classes can be static)
    public static void main(String[] args) {

    }
}*/
