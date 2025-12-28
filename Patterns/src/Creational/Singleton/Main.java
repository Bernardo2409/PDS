package Singleton;

public class Main {
    public static void main(String[] args) {
        // Tenta obter a instância do Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verifica se as duas variáveis apontam para a mesma instância
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        // Chama o método da instância
        singleton1.showMessage();
    }
}
