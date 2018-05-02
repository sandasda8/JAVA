package people;
import java.util.ArrayList;
import java.util.*;
import java.io .*;

public class PersonMain {
    public static void main (String args){
        ArrayList<Person> list = new ArrayList<>();
        Person feri= new Person(2, "sanyi", 15, 11);
        Person zsolti = new Person(2, "sanyi", 17, 11);
        list.add(feri);
        list.add(zsolti);

        Collections.sort(list, new IdComparator());
        for (Person person : list){}
        System.out.println(list);
        Collections.sort(list, new FarokComparator());
        for (Person person : list){}
        System.out.println(list);
        Collections.sort(list, new AgeComparator());
        for (Person person : list){}
        System.out.println(list);
    }


}
