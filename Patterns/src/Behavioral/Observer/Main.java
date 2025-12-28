package Observer;

/**
 * Observer Pattern Example - Text Editor Events
 * 
 * The Observer pattern lets you define a subscription mechanism to notify
 * multiple objects about any events that happen to the object they observe.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Demo - Text Editor Events");

        TextEditor editor = new TextEditor();

        // Create listeners
        EmailAlertListener emailListener = new EmailAlertListener("admin@example.com");
        LoggingListener logListener = new LoggingListener("/var/log/editor.log");

        // Subscribe to events
        editor.events.subscribe("open", emailListener);
        editor.events.subscribe("save", emailListener);
        editor.events.subscribe("save", logListener);

        // Perform operations
        System.out.println("\n--- Opening a file ---");
        editor.openFile("document.txt");

        System.out.println("\n--- Saving the file ---");
        editor.saveFile();

        System.out.println("\n--- Unsubscribe email from save events ---");
        editor.events.unsubscribe("save", emailListener);

        System.out.println("\n--- Saving again ---");
        editor.saveFile();
    }
}
