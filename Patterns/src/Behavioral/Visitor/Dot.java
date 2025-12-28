package Visitor;

public class Dot implements Shape {
    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing dot at (" + x + ", " + y + ")");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
