package Strategy.WithoutStrategyPattern;

public class Vehicle {
    public void drive(){
        System.out.println("Normal drive capability");
    }

    public static void main(String[] args) {
        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

    }
}
