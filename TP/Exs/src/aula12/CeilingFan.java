public class CeilingFan {
     // Bernardo Coelho 125059
    // João Pereira 125683
    // João Tomásio 120132
    private State state;

    public CeilingFan() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pull() {
        state.pull(this);
    }

    public State getState() {
        return state;

    }
}
