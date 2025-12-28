package Strategy;

/**
 * Strategy Pattern Example - Payment Methods
 * 
 * The Strategy pattern lets you define a family of algorithms,
 * put each of them into a separate class, and make their objects
 * interchangeable.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern Demo - Payment Methods");
        System.out.println("=".repeat(50));

        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem("Laptop", 1200);
        cart.addItem("Mouse", 25);
        cart.addItem("Keyboard", 75);

        // Pay with Credit Card
        System.out.println("\n--- Checkout with Credit Card ---");
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe"));
        cart.checkout();

        // Add more items
        System.out.println("\n--- New order ---");
        cart.addItem("Monitor", 300);
        cart.addItem("Webcam", 80);

        // Pay with PayPal
        System.out.println("\n--- Checkout with PayPal ---");
        cart.setPaymentStrategy(new PayPalPayment("john@example.com"));
        cart.checkout();

        // Another order with Bitcoin
        System.out.println("\n--- New order with Bitcoin ---");
        cart.addItem("Gaming Chair", 450);
        cart.setPaymentStrategy(new BitcoinPayment("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"));
        cart.checkout();
    }
}
