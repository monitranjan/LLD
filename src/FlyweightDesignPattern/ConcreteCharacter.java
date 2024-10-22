package FlyweightDesignPattern;

import javax.swing.text.Position;

public class ConcreteCharacter implements Character {
    private char character;
    private String font;
    private int fontSize;
    private String color;

    public ConcreteCharacter(char character, String font, int fontSize, String color) {
        this.character = character;
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void display(int positionX, int positionY) {
        System.out.println("Displaying Character :" +character + " at position "+ positionX +","+
                positionY + " with font: "+ font + " fontSize "+ fontSize +",color:" + color);
    }
}
