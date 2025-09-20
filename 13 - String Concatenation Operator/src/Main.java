/*
 * String Concatenation Operator
 * The only overloaded operator in Java is the '+' operator.
 * It can act in two ways:
 *   1. Arithmetic addition operator (when both operands are numbers)
 *   2. String concatenation operator (when at least one operand is a String)
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Rule:
         * - If both operands are numeric → '+' performs arithmetic addition
         * - If at least one operand is a String → '+' performs String concatenation
         * - Evaluation happens from LEFT to RIGHT (because '+' is left-associative)
         */
        String a = "Hello";
        int b = 10, c = 20, d = 30;

        // First operand is String → entire expression becomes String concatenation
        System.out.print("a + b + c + d = ");
        System.out.println(a + b + c + d); // "Hello102030"

        // First operands are numbers → b+c+d = 60 → then 60 + "Hello" = "60Hello"
        System.out.print("b + c + d + a = ");
        System.out.println(b + c + d + a); // "60Hello"

        // First b+c = 30 → then 30 + "Hello" = "30Hello" → "30Hello" + d = "30Hello30"
        System.out.print("b + c + a + d = ");
        System.out.println(b + c + a + d); // "30Hello30"

        // First b = 10, then 10 + "Hello" = "10Hello" → "10Hello" + c = "10Hello20" → "10Hello20" + d = "10Hello2030"
        System.out.print("b + a + c + d = ");
        System.out.println(b + a + c + d); // "10Hello2030"
    }
}