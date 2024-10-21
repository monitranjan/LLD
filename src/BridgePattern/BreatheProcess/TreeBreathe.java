package BridgePattern.BreatheProcess;

public class TreeBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Leaves");
        System.out.println("Absorb  Co2");
        System.out.println("Release Oxygen");
    }
}
