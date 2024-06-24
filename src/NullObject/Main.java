package NullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("seating capacity: "+vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity:" +vehicle.getTankCapacity());
    }
}
