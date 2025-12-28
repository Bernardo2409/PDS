package Builder;

public class SportsCarBuilder implements CarBuilder{
    private Car car;

    public void reset() {  
        car = new Car(); 
    }

    public void setSeats(int number) { 
        car.setSeats(number); 
    }
    public void setEngine(String type) { 
        car.setEngine(type); 
    }
    public void setGPS(boolean hasGPS) { 
        car.setGPS(hasGPS); 
    }

    public Car getResult() { 
        return car; 
    }

}
