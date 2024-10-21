package BridgePattern.BreatheProcess;

public class WaterBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through gills");
        System.out.println("Absorb oxygen");
        System.out.println("Release co2");
    }
}
