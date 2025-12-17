public class AttackerAdapter implements Robot {

    private OldAttacker oldAttacker;

    public AttackerAdapter(OldAttacker oldAttacker) {

        this.oldAttacker = oldAttacker;

    }

    @Override
    public void kick() {
        oldAttacker.kickOld();
    }

    @Override
    public void move() {
        oldAttacker.moveOld();

    }
    
}
