
public class ProxyCar implements ICar {
    private ICar car;
    private int agelimit;

    public ProxyCar(ICar car, int agelimit) {
        this.car = car;
        this.agelimit = agelimit;
    }

    @Override
    public void drive(Driver driver) {
        if (driver.getAge() >= agelimit) {
            car.drive(driver);
        } else {
            System.out.println("You are too young! (driver age: " + driver.getAge() + ")");
        }
    }
}
