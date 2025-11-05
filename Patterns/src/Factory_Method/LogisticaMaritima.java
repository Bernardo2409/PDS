package Factory_Method;

public class LogisticaMaritima extends Logistica {
    
    @Override
    protected Veiculo criaVeiculo() {
        // Responsabilidade de criar o produto CONCRETO específico (Navio)
        return new Navio();
    }
}