package Learning01;

public class OldPaymentAdapter implements PaymentMethod {
    private OldPaymentSystem oldSystem;

    public OldPaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void processPayment(Order order) {
        oldSystem.oldPay(100.0);
    }
}
