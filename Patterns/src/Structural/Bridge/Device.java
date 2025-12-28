package Bridge;

public interface Device {
    void turnOn();
    void turnOff();
    boolean isEnabled();
    void setVolume(int percent);
}