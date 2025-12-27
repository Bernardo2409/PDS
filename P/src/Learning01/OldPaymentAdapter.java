package Learning01;

// ADAPTER: faz o sistema antigo funcionar como um PaymentMethod moderno
public class OldPaymentAdapter implements PaymentMethod {

    private OldPaymentSystem oldSystem;

    public OldPaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void processPayment(Order order) {
        // Chama o método ANTIGO (oldPay) quando alguém usa o método MODERNO
        // (processPayment)
        oldSystem.oldPay(100.0);
    }
}
