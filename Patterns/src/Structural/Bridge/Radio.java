package Bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is now OFF");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Radio volume set to " + volume + "%");
    }
}
