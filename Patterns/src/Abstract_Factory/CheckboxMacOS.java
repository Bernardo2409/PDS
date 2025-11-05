package Abstract_Factory;


public class CheckboxMacOS implements Checkbox{
    @Override
    public void pintar() {
        System.out.println("A renderizar um Checkbox no estilo macOS.");
    }
}
