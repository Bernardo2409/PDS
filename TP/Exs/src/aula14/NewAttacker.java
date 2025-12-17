public class NewAttacker implements Robot{
    private int ID;
    private OldAttacker oldAttacker;

    public NewAttacker(OldAttacker oldAttacker, int iD) {
        ID = iD;
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

    @Override
    public void accept(Visitor v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }
}
