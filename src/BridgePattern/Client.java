package BridgePattern;

import BridgePattern.BreatheProcess.LandBreatheImplemetor;
import BridgePattern.BreatheProcess.TreeBreathe;
import BridgePattern.BreatheProcess.WaterBreathe;
import BridgePattern.Livingthings.Dog;
import BridgePattern.Livingthings.Fish;
import BridgePattern.Livingthings.LivingThings;
import BridgePattern.Livingthings.Tree;

public class Client {
    public static void main(String[] args) {
        LivingThings landLivingOrganism = new Dog(new LandBreatheImplemetor());
        landLivingOrganism.breatheProcess();

        LivingThings waterLivingOrganism = new Fish(new WaterBreathe());
        waterLivingOrganism.breatheProcess();

        LivingThings tree = new Tree(new TreeBreathe());
        tree.breatheProcess();
    }
}
