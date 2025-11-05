package Patterns.Abstract_Factory;

public class Main {

    public static void main(String[] args) {
        
        // CENÁRIO 1: Configurar para Windows
        FabricaGUI fabricaWindows = new FabricaWindows();
        App appWindows = new App(fabricaWindows);
        
        appWindows.criarInterface();
        System.out.println("--- Execução no Windows ---");
        appWindows.usarInterface(); 
        
        System.out.println("\n-----------------------------\n");
        
        // CENÁRIO 2: Configurar para macOS (Mudar a fábrica!)
        FabricaGUI fabricaMacOS = new FabricaMacOS();
        App appMacOS = new App(fabricaMacOS);
        
        appMacOS.criarInterface();
        System.out.println("--- Execução no macOS ---");
        appMacOS.usarInterface(); 
    }
}
