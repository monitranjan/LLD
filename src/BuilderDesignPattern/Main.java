package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder computerBuilder = new ComputerBuilder();

        Computer gamingPC = director.constructGamingPC(computerBuilder);
        System.out.println(gamingPC);
    }
}