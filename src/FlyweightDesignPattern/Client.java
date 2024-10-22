package FlyweightDesignPattern;

public class Client {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character charH = factory.getCharacter('H', "Arial" , 12 ,"Black");
        Character charE = factory.getCharacter('E', "Arial" , 12 ,"Black");
        Character charL = factory.getCharacter('L', "Arial" , 12 ,"Black");
        Character char0 = factory.getCharacter('O', "Arial" , 12 ,"Black");

        charH.display(10,20);
        charE.display(20,20);
        charL.display(30,20);
        charL.display(40,20);
        char0.display(50,20);
    }
}
