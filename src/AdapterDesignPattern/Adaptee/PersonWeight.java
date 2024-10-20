package AdapterDesignPattern.Adaptee;

public class PersonWeight implements WeighingMachine{
    @Override
    public double getWeightInPound() {
        return 25;
    }
}
