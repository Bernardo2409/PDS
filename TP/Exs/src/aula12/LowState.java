public class LowState implements State {

    @Override
    public void pull(CeilingFan fan) {
        fan.setState(new MediumState());
    }

    @Override
    public String toString() {
        return "Low";
    }
    
}
