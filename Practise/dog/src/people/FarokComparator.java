package people;

import java.util.Comparator;

public class FarokComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        if(t1.getTailWiggle() == person.getTailWiggle()){
            return  0;
        } else if (t1.getTailWiggle() > person.getTailWiggle()){
            return -1;
        }
        return 1;
    }
}
