/*
 * Switch Control Statement (Java 12+)

 * Before Java 12:
 * ----------------
 *  - switch was only a STATEMENT (executed actions, didn’t return values).
 *  - required break to avoid fall-through.
 *  - verbose and error-prone.
 *
 * After Java 12+ (modern switch expression):
 * ------------------------------------------
 *  - switch can now be used as an EXPRESSION (returns a value).
 *  - no fall-through with new arrow (->) syntax.
 *  - supports multiple labels in one case.
 *  - allows block syntax with 'yield' to return complex values.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Traditional Switch (Before Java 12)
         * - Works only as a statement (cannot return a value).
         * - Requires explicit 'break' to prevent fall-through.
         * - Tedious when assigning results.
         */
        int day = 3;
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Invalid Day";
        }
        System.out.println("Traditional switch: " + dayName);

        /*
         * Modern Switch Expression (Java 12+)
         * - Uses '->' syntax instead of ':'.
         * - No fall-through (break not required).
         * - Directly returns a value (expression form).
         * - Allows grouping cases with commas.
         */
        int day2 = 6;
        String dayName2 = switch (day2) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend"; // multiple labels
            default -> "Invalid Day";
        };
        System.out.println("Modern switch expression: " + dayName2);

        /*
         * Using 'yield' (Java 13+)
         * - If a case needs multiple statements, we use a block { }.
         * - Inside that block, we use 'yield' to return a value.
         * - 'yield' replaces the earlier need for local variables or break.
         */
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> "A"; // direct expression
            case 8 -> {
                System.out.println("Score is good, between 80–89");
                yield "B";
            }
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                System.out.println("Needs improvement.");
                yield "F";
            }
        };
        System.out.println("Grade based on score: " + grade);
    }
}
