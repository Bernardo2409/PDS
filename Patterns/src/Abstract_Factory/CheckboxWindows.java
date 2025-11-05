package Abstract_Factory;


public class CheckboxWindows implements Checkbox {
    @Override
    public void pintar() {
        System.out.println("A renderizar um Checkbox no estilo Windows.");
    }
}
