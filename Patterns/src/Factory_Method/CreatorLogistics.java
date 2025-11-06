package Factory_Method;

public class CreatorLogistics {

    public Vehicle createVehicle() {
    // default implementation (can be overridden)
    return new Truck();
}

public void planDelivery() {
    Vehicle v = createVehicle();
    v.deliver();
}
}

