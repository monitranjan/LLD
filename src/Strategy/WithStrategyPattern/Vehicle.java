package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // Constructor Injection
    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategy = driveStrategyObj;
    }

    public void drive(){
        driveStrategy.drive();
    }

    public static void main(String[] args) {

        Strategy.WithStrategyPattern.PassengerVehicle passengerVehicle = new Strategy.WithStrategyPattern.PassengerVehicle();
        passengerVehicle.drive();

        Strategy.WithStrategyPattern.SportsVehicle sportsVehicle = new Strategy.WithStrategyPattern.SportsVehicle();
        sportsVehicle.drive();

    }
}
