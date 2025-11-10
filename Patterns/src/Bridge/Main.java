package Bridge;

public class Main {
     public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemote = new RemoteControl(tv);
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);

        System.out.println("=== Using Basic Remote with TV ===");
        basicRemote.togglePower();
        basicRemote.volumeUp();

        System.out.println("\n=== Using Advanced Remote with Radio ===");
        advancedRemote.togglePower();
        advancedRemote.mute();
    }
}
