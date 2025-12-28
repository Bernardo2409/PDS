package Mediator;

public class Checkbox extends Component {
    private boolean checked = false;

    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void check() {
        checked = !checked;
        System.out.println("Checkbox: " + (checked ? "Checked" : "Unchecked"));
        mediator.notify(this, "check");
    }

    public boolean isChecked() {
        return checked;
    }
}
