package uz.dawo.electro;

public class PC extends Computers{

    private String monitor;

    public PC(String workingVoltage) {
        super(workingVoltage);
    }

    public PC(String workingVoltage, String motherboard, String processor, String ram, int storageCapacity, String brand, String model) {
        super(workingVoltage, motherboard, processor, ram, storageCapacity, brand, model);
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
