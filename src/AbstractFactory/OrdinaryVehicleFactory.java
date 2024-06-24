package AbstractFactory;

public  class OrdinaryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType){
            case "swift" -> new Swift();
            case "seltos" -> new Seltos();
            default -> null;
        };
    }
}
