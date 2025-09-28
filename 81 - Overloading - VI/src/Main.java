/*
 * Overloading
 * In Overloading:
 * - Method resolution is always based on reference type, not on runtime object type.
 * - Hence, it is called Compile-Time Polymorphism or Early Binding.
 *
 * 1) Animal animal = new Animal();
 *    main.m1(animal);
 *    → Reference type = Animal → matches m1(Animal).
 *      Output: Animal Version
 *
 * 2) Monkey monkey = new Monkey();
 *    main.m1(monkey);
 *    → Reference type = Monkey → matches m1(Monkey).
 *      Output: Monkey Version
 *
 * 3) Animal animalMonkey = new Monkey();
 *    main.m1(animalMonkey);
 *    → Reference type = Animal (even though object is Monkey).
 *    → Compiler resolves based on reference type only.
 *      Output: Animal Version
 *
 * Conclusion:
 * - Overloading depends on reference type (declared type).
 * - Overriding (in contrast) depends on runtime object type.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Animal animal = new Animal();
        main.m1(animal); // Animal Version

        Monkey monkey = new Monkey();
        main.m1(monkey); // Monkey Version

        Animal animalMonkey = new Monkey();
        main.m1(animalMonkey); // Animal Version
    }

    public void m1(Monkey monkey) {
        System.out.println("Monkey Version");
    }

    public void m1(Animal animal) {
        System.out.println("Animal Version");
    }
}