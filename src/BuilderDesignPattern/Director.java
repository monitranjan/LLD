package BuilderDesignPattern;

// Director class
public class Director {
    public Computer constructGamingPC(Builder builder) {
        return builder.setCPU("Intel i9")
                .setRAM("32GB RAM")
                .setStorageCapacity(512)
                .setGPU("NVIDIA RTX 3080")
                .build();
    }

    // You can have other construction methods for different types of computers...
}