package Learning01;

public class OrderFactory {
    public static Order createOrder(String type, String id, String nomeCliente) {
        switch (type.toLowerCase()) {
            case "simple":
                return new EncomendaSimples(id, nomeCliente);
            case "express":
                return new EncomendaExpresso(id, nomeCliente);
            case "international":
                return new EncomendaInternacional(id, nomeCliente);
            default:
                throw new IllegalArgumentException("Unknown order type: " + type);
        }
    }
}
