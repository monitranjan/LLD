package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SpecialDrive());
    }
}
