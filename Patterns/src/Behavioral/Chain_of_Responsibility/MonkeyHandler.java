package Chain_of_Responsibility;

public class MonkeyHandler extends Handler {
    @Override
    public String handle(String request) {
        if (request.equals("Banana")) {
            return "Monkey: I'll eat the " + request + "!";
        }
        return handleNext(request);
    }
}
