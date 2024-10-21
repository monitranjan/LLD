package BridgePattern.BreatheProcess;

public class LandBreatheImplemetor implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through nose");
        System.out.println("Inhale oxygen");
        System.out.println("Exhale co2");
    }
}
