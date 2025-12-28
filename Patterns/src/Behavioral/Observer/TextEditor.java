package Observer;

/**
 * Subject - the text editor that generates events.
 */
public class TextEditor {
    public EventManager events;
    private String file;

    public TextEditor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = filePath;
        System.out.println("Editor: Opened file " + filePath);
        events.notify("open", file);
    }

    public void saveFile() {
        System.out.println("Editor: Saved file " + file);
        events.notify("save", file);
    }
}
