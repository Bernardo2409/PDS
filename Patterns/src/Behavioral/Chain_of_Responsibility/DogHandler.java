package Chain_of_Responsibility;

public class DogHandler extends Handler {
    @Override
    public String handle(String request) {
        if (request.equals("MeatBall")) {
            return "Dog: I'll eat the " + request + "!";
        }
        return handleNext(request);
    }
}
