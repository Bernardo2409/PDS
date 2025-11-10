package Composite;

// Folha
public class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void add(Graphic graphic) {
        throw new UnsupportedOperationException("Leaf objects cannot add children.");
    }

    @Override
    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException("Leaf objects cannot remove children.");
    }
}
