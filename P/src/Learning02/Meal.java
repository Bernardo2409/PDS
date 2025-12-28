package Learning02;

public class Meal {
    private String type;
    private String name;
    private String chef;

    public Meal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public void prepare() {
        System.out.println("Preparing meal");
    }

    public void deliver(DeliveryMethod method) {
        method.deliver(this);
    }
}
