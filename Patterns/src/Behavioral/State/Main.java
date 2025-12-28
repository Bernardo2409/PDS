package State;

/**
 * State Pattern Example - Gumball Machine
 * 
 * The State pattern lets an object alter its behavior when its internal
 * state changes. It appears as if the object changed its class.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("State Pattern Demo - Gumball Machine");
        System.out.println("=".repeat(50));

        GumballMachine machine = new GumballMachine(3);

        System.out.println("\n--- Customer 1: Normal transaction ---");
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n--- Customer 2: Tries to get free gumball ---");
        machine.turnCrank();

        System.out.println("\n--- Customer 3: Changes mind ---");
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println("\n--- Customer 4: Normal transaction ---");
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n--- Customer 5: Last gumball ---");
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n--- Customer 6: Machine sold out ---");
        machine.insertQuarter();
    }
}
