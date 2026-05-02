
import java.util.Scanner;

interface Vehicle {

    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Starts...");
    }

    @Override
    public void stop() {
        System.out.println("Car Stops...");
    }
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck Starts...");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stops...");
    }
}

class VehicleFactory {

    public static Vehicle creatVehicle(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Vehicle Cannot be null");
        }

        return switch (type.toLowerCase()) {
            case "car" ->
                new Car();
            case "truck" ->
                new Truck();
            default ->
                throw new IllegalArgumentException("Unknown type:" + type);
        };
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Vehicle type (car/truck): ");
        String vehType = scanner.nextLine().trim();
        Vehicle veh = VehicleFactory.creatVehicle(vehType);
        veh.start();
        veh.stop();
    }
}
