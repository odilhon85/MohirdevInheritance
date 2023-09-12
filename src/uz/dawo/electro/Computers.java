package uz.dawo.electro;

public class Computers extends Electronics{

    private String motherboard;
    private String processor;
    private String ram;
    private int storageCapacity;
    private String brand;
    private String model;

    public Computers(String workingVoltage) {
        super(workingVoltage);
    }

    public Computers(String workingVoltage, String motherboard, String processor, String ram, int storageCapacity, String brand, String model) {
        super(workingVoltage);
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.brand = brand;
        this.model = model;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
