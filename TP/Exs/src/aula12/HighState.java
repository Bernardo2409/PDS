public class HighState implements State {

    @Override
    public String toString() {
        return "High";
    }

    @Override
    public void pull(CeilingFan fan) {
        fan.setState(new OffState());
    }
    
}
