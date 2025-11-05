public abstract class Logistica {
    // 1. O Factory Method (Abstrato)
    protected abstract Veiculo criaVeiculo();

    // 2. Método operacional que usa o Factory Method
    public void planearEntrega(String local) {
        Veiculo veiculo = criaVeiculo(); // Usa o Factory Method
        veiculo.entregar(local);
    }
}