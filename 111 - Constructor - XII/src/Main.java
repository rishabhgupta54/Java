/*
 * Constructor
 * - If the parent class contains ANY argument constructors, then while writing
 *   child classes we must take special care with respect to constructors.
 *
 * Why?
 * - Because by default, the compiler always inserts a super() call
 *   (i.e., parent no-arg constructor) as the first statement in child constructor.
 *
 * - If the parent does NOT have a no-arg constructor, we will get a Compile-Time Error.
 *
 * Solution:
 * - Whenever we are writing argument constructors in the parent,
 *   it is highly recommended to also write a no-arg constructor explicitly.
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
