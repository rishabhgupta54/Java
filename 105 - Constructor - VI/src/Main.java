/*
 * Constructor
 * Compiler generates internally:
 * public class Main {
 *     public Main() { // same access as class
 *         this(10);
 *     }
 *     public Main(int i) { // same access as class
 *         super(); // call parent constructor
 *     }
 * }
 */

public class Main {
    Main() {
        this(10);
    }

    Main(int i) {
        super();
    }

    public static void main(String[] args) {
        Main obj = new Main();
    }
}
