package Learning01;

public class ShippingModule implements Module {
    @Override
    public void onPayment(Order order, PaymentMethod method) {
        System.out.println("Module Shipping received notification from " + order.getId());
    }
}
