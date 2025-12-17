public class RobotGoalie implements Robot{

    private RobotType type;
    private int ID;
    private String nome;
    
    public RobotGoalie( int ID, String nome) {
        this.type = RobotType.GOALIE;
        ID = this.ID;
        this.nome = nome;
    }

    @Override
    public void kick() {
        System.out.println("Goalie "+ nome + " is kicking");
    }

    @Override
    public void move() {
        System.out.println("Goalie move " + nome + " is moving");
    }

    @Override
    public void accept(Visitor v) {
        v.visitGoalie(this);
    }
    
}
