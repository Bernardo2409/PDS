package Observer;

/**
 * Observer interface - event subscribers.
 */
public interface EventListener {
    void update(String eventType, String file);
}
