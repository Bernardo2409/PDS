package Learning03;

public interface Handler {

    public Handler setNext(Handler next);

    public Handler getNext();

    public void handle(String request);
}