package Learning02;

// TODO: Implementar Factory
public class MealFactory {
    public static Meal createMeal(String type, String name, String chef) {
        Meal meal;

        switch (type) {
            case "normal":
                meal = new NormalMeal(type, name, chef);
                break;
            case "vegetarian":
                meal = new VegetarianMeal(type, name, chef);
                break;
            case "gourmet":
                meal = new GourmetMeal(type, name, chef);
                break;
            default:
                throw new IllegalArgumentException("Invalid meal type");
        }
    
        MealRegistry.getInstance().addMeal(name, meal);
        return meal;
    }
}
