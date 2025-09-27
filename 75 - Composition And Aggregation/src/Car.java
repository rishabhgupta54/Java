public class Car {
    private Engine engine = new Engine(); // Composition (engine tied to car)

    void start() {
        System.out.println("Car is starting...");
        engine.run();
    }
}
