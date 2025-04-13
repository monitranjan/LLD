package Prototype;

public class GameCharacter implements Cloneable {
    private String name;
    private String skin;
    private String weapon;

    public GameCharacter(String name, String skin, String weapon) {
        loadSkin(skin);
        this.name = name;
        this.weapon = weapon;
    }

    private void loadSkin(String skin) {
        try {
            Thread.sleep(1000); // Simulate expensive operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.skin = skin;
    }

    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + name + ", Skin: " + skin + ", Weapon: " + weapon);
    }
}
