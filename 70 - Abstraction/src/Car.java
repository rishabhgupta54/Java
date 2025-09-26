public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    void stop() {
        System.out.println("Car stopped safely.");
    }
}
