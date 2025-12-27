package Learning01;

import java.util.*;

public class NotificationCenter {
    private static NotificationCenter instance;
    private List<Module> modules = new ArrayList<>();

    private NotificationCenter() {
    }

    public static NotificationCenter getInstance() {
        if (instance == null)
            instance = new NotificationCenter();
        return instance;
    }

    public void register(Module module) {
        modules.add(module);
    }

    public void unregister(Module module) {
        modules.remove(module);
    }

    public void notifyPayment(Order order, PaymentMethod method) {
        for (Module module : modules)
            module.onPayment(order, method);
    }
}
