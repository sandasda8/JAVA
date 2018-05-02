package people;
import java.util.*;
public class PeopleComparator implements Comparator<Person> {
    public int compare (Person person, Person t1 ){
        return person.compareTo(t1);
    }
}
