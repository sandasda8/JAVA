
public class Bicycle extends Vehicle {

    public void startUp() throws BrokenException {
        if (isBroken()) {
            throw new BrokenException("The bike is broken.");
        } else {
            System.out.println("Elindultunk biciklivel");
        }
    }

    public Bicycle(int suly) {
        super(suly, 40);
    }

}
