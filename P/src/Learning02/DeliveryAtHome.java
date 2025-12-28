package Learning02;

public class DeliveryAtHome implements DeliveryMethod {

    public DeliveryAtHome() {
        
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal at home");
    }

}
