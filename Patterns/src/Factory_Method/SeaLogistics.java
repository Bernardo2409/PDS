package Factory_Method;

public class SeaLogistics extends CreatorLogistics {

    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }


}