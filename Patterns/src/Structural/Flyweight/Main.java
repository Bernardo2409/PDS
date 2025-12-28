package Flyweight;

import java.awt.*;

/**
 * Flyweight Pattern Example - Forest Rendering
 * 
 * The Flyweight pattern minimizes memory usage by sharing common data
 * between similar objects. In this example, many trees share TreeType
 * objects instead of each tree storing duplicate type information.
 */
public class Main {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();

        System.out.println("Flyweight Pattern Demo - Forest with " + TREES_TO_DRAW + " trees");
        System.out.println("=".repeat(50));

        // Plant many trees with only a few tree types
        for (int i = 0; i < TREES_TO_DRAW / 2; i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Maple", Color.ORANGE, "Maple texture");
        }

        System.out.println();
        System.out.println("Total trees planted: " + forest.getTreeCount());
        System.out.println("Total unique tree types created: " + TreeFactory.getTreeTypesCount());
        System.out.println();
        System.out.println("Memory saved by sharing TreeType objects instead of");
        System.out.println("duplicating type data in each Tree object!");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
