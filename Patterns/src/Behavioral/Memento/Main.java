package Memento;

/**
 * Memento Pattern Example - Text Editor with Undo
 * 
 * The Memento pattern lets you save and restore the previous state
 * of an object without revealing the details of its implementation.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Memento Pattern Demo - Text Editor with Undo");

        Editor editor = new Editor();
        History history = new History();

        // Type and save states
        editor.type("Hello");
        System.out.println("Typed 'Hello': " + editor);
        history.push(editor.save());

        editor.type(" World");
        System.out.println("Typed ' World': " + editor);
        history.push(editor.save());

        editor.type("!");
        System.out.println("Typed '!': " + editor);
        history.push(editor.save());

        editor.type(" This will be undone.");
        System.out.println("Typed ' This will be undone.': " + editor);

        // Undo
        System.out.println("\n--- Performing Undo ---");
        Snapshot snapshot = history.pop();
        if (snapshot != null) {
            editor.restore(snapshot);
            System.out.println("After undo: " + editor);
        }

        System.out.println("\n--- Performing Another Undo ---");
        snapshot = history.pop();
        if (snapshot != null) {
            editor.restore(snapshot);
            System.out.println("After undo: " + editor);
        }
    }
}
