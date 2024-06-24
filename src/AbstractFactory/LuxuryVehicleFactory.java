package AbstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType){
            case "bmw" -> new BMW();
            case "mercedes" -> new Mercedes();
            default -> null;
        };
    }
}
