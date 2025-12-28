package Composite;

public class Main {
    public static void main(String[] args) {
        // Criando formas simples (folhas)
        Graphic circle = new Circle();
        Graphic rectangle = new Rectangle();

        // Criando um grupo (composto) de formas
        Group group = new Group();
        group.add(circle);
        group.add(rectangle);

        // Desenhando as formas
        System.out.println("Individual shapes:");
        circle.draw();
        rectangle.draw();

        System.out.println("\nGroup of shapes:");
        group.draw();  // O grupo desenha todas as formas dentro dele
    }
}
