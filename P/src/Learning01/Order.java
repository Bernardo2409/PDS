package Learning01;

public abstract class Order {
    protected String id;
    protected String nomeCliente;

    public Order(String id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        // Regista a encomenda ao ser criada
        OrderRegistry.getInstance().registerOrder(this);
    }

    public String getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método para pagamento que regista a operação e notifica observers
    public void pay(PaymentMethod method) {
        // Imprime mensagem de pagamento
        String methodName = method.getClass().getSimpleName().replace("Payment", "");
        System.out.println("Order " + id + " paid using " + methodName);

        doPay(method);

        // Regista o pagamento
        OrderRegistry.getInstance().registerPayment(this);

        // Notifica todos os módulos registados (Observer pattern)
        NotificationCenter.getInstance().notifyPayment(this, method);
    }

    // Método abstrato implementado pelas subclasses
    protected abstract void doPay(PaymentMethod method);

    // Retorna o tipo da encomenda em inglês
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

    @Override
    public String toString() {
        return getOrderType() + " [id=" + id + ", cliente=" + nomeCliente + "]";
    }
}
