package Learning02;

public class OldKitchenAdapter implements DeliveryMethod {

    private OldKitchen oldKitchen;

    public OldKitchenAdapter(OldKitchen oldKitchen) {
        this.oldKitchen = oldKitchen;
    }

    @Override
    public void deliver(Meal meal) {
        System.out.println("Delivering meal " + meal.getName() + " to old kitchen");
        oldKitchen.prepareDish(meal.getName());
    }

}
