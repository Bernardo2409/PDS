// Classe Singleton
public class Singleton {
    // Instância privada e estática da classe
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias externas
    private Singleton() {
        // Aqui podem ser feitas inicializações, se necessário
    }

    // Método público para acessar a instância
    public static Singleton getInstance() {
        // Cria a instância somente quando necessário (Lazy Initialization)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Método para demonstração
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}