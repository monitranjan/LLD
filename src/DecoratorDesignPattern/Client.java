package DecoratorDesignPattern;

import DecoratorDesignPattern.Pizza.BasePizza;
import DecoratorDesignPattern.Pizza.Margerita;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.Mushroom;

public class Client {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Margerita());
        System.out.println(pizza.cost());

        BasePizza mushroomPizza = new Mushroom(new ExtraCheese(new Margerita()));
        System.out.println(mushroomPizza.cost());
    }
}
