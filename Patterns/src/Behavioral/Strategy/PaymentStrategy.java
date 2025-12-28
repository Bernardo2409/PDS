package Strategy;

/**
 * Strategy interface declares the algorithm method.
 */
public interface PaymentStrategy {
    boolean pay(int amount);
}
