/*
 * Encapsulation
 * - The process of binding data (variables) and corresponding methods
 *   (operations on data) into a single unit is called Encapsulation.
 *
 * - If any component follows **Data Hiding** and **Abstraction**,
 *   such components are said to be Encapsulated.
 *
 * Encapsulation = Data Hiding + Abstraction
 *
 * Advantages:
 * - Achieves security (outside classes cannot directly access data).
 * - Enhancements/changes become easy.
 * - Improves maintainability of the application.
 *
 * Disadvantages:
 * - Increases the length of code (getters/setters).
 * - May slow down execution slightly due to indirection.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Rishabh", 99.99);
        System.out.println("Account Holder Name: " + account.getName());
        System.out.println("Account Holder Amount: " + account.getAmount());
    }
}
