package BuilderDesignPattern;

// Concrete builder class
public class ComputerBuilder implements Builder {
    private String CPU;
    private String RAM;
    private int storageCapacity;
    private String GPU;

    @Override
    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public Builder setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    @Override
    public Builder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM, storageCapacity, GPU);
    }
}