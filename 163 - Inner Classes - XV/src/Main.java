/*
 * Inner Classes
 * Interface Inside an Interface
 * We can declare an interface inside another interface.
 *
 * Key Points:
 * 1. An interface can contain another interface (called a *nested interface*).
 * 2. By default, the nested interface is **public and static**, even if we don't explicitly mention it.
 * 3. The nested interface is mainly used when the inner interface is strongly associated
 *    with the outer interface conceptually.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        // Implementing inner interface
        Vehicle.Engine engine = new CarEngine();
        engine.run();
    }
}

