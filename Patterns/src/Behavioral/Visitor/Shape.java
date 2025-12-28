package Visitor;

/**
 * Element interface declares accept method for visitors.
 */
public interface Shape {
    void move(int x, int y);

    void draw();

    void accept(Visitor visitor);
}
