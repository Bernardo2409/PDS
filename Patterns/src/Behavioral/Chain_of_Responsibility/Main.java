package Chain_of_Responsibility;

/**
 * Chain of Responsibility Pattern Example - Animal Food Chain
 * 
 * This pattern lets you pass requests along a chain of handlers.
 * Each handler decides to process the request or pass it to the next.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Pattern Demo");

        // Build the chain: Monkey -> Squirrel -> Dog
        Handler monkey = new MonkeyHandler();
        Handler squirrel = new SquirrelHandler();
        Handler dog = new DogHandler();

        monkey.setNext(squirrel).setNext(dog);

        // Test different foods
        String[] foods = { "Nut", "Banana", "MeatBall", "Coffee" };

        System.out.println("\nPassing food through the chain:");
        for (String food : foods) {
            System.out.print("  " + food + ": ");
            String result = monkey.handle(food);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println(food + " was left untouched.");
            }
        }
    }
}
