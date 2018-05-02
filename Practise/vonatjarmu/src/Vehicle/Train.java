package Vehicle;

public class Train {
    protected String departure;
    protected String destination;
    protected float distance;
    protected int averageSpeed;

    public Train(String departure, String destination, int distance, int averageSpeed) {
        this.departure = departure;
        this.destination = destination;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public Train() {

    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    public float soonest() {
        return distance / averageSpeed;
    }

    @Override
    public String toString() {
        return "departure: " + departure + "– destination: " + destination + " (distance: " + distance + "km), average speed: " +averageSpeed+ "km/h";
    }

}
