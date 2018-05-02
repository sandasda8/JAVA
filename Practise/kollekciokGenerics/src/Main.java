
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Set<Integer> halmaz = new HashSet<>(); //hasítótáblás
        Set<Integer> halmaz2 = new TreeSet<>(); // piros-fekete fás megvalósítás
        Set<String> halmazString = new HashSet<>();
        Set<String> halmazString2 = new TreeSet<>();
        halmaz.add(5);
        halmaz.add(3);
        halmaz.add(7);
        halmaz.add(2);
        halmaz.add(34);

        halmaz2.add(3);
        halmaz2.add(4);
        halmaz2.add(9);
        halmaz2.add(1);
        System.out.println(halmaz);
        System.out.println(halmaz2);

        halmazString.add("kakaós ");
        halmazString.add("biga");
        halmazString.add("egy");
        halmazString.add("ketto");
        halmazString.add("harom");
        halmazString.add("negy");

        halmazString2.add("kakaós ");
        halmazString2.add("csiga ");
        halmazString2.add("biga ");
        halmazString2.add("egy ");
        halmazString2.add("ketto ");

        System.out.println(halmazString);
        System.out.println(halmazString2);


        Iterator<Integer> it = halmaz.iterator(); //bejárás iterátorral
        while (it.hasNext()){
            Integer tmp = it.next();
            if (tmp > 5){
                System.out.println(tmp);
            }
            //System.out.println(it.next() + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(11);
        list.add(41);
        list.add(10);

        System.out.println(list.get(1));

        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for (Integer elem : list){ //ugyanaz a kettő eredménye
            System.out.println(elem);
        }

        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();

        map1.put(0, "null");
        map1.put(1, "egy");
        map1.put(2, "ketto");
        map1.put(3, "harom");
        map1.put(4, "negy");
        map1.put(5, "ot");
        map1.put(6, "hat");

        System.out.println(map1);

        map2.put(0, "null");
        map2.put(1, "egy");
        map2.put(2, "ketto");
        map2.put(3, "harom");
        map2.put(4, "negy");
        map2.put(5, "ot");
        map2.put(6, "hat");

        System.out.println(map2);

        for (int i = 0; i < map1.size(); i++){
            System.out.println(map1.get(i));
        }
            //bejárások 3db
        Iterator<Map.Entry<Integer, String>> mapka = map1.entrySet().iterator(); //map bejárása - iterátorral
        while (mapka.hasNext()) {
            System.out.println(mapka.next().getKey()); //csak keyek kerülnek kiírásra a getKeyyel
        }

        for(Map.Entry<Integer, String> mapka2 : map1.entrySet()) { //map bejárása - elemenként
            System.out.println(mapka2.getKey() + "\t" + mapka2.getValue());
        }

        for (Integer key : map1.keySet()){
            System.out.println(key + map1.get(key));
        }

    }
}
