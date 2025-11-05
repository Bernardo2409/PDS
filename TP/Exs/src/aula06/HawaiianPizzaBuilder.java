package aula06;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("macia");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("doce de tomate");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("fiambre e ananás");
    }
}
