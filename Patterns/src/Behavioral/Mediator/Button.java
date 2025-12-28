package Mediator;

class Button extends Colleague {
    static int count = 0;
    int id;
    {
        id = count++;
    }

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        mediator.sendMessage(this, "Button " + id + " clicked!");
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        // Handle received message specific to Button logic (optional)
        System.out.println("Button received: " + message);
    }
}
