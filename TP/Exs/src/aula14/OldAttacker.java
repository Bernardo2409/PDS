public class OldAttacker {

    String nome;

    public OldAttacker(String nome) {
        this.nome = nome;
    }

    public void kickOld() {
        System.out.println("OldRobot " + nome + " is kicking");
    }

    public void moveOld() {
        System.out.println("OldRobot " + nome + " is moving");
    }
}
