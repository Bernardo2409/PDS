public class Director {

    public void changeBuilder(CarBuilder builder) {
        
    }

     public void constructSportsCar(CarBuilder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Electric");
        builder.setGPS(true);
    }

    public void constructSUV(CarBuilder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("Diesel");
        builder.setGPS(true);
    }
}
