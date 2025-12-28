package Learning02;

public class DineIn implements DeliveryMethod {

    public DineIn() {
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal " + meal.getName() + " at dine in");
        RestaurantCenter.getInstance().notifyObservers(null, "Meal served at table: " + meal.getName());
    }

}
