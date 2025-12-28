package Visitor;

/**
 * Visitor Pattern Example - Shape Export
 * 
 * The Visitor pattern lets you separate algorithms from the objects on which
 * they operate. It lets you add new operations without changing the classes.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern Demo - Shape Export");

        // Create shapes
        Dot dot = new Dot(1, 2);
        Circle circle = new Circle(5, 5, 10);
        Rectangle rectangle = new Rectangle(10, 10, 20, 15);

        CompoundShape compound = new CompoundShape();
        compound.add(new Circle(0, 0, 5));
        compound.add(new Dot(3, 4));

        // Draw shapes
        System.out.println("\n--- Drawing shapes ---");
        dot.draw();
        circle.draw();
        rectangle.draw();
        compound.draw();

        // Export to XML using visitor
        System.out.println("\n--- Exporting to XML using Visitor ---");
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<shapes>");
        dot.accept(exportVisitor);
        circle.accept(exportVisitor);
        rectangle.accept(exportVisitor);
        compound.accept(exportVisitor);
        System.out.println("</shapes>");
    }
}
