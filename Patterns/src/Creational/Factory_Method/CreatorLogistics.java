package Factory_Method;

/**
 * Creator - declares the factory method that returns Vehicle objects.
 * The class is abstract because the factory method must be implemented
 * by concrete subclasses.
 */
public abstract class CreatorLogistics {

    // Factory Method - subclasses must implement this
    public abstract Vehicle createVehicle();

    // Business logic that uses the factory method
    public void planDelivery() {
        Vehicle v = createVehicle();
        System.out.println("Planning delivery...");
        v.deliver();
    }
}
