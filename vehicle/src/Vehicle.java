public abstract class Vehicle {
    private int weight;
    private int maxSpeed;
    private boolean broken = false;

    public Vehicle(int weight, int maxSpeed) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public abstract void startUp () throws BrokenException;

    @Override
    public String toString() {
        return "Vehicle {" + "weight=" + weight + ", maxSpeed=" + maxSpeed + ", is it broken: " + broken + '}';
    }
}
