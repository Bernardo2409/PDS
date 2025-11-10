package Decorator;

public class UnderlinedMessageDecorator extends MessageDecorator{
    public UnderlinedMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<u>" + wrappedMessage.getContent() + "</u>";
    }
}
