package Patterns.Abstract_Factory;

public class App {
    private FabricaGUI fabrica;
    private Botao botao;
    private Checkbox checkbox;

    // O construtor recebe a Fábrica, definindo a família de produtos
    public App(FabricaGUI f) {
        this.fabrica = f;
    }

    public void criarInterface() {
        this.botao = fabrica.criaBotao();     // Cria um Botão da FAMÍLIA escolhida
        this.checkbox = fabrica.criaCheckbox(); // Cria um Checkbox da MESMA FAMÍLIA
    }

    public void usarInterface() {
        botao.pintar();
        checkbox.pintar();
    }
}
