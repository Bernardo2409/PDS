package Flyweight;

import java.awt.*;

/**
 * Tree contains extrinsic state (unique per object) - position coordinates.
 * It references a flyweight TreeType for shared data.
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
