package Learning03;

public abstract class RequestHandler implements Handler {

    private Handler next;

    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    @Override
    public Handler getNext() {
        return this.next;
    }

    @Override
    public abstract void handle(String request);
}
