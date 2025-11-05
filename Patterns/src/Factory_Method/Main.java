package Factory_Method;

public class Main {
    public static void main(String[] args) {
        // Logística Terrestre
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        System.out.println("Logística Terrestre:");
        logisticaTerrestre.planearEntrega("Cidade A"); 

        System.out.println("---");

        // Logística Marítima
        Logistica logisticaMaritima = new LogisticaMaritima();
        System.out.println("Logística Marítima:");
        logisticaMaritima.planearEntrega("Porto B"); 
    }   
}
