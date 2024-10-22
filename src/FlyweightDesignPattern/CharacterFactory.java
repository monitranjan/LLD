package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> flyweight = new HashMap<>();

    public Character getCharacter(char character,String font, int fontSize, String color ){
        String key = character +font +fontSize + color;
        if(!flyweight.containsKey(key)){
            flyweight.put(key, new ConcreteCharacter(character, font, fontSize, color));
        }
        return flyweight.get(key);
    }
}
