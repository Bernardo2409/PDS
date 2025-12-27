package Learning01;

import java.util.ArrayList;
import java.util.List;

// Singleton + Subject (Observable) - centro de notificações
public class NotificationCenter {

    private static NotificationCenter instance;
    private List<Module> modules;

    private NotificationCenter() {
        modules = new ArrayList<>();
    }

    // Singleton: apenas uma instância
    public static NotificationCenter getInstance() {
        if (instance == null) {
            instance = new NotificationCenter();
        }
        return instance;
    }

    // Registar um observer (módulo) - silencioso
    public void register(Module module) {
        modules.add(module);
    }

    // Remover um observer
    public void unregister(Module module) {
        modules.remove(module);
    }

    // Notificar todos os observers sobre um pagamento
    public void notifyPayment(Order order, PaymentMethod method) {
        for (Module module : modules) {
            module.onPayment(order, method);
        }
    }
}
