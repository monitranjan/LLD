package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.PersonWeight;
import AdapterDesignPattern.Adapter.WeighingMachineImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineImpl weighingMachineAdapter = new WeighingMachineImpl(new PersonWeight());
        System.out.println(weighingMachineAdapter.getWeightInKg());
    }
}
