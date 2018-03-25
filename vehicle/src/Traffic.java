import java.util.ArrayList;

public class Traffic {

    public static void main(String[] args) {

        ArrayList <Vehicle> vehicleList = new ArrayList <Vehicle>();
        Car trabant = new Car(1000, 110);
        Car uaz = new Car(2000, 100);
        Bicycle csepel = new Bicycle(20);
        Bicycle piros = new Bicycle(25);
        vehicleList.add(trabant);
        vehicleList.add(uaz);
        vehicleList.add(csepel);
        piros.setBroken(true);
        vehicleList.add(piros);
        for (int i = 0; i < vehicleList.size(); i++) {
            try {
                vehicleList.get(i).startUp();
            } catch (BrokenException e) {
                e.printStackTrace();
            }
            System.out.println(vehicleList.get(i).toString());
        }
        try {
            while (true){
                vehicleList.get(0).startUp();
            }
        } catch (BrokenException e) {
            e.printStackTrace();
        }
    }
}
