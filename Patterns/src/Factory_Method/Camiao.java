package Factory_Method;

public class Camiao implements Veiculo{

    @Override
    public void entregar(String local) {
        System.out.println("Entrega feita por caminhão para " + local + ".");
    }
    
}
