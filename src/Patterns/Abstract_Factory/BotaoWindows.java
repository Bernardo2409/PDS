package Patterns.Abstract_Factory;


public class BotaoWindows implements Botao {
    @Override
    public void pintar() {
        System.out.println("A renderizar um Botão no estilo Windows.");
    }
}