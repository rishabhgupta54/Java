/*
 * Constructor
 * 1. Compiler generates this automatically if no constructor is written explicitly.
 * 2. It is always a no-argument constructor.
 * 3. Its access modifier matches the class's access modifier:
 *    - public class → public constructor
 *    - default class → default constructor
 * 4. Its body contains only one statement:
 *      super();
 *    → This calls the superclass's no-arg constructor.
 *
 * Compiler generates internally:
 * class Main {
 *     Main() { // same access as class
 *         super(); // call parent constructor
 *     }
 * }
 */

class Main {
    public static void main(String[] args) {
        Main obj = new Main();
    }
}