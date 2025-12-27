package Learning01;

public abstract class Order {
    protected String id;
    protected String nomeCliente;

    public Order(String id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        OrderRegistry.getInstance().registerOrder(this);
    }

    public String getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void pay(PaymentMethod method) {
        String methodName = method.getClass().getSimpleName().replace("Payment", "");
        System.out.println("Order " + id + " paid using " + methodName);
        doPay(method);
        OrderRegistry.getInstance().registerPayment(this);
        NotificationCenter.getInstance().notifyPayment(this, method);
    }

    protected abstract void doPay(PaymentMethod method);

    public String getOrderType() {
        String className = getClass().getSimpleName();
        if (className.equals("EncomendaSimples"))
            return "SimpleOrder";
        if (className.equals("EncomendaExpresso"))
            return "ExpressOrder";
        if (className.equals("EncomendaInternacional"))
            return "InternationalOrder";
        return className;
    }
}
