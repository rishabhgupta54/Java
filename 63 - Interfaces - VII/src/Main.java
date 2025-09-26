/*
 * Interfaces
 * Two interfaces can contain a variable with the same name, and there may be a chance of variable naming conflict.
 * In such cases, we can solve the problem by using the interface name explicitly.
 */
public class Main implements A, B{
    public static void main(String[] args) {
        // System.out.println(INT1); // CE: reference to INT1 is ambiguous both variable INT1 in A and variable INT1 in B match
        System.out.println("A.INT1: " + A.INT1);
        System.out.println("B.INT1: " + B.INT1);
    }
}
