package Flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Forest manages a large number of trees using the flyweight pattern.
 */
public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }

    public int getTreeCount() {
        return trees.size();
    }
}
