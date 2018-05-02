import java.util.Comparator;
import Vehicle.*;

public class timeComparator implements Comparator<Train> {
    public int compare(Train train, Train otherTrain) {
        if(otherTrain.soonest() == train.soonest()){
            return  0;
        } else if (otherTrain.soonest() > train.soonest()){
            return -1;
        }
        return 1;
    }
}
