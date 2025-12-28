package Mediator;

public class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        System.out.println("Button: Clicked");
        mediator.notify(this, "click");
    }
}
