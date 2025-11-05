package Patterns.Builder;

public class Car {
    // Required Fields
    private final String brand;
    private final String model;

    // Optional Fields with sensible defaults
    private final String color;
    private final int numberOfDoors;
    private final String engineType; // e.g., Gasoline, Diesel, Electric
    private final boolean hasGPS;
    private final boolean hasSunroof;

    // Private constructor that accepts the Builder
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.numberOfDoors = builder.numberOfDoors;
        this.engineType = builder.engineType;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
    }

    // Getters (Omitted for brevity)

    @Override
    public String toString() {
        return "Configured Car Details:\n" +
               "  Brand: " + brand + "\n" +
               "  Model: " + model + "\n" +
               "  Color: " + color + "\n" +
               "  Doors: " + numberOfDoors + "\n" +
               "  Engine: " + engineType + "\n" +
               "  GPS: " + (hasGPS ? "Yes" : "No") + "\n" +
               "  Sunroof: " + (hasSunroof ? "Yes" : "No");
    }

    // --- 2. The Builder Class (Static Nested Class) ---
    public static class Builder {
        // Required Fields (Copied from Product)
        private final String brand;
        private final String model;
        
        // Optional Fields with default values
        private String color = "Black";
        private int numberOfDoors = 4;
        private String engineType = "Gasoline";
        private boolean hasGPS = false;
        private boolean hasSunroof = false;

        // Constructor for REQUIRED parameters
        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        // Methods for setting OPTIONAL parameters (Fluent Interface)
        // Note: Each method returns 'this' to allow chaining
        public Builder setColor(String color) {
            this.color = color;
            return this; 
        }

        public Builder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder withGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        // The final build method to create the Car object
        public Car build() {
            // Optional: Add validation logic here
            if (numberOfDoors < 2 || numberOfDoors > 5) {
                throw new IllegalStateException("Invalid number of doors specified.");
            }
            return new Car(this); // Passes the Builder object to the Car's private constructor
        }
    }
}