
interface Cars {

    void manufacture();
}

interface Bike {

    void manufacture();
}

class TeslaCars implements Cars {

    @Override
    public void manufacture() {
        System.out.println("Tesla car manufacture");
    }
}

class TeslaBike implements Bike {

    @Override
    public void manufacture() {
        System.out.println("Tesla Bike  manufacture");
    }
}

class TataCars implements Cars {

    @Override
    public void manufacture() {
        System.out.println("Tata car manufacture");
    }
}

class TataBike implements Bike {

    @Override
    public void manufacture() {
        System.out.println("Tata Bike manufacture");
    }
}

interface VehicleFactory {

    Cars createCars();

    Bike createBike();

}

class TataCompanyFactory
        implements VehicleFactory {

    public Cars createCars() {
        return new TataCars();
    }

    public Bike createBike() {
        return new TataBike();
    }
}

class TeslaCompanyFactory
        implements VehicleFactory {

    public Cars createCars() {
        return new TeslaCars();
    }

    public Bike createBike() {
        return new TeslaBike();
    }
}

class Main {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new TataCompanyFactory();
        Cars car = vehicleFactory.createCars();
        Bike bike = vehicleFactory.createBike();
        bike.manufacture();
        car.manufacture();
    }
}
