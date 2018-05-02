package Vehicle;

public class LocalTrain extends Train{
    private int wayStations;

    public LocalTrain(String departure, String destination, int distance, int averageSpeed, int wayStations) {
        super(departure, destination, distance, averageSpeed);
        this.wayStations = wayStations;
    }

    public int getWayStations() {
        return wayStations;
    }

    public void setWayStations(int wayStations) {
        if (wayStations < 2) {
            System.out.println("Not enough stops.");
        } else {
            this.wayStations = wayStations;
        }
    }

    @Override
    public float soonest() {
        return super.soonest() + (getWayStations() - 2) * 0.1f;
    }

    @Override
    public String toString() {
        return "Local train: " + wayStations + " stops, " + super.toString();
    }

}
