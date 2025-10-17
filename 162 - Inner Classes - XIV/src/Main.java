/*
 * Inner Classes
 * Interface Inside a Class

 * Sometimes, when multiple implementations of an interface are conceptually related
 * to a single outer class, we can define that interface **inside** the class.
 *
 * This helps in logically grouping the interface and its implementations together.
 * It also avoids polluting the global namespace with unnecessary interface names.
 */

public class Main {
    public static void main(String[] args) {
        VehicleType vehicleType = new VehicleType();

        VehicleType.Car car = vehicleType.new Car();
        VehicleType.Bus bus = vehicleType.new Bus();

        System.out.println("Car wheels: " + car.getWheels());
        System.out.println("Bus wheels: " + bus.getWheels());
    }
}