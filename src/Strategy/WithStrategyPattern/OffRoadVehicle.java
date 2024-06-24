package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.NormalDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new NormalDrive());
    }
}
