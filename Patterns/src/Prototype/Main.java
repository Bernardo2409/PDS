public class Main {
    public static void main(String[] args) {
        // Criando o protótipo inicial
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        System.out.println("Original: " + prototype1);

        // Clonando o protótipo
        ConcretePrototype clone1 = (ConcretePrototype) prototype1.clone();
        clone1.setName("Clone 1");

        System.out.println("Clonado: " + clone1);
        System.out.println("Original após clonagem: " + prototype1);
    }
}
