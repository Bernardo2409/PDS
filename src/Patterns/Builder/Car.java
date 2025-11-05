
public class Car {
    private int seats;
    private String engine;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "\n--- Car Configuration ---\n" +
               "Seats: " + seats + "\n" +
               "Engine: " + engine + "\n" +
               "GPS: " + (gps ? "Yes" : "No");
    }
}