public class Main {

    // Bernardo Coelho 125059
    // João Pereira 125683
    // João Tomásio 120132
    
    public static void main(String[] args) {
    CeilingFan fan = new CeilingFan();
    System.out.println("Current state: " + fan.getState());
    
    fan.pull(); // Turn on low speed
    System.out.println("Current state: " + fan.getState());
    
    fan.pull(); // Switch to medium speed
    System.out.println("Current state: " + fan.getState());
    
    fan.pull(); // Switch to high speed
    System.out.println("Current state: " + fan.getState());
    
    fan.pull(); // Turn off the fan
    System.out.println("Current state: " + fan.getState());
    }

}
