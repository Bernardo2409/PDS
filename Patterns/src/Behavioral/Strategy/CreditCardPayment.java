package Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card (****" +
                cardNumber.substring(cardNumber.length() - 4) + ")");
        return true;
    }
}
