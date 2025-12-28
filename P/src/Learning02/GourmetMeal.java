package Learning02;

public class GourmetMeal extends Meal {
    public GourmetMeal(String type, String name, String chef) {
        super(type);
        System.out.println("GourmetMeal created");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing meal");
    }

    @Override
    public void deliver(DeliveryMethod method) {
        method.deliver(this);
    }
}
