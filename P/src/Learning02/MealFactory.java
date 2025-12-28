package Learning02;

// TODO: Implementar Factory
public class MealFactory {
    public static Meal createMeal(String type, String name, String chef) {
        switch (type) {
            case "normal":
                return new NormalMeal(type, name, chef);
            case "vegetarian":
                return new VegetarianMeal(type, name, chef);
            case "gourmet":
                return new GourmetMeal(type, name, chef);
            default:
                throw new IllegalArgumentException("Invalid meal type");
        }
    }
}
