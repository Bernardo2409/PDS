package Memento;

/**
 * Originator - creates mementos and restores state from them.
 */
public class Editor {
    private String text = "";
    private int cursorPosition = 0;

    public void type(String words) {
        text += words;
        cursorPosition = text.length();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursorPosition(int position) {
        this.cursorPosition = position;
    }

    public String getText() {
        return text;
    }

    public Snapshot save() {
        return new Snapshot(this, text, cursorPosition);
    }

    public void restore(Snapshot snapshot) {
        snapshot.restore();
    }

    @Override
    public String toString() {
        return "Editor{text='" + text + "', cursor=" + cursorPosition + "}";
    }
}
