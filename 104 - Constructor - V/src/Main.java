/*
 * Constructor
 * Compiler generates internally:
 * public class Main {
 *     public Main(int i) { // same access as class
 *         super(); // call parent constructor
 *     }
 * }
 */

public class Main {
    Main(int i) {
        super();
    }
    public static void main(String[] args) {
        Main obj = new Main();
    }
}
