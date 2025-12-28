package Factory_Method;

public class LandLogistics extends CreatorLogistics {

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }


}