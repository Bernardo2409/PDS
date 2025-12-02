public class OffState implements State {

    @Override
    public String toString() {
        return "Off";
    }

    @Override
    public void pull(CeilingFan fan) {
        fan.setState(new LowState());
    }
    
    
}
