package Learning01;

// Interface Observer - módulos que recebem notificações
public interface Module {
    void onPayment(Order order, PaymentMethod method);
}
