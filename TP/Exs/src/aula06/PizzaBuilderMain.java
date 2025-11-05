package aula06;

public class PizzaBuilderMain {
    public static void main(String[] args) {
        Chef chef = new Chef();

        PizzaBuilder hawaiianPizza = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizza = new SpicyPizzaBuilder();

        chef.setPizzaBuilder(hawaiianPizza);
        chef.constructPizza();
        Pizza pizza1 = chef.getPizza();
        System.out.println("Encomenda 1: " + pizza1);

        chef.setPizzaBuilder(spicyPizza);
        chef.constructPizza();
        Pizza pizza2 = chef.getPizza();
        System.out.println("Encomenda 2: " + pizza2);
    }
}
