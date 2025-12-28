package Learning02;

// TODO: Implementar classe abstrata Meal
public class NormalMeal extends Meal {
    public NormalMeal(String type, String name, String chef) {
        super(type, name, chef);
        System.out.println("NormalMeal created");
    }

    @Override
    public void deliver(DeliveryMethod method) {
        method.deliver(this);
    }

}
