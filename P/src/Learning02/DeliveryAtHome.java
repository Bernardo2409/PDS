package Learning02;

public class DeliveryAtHome implements DeliveryMethod {

    public DeliveryAtHome() {

    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal " + meal.getName() + " at home");
        RestaurantCenter.getInstance().notifyObservers(null, "Meal delivered at home: " + meal.getName());
    }

}
