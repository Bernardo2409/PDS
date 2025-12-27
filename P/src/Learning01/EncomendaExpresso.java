package Learning01;

public class EncomendaExpresso extends Order {

    public EncomendaExpresso(String id, String nomeCliente) {
        super(id, nomeCliente);
        System.out.println("ExpressOrder " + id + " created for client " + nomeCliente);
    }

    @Override
    protected void doPay(PaymentMethod method) {
        // Processamento específico de encomenda expresso (silencioso)
        method.processPayment(this);
    }
}
