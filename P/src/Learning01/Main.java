package Learning01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Creating orders");
        Order order1 = OrderFactory.createOrder("simple", "order1", "Ana");
        Order order2 = OrderFactory.createOrder("express", "order2", "Joao");
        Order order3 = OrderFactory.createOrder("international", "order3", "Maria");

        System.out.println("Part B: Paying orders");
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod mbway = new MBWayPayment();
        PaymentMethod paypal = new PayPalPayment();

        order1.pay(creditCard);
        order2.pay(mbway);
        order3.pay(paypal);

        OrderRegistry.getInstance().writeToFile();

        System.out.println("Part C: Notifications");
        Module logger = new LoggerModule();
        Module shipping = new ShippingModule();

        NotificationCenter center = NotificationCenter.getInstance();
        center.register(logger);
        center.register(shipping);

        order1.pay(creditCard);
        order2.pay(mbway);

        OrderRegistry.getInstance().writeToFile();
        OrderRegistry.getInstance().printFileContent();
    }
}
