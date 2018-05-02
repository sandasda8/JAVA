import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
        /*Set<Dog> dog = new HashSet <>(); // minden objektumhoz egy számot generál,
        Dog dog1 = new Dog("green", "retek");
        Dog dog2 = new Dog("pink", "kenyer");
        Dog dog3 = new Dog("pink", "langos");
        dog.add(dog1);
        dog.add(dog2);
        dog.add(dog3);
        //dog1.setColor("brown");
        //System.out.println(dog.contains(new Dog("pink", "dsaads")));
        System.out.println(dog.contains(dog1));
        //System.out.println(dog2.equals(dog3)); */

        Dog dog1 = new Dog("green", "retek");
        Person person1 = new Person(1, "Sanyi");
        Tacsko dog2= new Tacsko("black", "buksi",person1,"drotszoru");
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dog2);
        out.flush();
        System.out.println("success");


        ObjectInputStream in =new ObjectInputStream(new FileInputStream("f.txt"));
        Tacsko s=(Tacsko) in.readObject();
        System.out.println(s.toString());
        in.close();
        /*
        Map<Dog, Integer> dogMap = new HashMap <>();
        dogMap.put(dog1, 2);
        dogMap.put(dog2, 4);
        dogMap.put(dog3, 6);
        //System.out.println(dogMap.containsKey(new Dog("pink", "kenyer")));
        //System.out.println(dogMap.containsKey(new Dog("green", "retek")));
        System.out.println(dog1.hashCode()); */
    }
}
