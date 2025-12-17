public class Ball {
    
    private static Ball instance;
    private String Cor;

    private Ball(String Cor) {
        this.Cor = Cor;
    }

    public static Ball getInstance() {
        if (instance == null) {
            instance = new Ball("white");
        }
        return instance;
    }


    public String getColor() {
        return Cor;
    }
}
