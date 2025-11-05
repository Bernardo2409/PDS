package Patterns.src.Builder;

public class Dealership {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Standard Family Sedan ---");
        // Only required parameters and a few optional ones
        Car familyCar = new Car.Builder("Volkswagen", "Jetta")
                               .setNumberOfDoors(4)
                               .withGPS(true) // Setting GPS to true
                               .build();
        System.out.println(familyCar);

        System.out.println("\n--- 2. Custom Electric Sports Car ---");
        // Setting all options in a clean, readable sequence
        Car sportsEV = new Car.Builder("Tesla", "Roadster")
                              .setColor("Deep Red")
                              .setNumberOfDoors(2)
                              .setEngineType("Electric")
                              .withGPS(true)
                              .withSunroof(true) // Setting Sunroof to true
                              .build();
        System.out.println(sportsEV);

        System.out.println("\n--- 3. Basic Utility Car ---");
        // Uses mostly default values
        Car utilityCar = new Car.Builder("Ford", "Fiesta")
                                .setNumberOfDoors(3)
                                .setColor("White")
                                .build();
        System.out.println(utilityCar);
    }
}