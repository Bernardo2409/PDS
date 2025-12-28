package Mediator;

/**
 * Mediator interface declares communication methods.
 */
public interface Mediator {
    void notify(Component sender, String event);
}
