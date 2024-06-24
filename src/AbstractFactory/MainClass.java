package AbstractFactory;

public class MainClass {
    public static void main(String[] args) {
        VehicleFactory luxuryVehicle = new LuxuryVehicleFactory();
        Vehicle vehicle = luxuryVehicle.getVehicle("bmw");
        vehicle.average();

        VehicleFactory ordinaryVehicle = new OrdinaryVehicleFactory();
        Vehicle vehicle1 = ordinaryVehicle.getVehicle("seltos");
        vehicle1.average();
    }
}
