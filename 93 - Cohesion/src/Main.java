/*
 * Cohesion
 * - Cohesion refers to how strongly the responsibilities of a single component (class/module) are related.
 * - If every component has a clear, well-defined functionality, then that component is said to have **High Cohesion**.
 *
 * High Cohesion:
 * - Each class/module does only ONE well-defined job.
 * - Advantages:
 *    * Easy to enhance (we can modify one class without affecting others).
 *    * Promotes reusability.
 *    * Improves maintainability.
 *
 * Low Cohesion:
 * - A single class/module tries to handle multiple unrelated functionalities.
 * - Leads to confusion, harder maintenance, and low reusability.
 *
 * Example below:
 * - Calculator → High cohesion (only mathematical operations).
 * - Printer → High cohesion (only printing task).
 * - Utility → Low cohesion (mixed tasks: math + printing).
 */

public class Main {
    public static void main(String[] args) {
        // High Cohesion usage
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 20));
        System.out.println("Subtraction: " + calc.subtract(30, 15));

        Printer printer = new Printer();
        printer.print("Hello, World!");

        // Low Cohesion usage
        Utility util = new Utility();
        System.out.println("Multiply: " + util.multiply(5, 4));
        util.print("Low cohesion mixes math + printing");
    }
}

