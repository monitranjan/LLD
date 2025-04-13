package BuilderDesignPattern;

// Product class
public class Computer {
    private String CPU;
    private String RAM;
    private int storageCapacity;
    private String GPU;

    public Computer(String CPU, String RAM, int storageCapacity, String GPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storageCapacity = storageCapacity;
        this.GPU = GPU;
    }

    // Getters...

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}