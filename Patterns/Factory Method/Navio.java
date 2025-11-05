public class Navio implements Veiculo {
    
    @Override
    public void entregar(String local) {
        System.out.println("Entrega feita por navio para " + local + ".");
    }
}