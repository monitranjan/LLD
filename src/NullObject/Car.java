package NullObject;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 45;
    }

    @Override
    public int getSeatingCapacity() {
        return 10;
    }
}
