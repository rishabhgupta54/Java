public class VehicleType {
    interface Vehicle {
        int getWheels();
    }

    class Car implements Vehicle {
        public int getWheels() {
            return 4;
        }
    }

    class Bus implements Vehicle {
        public int getWheels() {
            return 6;
        }
    }
}
