package uz.dawo.electro;

public class Loudspeaker extends Sounds{

    private String model;

    public Loudspeaker(String workingVoltage) {
        super(workingVoltage);
    }

    public Loudspeaker(String workingVoltage, int volume, int soundQuality, int frequency, String effects) {
        super(workingVoltage, volume, soundQuality, frequency, effects);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
