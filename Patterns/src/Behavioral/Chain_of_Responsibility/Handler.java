package Chain_of_Responsibility;

/**
 * Handler interface declares a method for building the chain of handlers
 * and a method for executing a request.
 */
public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract String handle(String request);

    protected String handleNext(String request) {
        if (next == null) {
            return null;
        }
        return next.handle(request);
    }
}

