
public class Car extends Vehicle implements Motorized{

    private int fuelLevel;

    public Car(int weight, int maxSpeed) {
        super(weight, maxSpeed);
        this.fuelLevel = 50;
    }

   public void startUp () throws NoFuelException, BrokenException {
       if (isBroken()) {
           throw new BrokenException("The car is broken.");
       } else if ( this.fuelLevel <= 0 ) {
           throw new NoFuelException("No fuel.");
       } else {
           System.out.println("The car is running.");
           this.fuelLevel -= 5;
       }
   }
   public void getFuel() {

   }

    @Override
    public void FuelRefill(int something) {
        this.fuelLevel = something;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
