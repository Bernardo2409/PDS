package Patterns.Abstract_Factory;

public class BotaoMacOS implements Botao {
    @Override
    public void pintar() {
        System.out.println("A renderizar um Botão no estilo macOS.");
    }
}
