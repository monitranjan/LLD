package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
