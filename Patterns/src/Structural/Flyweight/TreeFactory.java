package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory creates and manages flyweight objects.
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String texture) {
        String key = name + "_" + color.toString() + "_" + texture;
        TreeType result = treeTypes.get(key);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypes.put(key, result);
            System.out.println("TreeFactory: Created new TreeType - " + name);
        }
        return result;
    }

    public static int getTreeTypesCount() {
        return treeTypes.size();
    }
}
