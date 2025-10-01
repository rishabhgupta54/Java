/*
 * Constructor
 * Compiler generates internally:
 * public class Main {
 *     public Main() { // same access as class
 *         super(); // call parent constructor
 *     }
 * }
 */

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
    }
}
