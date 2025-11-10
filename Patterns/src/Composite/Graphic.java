package Composite;

public interface Graphic {
    void draw();
    void add(Graphic graphic);
    void remove(Graphic graphic);
}
