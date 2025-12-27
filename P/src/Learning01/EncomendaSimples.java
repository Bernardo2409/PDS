package Learning01;

public class EncomendaSimples extends Order {

    public EncomendaSimples(String id, String nomeCliente) {
        super(id, nomeCliente);
        System.out.println("SimpleOrder " + id + " created for client " + nomeCliente);
    }

    @Override
    protected void doPay(PaymentMethod method) {
        // Processamento específico de encomenda simples (silencioso)
        method.processPayment(this);
    }
}
