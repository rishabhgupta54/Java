public class Car {
    private Engine engine; // Has-A relationship

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        System.out.println("Car is starting...");
        engine.run(); // delegation
    }
}
