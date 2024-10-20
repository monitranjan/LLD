package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeighingMachine;

public class WeighingMachineImpl implements WeighingMachineAdapter{
    WeighingMachine weighingMachine;

    public WeighingMachineImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weighingMachine.getWeightInPound();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
