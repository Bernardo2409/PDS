public class RobotAttacker implements Robot {

    private RobotType type;
    private int ID;
    private String nome;
    
     public RobotAttacker(int ID, String nome) {
        this.type = RobotType.ATTACKER;
        ID = this.ID;
        this.nome = nome;
    }
    @Override
    public void kick() {
        System.out.println("Attacker " + nome + " is kicking");
    }

    @Override
    public void move() {
        System.out.println("Attacker move " + nome + " is moving");
    }
    
    @Override
    public void accept(Visitor v) {
        v.visitAttacker(this);
    }
}
