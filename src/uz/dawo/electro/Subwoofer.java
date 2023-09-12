package uz.dawo.electro;

public class Subwoofer extends Sounds{

    private int speakerSize;

    public Subwoofer(String workingVoltage) {
        super(workingVoltage);
    }

    public Subwoofer(String workingVoltage, int volume, int soundQuality, int frequency, String effects) {
        super(workingVoltage, volume, soundQuality, frequency, effects);
    }

    public int getSpeakerSize() {
        return speakerSize;
    }

    public void setSpeakerSize(int speakerSize) {
        this.speakerSize = speakerSize;
    }
}
