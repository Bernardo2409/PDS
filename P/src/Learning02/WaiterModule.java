package Learning02;

// Concrete Observer - Módulo do Empregado
public class WaiterModule implements RestaurantModule {

    @Override
    public void update(String message) {
        System.out.println("[WAITER] Received notification: " + message);
    }
}
