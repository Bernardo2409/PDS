package Patterns.Abstract_Factory;

public class FabricaWindows implements FabricaGUI {
    @Override
    public Botao criaBotao() {
        return new BotaoWindows(); // Cria a variante Windows
    }

    @Override
    public Checkbox criaCheckbox() {
        return new CheckboxWindows(); // Cria a variante Windows
    }
}