/*
 * Final Modifier
 * The `final` modifier can be applied to:
 * - Classes
 * - Methods
 * - Variables
 *
 * 1) Final Methods:
 * -----------------
 * - By default, child classes inherit all methods of the parent.
 * - If the child is not satisfied, it can override the method
 *   (i.e., provide its own implementation).
 * - But if a parent method is declared as `final`, then overriding
 *   that method is not allowed.
 *
 * 2) Final Classes:
 * -----------------
 * - If a class is declared as `final`, it cannot be extended
 *   (i.e., no child class can be created).
 * - Hence, inheritance is not possible.
 * - All methods inside a final class are implicitly `final`,
 *   but variables need not be `final`.
 *
 * Pros:
 * - Provides security.
 * - Prevents modification of critical implementation.
 *
 * Cons:
 * - Restricts the use of key OOP concepts: Inheritance & Polymorphism.
 */

public class Main {
    public static void main(String[] args) {

    }
}