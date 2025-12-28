package Learning02;

// Concrete Observer - Módulo da Cozinha
public class KitchenModule implements RestaurantModule {

    @Override
    public void update(String message) {
        System.out.println("[KITCHEN] Received notification: " + message);
    }
}
