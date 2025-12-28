package Composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        System.out.println("Drawing a Group of Shapes:");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }

    @Override
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }
}
