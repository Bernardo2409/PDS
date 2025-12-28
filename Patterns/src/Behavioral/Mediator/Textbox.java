package Mediator;

public class Textbox extends Component {
    private String text = "";

    public Textbox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Textbox: Text set to '" + text + "'");
        mediator.notify(this, "textChanged");
    }

    public String getText() {
        return text;
    }
}
