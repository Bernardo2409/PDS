package Strategy;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin wallet (" +
                walletAddress.substring(0, 10) + "...)");
        return true;
    }
}
