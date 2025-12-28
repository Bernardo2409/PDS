package Learning02;

public class DineIn implements DeliveryMethod {

    public DineIn() {
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal at dine in");
    }

}
