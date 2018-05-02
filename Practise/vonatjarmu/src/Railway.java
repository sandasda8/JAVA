import Vehicle.*;
import java.util.*;
public class Railway {
    public static void main(String[] args) {
        trains(args);
    }

    public static void trains(String[] input) {
        ArrayList <Train> trains = new ArrayList <Train>();
        Train fastest = new Train();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("teher")) {
                Train freightTrain = new GoodsTrain(input[i + 1], input[i + 2], Integer.parseInt(input[i + 3]), Integer.parseInt(input[i + 4]), input[i + 5], Integer.parseInt(input[i + 6]));
                trains.add(freightTrain);
                if (freightTrain.soonest() < min) {
                    fastest = freightTrain;
                }
                //System.out.println(freightTrain.toString());
                i += 6;
            } else if (input[i].equals("személy")) {
                Train passengerTrain = new LocalTrain(input[i + 1], input[i + 2], Integer.parseInt(input[i + 3]), Integer.parseInt(input[i + 4]), Integer.parseInt(input[i + 5]));
                trains.add(passengerTrain);
                if (passengerTrain.soonest() < min) {
                    fastest = passengerTrain;
                }
                //System.out.println(passengerTrain.toString());
                i += 5;
            }
        }

        Collections.sort(trains, new timeComparator());
        for (Train train : trains){
            System.out.println(train);
        }
        //System.out.println("Fastest train:\n" + fastest + "\nTime: " + fastest.soonest() + " h");
    }
}
