package Memento;

/**
 * Memento stores the state of the originator (Editor).
 */
public class Snapshot {
    private Editor editor;
    private String text;
    private int cursorPosition;

    public Snapshot(Editor editor, String text, int cursorPosition) {
        this.editor = editor;
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    public void restore() {
        editor.setText(text);
        editor.setCursorPosition(cursorPosition);
    }

    public String getText() {
        return text;
    }
}
