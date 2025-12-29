package Learning03;

public class ArtistHandler extends RequestHandler {

    @Override
    public void handle(String request) {
        if (request.equals("Beatles")) {
            System.out.println("Processing request by artist: " + request);
        } else {
            if (getNext() != null) {
                getNext().handle(request);
            }
        }
    }

}
