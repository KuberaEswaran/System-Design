
interface VehicleCompany {

    void manufacture();
}

class TeslaCars implements VehicleCompany {

    @Override
    public void manufacture() {
        System.out.println("Tesla car manufacture");
    }
}

class TataCars implements VehicleCompany {

    @Override
    public void manufacture() {
        System.out.println("Tata car manufacture");
    }
}

abstract class CarManufactureFactory {

    abstract protected VehicleCompany creatVehicleCompany();

    public void manufactureVehicle() {
        VehicleCompany vehicleCompany = creatVehicleCompany();
        vehicleCompany.manufacture();
    }

}

class TataCompanyFactory extends CarManufactureFactory {

    @Override
    protected VehicleCompany creatVehicleCompany() {
        return new TataCars();
    }
}

class TeslaCompanyFactory extends CarManufactureFactory {

    @Override
    protected VehicleCompany creatVehicleCompany() {
        return new TeslaCars();
    }
}

class Main {

    public static void main(String[] args) {
        CarManufactureFactory carManufactureFactory = new TataCompanyFactory();
        carManufactureFactory.manufactureVehicle();

    }
}
