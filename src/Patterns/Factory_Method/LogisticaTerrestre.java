public class LogisticaTerrestre extends Logistica{

    @Override
    protected Veiculo criaVeiculo() {
        // Responsabilidade de criar o produto CONCRETO específico (Caminhao)
        return new Camiao();
    }

}
