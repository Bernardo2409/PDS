package Learning02;

import java.util.ArrayList;
import java.util.List;

// Subject (Singleton) - Centro de notificações do restaurante
public class RestaurantCenter {
    private static RestaurantCenter instance;
    private List<RestaurantModule> observers;

    private RestaurantCenter() {
        observers = new ArrayList<>();
    }

    public static RestaurantCenter getInstance() {
        if (instance == null) {
            instance = new RestaurantCenter();
        }
        return instance;
    }

    // Registar um observer
    public void register(RestaurantModule observer) {
        observers.add(observer);
    }

    // Remover um observer
    public void unregister(RestaurantModule observer) {
        observers.remove(observer);
    }

    // Notificar todos os observers EXCEPTO o sender
    public void notifyObservers(RestaurantModule sender, String message) {
        for (RestaurantModule observer : observers) {
            if (observer != sender) {
                observer.update(message);
            }
        }
    }
}
