package Learning02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Creating meals");
        Meal meal1 = MealFactory.createMeal("normal", "meal1", "Carlos");
        Meal meal2 = MealFactory.createMeal("vegetarian", "meal2", "Sofia");
        Meal meal3 = MealFactory.createMeal("gourmet", "meal3", "Miguel");

        System.out.println("\nPart B: Delivering meals");
        DeliveryMethod homeDelivery = new DeliveryAtHome();
        DeliveryMethod takeAway = new TakeAway();
        DeliveryMethod dineIn = new DineIn();

        meal1.deliver(homeDelivery);
        meal2.deliver(takeAway);
        meal3.deliver(dineIn);

        System.out.println("\nPart C: Using old kitchen system");
        OldKitchen oldKitchen = new OldKitchen();
        DeliveryMethod adapter = new OldKitchenAdapter(oldKitchen);
        meal1.deliver(adapter);

        MealRegistry.getInstance().writeToFile();

        System.out.println("\nPart D: Notifications");
        RestaurantModule kitchen = new KitchenModule();
        RestaurantModule waiter = new WaiterModule();

        RestaurantCenter center = RestaurantCenter.getInstance();
        center.register(kitchen);
        center.register(waiter);

        meal1.deliver(homeDelivery);

        MealRegistry.getInstance().writeToFile();
        MealRegistry.getInstance().printFileContent();
    }
}
