package Learning02;

public class TakeAway implements DeliveryMethod {

    public TakeAway() {
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal " + meal.getName() + " to take away");
        RestaurantCenter.getInstance().notifyObservers(null, "Meal ready for take away: " + meal.getName());
    }

}
