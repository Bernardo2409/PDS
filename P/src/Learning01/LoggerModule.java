package Learning01;

public class LoggerModule implements Module {
    @Override
    public void onPayment(Order order, PaymentMethod method) {
        System.out.println("Module Logger received notification from " + order.getId());
    }
}
