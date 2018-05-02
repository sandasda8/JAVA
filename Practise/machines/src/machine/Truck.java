package machine;
import ../.machine;
import java.io.Serializable;
import java.util.Random;

public class Truck extends Machinery implements Supplier, Serializable{
    private int weightCapacity;
    private int loadWeight;

    public Truck(int weight, String type, int weightCapacity) {
        super(weight, type);
        this.weightCapacity = weightCapacity;
        this.loadWeight = 0;
    }
    public double transport(int howFar) throws Exception {
        if (loadWeight == 0){
            throw new Exception ("No load.");
        } else {
            double velocity = (this.weightCapacity + this.loadWeight) * Math.random() * 1;
            double transportTime = howFar/velocity;

            this.loadWeight = 0;
            return transportTime;
        }
    }

    @Override
    public String toString() {
        return "Truck [" + weightCapacity + ", loadWeight=" + loadWeight + "]" + super.toString();
    }
}
