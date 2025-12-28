package Command;

/**
 * Command Pattern Example - Remote Control
 * 
 * The Command pattern turns a request into a stand-alone object.
 * This decouples the sender from the receiver and allows parameterization.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern Demo - Remote Control");
        System.out.println("=".repeat(50));

        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        Command turnOff = new TurnOffLightCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Use the remote
        System.out.println("\nUsing remote control:");
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();

        remote.setCommand(turnOn);
        remote.pressButton();
    }
}
