
public class CarMain {
    public static void main(String[] args) {
        Driver driver1 = new Driver(17);

        ICar car = new Car("Mercedes");

        ICar proxy = new ProxyCar(car, 21);
        ICar proxy2 = new ProxyCar(car, 16);
        proxy.drive(driver1);
        proxy2.drive(driver1);
    }
}
