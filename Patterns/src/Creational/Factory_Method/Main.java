package Factory_Method;

public class Main {
    public static void main(String[] args) {
        
        // Land Logistics
        CreatorLogistics landLogistics = new LandLogistics();
        System.out.println("Land Logistics:");
        landLogistics.planDelivery();

        System.out.println("---");

        // Sea Logistics
        CreatorLogistics seaLogistics = new SeaLogistics();
        System.out.println("Sea Logistics:");
        seaLogistics.planDelivery();
    }


}
