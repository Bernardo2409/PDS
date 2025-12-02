public class MediumState implements State{

    @Override
    public void pull(CeilingFan fan) {
         fan.setState(new HighState());
    }

    @Override
    public String toString() {
        return "Medium";
    }
    
}
