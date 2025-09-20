/*
 * Identifiers in Java:
 * An identifier is the name given to a class, method, variable, or label so that they can be uniquely identified within the program.
 *
 * Rules for Identifiers:
 * - Cannot be a keyword (e.g., class, int, static are invalid).
 * - Cannot start with a digit (e.g., 1value is invalid).
 * - Can only contain letters (A–Z, a–z), digits (0–9), underscores (_) and dollar signs ($).
 * - They are case-sensitive (e.g., Main and main are treated as different identifiers).
 * - No spaces or special characters (such as #, @, %) are allowed.
 *
 * Naming Conventions (recommended for readability):
 * - Class names → Start with uppercase (e.g., Main, StudentData).
 * - Method names → Start with lowercase and use camelCase (e.g., main, calculateSum).
 * - Variable names → Start with lowercase and use camelCase (e.g., outputContent, studentAge).
 * - Constants → Written in uppercase with underscores (e.g., MAX_VALUE).
 *
 * In the program below, we have the following identifiers:
 * - Main → the name of the class
 * - main → the name of the method
 * - args → the name of the parameter variable
 * - outputContent → the name of the local variable
 */
public class Main {
    public static void main(String[] args) {
        String outputContent = "Hello World";
        System.out.println(outputContent);

        // Valid identifiers
        int age = 25;
        String studentName = "Rishabh";
        double _salary = 50000.50;
        int $marks = 90;
        int number1 = 100;

        // Invalid identifiers (uncommenting will give compile-time errors)
        // int 1number = 10; // Cannot start with a digit
        // int class = 5; // Cannot use a keyword
        // int student-name = 20; // Cannot use special characters like '-'
        // int total value = 30;// Cannot have spaces
    }
}
