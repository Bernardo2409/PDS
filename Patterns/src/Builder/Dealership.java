package Builder;

public class Dealership {
    public static void main(String[] args) {
        
         Director director = new Director();

        // Builder para o carro desportivo
        SportsCarBuilder sportsBuilder = new SportsCarBuilder();
        director.constructSportsCar(sportsBuilder);
        Car sportsCar = sportsBuilder.getResult();
        System.out.println(sportsCar);

        // Builder para o SUV
        SUVCarBuilder suvBuilder = new SUVCarBuilder();
        director.constructSUV(suvBuilder);
        Car suv = suvBuilder.getResult();
        System.out.println(suv);
    }
}
