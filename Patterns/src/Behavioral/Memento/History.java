package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker - manages memento history.
 */
public class History {
    private List<Snapshot> snapshots = new ArrayList<>();

    public void push(Snapshot snapshot) {
        snapshots.add(snapshot);
    }

    public Snapshot pop() {
        if (snapshots.isEmpty()) {
            return null;
        }
        Snapshot last = snapshots.get(snapshots.size() - 1);
        snapshots.remove(snapshots.size() - 1);
        return last;
    }

    public int size() {
        return snapshots.size();
    }
}
