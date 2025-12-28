package Strategy;

/**
 * Context - shopping cart that uses different payment strategies.
 */
public class ShoppingCart {
    private int total = 0;
    private PaymentStrategy paymentStrategy;

    public void addItem(String item, int price) {
        total += price;
        System.out.println("Added '" + item + "' for " + price);
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method!");
            return;
        }
        System.out.println("Total: " + total);
        paymentStrategy.pay(total);
        total = 0;
    }
}
