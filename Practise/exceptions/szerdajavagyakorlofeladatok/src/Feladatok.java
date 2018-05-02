/*      1. Írj egy programot ami bekéri egy dolgozat lehetséges maximális és
        aktuális pontszámát, majd kiírja, hogy a dolgozat sikeres vagy
        sikertelen volt! A dolgozat akkor sikeres, ha az aktuális pontszám
        legalább a maximális pontszám fele. [a,b,c,d]
        2. Írj egy programot ami egy jegyhez (osztályzathoz) megadja a szöveges
        értékelést, vagy kiírja, ha rossz értéket kapott! [a,b,c,d]
        3. Írj egy programot ami leosztályoz egy maximálisan 100 pontos
        dolgozatot az 50,65,80,90 ponthatárok szerint! A határérték a jobb
        jegyhez tartozik. Ha a pontszám negatív vagy száznál nagyobb, akkor
        írja ki, hogy hibás az adat! [a,b,c,d]
        4. Írj egy programot, ami egy évszámról eldönti, hogy szökõév-e! [a,b]
        5. Írj egy programot ami a hónap sorszáma alapján kiírja a hónap nevét!
        [a,b,c,d]
        6. Írj egy programot, ami bekér egy N számot, majd kiírja egy általad
        választott vers elsõ 12 sorát, kihagyva az elsõ N sort. Ha több
        versszakot kell kiírni, akkor két-két versszak sorai között legyen
        egy-egy üres sor is. [a,b,c,d] az objektum a classnak egy példánya */
import java.util.Scanner;
import java.util.ArrayList;
public class Feladatok {

    public static void main(String[] args) {
        Feladatok showNum() = new Feladatok();
        showNum.calendar();
    //test();
    //leapyear();
    //calendar();
    poem();

    }
    public static void test() {
        int percent;
        boolean right;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter percentage");
        percent = kb.nextInt();
        kb.close();
        if (percent > 94) {
            Boolean result = Boolean.valueOf(true);
        } else if (percent > 84) {
            boolean something = true;

        } else if (percent > 69) {
            boolean something = true;

        } else if (percent > 49) {
            boolean something = true;

        } else {
            boolean something = false;
            System.out.println("failed");
        }
        if (something == true) {

        }
    }
    public static void leapyear() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter date");
        int year = kb.nextInt();
        kb.close();
        if (year % 4 != 0) {
            System.out.println(year + " is NOT leap year.");
        } else {
            System.out.println(year + " is a leap year");
        }
    }
    public void calendar() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter year");
        int place = kb.nextInt();
        String [] tomb = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i=0; i < tomb.length; i++) {
        }
        System.out.println(tomb[place - 1]);
    }
    public static void poem() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter row of poem");
        int which = kb.nextInt();
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Nem volt csatlakozás. Hat óra késést");
        myArrayList.add("jeleztek és a fullatag sötétben");
        myArrayList.add("hat órát üldögéltem a kocsárdi");
        myArrayList.add("váróteremben, nagycsütörtökön.");
        myArrayList.add("Testem törött volt és nehéz a lelkem,");
        myArrayList.add("mint ki sötétben titkos útnak indult,");
        myArrayList.add("végzetes földön csillagok szavára,");
        myArrayList.add("sors elől szökve, mégis szembe sorssal");
        myArrayList.add("s finom ideggel érzi messziről");
        myArrayList.add("nyomán lopódzó ellenségeit.");
        myArrayList.add("Az ablakon túl mozdonyok zörögtek,");
        myArrayList.add("a sűrű füst, mint roppant denevérszárny,");
        myArrayList.add("legyintett arcul. Tompa borzalom");
        myArrayList.add("fogott el, mély állati félelem.");
        myArrayList.add("Körülnéztem: szerettem volna néhány");
        myArrayList.add("szót váltani jó, meghitt emberekkel,");
        myArrayList.add("de nyirkos éj volt és hideg sötét volt,");
        myArrayList.add("Péter aludt, János aludt, Jakab");
        myArrayList.add("aludt, Máté aludt és mind aludtak...");
        myArrayList.add("Kövér csöppek indultak homlokomról");
        myArrayList.add("s végigcsurogtak gyűrött arcomon.");
        for (int i = which; i < 21; i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}

