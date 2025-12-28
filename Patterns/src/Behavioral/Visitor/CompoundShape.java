package Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private List<Shape> children = new ArrayList<>();

    public void add(Shape shape) {
        children.add(shape);
    }

    public List<Shape> getChildren() {
        return children;
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing compound shape:");
        for (Shape child : children) {
            child.draw();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}
