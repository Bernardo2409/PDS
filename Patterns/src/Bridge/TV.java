package Bridge;

public class TV implements Device {

     private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("TV volume set to " + volume + "%");
    }
}
