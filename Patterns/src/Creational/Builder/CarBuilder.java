package Builder;

public interface CarBuilder {
    void reset();
    void setSeats(int number);
    void setEngine(String type);
    void setGPS(boolean hasGPS);
}
