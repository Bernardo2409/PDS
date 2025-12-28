package Chain_of_Responsibility;

public class SquirrelHandler extends Handler {
    @Override
    public String handle(String request) {
        if (request.equals("Nut")) {
            return "Squirrel: I'll eat the " + request + "!";
        }
        return handleNext(request);
    }
}
