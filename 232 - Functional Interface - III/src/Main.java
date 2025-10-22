/*
 * Functional Interface
 *
 * - Since a functional interface has only one abstract method,
 *   the compiler can automatically infer which method the lambda expression implements.
 *
 * - Hence, we don’t need to specify the method name explicitly when using lambda expressions.
 *
 * - Traditional way:
 *     → Create a class that implements the interface and override its method.
 *
 * - Modern (Lambda) way:
 *     → Use a lambda expression to provide the method implementation directly.
 */

public class Main {
    public static void main(String[] args) {
        // Traditional way using a class
        A a = new A();
        a.m1();

        // Lambda expression automatically implements m1()
        AI ai = () -> System.out.println("Hello From Lambda Function");
        ai.m1();
    }
}

