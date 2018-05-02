package Vehicle;

public class GoodsTrain extends Train{

    private String cargo;
    private int weight;

    public GoodsTrain(String departure, String destination, int distance, int averageSpeed, String cargo, int weight) {
        super(departure, destination, distance, averageSpeed);
        this.cargo = cargo;
        this.weight = weight;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Goods train: cargo:" + cargo + "(weight: "+ weight + "t) " + super.toString();
    }
}

