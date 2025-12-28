package Learning02;

public class TakeAway implements DeliveryMethod {

    public TakeAway() {
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal to take away");
    }

}
