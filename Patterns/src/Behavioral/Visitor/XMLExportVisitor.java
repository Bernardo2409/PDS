package Visitor;

/**
 * Concrete visitor that exports shapes to XML.
 */
public class XMLExportVisitor implements Visitor {
    public String export(Shape... shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<shapes>\n");
        for (Shape shape : shapes) {
            shape.accept(this);
        }
        sb.append("</shapes>");
        return sb.toString();
    }

    @Override
    public void visitDot(Dot dot) {
        System.out.println("  <dot x=\"" + dot.getX() + "\" y=\"" + dot.getY() + "\"/>");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("  <circle x=\"" + circle.getX() + "\" y=\"" + circle.getY() +
                "\" radius=\"" + circle.getRadius() + "\"/>");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("  <rectangle x=\"" + rectangle.getX() + "\" y=\"" + rectangle.getY() +
                "\" width=\"" + rectangle.getWidth() + "\" height=\"" + rectangle.getHeight() + "\"/>");
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {
        System.out.println("  <compound>");
        for (Shape child : compoundShape.getChildren()) {
            child.accept(this);
        }
        System.out.println("  </compound>");
    }
}
