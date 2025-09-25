/*
 * Interfaces
 * If two interfaces contain a method with the same signature but different return types,
 * then it is impossible to implement both interfaces simultaneously.
 * This is because the compiler cannot decide which return type to use in the implementation.
 */
public class Main implements A, B {
    public static void main(String[] args) {
        // This class cannot be compiled because of conflicting return types.
    }
}