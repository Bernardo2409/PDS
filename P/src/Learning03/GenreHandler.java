package Learning03;

public class GenreHandler extends RequestHandler {

    @Override
    public void handle(String request) {
        if (request.equals("rock") || request.equals("pop") || request.equals("jazz")) {
            System.out.println("Processing request by genre: " + request);
        } else {
            if (getNext() != null) {
                getNext().handle(request);
            }
        }
    }
}
