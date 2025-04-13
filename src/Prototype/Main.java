package Prototype;

public class Main{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // Expensive creation once
        GameCharacter prototype = new GameCharacter("Hero", "KnightSkin", "Sword");

        // Cloning 5 characters
        for (int i = 1; i <= 5; i++) {
            GameCharacter copy = prototype.clone();
            copy.setName("Hero" + i);
            copy.print();
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time with prototype: " + (end - start) + " ms");
    }
}
