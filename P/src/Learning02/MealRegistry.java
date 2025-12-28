package Learning02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

// TODO: Implementar Singleton para registo
public class MealRegistry {
    private static MealRegistry instance;
    private HashMap<String, Meal> meals;

    private MealRegistry() {
    }

    public static MealRegistry getInstance() {
        if (instance == null)
            instance = new MealRegistry();
        return instance;
    }

    public void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/Learning02/meals.txt"))) {
            for (String id : meals.keySet()) {
                writer.println(meals.get(id).toString());
            }
            System.out.println("File written with order operations");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void printFileContent() {
        System.out.println("Content of file \"orders.txt\":");
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Learning02/meals.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
