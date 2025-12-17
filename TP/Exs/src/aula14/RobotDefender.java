public class RobotDefender implements Robot {

    private RobotType type;
    private int ID;
    private String nome;

    public RobotDefender(int ID, String nome) {
        this.type = RobotType.DEFENDER;
        this.ID = ID;
        this.nome = nome;
    }

    @Override
    public void kick() {
        System.out.println("Defender "+ nome + " is kicking");
    }

    @Override
    public void move() {
        System.out.println("Defender "+ nome + " is moving");
    }

    @Override
    public void accept(Visitor v) {
        v.visitDefender(this);
    }
    
}
