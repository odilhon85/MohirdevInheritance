package uz.dawo.electro;

public class Sounds extends Electronics{

    private int volume;
    private int soundQuality;
    private int frequency;
    private String effects;

    public Sounds(String workingVoltage) {
        super(workingVoltage);
    }

    public Sounds(String workingVoltage, int volume, int soundQuality, int frequency, String effects) {
        super(workingVoltage);
        this.volume = volume;
        this.soundQuality = soundQuality;
        this.frequency = frequency;
        this.effects = effects;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSoundQuality() {
        return soundQuality;
    }

    public void setSoundQuality(int soundQuality) {
        this.soundQuality = soundQuality;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }
}
