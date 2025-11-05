package Patterns.Abstract_Factory;

public class FabricaMacOS implements FabricaGUI {
    @Override
    public Botao criaBotao() {
        return new BotaoMacOS(); // Cria a variante macOS
    }

    @Override
    public Checkbox criaCheckbox() {
        return new CheckboxMacOS(); // Cria a variante macOS
    }
}
