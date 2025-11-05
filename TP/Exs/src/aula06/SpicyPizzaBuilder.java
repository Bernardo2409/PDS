package aula06;

public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("crocante");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("picante");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("chouriço e pimenta");
    }
}