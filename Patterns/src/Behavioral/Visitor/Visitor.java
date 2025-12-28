package Visitor;

/**
 * Visitor interface declares visit methods for each element type.
 */
public interface Visitor {
    void visitDot(Dot dot);

    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);

    void visitCompoundShape(CompoundShape compoundShape);
}
