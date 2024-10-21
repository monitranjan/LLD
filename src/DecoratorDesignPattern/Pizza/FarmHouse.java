package DecoratorDesignPattern.Pizza;

public class FarmHouse extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
