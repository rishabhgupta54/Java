/*
 * Enum
 *
 * Use enum to represent a group of named constants.
 * Enums allow us to define our own enumerated data type.
 *
 * Key Points:
 * - Every enum is internally implemented as a class.
 * - Enum constants are public, static, and final by default.
 * - Each enum constant is an instance of the enum type.
 * - The toString() method is overridden internally to return the constant's name.
 * - Enums can be declared:
 *      - Outside a class → allowed modifiers: public, default, strictfp
 *      - Inside a class  → allowed modifiers: public, default, private, protected, static, strictfp
 * - Enums cannot be declared inside a method (will give compile-time error).
 */

public class Main {
    public static void main(String[] args) {
        // Accessing enum constant using enum type
        System.out.println(Days.SUNDAY);
        System.out.println(Days.MONDAY);

        // Using enum in switch-case
        Days today = Days.FRIDAY;
        switch (today) {
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("Weekday work!");
        }
    }
}
