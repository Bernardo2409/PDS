package Learning03;

public class DefaultHandler extends RequestHandler {

    @Override
    public void handle(String request) {
        System.out.println("Default processing for: " + request);
    }

}
