package uz.dawo.electro;

public class Laptop extends Computers{

    private int battaryCell;

    public Laptop(String workingVoltage) {
        super(workingVoltage);
    }

    public Laptop(String workingVoltage, String motherboard, String processor, String ram, int storageCapacity, String brand, String model) {
        super(workingVoltage, motherboard, processor, ram, storageCapacity, brand, model);
    }

    public int getBattaryCell() {
        return battaryCell;
    }

    public void setBattaryCell(int battaryCell) {
        this.battaryCell = battaryCell;
    }
}
