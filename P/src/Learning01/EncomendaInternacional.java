package Learning01;

public class EncomendaInternacional extends Order {
    public EncomendaInternacional(String id, String nomeCliente) {
        super(id, nomeCliente);
        System.out.println("InternationalOrder " + id + " created for client " + nomeCliente);
    }

    @Override
    protected void doPay(PaymentMethod method) {
        method.processPayment(this);
    }
}
