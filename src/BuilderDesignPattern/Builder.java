// Builder Interface
package BuilderDesignPattern;
public interface Builder {
    Builder setCPU(String CPU);
    Builder setRAM(String RAM);
    Builder setStorageCapacity(int storageCapacity);
    Builder setGPU(String GPU);

    Computer build();
}