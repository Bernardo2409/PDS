package Learning01;

import java.io.*;
import java.util.*;

public class OrderRegistry {
    private static OrderRegistry instance;
    private Map<String, Integer> paymentCounts = new LinkedHashMap<>();
    private Map<String, String> orderTypes = new LinkedHashMap<>();
    private static final String FILENAME = "src/Learning01/orders.txt";

    private OrderRegistry() {
    }

    public static OrderRegistry getInstance() {
        if (instance == null)
            instance = new OrderRegistry();
        return instance;
    }

    public void registerOrder(Order order) {
        orderTypes.put(order.getId(), order.getOrderType());
        paymentCounts.put(order.getId(), 0);
    }

    public void registerPayment(Order order) {
        if (!paymentCounts.containsKey(order.getId()))
            registerOrder(order);
        paymentCounts.put(order.getId(), paymentCounts.get(order.getId()) + 1);
    }

    public void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (String id : orderTypes.keySet()) {
                writer.println(
                        "Order " + id + " (" + orderTypes.get(id) + ") has " + paymentCounts.get(id) + " payments");
            }
            System.out.println("File written with order operations");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void printFileContent() {
        System.out.println("Content of file \"orders.txt\":");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
