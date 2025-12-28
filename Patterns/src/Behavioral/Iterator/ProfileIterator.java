package Iterator;

/**
 * Iterator interface declares traversal operations.
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
